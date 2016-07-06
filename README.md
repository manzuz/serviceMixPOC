# serviceMixPOC
ServiceMix ESB Proof Of Concept (POC)

## What is ServiceMix
ServiceMix is an open-source ESB implementation based on Apache Karaf OSGI framework (see <http://servicemix.apache.org/> for more details).

The aim of this POC is to show how Conztanz ONEConnect could be implemented by this solution, as a replacement to current WSO2 ESB solution.

---

### Summary

1) Java mediation

2) External ActiveMQ broker usage

3) JPA support (hibernate)

4) XA transaction support

5) Connect lifecycle java implementation

6) AS calls

7) Complete connect message listener

8) Multi-versioned dependency management

9) Discussion about ideal software architecture / DevOps solutions 

10) Integration tests via PaxExam

11) Links



---

## 1. Java mediation

The first step of this POC consists in demonstrating our ability to implement message processing through java mediation implementation.

Cf <https://github.com/manzuz/serviceMixPOC/blob/JIBX_SBR_14_1_WORKING/README.md>

### Demonstration principle


An initial project structure (based on Maven) has been created to demonstrate a simple SBR message (EDIfact v14.1) processing, as it is currently implemented in ONEConnect WSO2 version.
During the demo the servicemix (Karaf) console will show the message mediation process.

*Note : At this time we'll launch this demo on Windows system*

These are the steps:

- A sample message is posted in a dedicated folder
- A dedicated FTP listener service handles the message and redirects it to an internal dedicated MQ queue
- A MQ listener handles the message
- The message is cleaned to be properly converted from EDIfact to XML
- The message is converted to XML using smooks

### The projects structure


- **demo-commons** : common dependencies declarations and common utilities 
- **demo-deployer** : automates local deployment for this demo 
- **demo-fab** : not used (may be used for future JBoss Fuse - Fabric - POC)
- **demo-kar** : pom project that builds the final karaf archive (.kar file) which will be deployed in the local ServiceMix container
- **demo-parent** : global parent pom project (dependency management) that extends Conztanz framework (eases implementation)
- **demo-platform** : not used
- **demo-sbr-cleaner** : edifact messages cleaner service
- **demo-sbr-ftplistener-14_1** : FTP listener service for SBR 14.1 (EDI/XML) messages
- **demo-sbr-mqlistener-14_1** : MQ listener service for SBR 14.1 (EDI/XML) messages
- **demo-sbr-stub-14_1** : not used (but already functional). This library will be used in the future to parse SBR 14.1 XML parsing using Jibx implementation (as it is done in current WSO2 implementation).
- **demo-sbr-transform-14_1** : transformation service for SBR 14.1 EDI messages transformation *(note : it should be renamed to reflect EDI specific notion)*.

### How to launch the demo?

Here are the steps to follow:

1. Clone this repo to your windows workstation

2. Download ServiceMix 6.1.1 here : http://www.apache.org/dyn/closer.lua/servicemix/servicemix-6/6.1.1/apache-servicemix-6.1.1.zip

3. Extract the ServiceMix 6.1.1 archive you downloaded in your root folder (C:\apache-servicemix-6.1.1)

4. (optional) Create an eclipse workspace and import the above projects.

5. Start ServiceMix by running the following command :

        C:\apache-servicemix-6.1.1\bin\servicemix
       
6. Create the following folder:

        C:\apache-servicemix-6.1.1\ftp\incoming\edi

7. Download [this file][1] in a temporary folder (C:\tmp in our example) and add the smooks feature to ServiceMix by running this command in Karaf console:

        feature:repo-add file:C:/tmp/features.xml
        
8. Install the smooks feature by running this command in Karaf console:

        feature:install smooks

9. Build and deploy the demo application archive (.kar) via maven by launching the following commands in your windows shell (*you can do the same thing inside eclipse if you didn't skip the step 4*):

        cd <your-git-repositories-root-folder>/serviceMix/demo-parent
        mvn clean install
        cd <your-git-repositories-root-folder>/serviceMix/demo-deployer
        mvn clean install -Pconztanz

  *Note : -Pconztanz is not necessary if your maven settings.xml is configured to use conztanz as default profile.*

  After the build finishes, a file named **demo-kar-0.0.1-SNAPSHOT.kar** should appear in your **C:\apache-servicemix-6.1.1\deploy** folder, and you should see ServiceMix detecting the newly deployed archive. To see these logs, just run this command in the Karaf console:

        log:tail


10. Post the sample SBR file:

- To do this using eclipse : right click on **/demo-sbr-publisher/src/main/java/com/conztanz/publisher/Publisher.java**, Run as... Java application.

- To do this using windows explorer, download [this file][2] and copy it into your **C:\apache-servicemix-6.1.1\ftp\incoming\edi** folder.

[1]: <https://raw.githubusercontent.com/manzuz/serviceMixPOC/master/_requisites/features.xml>
[2]: <https://raw.githubusercontent.com/manzuz/serviceMixPOC/master/demo-sbr-publisher/src/main/resources/edifact-sample.txt>
  

   
### OSGI implementation - details

See this presentation :

https://docs.google.com/presentation/d/1NTXjhrjQCDqpFP3k3yFWvSHkXQbKTkeY53lndjXR5CM/edit#slide=id.g1452030672_1_149

---

## 2. External ActiveMQ broker usage

Ok

---

## 3. JPA support (hibernate)

TODO

---

## 4. XA transaction support

TODO

---

## 5. Connect lifecycle java implementation

TODO

---

## 6. AS calls

TODO

---

## 7. Complete connect message listener

TODO

---

## 8. Multi-versioned dependency management

TODO

---

## 9. Discussion about ideal software architecture / DevOps solutions 

TODO

---

It will be necessary to think about project structures and deployment processes to manage genericity and ability to decline different implementations per customer.

## 10. Integration tests via PaxExam

TODO

---

## 11. Resources links

http://servicemix.apache.org/
http://servicemix.apache.org/docs/6.x/
http://www.ibm.com/developerworks/opensource/library/os-osgiblueprint/
http://aries.apache.org/modules/blueprint.html
http://camel.apache.org/bean-binding.html
http://camel.apache.org/enterprise-integration-patterns.html
http://davidmasclet.gisgraphy.com/post/2009/11/26/10-minutes-pour...comprendre-OSGI
http://servicemix.apache.org/docs/6.x/developers-guide/custom-distribution.html
http://john.sh/blog/2010/11/30/deploying-osgi-feature-repositories-to-a-maven-repository.html
http://jibx.sourceforge.net/jibx-maven-plugin/webservice.html
https://karaf.apache.org/manual/latest-3.0.x/users-guide/provisioning.html
https://www.osgi.org/developer/architecture/
https://davidvaleri.wordpress.com/2013/09/17/integration-testing-osgi-bundles-in-apache-karafservicemix-with-pax-exam-3/
https://ops4j1.jira.com/wiki/display/paxexam/Concepts

