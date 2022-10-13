import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }
  wrongPassword:boolean=false;
  submitForm(passwordGiven:HTMLInputElement):void{
    this.wrongPassword=false;
    if(passwordGiven.value=="admin"){
      alert('Logged in successfully !!! hurreyyyyyyyy');
    }
    else{
      this.wrongPassword=true;
    }
  }
  changePassword(newPassword:HTMLInputElement,reNewPassword:HTMLInputElement):void{
    if(newPassword.value==reNewPassword.value){
      alert('Password has been reset successfully !!!')
      this.wrongPassword=true;
    }
    else{
      alert('Input fileds mismatched');
    }
  }
}
