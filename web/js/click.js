function myOnClick (button) {
  if (button.name == 'delete') {
    button.form.action = 'DeleteEmployee';
  } 
  else if (button.name == 'add') {
    button.form.action = 'ShowAddForm';
  }
  else if (button.name == 'show') {
    button.form.action = 'ShowEmployee';
  }
   else if (button.name == 'change') {
    button.form.action = 'GetEmployee';
  }
    else if (button.name == 'changeSave') {
    button.form.action = 'SavaChange';
  }
}