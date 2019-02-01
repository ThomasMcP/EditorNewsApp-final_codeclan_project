const MockData = require('./feed.js');

console.log(MockData);
MockData.rss.channel.item.forEach((item) => {
  console.log(item.title);
})
