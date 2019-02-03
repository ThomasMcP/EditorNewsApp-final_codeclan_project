import React, { Component } from 'react';
import './App.css';
import NewsAppContainer from './containers/NewsAppContainer.js';

class App extends Component {
  render() {
    return (
      <div className="App">
        <NewsAppContainer />
      </div>
    );
  }
}

export default App;
