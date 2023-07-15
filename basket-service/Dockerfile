FROM node:18-alpine

WORKDIR /src
COPY ./node-express-mongodb/package.json ./node-express-mongodb/package-lock.json /src/
RUN npm install --production
RUN npm install eureka-js-client --save
COPY ./node-express-mongodb/ /src

EXPOSE 808

CMD ["node", "server.js"]