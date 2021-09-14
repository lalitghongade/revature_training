import { Injectable } from '@angular/core';
import { CanActivate,Router} from '@angular/router';


@Injectable({
  providedIn: 'root'
})
export class AuthGuard implements CanActivate {
  constructor(private router: Router){}

  canActivate():  boolean {
    
    // if not register he will not go there
    if(true){
      return true;
    }
      this.router.navigate(['/register'])
      return false;
    
  }
  
}
