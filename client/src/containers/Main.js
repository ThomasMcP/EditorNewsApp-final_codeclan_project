import { BrowserRouter as Router, Route } from 'react-router-dom';
import React, { Component, Fragment } from 'react';
import NewsAppContainer from './NewsAppContainer';
import ArticleForm from '../components/ArticleForm.js';

class Main extends Component {

  render() {
    return(
      <Router>
        <Fragment>
          <Route exact path="/" component={NewsAppContainer} />
          <Route
            path="/edit-article"
            //component={ArticleForm}
            render={ props => <ArticleForm {...props} /> }
          />
        </Fragment>
      </Router>
    );
  }

}

export default Main;
