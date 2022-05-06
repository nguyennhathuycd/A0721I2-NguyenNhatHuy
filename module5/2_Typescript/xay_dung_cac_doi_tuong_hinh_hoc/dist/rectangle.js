"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Rectangle = void 0;
const shape_1 = require("./shape");
class Rectangle extends shape_1.Shape {
    constructor(x, y, _with, _height) {
        super(x, y);
        this._with = _with;
        this._height = _height;
    }
    area() {
        return this._with * this._height;
    }
    get with() {
        return this._with;
    }
    set with(value) {
        this._with = value;
    }
    get height() {
        return this._height;
    }
    set height(value) {
        this._height = value;
    }
}
exports.Rectangle = Rectangle;
//# sourceMappingURL=rectangle.js.map