import React, { Component } from 'react';
import './App.css';
import Add from './components/Add';
import Create from './components/Create';
import Search from './components/Search';
import Register from './components/Register';


class App extends Component {
constructor(props){
super(props);
this.state = {
employee: [],
isLoaded:false
};
}

componentDidMount(){
fetch('http://localhost:8080/get')
.then(res=>res.json())
.then(json=>{
this.setState({
isLoaded:true,
employee:json,
})
});
}
onSubmit = () => {

this.props.history.push('/Greater');

}
onSubmit2 = () => {

this.props.history.push('/Lesser');

}

onSubmit3 = () => {

this.props.history.push('/Between');

}

    

onSubmit5 = () => {

    this.props.history.push('/All');
    
    }
   
onSubmit7 = () => {

    this.props.history.push('/Register');
    
    }

render(){
return(
<body>
<div className="App">

<h1>Rewards Program <i class="fa fa-trophy" id="color"></i></h1>
<div class="row">

<button onClick={this.onSubmit} type="button" class="btn btn-primary" title="High" data-toggle="modal">High</button>
<button onClick={this.onSubmit2} type="button" class="btn btn-primary" title="Less" data-toggle="modal">Less</button>
<button onClick={this.onSubmit3}type="button" class="btn btn-primary" title="Medium" data-toggle="modal">Medium</button>
<button onClick={this.onSubmit4} type="button" class="btn btn-success" data-toggle="modal" data-target="#myModal"><i class="fa fa-plus" aria-hidden="true"></i> Add Employee</button>
<button onClick={this.onSubmit5} type="button" class="btn btn-primary" title="High" data-toggle="modal">All Employee</button>
<button onClick={this.onSubmit6} type="button" class="btn btn-success" data-toggle="modal" data-target="#myModal2"><i class="fa fa-plus" aria-hidden="true"></i> Create</button>
<button onClick={this.onSubmit7} type="button" class="btn btn-success" data-toggle="modal" data-target="#myModal23"><i class="fa fa-plus" aria-hidden="true"></i> register</button>
<Search/>
<Add/>
<Create/>



</div>

{/* <div class="modal-body-center">
<center>
<table>
<thead>
<tr>
<th colspan="7" class="colspan">All Employee List</th>
</tr>
<tr>
<th>Employee No</th>
<th>Employee Name</th>
<th>Point Value</th>
<th>Point Donate</th>
<th>Point Received</th>
<th>Point Expired</th>
<th>Last Timestamp</th>

</tr>

{this.state.employee.map((employees)=>

<tr>
<td>{employees.emp_no}</td>
<td>{employees.emp_name}</td>

{employees.points.map((sub)=>

<td>{sub.point_value}</td>

)}
{employees.points.map((sub)=>

<td>{sub.point_donate}</td>

)}
{employees.points.map((sub)=>

<td>{sub.point_received}</td>

)}
{employees.points.map((sub)=>

<td>{sub.point_expired}</td>

)}
{employees.points.map((sub)=>

<td>{sub.last_timestamp}</td>

)}
</tr>

)
}


</thead>


</table>
</center>

</div> */}






</div>
</body>

)

}
}

export default App;
