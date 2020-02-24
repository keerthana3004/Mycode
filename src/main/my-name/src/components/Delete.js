import React,{Component} from 'react';

class All extends Component
{
    constructor(props){
        super(props);
        this.state = {
        employee: [],
        isLoaded:false
        };
        this.deleteStudent = this.deleteStudent.bind(this);
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
            deleteStudent() {
                this.props.deleteStudent(this.props.student);
            }   

render(){
   return(
     <div className="App">
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
<th>Action</th>

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

<td>{employees.last_timestamp}</td>
<td><button variant="info">Edit</button></td>
<button className="btn btn-danger btn-xs" onClick={this.deleteStudent}>Delete</button>
  
</tr>

)
}


</thead>


</table>
</center>
</div>
  )
 }
}   

export default All;
