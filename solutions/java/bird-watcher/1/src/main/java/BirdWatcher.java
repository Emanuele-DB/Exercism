
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        if (birdsPerDay.length == 0) {
        return 0;
        }
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        int oggi = birdsPerDay.length - 1;
        birdsPerDay[oggi] = birdsPerDay[oggi] +1;
    }

    public boolean hasDayWithoutBirds() {
        for (int dayCount : birdsPerDay) {
            if (dayCount == 0) {
                return true;
            }
        }
        return false;
    }


    public int getCountForFirstDays(int numberOfDays) {
        int sommaParziale = 0;
        for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++) {
        sommaParziale += birdsPerDay[i];
        }
        return sommaParziale;
    }

    public int getBusyDays() {
        int giorniBusy = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {   
            if (birdsPerDay[i] >= 5) {
                giorniBusy++;
            }
        }
        return giorniBusy;
    }
}