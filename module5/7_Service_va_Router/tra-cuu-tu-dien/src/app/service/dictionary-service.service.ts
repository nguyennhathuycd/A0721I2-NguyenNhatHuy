import { Injectable } from '@angular/core';
import {IWord} from '../models/iword';

@Injectable({
  providedIn: 'root'
})
export class DictionaryServiceService {

  words: IWord[] = [
    {word: 'Hi', mean: 'Xin chao'},
    {word: 'Hand', mean: 'Tay'},
    {word: 'Goodbye', mean: 'Tam biet'},
    {word: 'Door', mean: 'Canh cua'},
    {word: 'Good', mean: 'Tot'}
  ];

  constructor() { }

  translate(word: string): string{
    for (const item of this.words) {
      if (item.word === word) {
              return item.mean;
            }
    }
  }

  getAllWords() {
    return this.words;
  }
}
