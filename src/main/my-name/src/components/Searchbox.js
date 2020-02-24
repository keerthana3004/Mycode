import React, { Component } from 'react';
class Searchbox extends Component {
  constructor(props){
    super(props)
    this.state = {
      query:'',
      employee: [],
    }
  }

 onChange (e){
   this.setState({
     query: e.target.value
   })
  if(this.state.query && this.state.query.length > 1) {
     if(this.state.query.length % 2 === 0){
       this.componentDidMount()
     }
   }
 }

componentDidMount(){
  const url = "http://localhost:8080/get/{emp_name}";
  fetch (url,{
    method:'GET'
  }).then(results => {
    return results.json();
  }).then(data => {
    let employee = data.results.map((people) => {
      return(
        <ul key={people.name}>
        <li>{people.name}</li>
        </ul>
      )
    })
    this.setState({employee: employee});
    console.log("state", employee)
  })
}

 render() {
   return (
     <form>
       <input
         type="text"
         className="search-box"
         placeholder="Search for..."
         onChange={this.onChange.bind(this)}
       />
       {this.state.employee}
     </form>
   )
 }
}

export default Search