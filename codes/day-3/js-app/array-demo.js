//array: it is a collection of similar type of elements
let firstname = "kuldeep"
let secondname = "premasish"
let thirdname = "peeyush"

let people = [firstname, secondname, thirdname]

for (let i = 0; i < 4; i++) {
    let newName = prompt("enter a name: ")
    people.push(newName)
}
for (let i = 0; i < people.length; i++) {
    const name = people[i];
    console.log("Name at index:" + i + " is: " + name)
}
people.splice(1, 2)
console.log("\nafter deletion\n")
for (const name of people) {
    console.log(name)
}
people.splice(1, 2, "joydip", "vinod")
console.log("\nafter replacement\n")
for (const index in people) {
    console.log("Name at index:" + index + " is: " + people[index])
}

//people.shift()
people.unshift("amandeep", "tanmay")
console.log("\nafter new addition using unshift\n")
for (const index in people) {
    console.log("Name at index:" + index + " is: " + people[index])
}

let peopleSubSet = people.slice(2, 6)
console.log(peopleSubSet)

/*
people = {
    0:"kuldeep",
    1:"premasish",
    2:"peeyush"
}
*/