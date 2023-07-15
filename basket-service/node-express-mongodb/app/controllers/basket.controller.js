const db = require("../models");
const Basket = db.baskets;

// Create and Save a new Basket
exports.create = (req, res) => {
  // Validate request
  if (!req.body.title) {
    res.status(400).send({ message: "Content can not be empty!" });
    return;
  }

  // Create a Basket
  const basket = new Basket({
    title: req.body.title,
    userid: req.body.userid,
    description: req.body.description,
    published: req.body.published ? req.body.published : false,
    products:req.body.products ? req.body.products : [],

  });

  // Save Basket in the database
  basket
    .save(basket)
    .then(data => {
      res.send(data);
    })
    .catch(err => {
      res.status(500).send({
        message:
          err.message || "Some error occurred while creating the Basket."
      });
    });
};

// Retrieve all Baskets from the database.
exports.findAll = (req, res) => {
  const title = req.query.title;
  var condition = title ? { title: { $regex: new RegExp(title), $options: "i" } } : {};

  Basket.find(condition)
    .then(data => {
      res.send(data);
    })
    .catch(err => {
      res.status(500).send({
        message:
          err.message || "Some error occurred while retrieving baskets."
      });
    });
};

// Find a single Basket with an id
exports.findOne = (req, res) => {
  const id = req.params.id;

  Basket.find({ userid: id })
    .then(data => {
      if (!data)
        res.status(404).send({ message: "Not found Basket with id " + id });
      else res.send(data);
    })
    .catch(err => {
      res
        .status(500)
        .send({ message: "Error retrieving Basket with id=" + id });
    });
};

// Update a Basket by the id in the request
exports.update = (req, res) => {
  if (!req.body) {
    return res.status(400).send({
      message: "Data to update can not be empty!"
    });
  }

  const id = req.params.id;

  Basket.findOneAndUpdate({ userid: id }, req.body, { useFindAndModify: false })
    .then(data => {
      if (!data) {
        res.status(404).send({
          message: `Cannot update Basket with id=${id}. Maybe Basket was not found!`
        });
      } else res.send({ message: "Basket was updated successfully." });
    })
    .catch(err => {
      res.status(500).send({
        message: "Error updating Basket with id=" + id
      });
    });
};

// Delete a Basket with the specified id in the request
exports.delete = (req, res) => {
  const id = req.params.id;

  Basket.findOneAndRemove({ userid: id }, { useFindAndModify: false })
    .then(data => {
      if (!data) {
        res.status(404).send({
          message: `Cannot delete Basket with id=${id}. Maybe Basket was not found!`
        });
      } else {
        res.send({
          message: "Basket was deleted successfully!"
        });
      }
    })
    .catch(err => {
      res.status(500).send({
        message: "Could not delete Basket with id=" + id
      });
    });
};

// Delete all Baskets from the database.
exports.deleteAll = (req, res) => {
  Basket.deleteMany({})
    .then(data => {
      res.send({
        message: `${data.deletedCount} Baskets were deleted successfully!`
      });
    })
    .catch(err => {
      res.status(500).send({
        message:
          err.message || "Some error occurred while removing all baskets."
      });
    });
};

// Find all published Baskets
exports.findAllPublished = (req, res) => {
  Basket.find({ published: true })
    .then(data => {
      res.send(data);
    })
    .catch(err => {
      res.status(500).send({
        message:
          err.message || "Some error occurred while retrieving baskets."
      });
    });
};
