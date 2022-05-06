import { Shape } from "./shape";
import { IArea } from "./IArea";
export declare class Rectangle extends Shape implements IArea {
    private _with;
    private _height;
    constructor(x: number, y: number, _with: number, _height: number);
    area(): number;
    get with(): number;
    set with(value: number);
    get height(): number;
    set height(value: number);
}
