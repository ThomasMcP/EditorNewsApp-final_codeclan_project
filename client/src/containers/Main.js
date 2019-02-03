import { BrowserRouter as Router, Route, Link } from 'react-router-dom';
import React, { Component, Fragment } from 'react';
import MockData from '../data/mockdata';
import NewsAppContainer from './NewsAppContainer';
import ArticleForm from '../components/ArticleForm.js';

class Main extends Component {

  constructor() {
    super();
  }

  render() {
    return(
      <Router>
        <Fragment>
          <Route exact path="/" component={NewsAppContainer} />
          <Route path="/edit-article" component={ArticleForm} />
        </Fragment>
      </Router>
    );
  }

}

export default Main;
