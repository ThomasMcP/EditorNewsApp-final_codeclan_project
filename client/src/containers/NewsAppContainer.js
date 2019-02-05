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

    this.getArticlesData = this.getArticlesData.bind(this);
    this.getArticlesData();

  }

  handleArticleDelete(article){
    console.log(article);
  }



  getArticlesData() {
    //debugger;
    window.fetch('http://localhost:8080/articles')
    .then( response => {
      //console.dir(response.json());
      return response.json();
    })
    .then( myJson => {
      this.setState({articles: myJson});
    })
    // .catch((err) => {
    //   debugger;
    //   console.log(err);
    // });
  }

  render(){
    return (
      <>
      <NavBar />
      <ArticleList articles={this.state.articles} handleDelete={this.handleArticleDelete} />
      </>
    )
  }
}

export default NewsAppContainer;
