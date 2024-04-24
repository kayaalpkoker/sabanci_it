var fruits = ["Orange", "Apple", "Banana", "Cherry"];

fruits.sort();
fruits.reverse();



document.getElementById("fruits").innerHTML = fruits;


var numbers = [9,16,24,5,18,33];

var listOfOver17 = numbers.filter(findOver17);

function findOver17(value) {
        return value>17;
}

document.getElementById("fruits").innerHTML = listOfOver17;