function add(num1:number,num2?:number): number//retuern type
{//? used as optional parameter
    console.log(num1);
    console.log(num2);
    return num1+num2;
}


let sum =add(5);
console.log(sum);