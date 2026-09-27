public class ElonsToyCar {
    private int distanceDriven = 0;
    private int batteryPercentage = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    public String batteryDisplay() {
        if (batteryPercentage == 0) {
            return "Battery empty";
        }
        return "Battery at " + batteryPercentage + "%";
    }

    public void drive() {
        if (batteryPercentage > 0) {
            distanceDriven += 20;
            batteryPercentage -= 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Probando Elon's Toy Car");
        ElonsToyCar car = ElonsToyCar.buy();
        System.out.println("Estado inicial: " + car.distanceDisplay() + " | " + car.batteryDisplay());
        
        car.drive();
        car.drive();
        
        System.out.println("Después de conducir: " + car.distanceDisplay() + " | " + car.batteryDisplay());
    }
}