import React, { Component } from 'react';
import Article from './Article.js';

class ArticleList extends Component {

  render(){
    const articles = this.props.articles.map((article) => {
      return (
        <div className="article-style" key={article.id}>
          <Article article={article} />
        </div>
      )
    })
    return (
      <div className="article-list">
      {articles}
      </div>
    )
  }
}

export default ArticleList;
