FROM docker.io/tomcat
MAINTAINER griftt
COPY work-admin/target/work-admin-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps
EXPOSE 8080