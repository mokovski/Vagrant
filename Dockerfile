FROM ubuntu:16.04

ADD index.html /tmp/

RUN apt-get update

RUN apt-get install -y apache2 && apt-get clean

RUN mv /tmp/* /var/www/html/

EXPOSE 80
CMD apachectl -D FOREGROUND