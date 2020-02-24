import React,{Component} from 'react';

class Between extends Component
{
constructor(){
super();
this.state={
searchData:null,
total:null
}
}
// onchange(e)
// {
// this.setState{this.state.search(key1,key2)}}
search1(key){
console.warn(key);
fetch("http://localhost:8080/between?param1=4000&param2=7000"+key).then((data)=>{
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



    // search1(key1){
    //     console.warn(key1);
    //     fetch("http://localhost:8080/greater?param1="+key1).then((data)=>{
    //     data.json().then((resp)=>{
    //     //console.warn("resp",resp)
    //     if(resp.length>0){
    //     this.setState({searchData:resp,noData:false})
    //     }
    //     else
    //     {
    //     this.setState({noData:true,searchData:null})
    //     }
    //     //this.setState({searchData:resp})
    //     })
    //     })
    //     }


    //     search2(key2){
    //         console.warn(key2);
    //         fetch("http://localhost:8080/lesser?param2="+key2).then((data)=>{
    //         data.json().then((resp)=>{
    //         //console.warn("resp",resp)
    //         if(resp.length>0){
    //         this.setState({searchData:resp,noData:false})
    //         }
    //         else
    //         {
    //         this.setState({noData:true,searchData:null})
    //         }
    //         // this.setState({searchData:resp})
    //         })
    //         })
    //         }            
render(){
return(
<div>
<h1>Search Employee Between points</h1>
<input type="text" onChange={(event)=>this.search1(event.target.value)} />

{/* <input type="text" onChange={(event)=>this.search(event.target.value)} /> */}

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
<td>{item.last_timesstamp}</td>
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

export default Between;