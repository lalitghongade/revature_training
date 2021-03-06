import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';

@Component({
  selector: 'app-department-list',
  template: `
    <div style="text-align:center">
    <p>
      Department-List!
    </p>

  <ul class="items">
    <li (click)="onSelect(department)" *ngFor="let department of departments">
      <span >{{department.id}}</span> {{department.name}}
</li>
</ul>
</div>
`,
  styles: []
})
export class DepartmentListComponent implements OnInit {

  departments=[
    {"id":1,"name":"Computer"},
    {"id":2,"name":"IT"},
    {"id":3,"name":"Mech"},
    {"id":4,"name":"Civil"},
    {"id":5,"name":"electrical"}
]

  constructor(private router:Router) { }

  ngOnInit() {
  }



  onSelect(department){
    this.router.navigate(['/departments',department.id])



  }

}
