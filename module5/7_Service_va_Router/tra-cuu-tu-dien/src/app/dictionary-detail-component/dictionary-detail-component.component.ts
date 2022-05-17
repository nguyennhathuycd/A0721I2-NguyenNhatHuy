import { Component, OnInit } from '@angular/core';
import {DictionaryServiceService} from '../service/dictionary-service.service';
import {IWord} from '../models/iword';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-dictionary-detail-component',
  templateUrl: './dictionary-detail-component.component.html',
  styleUrls: ['./dictionary-detail-component.component.css']
})
export class DictionaryDetailComponentComponent implements OnInit {
  english: string;
  vietnamese: string;

  constructor(private dictionaryServiceService: DictionaryServiceService, private activatedRouter: ActivatedRoute) { }

  ngOnInit(): void {
    this.activatedRouter.paramMap.subscribe((param) => {
      const w = param.get('word');
      this.english = w;
      this.vietnamese = this.dictionaryServiceService.translate(w);
    });
  }
}
