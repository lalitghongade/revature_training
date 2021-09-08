var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Employee = /** @class */ (function () {
    function Employee(name) {
        this.Ename = name;
    }
    Employee.prototype.greet = function () {
        console.log("How you Doing " + this.Ename);
    };
    return Employee;
}());
var emp = new Employee('john Doe');
console.log(emp.Ename);
emp.greet();
var Manager = /** @class */ (function (_super) {
    __extends(Manager, _super);
    function Manager(mangerName) {
        return _super.call(this, mangerName) || this;
    }
    Manager.prototype.delegateWork = function () {
        console.log("Manger delegating tasks");
    };
    return Manager;
}(Employee));
var m = new Manager("jacky");
m.delegateWork();
//accesing employee methods
m.greet();
console.log(m.Ename);
