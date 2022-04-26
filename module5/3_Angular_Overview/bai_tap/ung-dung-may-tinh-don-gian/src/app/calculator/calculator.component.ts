import { Component, OnInit } from '@angular/core';
import {Calculator} from '../../models/Calculator';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {

  calculator: Calculator = {
    number1: 0,
    number2: 0
  };
  result: number;
  error: string;
  constructor() { }

  ngOnInit(): void {
  }


  add() {
    this.result = this.calculator.number1 + this.calculator.number2;
    this.error = null;
  }

  sub() {
    this.result = this.calculator.number1 - this.calculator.number2;
    this.error = null;
  }

  mul() {
    this.result = this.calculator.number1 * this.calculator.number2;
    this.error = null;
  }

  div() {
    if (this.calculator.number2 === 0) {
      this.error = 'Can not div for 0';
      this.result = null;
    } else {
      this.result = Math.round(this.calculator.number1 / this.calculator.number2 * 100) / 100;
      // this.result = this.calculator.number1 / this.calculator.number2 ;
      this.error = null;
    }
  }
}
