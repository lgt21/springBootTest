#!/bin/bash
tomcat_root='/opt/tomcat-dev'
${tomcat_root}/bin/shutdown.sh
sleep 3
kill -9 `ps -ef | grep tomcat-dev | awk '{print $2}'`
cp target/springBootTest.war ${tomcat_root}/webapps/
${tomcat_root}/bin/startup.sh