var car = {
    brand: "Volvo",
    model: "XC40",
    series: "T5 AWD",
    color: "white",
    detail: function() {
        return this.brand+ " " +this.model + " " +this.series;
    }
};

document.getElementById('car-description').innerHTML = car.detail();