import React, {Component} from 'react';
import MockData from '../data/mockdata';
import ArticleList from '../components/ArticleList';

class NewsContainer extends Component {

  constructor(props){
    super(props);
    this.state = {
      articles: MockData
    }
  }

  render() {
    return (
      <ArticleList articles={this.state.articles}/>
    )
  }

}

export default NewsContainer;
