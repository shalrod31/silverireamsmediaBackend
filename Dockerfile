FROM java:7 as java

WORKDIR /app

COPY package.json ./app

RUN npm install

COPY . ./app

#FROM APACHE - SEE DOCKER HUB
 
EXPOSE 80  

#ENV MONGODB_USERNAME=root
#ENV MONGODB_PASSWORD=secret
#ENV MONGODB_URL=mongodb

CMD ["java", "Main"]