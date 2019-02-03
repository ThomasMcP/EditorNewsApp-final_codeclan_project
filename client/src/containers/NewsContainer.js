import React, {Component} from 'react';
import MockData from '../data/mockdata';
import ArticleList from '../components/ArticleList';

class NewsContainer extends Component {

  constructor(props){
    super(props);
    this.state = {
      articles: MockData
    }

    this.handleDelete = this.handleDelete.bind(this);
  }

  handleDelete(selectedArticle){
    const newArray = this.props.articles.filter(article => article !== selectedArticle)

  }

  render() {
    return (
      <ArticleList articles={this.state.articles}/>
    )
  }

}

export default NewsContainer;
