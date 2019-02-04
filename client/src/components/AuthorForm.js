import React from 'react';
import PropTypes from 'prop-types';
import { withStyles } from '@material-ui/core/styles';
import FormControl from '@material-ui/core/FormControl';
import Button from '@material-ui/core/Button';
//import Select from '@material-ui/core/Select';
import TextField from '@material-ui/core/TextField';


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

    const article = this.props.location.state.article;
    console.dir(article);

    this.state = {
      article: article
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
            id="outlined-with-placeholder"
            label="Author"
            defaultValue={this.state.article.author}
            placeholder="Enter Author"
            className={classes.textField}
            margin="normal"
            variant="outlined"
           />
        </FormControl>
        <Button variant="contained" color="primary" className="button">
          Save
        </Button>
        <Button variant="contained" color="secondary" className="button">
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
