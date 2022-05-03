import {Component, Input, OnInit, Output, EventEmitter, SimpleChanges, OnChanges, OnDestroy} from '@angular/core';

@Component({
  selector: 'app-countdown-timer',
  templateUrl: './countdown-timer.component.html',
  styleUrls: ['./countdown-timer.component.css']
})
export class CountdownTimerComponent implements OnInit, OnDestroy {
  message = '';
  remainTime: number;
  seconds = 11;
  private intervalId = 0;

  clearTime() {
    clearInterval(this.intervalId);
  }

  ngOnInit() {
    this.reset();
  }

  ngOnDestroy() {
    this.clearTime();
  }

  start() {
    this.clearTime();
    this.intervalId = window.setInterval(() => {
      this.remainTime -= 1;
      if (this.remainTime === 0) {
        this.message = 'Blast off!';
        this.clearTime();
      } else {
        this.message = `${this.remainTime} seconds and counting`;
      }
    }, 1000);
  }

  stop() {
    this.clearTime();
    this.message = `Holding at ${this.remainTime} seconds.`;
  }

  reset() {
    this.clearTime();
    this.remainTime = this.seconds;
    this.message = 'Click start button to start the Countdown';
  }
}
