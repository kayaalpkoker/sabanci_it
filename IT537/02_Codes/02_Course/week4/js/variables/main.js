var x = "Sabanci University";

var x = 0;   //it works

let x = "Front-end Web Development"

let x = 0;  //not works

/*---------------------------------------------------*/

{
    let x = 2;
}

// x can not be used here

{
    var x = 2;
}

// x can be used here


/*---------------------------------------------------*/

var x = 10;
x->10

{
    var x = 2;
    x->2
}

x->2

let x = 10;
x->10

{
    let x = 2;
    x->2
}

x->10

/*---------------------------------------------------*/


const PI = 3.141142612341234
PI = 3.1411 //ERROR
PI = PI - 0.0011 //ERROR

const volvoXC40 = {brand: "Volvo", model: "XC40", series: "T5 AWD", color: "white"};

volvoXC40.color="red";


const volvoXC40 = {brand: "Volvo", model: "XC40", series: "T5 AWD", color: "white"};
const volvoXC40 = {brand: "BMW", model: "3 Series", series: "320i", color: "black"};