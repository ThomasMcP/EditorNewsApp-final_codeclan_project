import React, { Component } from 'react';
import Button from '@material-ui/core/Button';
import { Redirect } from 'react-router'
import ArticleForm from './ArticleForm';
import AccountCircle from '@material-ui/icons/AccountCircle';
import IconButton from '@material-ui/core/IconButton';




class Article extends Component {

  constructor() {
    super();
    this.state = {
      redirectEdit: false,
      redirectAuthorEdit: false
    }
  }

  handleEdit(article){
    console.log("In handleEdit");
    console.dir(article);
    // https://stackoverflow.com/a/43230829/5158630
    this.setState({redirectEdit:true});
  }

  handleAuthorEdit(article){
    console.log("In Author Edit");
    this.setState({redirectAuthorEdit:true});
  }

  render(){
    const { redirectEdit, redirectAuthorEdit } = this.state;
    if (redirectEdit) {
      return(
        <Redirect
          to={{
            pathname: "/edit-article",
            search: "",
            state: {
              article: this.props.article
            }
          }}
        />
      )
    }

    if (redirectAuthorEdit) {
      return(
        <Redirect
          to={{
            pathname: "/edit-author",
            search: "",
            state: {
              article: this.props.article
            }
          }}
        />
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
          <div className="article-author">
            {this.props.article.author}
            <IconButton
              color="inherit"
              onClick={() => this.handleAuthorEdit(this.props.article)}
            >
              <AccountCircle />
            </IconButton>
          </div>
          <div className="article-description">
          {this.props.article.description}
          </div>
          <div className="article-content">
          {this.props.article.content}
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
