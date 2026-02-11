public class CarsAssemble {

    public double successRate(int speed) {
        if (speed == 0) {
            return 0.0;
        } else if (speed >= 1 && speed <= 4) {
            return 1.0;
        } else if (speed >= 5 && speed <= 8) {
            return 0.9;
        } else if (speed == 9){
            return 0.8;
        }else {
            return 0.77;
        }
    }
    public double productionRatePerHour(int speed) {
        return speed * 221 * successRate(speed);
    }
    public int workingItemsPerMinute(int speed) {
        double perMinute = productionRatePerHour(speed) / 60;
        return (int) perMinute;
    }
}
