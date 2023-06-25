import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Complete the classes below

//parent class
class Flower {
    //string class that will return names
    String whatsYourName() {
        return "I have many names and types.";
    }
}
//extend flower class 4 times to return different strings
class Jasmine extends Flower {
    @Override
    String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower {
    @Override
    String whatsYourName() {
        return "Lily";
    }
}
class Lotus extends Flower {
    @Override
    String whatsYourName() {
        return "Lotus";
    }
}
//parent class
class Region {
    Flower yourNationalFlower() {
        return new Flower();
    }
}
//extend region class
class WestBengal extends Region {
    @Override
    //return string with content we have passed from extended class
    Jasmine yourNationalFlower() {
        return new Jasmine();
    }
}
//extend region class
class Karnataka extends Region {
    @Override
    //return string we passed from extended class
    Lotus yourNationalFlower() {
        return new Lotus();
    }
}
//extend region class

class AndhraPradesh extends Region {
    @Override
    //return string from extended class
    Lily yourNationalFlower() {
        return new Lily();
    }
}