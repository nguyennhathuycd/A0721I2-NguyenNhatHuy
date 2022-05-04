import { Component, OnInit } from '@angular/core';
import {Todo} from '../todo';
import {FormGroup} from '@angular/forms';

let _id = 1;

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})
export class TodoComponent implements OnInit {
  todos: Todo[] = [];
  content = new FormGroup({});

  constructor() { }

  ngOnInit(): void {
  }

  change() {
    const va
  }

  toggleTodo(i: number) {

  }
}
