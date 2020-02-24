import React, { Component } from 'react';
import axios from 'axios';
import { Link} from 'react-router-dom';


class Create extends Component {
constructor() {
super();
this.state ={
"email": '',
"password": '',

};
}
onChange = (e) => {

const state=this.state;
state[e.target.name] = e.target.value;
this.setState(state);
}

onSubmit = (e) => {
e.preventDefault();

const {email, password} = this.state;



axios.post('http://localhost:8080/login', {email, password})
.then(res => {
console.log(res.data);

});

}

render() {
const { email, password} = this.state;


return (
<div className="modal fade" id="myModal2" role="dialog">
<div class="modal-dialog">
<div class="panel panel-default">
<div class="panel-heading">
<h3 class="panel-title">
Create EMPLOYEE
</h3>
</div>
<div class="panel-body">
<h4><Link to="/AllEmployee"><span class="glyphicon glyphicon-th-list" aria-hidden="true"></span> Employee List</Link></h4>
<form onSubmit={this.onSubmit}>
<div class="input-group">
<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
<input type="text" class="form-control" name="email" value={email} onChange={this.onChange} placeholder="Email" />
</div>

<div class="input-group">
<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
<input type="text" class="form-control" name="password" value={password} onChange={this.onChange} placeholder="Password" />
</div>



<button class="btn btn-primary" type="submit">Submit</button>

</form>
</div>
</div>
</div>
</div>

);
}
}

export default Create;