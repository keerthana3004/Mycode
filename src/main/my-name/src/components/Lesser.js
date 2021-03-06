import React,{Component} from 'react';

class Lesser extends Component
{
constructor(){
super();
this.state={
searchData:null,
total:null
}
}
search(key){
console.warn(key);
fetch("http://localhost:8080/lesser?param2="+key).then((data)=>{
data.json().then((resp)=>{
//console.warn("resp",resp)
if(resp.length>0){
this.setState({searchData:resp,noData:false})
}
else
{
this.setState({noData:true,searchData:null})
}
//this.setState({searchData:resp})
})
})
}
render(){
return(
<div>
<h1>Search Employee Less Points</h1>
<input type="text" onChange={(event)=>this.search(event.target.value)} />
<div>
{
this.state.searchData?
<div>

{
<center>
<table>

<thead>
<tr>
<th colSpan="7" className="colspan">All Employee List</th>
</tr>
<tr>
<th>Emp No</th>
<th>Emp Name</th>

<th>Point Value</th>
<th>Point Donate</th>
<th>Point Received</th>
<th>Point Expired</th>
<th>Last Timestamp</th>

</tr>

{this.state.searchData.map((item)=>

<tr>
<td>{item.emp_no}</td>
<td>{item.emp_name}</td>


{item.points.map((sub) =>

<td>{sub.point_value}</td>
)}
{item.points.map((sub) =>

<td>{sub.point_donate}</td>
)}
{item.points.map((sub) =>

<td>{sub.point_received}</td>
)}
{item.points.map((sub) =>

<td>{sub.point_expired}</td>
)}
<td>{item.last_timestamp}</td>
</tr>
)
}


</thead>


</table>
</center>
}
</div>
:""
}

</div>
<div>
{
this.state.noData?<h3>No Data Found</h3>:null
}
</div>
</div>



);
}
}
export default Lesser;