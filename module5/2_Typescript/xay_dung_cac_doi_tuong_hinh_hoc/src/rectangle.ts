import {Shape} from "./shape";
import {IArea} from "./IArea";

export class Rectangle extends Shape implements IArea {
    constructor(x: number, y: number, private _with: number, private _height: number) {
        super(x, y);
    }

    area(): number {
        return this._with*this._height;
    }


    get with(): number {
        return this._with;
    }

    set with(value: number) {
        this._with = value;
    }

    get height(): number {
        return this._height;
    }

    set height(value: number) {
        this._height = value;
    }
}
