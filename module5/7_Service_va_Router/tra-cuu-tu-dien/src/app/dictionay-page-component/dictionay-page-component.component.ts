import { Component, OnInit } from '@angular/core';
import {DictionaryServiceService} from '../service/dictionary-service.service';
import {IWord} from '../models/iword';

@Component({
  selector: 'app-dictionay-page-component',
  templateUrl: './dictionay-page-component.component.html',
  styleUrls: ['./dictionay-page-component.component.css']
})
export class DictionayPageComponentComponent implements OnInit {
  words: IWord[];

  constructor(private dictionaryServiceService: DictionaryServiceService) { }

  ngOnInit(){
    this.words = this.getallWord();
  }

  getallWord() {
    return this.dictionaryServiceService.getAllWords();
  }
}
