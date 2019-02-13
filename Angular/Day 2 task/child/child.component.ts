import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css'],

})
export class ChildComponent implements OnInit {
  @Input() currentData: any;
  @Input() value: any;
  visiblity() {

  }

  constructor() { }
  ngOnInit() {
  }
  deleteRow() {
    this.currentData = '';
    this.value = true;
  }

}
