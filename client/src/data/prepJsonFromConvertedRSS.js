const MockData = require('./feed.js');
const fs = require('fs');

let mockItems = [];
MockData.rss.channel.item.forEach((item) => {
  const newItem = {
    id: item.link,
    title: item.title,
    author : "John Q. Randomhack",
    description: item.description,
    url: item.link,
    date: item.pubDate,
    content: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec in tincidunt sapien. Nullam est urna, fermentum sit amet libero laoreet, euismod dignissim nisl. Sed diam ipsum, iaculis sed tortor eu, facilisis cursus erat. Vivamus pharetra magna nec turpis cursus, sed tincidunt ligula egestas. Nunc eleifend lacus et semper pellentesque. Etiam sagittis, sapien in congue pulvinar, ipsum lectus fringilla ligula, non semper tellus nibh vel dui. Praesent enim urna, ornare id tristique ultricies, mattis nec est. Phasellus eu consectetur elit. Nullam fermentum ipsum porttitor tortor fermentum vehicula. Donec mollis ullamcorper neque, vitae commodo dui molestie vel. Sed volutpat tempus magna in ornare. Nullam vitae venenatis erat, sit amet gravida erat.",
    imagelink: item["media:thumbnail"]["-url"]
  };
  mockItems.push(newItem);
});

const str = JSON.stringify(mockItems);
fs.appendFile('mockdata.js', str, (err) => {
    if (err) throw err;
    console.log('File written!');
});
