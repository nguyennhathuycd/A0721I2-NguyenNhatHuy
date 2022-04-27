import {IStudent} from "../models/IStudent";

export class StudentDao {
  static studentList: IStudent[] = [
    {
      id: '1',
      name: 'Huy',
      age: 22,
      mark: 7,
      avatar: 'https://image.thanhnien.vn/1200x630/Uploaded/2022/mftum/2021_06_29/anhchupmanhinh2021-06-29luc065613_wsab.png'
    },
    {
      id: '2',
      name: 'Linh',
      age: 22,
      mark: 10,
      avatar: 'https://suckhoedoisong.qltns.mediacdn.vn/324455921873985536/2022/3/10/hoai-linh-1-16468728552541348873630.jpg',
    }
  ];
}
