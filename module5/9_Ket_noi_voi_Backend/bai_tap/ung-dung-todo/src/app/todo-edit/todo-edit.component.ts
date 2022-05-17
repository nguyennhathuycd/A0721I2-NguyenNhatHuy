import { Component, OnInit } from '@angular/core';
import {FormGroup, FormControl} from '@angular/forms';
import {Todo} from '../todo';
import {ActivatedRoute, Router} from '@angular/router';
import { TodoService } from '../service/todo.service';

@Component({
  selector: 'app-todo-edit',
  templateUrl: './todo-edit.component.html',
  styleUrls: ['./todo-edit.component.css']
})
export class TodoEditComponent implements OnInit {

  id: number;
  todo: Todo;
  formGroup: FormGroup;
  constructor( private todoService: TodoService, private activatedRouter: ActivatedRoute, private router: Router ) { }

  ngOnInit(): void {
    this.activatedRouter.paramMap.subscribe((param) => {
      this.id = +param.get('id');
      // @ts-ignore
      this.todo = this.todoService.findById(this.id).subscribe(
        (todo) => {
          this.formGroup = new FormGroup({
            content: new FormControl(todo.content)
          });
        }
      );
    });
  }

  editTodo(id: number) {
    console.log(this.formGroup.value);
    this.todoService.editTodo(id, this.formGroup.value).subscribe(
      () => {},
      () => {},
      () => {
        this.router.navigateByUrl('/');
      }
    );
  }

}
