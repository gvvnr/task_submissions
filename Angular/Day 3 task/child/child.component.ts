import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css'],

})
export class ChildComponent implements OnInit {
  @Input() currentData: any;
  value: any;
  name: any;
  @Output() valueChange = new EventEmitter();

  constructor() { }
  ngOnInit() {
  }
  deleteRow() {
    console.log(this.currentData);
    this.valueChange.emit(this.currentData);
  }

}
