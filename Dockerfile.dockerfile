FROM ubuntu:16.04

RUN apt-get update && apt-get clean
RUN apt-get -y install apache2 && apt-get clean
RUN echo 'Hi, I am done. All works!!!' > /var/www/index.html

EXPOSE 8080

