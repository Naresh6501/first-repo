import { Component, OnInit } from '@angular/core';
import { loanService } from '../loan.service';

@Component({
  selector: 'app-delete',
  templateUrl: './delete.component.html',
  styleUrls: ['./delete.component.css']
})
export class DeleteComponent implements OnInit {

  constructor(public ls:loanService) { }

  ngOnInit() {
   
  }
delete(loanId){
  this.ls.deleteLoan(loanId);
}
}
