import React, { Component, Fragment } from 'react';
import MockData from '../data/mockdata.js';
import ArticleList from '../components/ArticleList.js'

import { withStyles } from '@material-ui/core/styles';
import AppBar from '@material-ui/core/AppBar';
import Toolbar from '@material-ui/core/Toolbar';
import Typography from '@material-ui/core/Typography';
import Button from '@material-ui/core/Button';
import IconButton from '@material-ui/core/IconButton';
import MenuIcon from '@material-ui/icons/Menu';

const styles = {
  root: {
    flexGrow: 1,
  },
  grow: {
    flexGrow: 1,
  },
  menuButton: {
    marginLeft: -12,
    marginRight: 20,
  },
};

class NewsAppContainer extends Component {
  constructor(props){
    super(props);
    this.state = {
      articles: MockData
    }
  }

  render(){
    const classes = this.props.classes;
    return (
      <>
      <AppBar position="static">
       <Toolbar>
         <IconButton className={classes.menuButton} color="inherit" aria-label="Menu">
           <MenuIcon />
         </IconButton>
         <Typography variant="h6" color="inherit" className={classes.grow}>
           NewsApp
         </Typography>
         <Button color="inherit">Login</Button>
       </Toolbar>
     </AppBar>
      <ArticleList articles={this.state.articles} />
      </>
    )
  }
}

export default withStyles(styles)(NewsAppContainer);
