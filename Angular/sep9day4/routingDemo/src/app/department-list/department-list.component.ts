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
      <span >{{department.id}}</span>{{department.name}}
</li>
</ul>
</div>
`,
  styles: []
})
export class DepartmentListComponent implements OnInit {

  departments=[
    {"id":1,"name":"Angular"},
    {"id":2,"name":"Node"},
    {"id":3,"name":"mongo"},
    {"id":4,"name":"Ruby"},
    {"id":5,"name":"bootStrap"}
]

  constructor(private router:Router) { }

  ngOnInit() {
  }



  onSelect(department){
    this.router.navigate(['/departments',department.id])



  }

}
