import React, { Component } from 'react'


export class Login extends Component 
    {
        constructor() {
            super();
            this.state ={
            "username": '',
            "password":'',
        };
    }
          
            componentDidMount() {
                axios.get('http://localhost:8080/login')
                  .then(res => {
                    const employee = res.data;
                    this.setState({ employee });
                  });
                }
            
                
                  
              
   
    
    render() {
        return (
            <div className="Login">
               
            <h1>login</h1>
                </div>
                <div>
                     <button onClick={this.onSubmit} type="button" class="btn btn-primary" title="High" data-toggle="modal">High</button>
                </div>
               
                
    );
    
    }

}

export default Login
