class NeedForSpeed {
    public int speed;
    public int batteryDrain;
    public int battery;
    public int  distance;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        battery = 100;
        distance = 0;
    }

    public boolean batteryDrained() {
        return (battery > 0) ? false : true;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if (battery > 0) {
            distance += speed;
            battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class  RaceTrack{
    private  int trackDistance;

    public RaceTrack(int trackDistance) {
        this.trackDistance = trackDistance;
    }
    public boolean tryFinishTrack(NeedForSpeed car) {
        while (!car.batteryDrained()) {
            car.drive();
        }
        return (car.distance >= this.trackDistance);
    }
}

