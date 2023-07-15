module.exports = mongoose => {
  var schema = mongoose.Schema(
    {
      title: String,
      userid: Number,
      description: String,
      published: Boolean,
      products: Array
    },
    { timestamps: true }
  );

  schema.method("toJSON", function() {
    const { __v, _id, ...object } = this.toObject();
    object.id = _id;
    return object;
  });

  const Basket = mongoose.model("basket", schema);
  return Basket;
};
