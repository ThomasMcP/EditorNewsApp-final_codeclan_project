import React, { Component } from 'react';
import MockData from '../data/mockdata.js';
import ArticleList from '../components/ArticleList.js'
import NavBar from '../components/NavBar.js';

class NewsAppContainer extends Component {

  constructor(props){
    super(props);
    this.state = {
      articles: MockData
    }
    this.getArticlesData();
  }

  getArticlesData() {
    //debugger;
    window.fetch('http://localhost:8080/articles')
    .then(function(response) {
      console.dir(response);
      return response.json();
    })
    .then(function(myJson) {
    //  d//ebugger;
      this.setState({articles: myJson});
    })
    .catch((err) => {
    //  debugger;
      console.log(err);
    });
  }

  render(){
    return (
      <>
      <NavBar />
      <ArticleList articles={this.state.articles} />
      </>
    )
  }
}

export default NewsAppContainer;
