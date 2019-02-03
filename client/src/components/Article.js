import React, { Component } from 'react';
import Button from '@material-ui/core/Button';
import { Redirect } from 'react-router'
import ArticleForm from './ArticleForm';


// const styles = theme => ({
//   button: {
//     margin: theme.spacing.unit,
//   },
//   input: {
//     display: 'none',
//   },
// });

class Article extends Component {

  constructor() {
    super();
    this.state = {
      redirectEdit: false
    }
  }

  handleEdit(article){
    console.log("In handleEdit");
    console.dir(article);
    // https://stackoverflow.com/a/43230829/5158630
    this.setState({redirectEdit:true});
  }

  render(){
    const { redirectEdit } = this.state;
    if (redirectEdit) {
      return(
        <ArticleForm article={this.props.article} />
      )
    }
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
          <img alt="{this.props.article.title}" src={this.props.article.imagelink} />
        </div>
        <div className="article-footer">
          <div className="buttons">
          <Button
            variant="contained"
            color="primary"
            className="button"
            onClick={() => this.handleEdit(this.props.article)}
          >
              Edit
          </Button>
          <Button variant="contained" color="secondary" className="button">
              Delete
          </Button>
          </div>
        </div>
      </div>
    </div>
  )
  }
}

export default Article;
