function add(num1:number,num2?:number): number//retuern type
{//? used as optional parameter
    console.log(num1);
    console.log(num2);
    return num1+num2;
}


let sum =add(5);
console.log(sum);


function fullname(person :{fname:string,lname:string}){
    console.log(`${person.fname} ${person.lname}`);
}

let p ={
    fname:"jack",
    lname:"sparrow"
};

fullname(p);//clumsy code code maintenance also difficult


interface Person{
    fname:string;
    lname:string;
}



function fullnameImprovised(person : Person){
    console.log("improvised version with using interface");
    console.log(`${person.fname} ${person.lname}`);
}


fullnameImprovised(p);