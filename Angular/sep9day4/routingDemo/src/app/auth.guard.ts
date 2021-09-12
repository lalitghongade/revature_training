import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree ,Router} from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthGuard implements CanActivate {
  constructor(private router: Router){}

  canActivate():  boolean {
    
    // if not register he will not go there
    if(false){
      return true;
    }
      this.router.navigate(['/register'])
      return false;
    
  }
  
}
