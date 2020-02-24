import React,{Component} from 'react';
import axios from 'axios';
class All extends Component
{
    constructor(props){
        super(props);
        this.state = {
            id: '',
        employee: [],
        isLoaded:false
        };
      }
      
        componentDidMount() {
            axios.get('http://localhost:8080/get')
              .then(res => {
                const employee = res.data;
                this.setState({ employee });
              })
          }
        
           
render(){
   
   return(
     <div className="App">
<center>
<table>
<thead>
<tr>
<th colspan="8" class="colspan">All Employee List</th>
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

<tr key={employees.id}>
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
<td><button onClick={()=>this.delete(employees.id)}><i class="fa fa-trash"></i>
</button></td>

  
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
