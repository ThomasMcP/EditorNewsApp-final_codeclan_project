import { BrowserRouter as Router, Route } from 'react-router-dom';
import React, { Component, Fragment } from 'react';
import NewsAppContainer from './NewsAppContainer';
import ArticleForm from '../components/ArticleForm.js';
import AuthorForm from '../components/AuthorForm.js'

class Main extends Component {

  render() {
    return(
      <Router>
        <Fragment>
          <Route exact path="/" component={NewsAppContainer} />
          <Route
            path="/edit-article"
            // to pass props we need to render rather than use named component
            render={ props => <ArticleForm {...props} /> }
          />
          <Route
            path="/edit-author"
            // to pass props we need to render rather than use named component
            render={ props => <AuthorForm {...props} /> }
          />
          <Route
            path="/create-article"
            component = {ArticleForm}
          />
          <Route
            path="/create-author"
            component = {AuthorForm}
          />
        </Fragment>
      </Router>
    );
  }

}

export default Main;
