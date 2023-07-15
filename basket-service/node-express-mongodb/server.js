const express = require("express");
const cors = require("cors");

const app = express();

var corsOptions = {
  origin: "http://localhost:8081"
};

app.use(cors(corsOptions));

// parse requests of content-type - application/json
app.use(express.json());

// parse requests of content-type - application/x-www-form-urlencoded
app.use(express.urlencoded({ extended: true }));

const db = require("./app/models");
db.mongoose
  .connect(db.url, {
    useNewUrlParser: true,
    useUnifiedTopology: true
  })
  .then(() => {
    console.log("Connected to the database!");
  })
  .catch(err => {
    console.log("Cannot connect to the database!", err);
    process.exit();
  });

// simple route
app.get("/", (req, res) => {
  res.json({ message: "Welcome to basket microservice application." });
});
'use strict';
const Eureka = require('eureka-js-client').Eureka;
const client = new Eureka({
instance: {
    app: 'basket-service',
    hostName: 'localhost',
    ipAddr: "197.26.19.239",
    port: {
      '$': 808,
      '@enabled': 'true',
    },
  vipAddress: '197.26.19.239',
  statusPageUrl: 'http://197.26.19.239:808/api/baskets',
  dataCenterInfo: {
    '@class': 'com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo',
    name: 'default',
    },
  },
  eureka: {
    host: '197.26.19.239',
    port: '8761',
    servicePath: '/eureka/'
  },
});

require("./app/routes/basket.routes")(app);
function connectToEureka() {              
  client.logger.level('debug');  
  client.start(function(error) {
  console.log(JSON.stringify(error) || 'Eureka registration complete');   }); }
  connectToEureka();
// set port, listen for requests
const PORT = process.env.PORT || 808;
app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}.`);
});
