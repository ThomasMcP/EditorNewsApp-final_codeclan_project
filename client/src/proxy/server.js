const express = require("express")
const fetch = require("node-fetch")

const app = express()

app.use(function (req, res, next) {
  res.header("Access-Control-Allow-Origin", "http://localhost:3000");
  res.header("Access-Control-Allow-Credentials", true);
  res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
  next();
});

app.get("/", (req,res, next) => {
  console.log("In proxy")
  return fetch('http://localhost:8080/api/articles', {
     method: "GET",
     headers: {
       "Content-Type": "application/json"
     }
  })
  .then((result) => {
    console.log(result);
    return result.json()
  })
  .then((data) => {
    console.log(data)
    res.send(JSON.stringify(data._embedded.articles))
  })
  .catch((err) => {
    console.log(err);
  })
})

app.listen(3001,() => {
  console.log("Proxy is up and running")
})
