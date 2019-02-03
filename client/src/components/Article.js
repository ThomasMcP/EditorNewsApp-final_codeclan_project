import React, {Component} from 'react';

class Article extends Component {
  constructor(props){
    super(props);
  }

  render() {
    return (
      <div className="article">

        <div className="article-header">
          <div className="article-title">
            {this.props.article.title}
          </div>
        </div>

        <div className="article-body">
          <div className="article-author">
            {this.props.article.author}
          </div>
          <div className="article-description">
            {this.props.article.description}
          </div>
          <div className="article-date">
            {this.props.article.date}
          </div>
        </div>

        <div className="article-image">
          <img
            alt={this.props.article.description}
            src={this.props.article.imagelink}
          />
        </div>

        <div className="article-buttons">
          <button type="button">
              Edit
          </button>
          <button type="button" onClick={() => {this.handleDelete(this.props.article)}}>
              Delete
          </button>
          <hr />
        </div>

      </div>
    )
  }

}

export default Article;
