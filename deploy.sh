#!/bin/bash
set tomcat_root = /opt/tomcat_dev
${tomcat_root}/opt/tomcat_dev/bin/shutdown.sh
kill -9 `ps -ef | grep tomcat_dev | awk '{print $2}''`
cp springBootTest.war ${tomcat_root}/webapps/
${tomcat_root}/opt/tomcat_dev/bin/startup.sh