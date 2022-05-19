import { getLocaleDateFormat } from '@angular/common';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class loanService {

  constructor() { }
  public loans=[];
  addLoan(loan){
    
    this.loans.push(loan);
    console.log(this.loans);
  
  }
  getAllLoans(){
 return this.loans;
  }
  findLoan(loanId){
    for(let i=0;i<this.loans.length;i++){
      if(this.loans[i].loanId==loanId){
        return this.loans[i];
      }
      return null;
    }
  }
  deleteLoan(loanId){
    for(let i=0;i<this.loans.length;i++){
      if(this.loans[i].loanId==loanId){
         this.loans.splice(i,1);
    }
  }
}

computeLoanAmount(dateOfLoan,loanAmount,rateOfInterest){
  var date1 = new Date(dateOfLoan);
var date2 = Date.now();
var Time = date2 - date1. getTime();
return Time*parseFloat(loanAmount)*parseFloat(rateOfInterest);


}
computeEMI(dateOfLoan,loanAmount,rateOfInterest){
  for(let i=0;i<this.loans.length;i++){
  return this.computeLoanAmount(dateOfLoan,loanAmount,rateOfInterest)/12;
}
}
}
