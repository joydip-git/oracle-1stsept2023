//arithmetic operators: +, -, /, *, % etc. (binary operators)
let a = 20
let b = 7
let addres = a + b
let subres = a - b
let multires = a * b
let divres = a / b
let modres = a % b
console.log(addres)
console.log(subres)
console.log(divres)
console.log(multires)
console.log(modres)

//incremental and decremental operators (unary operators): ++, --
let incresprefix = ++a //(a = a + 1)
console.log(incresprefix)

let increspostfix = a++ // (a = a + 1)
console.log(increspostfix)

let decresprefix = --b // (b = b-1)
console.log(decresprefix)

let decrespostfix = b-- // (b = b-1)
console.log(decrespostfix)

//assignment operators: =, +=, -=, *= /=, %=
let intial = 5
a += intial //(a = a + initial)
console.log(a)
a -= intial // (a=a-initial)
console.log(a)
a *= intial // (a = a*initial)
console.log(a)
a /= intial // (a = a/initial)
console.log(a)
a %= intial // (a=a%initial)
console.log(a)

//equality operators: ==, !=, ===, !== (binary operators)

//if (a == b) <= equality (==): whether values of both a and b are equal or not
//if (a != b) <= equality (!=): whether values of both a and b are unequal or not

//if(a === b) <= strict equality (===): whether data types as well as values of both a and b are equal or not
//if(a !== b) <= strict equality (!==): whether data types as well as values of both a and b are unequal or not

if (a === b) {
    console.log("both a and b are equal")
} else {
    console.log("both and b are unequal")
}
//logical and and or: && and || (binary operators)
let c = 7
if (a > b && a > c) {
    console.log("a is greater than b and c")
} else if (a > b && a < c) {
    console.log("c is greater than a and b")
} else if (b > c)
    console.log("b is greater than a and c")
else {
    console.log("c is greater than and b")
}

//conditional operators: >, <, >=, <= (binary operators)
let conditionres = ""
if (a > b) {
    conditionres = "b is greater than a"
} else {
    conditionres = "a is greater than b"
}
console.log(conditionres, a, b)

//ternary operator: ? and :
let comparisonres = a > b ? "a is greater than b" : "b is greater than a"
console.log(comparisonres)






