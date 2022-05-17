import { Component, OnInit } from '@angular/core';
import {AbstractControl, FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-register-component',
  templateUrl: './register-component.component.html',
  styleUrls: ['./register-component.component.css']
})
export class RegisterComponentComponent implements OnInit {
  formAccount: FormGroup;

  constructor() { }

  ngOnInit(): void {
    this.formAccount = new FormGroup({
      email: new FormControl('', [Validators.required, Validators.email]),
      passwordGroup: new FormGroup({
        password: new FormControl('', Validators.required),
        confirmPassword: new FormControl('', Validators.required),
      }, this.comparePassword),
      country: new FormControl('', Validators.required),
      age: new FormControl('', [Validators.required, Validators.min(18)]),
      gender: new FormControl('', Validators.required),
      phone: new FormControl('', [Validators.required, Validators.pattern('^\\+84\\d{9,10}$')]),
    });
  }

    comparePassword(passwordGroup: AbstractControl) {
      const value = passwordGroup.value;
      return value.password === value.confirmPassword ? null : {notSame: true};
    }

  submitForm() {
    console.log(this.formAccount);
  }
}
