function add(num1, num2) {
    console.log(num1);
    console.log(num2);
    return num1 + num2;
}
var sum = add(5);
console.log(sum);
function fullname(person) {
    console.log(person.fname + " " + person.lname);
}
var p = {
    fname: "jack",
    lname: "sparrow"
};
fullname(p); //clumsy code code maintenance also difficult
function fullnameImprovised(person) {
    console.log("improvised version with using interface");
    console.log(person.fname + " " + person.lname);
}
fullnameImprovised(p);
