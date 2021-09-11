import { Component, OnInit } from '@angular/core';
import {ActivatedRoute,Router,ParamMap} from '@angular/router';
@Component({
  selector: 'app-department-details',
  template: `
   
   <div style="text-align:center"><p>
     you have selected department with id = {{departmentId}}
    </p>
  <a (click)="goPrevious()" class="mt-3">Previous</a>
  <a (click)="goNext()">Next</a>
</div>
  `,
  styles: []
})
export class DepartmentDetailsComponent implements OnInit {
  public departmentId;
  constructor(private route:ActivatedRoute,private router:Router) { }

  ngOnInit() {
   // let id = parseInt(this.route.snapshot.paramMap.get('id'));
    //this.departmentId=id;
    this.route.paramMap.subscribe((params:ParamMap)=>{
      let id =parseInt(params.get('id'));
      this.departmentId =id;
    });

  }
  goPrevious(){
    let previousId =this.departmentId-1;
    this.router.navigate(['/departments',previousId]);


  }
  goNext(){
    let nextId=this.departmentId+1;
    this.router.navigate(['/departments',nextId]);
  }

}
