import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-employee-list',
  template: `<div class="container">
    <h1>Employees List</h1>
  <div class="d-flex justify-content-center">
  
  </div>
  <table class="table" id='tab'>
      <thead>
      <tr>
          <th scope="col">Name</th>
          <th scope="col">Position</th>
          <th scope="col">Office</th>
          <th scope="col">Salary</th>
      </tr>
      </thead>
      <tbody>
      <tr *ngFor="let e of lis;">
          <td>{{ e.name }}</td>
          <td>{{ e.position }}</td>
          <td>{{ e.office }}</td>
          <td>{{ e.salary }}</td>
      </tr>
      </tbody>
  </table>    
</div>  
  `,
  styles: []
})
export class EmployeeListComponent implements OnInit {

  li:any;
  lis=[];

  constructor(private http : HttpClient) { }

  ngOnInit(): void {
    this.http.get('http://www.mocky.io/v2/5ea172973100002d001eeada')
    .subscribe(Response => {
 
     
      console.log(Response)
      this.li=Response;
      this.lis=this.li.list;
    });
    
  }

}
