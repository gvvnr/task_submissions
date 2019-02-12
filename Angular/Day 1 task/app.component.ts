import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my first angular application';
  item = 4;
  fruits = ['apple', 'banana' , 'mango'];
  fruitValue = '';
  modifingValue = 'Hello';
  textValue = '';
  students = {
    name : 'vamsi',
    id : '100',
    phone : '9999999999'
  };

  fruitButton(value){
    this.fruitValue = value;
  }

}

