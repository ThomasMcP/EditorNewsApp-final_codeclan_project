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
