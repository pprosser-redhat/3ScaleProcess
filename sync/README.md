# Spring Boot Camel app that receives events from 3Scale 

Demonstrates receiving webhook events from 3Scale, determining the event that occurred, in the event of a new account subscription, a BPMS process is started to authorise/reject the new account

### Building

The project can be built with 

    mvn clean install

### Running the example in OpenShift

The Camel route using 4 custom properties that need to be changed before using,

these can be changed in application.yml, or via a config map on Openshift 

The 4 properties are :

	bpm.hostname
	bpm.port
	bpm.username
	bpm.password

The properties need to be changed to reflect your environment

The example can then be built and deployed using a single goal:

    $ mvn fabric8:deploy -Dbpm.hostname=<hostname> -Dbpm.port=<port> -Dbpm.username=<username> -D bpm.password=<password>

or

by using a Fuse integration services template and using S2I by placing the project in a Git repo and a config map to define the properties. Below is a sample configmap :-

	apiVersion: v1
	kind: ConfigMap
	metadata:
		name: bpm-config
		namespace: accountapprovals
		selfLink: /api/v1/namespaces/accountapprovals/configmaps/bpm-config
		uid: ca120cce-f54f-11e7-9096-080027b8f3eb
		resourceVersion: '458753'
		creationTimestamp: '2018-01-09T15:14:29Z'
	data:
		bpm.hostname: rhcs-bpms-install-demo-accountapprovals.192.168.99.100.nip.io
		bpm.password: welcome1
		bpm.port: '80'
		bpm.username: bpmsAdmin

To enable the the Fuse application to read the config map, a view policy needs to be applied to the openshift project, this can be acheived through the Openshift console or by running the following command:-

	$ oc policy add-role-to-user view --serviceaccount=default

## Username and password for bpm

The Camel Route is expecting the bpm user name and password to be made available as Openshift secrets.

An example secret yaml file is provided below :

	apiVersion: v1
	kind: Secret
	metadata:
		name: bpmsecrets
	data: 
	
	stringData:
		bpm.username: test
		bpm.password: test

Passing the data as stringData will encode the username and password into the data structure when loaded

To load the secret into Openshift, login in using the commnad line tool "oc", and then using the oc create command to load the file (make sure you are in the right project)

	$ oc login https:<ipaddress>:<port>
	$ oc create -f <filename.yml>
	
Having created the secrets, update the deployment configuration to mount the secrets into:

	/etc/secrets 
	




