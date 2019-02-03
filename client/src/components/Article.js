import React, { Component } from 'react';

class Article extends Component {
  render(){
    return (
    <div className="article">
      <div className="article-header">
        {this.props.article.title}
      </div>
      <div className="article-bottom">
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
          <div className="buttons">
          <button className="button-edit"
            type="button">
              Edit
          </button>
          <button className="button-delete"
                  type="button">
              Delete
          </button>
          </div>
        </div>
      </div>
    </div>
  )
  }
}

export default Article;
