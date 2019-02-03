import React from 'react';
//import ReactDOM from 'react-dom';
import PropTypes from 'prop-types';
import { withStyles } from '@material-ui/core/styles';
//import Input from '@material-ui/core/Input';
//import OutlinedInput from '@material-ui/core/OutlinedInput';
//import FilledInput from '@material-ui/core/FilledInput';
//import InputLabel from '@material-ui/core/InputLabel';
//import MenuItem from '@material-ui/core/MenuItem';
//import FormHelperText from '@material-ui/core/FormHelperText';
import FormControl from '@material-ui/core/FormControl';
//import Select from '@material-ui/core/Select';
import TextField from '@material-ui/core/TextField';


const styles = theme => ({
  root: {
    display: 'flex',
    flexWrap: 'wrap',
  },
  formControl: {
    margin: theme.spacing.unit,
    minWidth: 500,
  },
  selectEmpty: {
    marginTop: theme.spacing.unit * 2,
  },
});

class ArticleForm extends React.Component {

  constructor(props){
    super(props);
    console.log("whoop!")
    console.dir(this.props.article);
    this.state = {
      title: this.props.article.title,
      date: this.props.article.date,
      description: this.props.article.description,
      imagelink: this.props.article.imagelink
    };
  }

  handleChange = event => {
    this.setState({ [event.target.name]: event.target.value });
  };

  render() {
    const { classes } = this.props;

    return (
      <form className={classes.root} autoComplete="off">
        <FormControl className={classes.formControl}>
          <TextField
           id="outlined-full-width"
           label="Title"
           defaultValue = {this.props.article.title}
           placeholder="Enter Article Title"
           className={classes.textField}
           margin="normal"
           variant="outlined"
         />
         <TextField
          id="outlined-with-placeholder"
          label="Author"
          defaultValue = ""
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
          defaultValue={this.props.article.date}
          margin="normal"
          variant="outlined"
        />
        <TextField
         id="outlined-textarea"
         label="Description"
         placeholder="Enter Description"
         defaultValue={this.props.article.description}
         multiline
         rows="4"
         className={classes.textField}
         margin="normal"
         variant="outlined"
       />
       <TextField
        id="outlined-with-placeholder"
        label="ImageLink"
        placeholder="Enter ImageLink"
        defaultValue={this.props.article.imagelink}
        className={classes.textField}
        margin="normal"
        variant="outlined"
       />
        </FormControl>
      </form>
    );
  }
}

ArticleForm.propTypes = {
  classes: PropTypes.object.isRequired,
};

export default withStyles(styles)(ArticleForm);
