import React, { Component } from 'react';
import './App.css';
import NewsAppContainer from './containers/NewsAppContainer.js';
import { BrowserRouter, Route, Link } from 'react-router-dom';
import Main from './containers/Main.js';

class App extends Component {
  render() {
    return (
      <div className="App">
        <Main />
      </div>
    );
  }
}

export default App;
