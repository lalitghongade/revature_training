class Employee{
    Ename:string;

    constructor(name:string){
        this.Ename =name;
    }
    greet(){
        console.log("How you Doing "+this.Ename);

    }


}

let emp = new Employee('john Doe');
console.log(emp.Ename);
emp.greet();

class Manager extends Employee{
    constructor(mangerName:string){
        super(mangerName);
    }

    delegateWork(){
        console.log(`Manger delegating tasks`);
        
    }
}


let m = new Manager("jacky");
m.delegateWork();
//accesing employee methods
m.greet();
console.log(m.Ename);



//acces modifiers  public,private,protected
//by default every class members are public
