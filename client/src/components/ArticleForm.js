import React from 'react';
import PropTypes from 'prop-types';
import { withStyles } from '@material-ui/core/styles';
import FormControl from '@material-ui/core/FormControl';
import Button from '@material-ui/core/Button';
//import Select from '@material-ui/core/Select';
import TextField from '@material-ui/core/TextField';
import { Redirect } from 'react-router'


const styles = theme => ({
  root: {
    display: 'flex',
    flexWrap: 'wrap',
  },
  formControl: {
    margin: theme.spacing.unit,
    minWidth: '100%'
  },
  selectEmpty: {
    marginTop: theme.spacing.unit * 2,
  },
});

class ArticleForm extends React.Component {

  constructor(props){
    super(props);
    console.log("In article form constructor")

    let article;

    // if we pass without an articles prop,
    // make an empty article. Otherwise use the one
    // passed in the props.

    if (this.props.location.state === undefined) {
      article = {
        name: "",
        author: "",
        title: "",
        description: "",
        content: "",
        date: "",
        imagelink: ""
      }
    } else {
      article = this.props.location.state.article;
    };
    console.dir(article);

    this.state = {
      article: article,
      redirectClose: false
    };
  }

  handleChange = event => {
    this.setState({ [event.target.name]: event.target.value });
  };

  handleClose(article){
    console.log("In Author Edit");
    this.setState({redirectClose:true});
  }

  render() {
    const { classes } = this.props;
    const { redirectClose } = this.state;
    if (redirectClose) {
      return(
        <Redirect
          to={{
            pathname: "/",
            search: "",
          }}
        />
      )
    }
    return (
      <form className={classes.root} autoComplete="off">
        <FormControl className={classes.formControl}>
          <TextField
           id="outlined-full-width"
           label="Title"
           defaultValue = {this.state.article.title}
           placeholder="Enter Article Title"
           className={classes.textField}
           margin="normal"
           variant="outlined"
         />
         <TextField
          id="outlined-with-placeholder"
          label="Author"
          defaultValue={this.state.article.author}
          placeholder="Enter Author"
          className={classes.textField}
          margin="normal"
          variant="outlined"
         />
         <TextField
          id="outlined-with-placeholder"
          label="Date"
          placeholder="Enter Date DD/MM/YYYY"
          className={classes.textField}
          defaultValue={this.state.article.date}
          margin="normal"
          variant="outlined"
        />
        <TextField
         id="outlined-textarea"
         label="Description"
         placeholder="Enter Description"
         defaultValue={this.state.article.description}
         multiline
         rows="4"
         className={classes.textField}
         margin="normal"
         variant="outlined"
       />
       <TextField
        id="outlined-textarea"
        label="Full article"
        placeholder="Full article text"
        defaultValue={this.state.article.content}
        multiline
        rows="8"
        className={classes.textField}
        margin="normal"
        variant="outlined"
      />
       <TextField
        id="outlined-with-placeholder"
        label="ImageLink"
        placeholder="Enter ImageLink"
        defaultValue={this.state.article.imagelink}
        className={classes.textField}
        margin="normal"
        variant="outlined"
       />
        </FormControl>
        <Button variant="contained" color="primary" className="button">
          Save
        </Button>
        <Button
          variant="contained"
          color="secondary"
          className="button"
          onClick={() => this.handleClose()}
        >
          Cancel
        </Button>
      </form>
    );
  }
}

ArticleForm.propTypes = {
  classes: PropTypes.object.isRequired,
};

export default withStyles(styles)(ArticleForm);
