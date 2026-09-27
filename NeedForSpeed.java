class RaceTrack {
    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while (!car.batteryDrained()) {
            car.drive();
        }
        return car.distanceDriven() >= this.distance;
    }
}

public class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int battery = 100;
    private int distanceDriven = 0;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (!batteryDrained()) {
            distanceDriven += speed;
            battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public static void main(String[] args) {
        System.out.println("Probando Need for Speed");
        int speed = 5;
        int batteryDrain = 2;
        NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);
        
        int trackDistance = 100;
        RaceTrack track = new RaceTrack(trackDistance);
        
        System.out.println("¿El auto puede terminar la pista de " + trackDistance + " metros?: " + track.tryFinishTrack(car));
        
        NeedForSpeed nitroCar = NeedForSpeed.nitro();
        System.out.println("¿El auto NITRO puede terminar?: " + track.tryFinishTrack(nitroCar));
    }
}
