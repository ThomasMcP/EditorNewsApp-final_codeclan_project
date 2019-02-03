import React, { Component } from 'react';

class ArticleList extends Component {

  render(){
    const articles = this.props.articles.map((article) => {
      return (
        <div className="article" key={article.id}>
          <h1>{article.title}</h1>
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
