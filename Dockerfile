FROM bitnami/java:17.0.10-13-debian-11-r6

WORKDIR /app

COPY . ./app

#FROM APACHE - SEE DOCKER HUB
 
EXPOSE 80  

#ENV MONGODB_USERNAME=root
#ENV MONGODB_PASSWORD=secret
#ENV MONGODB_URL=mongodb
##run mvn clean installn

CMD ["java", "Main"]