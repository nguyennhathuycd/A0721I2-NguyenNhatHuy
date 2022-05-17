import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Todo} from '../todo';
const URL = 'http://localhost:3000/todos';
@Injectable({
  providedIn: 'root'
})
export class TodoService {

  constructor(private httpClient: HttpClient) { }

  getAll(): Observable<Todo[]> {
    return this.httpClient.get<Todo[]>(URL);
  }

  findById(id: number): Observable<Todo> {
    return this.httpClient.get<Todo>(URL + '/' + id);
  }

  createTodo(todo: Todo): Observable<any> {
    return this.httpClient.post<Todo>(URL, todo);
  }

  editTodo(id: number, todo: Todo): Observable<Todo> {
    return this.httpClient.put(URL + '/' + id, todo);
  }

  deleteTodo(id: number): Observable<Todo> {
    return this.httpClient.delete(URL + '/' + id);
  }
}
