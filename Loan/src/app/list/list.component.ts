import { Component, OnInit } from '@angular/core';
import { loanService } from '../loan.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  constructor(private ls:loanService) { }
public loans=[];
  ngOnInit() {
    this.loans=this.ls.getAllLoans();
  }

}
