import { getLocaleDateFormat } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { loanService } from '../loan.service';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  constructor(public ls:loanService) { }
  public loanForm= new FormGroup({
    loanId:new FormControl(),
    loanCustomerName:new FormControl(),
    loanAmount:new FormControl(0.0),
    dateOfLoan:new FormControl(),
    tenure:new FormControl(),
    rateOfInterest:new FormControl(),
   
  });
  ngOnInit() {
  }
 add(){
   console.log(this.loanForm.value);
  this.ls.addLoan(this.loanForm.value);
  
 }
}
