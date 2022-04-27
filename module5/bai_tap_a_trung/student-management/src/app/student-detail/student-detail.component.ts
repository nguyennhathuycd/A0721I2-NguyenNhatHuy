import { Component, OnInit } from '@angular/core';
import {IStudent} from "../../models/IStudent";
import {StudentDao} from "../../dao/StudentDao";


@Component({
  selector: 'app-student-detail',
  templateUrl: './student-detail.component.html',
  styleUrls: ['./student-detail.component.css']
})
export class StudentDetailComponent implements OnInit {
  studentList: IStudent[] = StudentDao.studentList;

  constructor() { }

  ngOnInit(): void {
  }

}
