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

class AuthorForm extends React.Component {

  constructor(props){
    super(props);
    //debugger;
    console.log("In article form constructor")

    let article;
    let author;
    if (this.props.location.state === undefined) {
      // if no article provided then make placeholder
      // article and author
      article = {
        name: "",
        author: "",
        description: "",
        imagelink: "",
        content: "",
        date: ""
      };
      author = {
        name: ""
      }
    }
    else {
      // if one sent in props, use it.
      article = this.props.location.state.article;
      author = {
        name: article.author
      }
    }

    console.dir(article);
    console.dir(author);

    this.state = {
      article: article,
      author: author,
      redirectAuthorFormEdit: false
    };
  }

  handleChange = event => {
    this.setState({ [event.target.name]: event.target.value });
  };

  handleAuthorFormEdit(article){
    console.log("In Author Edit");
    this.setState({redirectAuthorFormEdit:true});
  }

  render() {
    const { classes } = this.props;

    const {redirectAuthorFormEdit } = this.state;
    if (redirectAuthorFormEdit) {
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
            id="outlined-with-placeholder"
            label="Author"
            defaultValue={this.state.article.author}
            placeholder="Enter Author"
            className={classes.textField}
            margin="normal"
            variant="outlined"
           />
        </FormControl>
        <Button variant="contained" color="#009688" className="button">
          Save
        </Button>
        <Button
          variant="contained"
          color="secondary"
          className="button"
          onClick={() => this.handleAuthorFormEdit(this.props.article)}
        >
          Cancel
        </Button>
      </form>
    );
  }
}

AuthorForm.propTypes = {
  classes: PropTypes.object.isRequired,
};

export default withStyles(styles)(AuthorForm);
