import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'nang-cap-ung-dung-Hackernew';
  page: string;

  pageChange(page: string) {
    this.page = page;
  }
}
