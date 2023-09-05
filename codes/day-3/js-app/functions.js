//function: a series of instructions that an application must perform
//syntax:
/*
function func_name(arguments){
    //return (to return value - optional)
}
*/

//arguments/parameters of function: in order to perform some task, that is written through series of instructions inside that function, we might need some additional inputs. those can be passed to the function, when the function is called/invoked

//return: if the function after performing some task wants to return the result from the itself, then use return keyword (statement)

/*
//function declaration
//you can call the function before function declaration
const firstPersonFullName = createFullName('Mr', 'amandeep', 'singh')
console.log(firstPersonFullName)

function createFullName(title, personFirstName, personLastName) {
    let fullNameWithTitle = title + '. ' + personFirstName + ' ' + personLastName
    return fullNameWithTitle
}

const secondPersonFullName = createFullName('Mrs', 'sudha', 'murthy')
console.log(secondPersonFullName)
*/

//function expression
/*
//you can't call the function before function expression
//don't do the following:
const secondPersonFullName = createFullName('Mrs', 'sudha', 'murthy')
console.log(secondPersonFullName)
*/

/*
const createFullName = function (title, personFirstName, personLastName) {
    let fullNameWithTitle = title + '. ' + personFirstName + ' ' + personLastName
    return fullNameWithTitle
}
*/

//function exoression can be written using new style: arrow function (this is a new feature introduced in version 6)
/*
const createFullName = (title, personFirstName, personLastName) => {
    // let fullNameWithTitle = title + '. ' + personFirstName + ' ' + personLastName
    // return fullNameWithTitle
    return title + '. ' + personFirstName + ' ' + personLastName
}
*/
const createFullNameWithReturn = (title, personFirstName, personLastName) => title + '. ' + personFirstName + ' ' + personLastName

const createFullNameNoReturn = (title, personFirstName, personLastName) => console.log(title + '. ' + personFirstName + ' ' + personLastName)

//you can call the function after function expression only
const firstPersonFullName = createFullNameWithReturn('Mr', 'amandeep', 'singh')
console.log(firstPersonFullName)

createFullNameNoReturn('Mrs', 'sudha', 'murthy')
