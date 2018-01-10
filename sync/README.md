# Spring Boot Camel app that receives events from 3Scale 

Demonstrates receiving webhook events from 3Scale, determining the event that occurred, in the event of a new account subscription, a BPMS process is started to authorise/reject the new account

### Building

The project can be built with 

    mvn clean install

### Running the example in OpenShift

The Camel route using 8 custom properties that need to be changed before using,

these can be changed in application.yml, or via a config map on Openshift 

The 8 properties are :

	bpm.hostname (can use either the OCP route or service)
	bpm.port
	bpm.username
	bpm.password
	bpm.organisation
	amp.http
	amp.hostname    (if using AMP on OCP then as a demo, it's recommended to use the Openshift service name - this will avoid needing to configure truststore for self signed keys
	amp.port

Here is an example configmap :-

	apiVersion: v1
		kind: ConfigMap
	metadata:
		name: bpm-config
		namespace: accountapprovals
		selfLink: /api/v1/namespaces/accountapprovals/configmaps/bpm-config
		uid: ca120cce-f54f-11e7-9096-080027b8f3eb
		resourceVersion: '477687'
		creationTimestamp: '2018-01-09T15:14:29Z'
	data:
		amp.hostname: system-provider.amp.svc
		amp.http: http
		amp.port: '3000'
		bpm.hostname: rhcs-bpms-install-demo-accountapprovals.192.168.99.100.nip.io
		bpm.organisation: 3scale
		bpm.port: '80'

The properties need to be changed to reflect your environment

The example can then be built and deployed using a single goal:

    $ mvn fabric8:deploy -Dbpm.hostname=<hostname> -Dbpm.port=<port> -Dbpm.username=<username> -D bpm.password=<password>

or

by using a Fuse integration services template and using S2I by placing the project in a Git repo and creating a config map to define the properties. Below is a sample configmap :-

Note - create the config map first, otherwise the default values will be used from the project

To enable the the Fuse application to read the config map, a view policy needs to be applied to the openshift project, this can be acheived through the Openshift console or by running the following command:-

	$ oc policy add-role-to-user view --serviceaccount=default

## Username and password for bpm

The Camel Route is expecting the bpm user name, andpassword to be made available as Openshift secrets (you can also just but them in the config map).

The API token is also passed as a secret (this token is required by all calls to the 3Scale AMP backend) - you need to generate this in your own 3Scale environment, and place it in the secret.

To generate the token, see the 3Scale documentation - https://access.redhat.com/documentation/en-us/red_hat_3scale/2.1/html/accounts/tokens

An example secret yaml file is provided below :

	apiVersion: v1
	kind: Secret
	metadata:
		name: bpmsecrets
	data: 
	
	stringData:
		bpm.username: test
		bpm.password: test
        amp.key: 809186e5d04162c5d2a3ab50ea7172d77591cc893311e77e404307f8183d1a42
        
Passing the data as stringData will encode the username, password and API Key into the data structure when loaded

To load the secret into Openshift, login in using the commnad line tool "oc", and then using the oc create command to load the file (make sure you are in the right project)

	$ oc login https:<ipaddress>:<port>
	$ oc create -f <filename.yml>
	
Having created the secrets, update the deployment configuration to mount the secrets into:

	/etc/secrets 
	




