var x = 100
var personName = 'joydip'
var isTrue = false
var anilObject = {
    //value properties
    name: "anil",
    id: 1,
    salary: 1000,
    isManager: true,

    //functional property
    //anonymous, inline function
    print: function () {
        return 'Name: ' + this.name + ', Salary: ' + this.salary + (this.isManager ? ', Designation: Manager' : 'Designation: Not a Manager')
    }
}

x = 'Amandeep'
console.log(typeof x, x)
console.log(typeof personName, personName)
console.log(typeof isTrue, isTrue)
console.log(typeof anilObject, anilObject.print())

//undefined and its effect on different other data types (number, string and boolean)

//1.
var y
console.log(y)
var z = 10
var res = y + z
console.log(res) //NaN => Not a Number (in case of a number type value is being added to undefined)

//2.
var a = 'joy'
var b
console.log(a + b) //joyundefined

//3. boolean
var statusValue = true
console.log(statusValue + undefined) //=> NaN (since boolean has numeric presentation[0/1])

//const => a new feature in JS and was introduced in 2015 (version 6)
//a constant variable must be assigned with a value while declaring the same and later that variable can't be assigned to a new value

const constValue = 100
//constValue = 200 <-- incorrect
console.log(constValue)

//in JS there is no separate scope for variables inside control flow statements. they are same as that of the variables outside the control flow statements. hence, the value is considered as a single variable in JS. That's why its value outside for loop will be overwritten inside the for loop

/*
var value = 10
console.log(value)//10

for (var i = 0; i < 1; i++) {
    var value = 20
    console.log(value)//20
}

console.log(value)//20
*/

//hence in 2015 (version 6) let keyword was introduced to declare scoped variable. the above code with variable declared with let keyword instead of var keyword looks like the following:
let value = 10
console.log(value)//10

for (let i = 0; i < 1; i++) {
    let value = 20
    console.log(value)//20
}

console.log(value)//10

//Infinity => result of division of a number by zero
const first = 10
const second = 0
const resDiv = first / second
console.log(resDiv)
