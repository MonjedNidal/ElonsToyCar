public class ElonsToyCar {

    public static void main(String[] args) {
        //Create an object
        ElonsToyCar car = buy();

        //drive 15 times.
        for (int i = 0; i < 15; i++) {
            car.drive();
        }

        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
    }

    //Distance will start from zero and battery will start from 100 percent
    public int distance= 0;
    public int battery= 100;

    //Function buy to buy a car (Create object from ElonsToyCar class)
    public static ElonsToyCar buy() {
        ElonsToyCar car = new ElonsToyCar();
        return car;
    }

    // distanceDisplay Function to display the traveled distance
    public String distanceDisplay() {
        return "Driven "+distance+" meters";
    }

    // batteryDisplay Function to display the battery percent
    public String batteryDisplay() {
        if(battery != 0){
            return "Battery at "+battery+"%";
        }
        else return "Battery empty";

    }
    
    public void drive() {
        if(battery != 0){
            //The car will drive distance of 20 metre at one time and it will drain one percent of battery
            distance += 20;
            battery -= 1;
        }else System.out.println("Battery empty");

    }
}