import React, { Component, Fragment } from 'react';
import MockData from '../data/mockdata.js';
import ArticleList from '../components/ArticleList.js'
import NavBar2 from '../components/NavBar2.js';

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
      <NavBar2 />
      <ArticleList articles={this.state.articles} />
      </>
    )
  }
}

export default NewsAppContainer;
