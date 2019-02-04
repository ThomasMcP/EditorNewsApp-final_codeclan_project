import { BrowserRouter as Router, Route } from 'react-router-dom';
import React, { Component, Fragment } from 'react';
import NewsAppContainer from './NewsAppContainer';
import ArticleForm from '../components/ArticleForm.js';
import PropTypes from 'prop-types';

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
        </Fragment>
      </Router>
    );
  }

}

export default Main;
