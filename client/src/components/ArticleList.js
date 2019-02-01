import React, {Component, Fragment} from 'react';

class ArticleList extends Component {

  render() {
    const articleArray = this.props.articles.map((article) => {
      return(
        <div
          className="article"
        >
        {article.title}
        </div>
      )
    });
    return (
      <Fragment>
        <h2>Articles</h2>
        <div class="articlelist">
          {articleArray}
        </div>
      </Fragment>
    )
  }
};

export default ArticleList;
