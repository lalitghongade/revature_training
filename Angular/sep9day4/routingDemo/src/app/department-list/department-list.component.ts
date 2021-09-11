import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-department-list',
  template: `
    <div style="text-align:center">
    <p>
      Department-List!
    </p>

  <ul class="items">
    <li *ngFor="let deparment of departments">
      <span >{{deparment.id}}</span>{{deparment.name}}
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

  constructor() { }

  ngOnInit() {
  }

}
