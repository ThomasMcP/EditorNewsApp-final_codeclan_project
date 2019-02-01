import React, {Component, Fragment} from 'react';

class Article extends Component {

  render() {
    return (
      <div className="article">
        <div className="article-title">
          {this.props.article.title}
        </div>
      </div>
    )
  }

}

export default Article;
