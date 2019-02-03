import React, { Component, Fragment } from 'react';
import MockData from '../data/mockdata.js';
import ArticleList from '../components/ArticleList.js'

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
      <h1>Container</h1>
      <ArticleList articles={this.state.articles} />
      </>
    )
  }
}

export default NewsAppContainer;
