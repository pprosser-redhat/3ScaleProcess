# Spring Boot Camel app that receives events from 3Scale 

Demonstrates receiving webhook events from 3Scale, determining the event that occurred, in the event of a new account subscription, a BPMS process is started to authorise/reject the new account

### Building

The project can be built with 

    mvn clean install

### Running the example in OpenShift

The Camel route using 4 custom properties that need to be changed before using,

these can be changed in application.yml, or via a config map on Openshift 

The 3 properties are :

	bpm.hostname
	bpm.port
	bpm.username
	bpm.password

The properties need to be changed to reflect your environment

The example can then be built and deployed using a single goal:

    $ mvn fabric8:deploy -Dbpm.hostname=<hostname> -Dbpm.port=<port> -Dbpm.username=<username> -D bpm.password=<password>

or

by using a Fuse integration services template and using S2I by placing the projec in a Git repo


