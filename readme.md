Extending 3Scale authorisation worflows with Red Hat JBoss BPMS
=======================

The 3ScaleProcess repo contains 3 projects 

1. Scale3Pojos - Jaxb project for working with the 3Scale XML - has to be imported into BPM as a dependency. This can be done by compiling the project using "mvn package" to create the jar file. The jar file can than be loaded via business central using Authoring --> Artifact Repository
2. sync - Spring boot Fuse application that received web hooks events from 3Scale. Transforms the request and starts a BPMS process for authoiration
3. workflows - the BPMS process project - This needs to be clone into BPMS using business central
