import React, { Component } from 'react';

class Article extends Component {
  render(){
    return (
    <div className="article">
      <div className="article-header">
        {this.props.article.title}
      </div>
      <div className="article-body">
        <div className="article-date">
          {this.props.article.date}
        </div>
        <div className="article-description">
        {this.props.article.description}
        </div>
      </div>
      <div className="article-image">
        <img src={this.props.article.imagelink} />
      </div>
      <div className="article-footer">
        <h1>Buttons Here!</h1>
      </div>
    </div>
  )
  }
}

export default Article;
