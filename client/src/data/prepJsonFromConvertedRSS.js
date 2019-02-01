const MockData = require('./feed.js');
const fs = require('fs');

let mockItems = [];
MockData.rss.channel.item.forEach((item) => {
  const newItem = {
    id: item.link,
    title: item.title,
    author : "",
    description: item.description,
    url: item.link,
    date: item.pubDate,
    content: item.description,
    imagelink: item["media:thumbnail"]["-url"]
  };
  mockItems.push(newItem);
});

const str = JSON.stringify(mockItems);
fs.appendFile('mockdata.js', str, (err) => {
    if (err) throw err;
    console.log('File written!');
});
