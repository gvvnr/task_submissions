import { Component } from '@angular/core';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  messageEvent: any;
  title = 'my first angular application';
  item = 4;
  fruits = ['apple', 'banana' , 'mango'];
  fruitValue = '';
  modifingValue = 'Hello';
   userTestStatus: { id: number, name: string, phone: string }[] = [
    { id: 0, name: 'vamsi', phone : '9999999999' },
    { id: 1, name: 'avinash', phone : '9999999999' },
    { id: 2, name: 'rahul', phone : '9999999999' }
  ];

   fruitButton(value) {
    this.fruitValue = value;
  }
  sendData(data) {
  this.messageEvent = data;
  }

}

