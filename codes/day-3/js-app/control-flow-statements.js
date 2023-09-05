//conditional statements: if...else, while, do...while, swicth...case
/*
if (condtion-to-be-evaluated-to-true) { }
else { }
*/
let a = 20
let b = 7
let c = 5

if (a > b) {
    if (a > c)
        console.log("a is greatest")
    else
        console.log("b is greatest")
}
else {
    if (b > c)
        console.log("b is greatest")
    else
        console.log("c is greatest")
}

//while
while (c > 0) {
    console.log(c)
    c--
}

//do...while
do {
    console.log(b)
    b--
} while (b > 0)

//switch...case
let choice = 1 //1-4
let value = 10
switch (choice) {
    case 1:
        console.log(value += value)
        break;

    case 2:
        console.log(value -= value)
        break;

    case 3:
        console.log(value *= value)
        break;

    case 4:
        console.log(value /= value)
        break;

    default:
        console.log(value)
        break;
}

let sumFirstFor = 0
for (let i = 0; i < 3; i++) {
    console.log(sumFirstFor += i)
}

let sumSecondFor = 0
for (let i = 3; i > 0; i--) {
    console.log(sumSecondFor += i)
}

const sentence = "I work for Oracle"
console.log("Length of string: " + sentence.length)
for (let i = 0; i < sentence.length; i++) {
    //indexing:
    //[] <= indexer
    //i <= index
    let char = sentence[i]
    // if (char === " ") {
    //     continue;
    // } else {
    //     console.log(char)
    // }
    if (char !== " ") {
        console.log(i + ":" + char)
    }
}
console.log("\n\n")
//for...of: auto-incrementational, read-only and used to read every element from the collection, till it has reached the end of collection
for (let char of sentence) {
    if (char !== " ") {
        console.log(char)
    }
}
console.log("\n\n")
//for...in: auto-incrementational, read-only and used to read every index position from the collection, till it has reached the end of collection. you can pick up the values fro the collection using the index position number
for (let index in sentence) {
    // console.log(index + ":" + (sentence[index] === " " ? "blank" : sentence[index]))
    if (sentence[index] !== " ") {
        console.log(index + ":" + (sentence[index]))
    }
}




