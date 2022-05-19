import { Component, OnInit } from '@angular/core';
import { loanService } from '../loan.service';

@Component({
  selector: 'app-find',
  templateUrl: './find.component.html',
  styleUrls: ['./find.component.css']
})
export class FindComponent implements OnInit {

  constructor(private ls:loanService) { }
public loan;
  ngOnInit() {
  }
find(loanId){
  this.loan=this.ls.findLoan(loanId);
}
}
