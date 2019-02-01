import React, { Component } from 'react';
import './App.css';
import NewsContainer from './containers/NewsContainer';

class App extends Component {
  render() {
    return (
      <div className="App">
        <h1>News Application</h1>
        <NewsContainer />
      </div>
    );
  }
}

export default App;
