import { BrowserRouter as Router, Route, Link } from 'react-router-dom';
import React, { Component, Fragment } from 'react';
import MockData from '../data/mockdata';
import NewsAppContainer from './NewsAppContainer';

class Main extends Component {

  constructor() {
    super();
  }

  render() {
    return(
      <Router>
        <Fragment>
          <Route exact path="/" component={NewsAppContainer} />
        </Fragment>
      </Router>
    );
  }

}

export default Main;
