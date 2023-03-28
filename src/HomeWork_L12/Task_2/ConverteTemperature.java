package HomeWork_L12.Task_2;



abstract class ConverteTemperature {
    abstract double convert(double value);
}

class CelsiusToKelvinConverter extends ConverteTemperature {
    double convert(double value) {
        return value + 273.15;
    }
}

class CelsiusToFahrenheitConverter extends ConverteTemperature {
    double convert(double value) {
        return (value * 1.8) + 32;
    }
}

class KelvinToCelsiusConverter extends ConverteTemperature {
    double convert(double value) {
        return value - 273.15;
    }
}

class KelvinToFahrenheitConverter extends ConverteTemperature {
    double convert(double value) {
        return (value - 273.15) * 1.8 + 32;
    }
}

class FahrenheitToCelsiusConverter extends ConverteTemperature {
    double convert(double value) {
        return (value - 32) / 1.8;
    }
}

class FahrenheitToKelvinConverter extends ConverteTemperature {
    double convert(double value) {
        return (value + 459.67) * 5 / 9;
    }
}


