class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        if (birdsPerDay.length == 0) return 0;
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        if (birdsPerDay.length > 0) {
            birdsPerDay[birdsPerDay.length - 1]++;
        }
    }

    public boolean hasDayWithoutBirds() {
        for (int count : birdsPerDay) {
            if (count == 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        int limit = Math.min(numberOfDays, birdsPerDay.length);
        for (int i = 0; i < limit; i++) {
            sum += birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int busyDaysCount = 0;
        for (int count : birdsPerDay) {
            if (count >= 5) {
                busyDaysCount++;
            }
        }
        return busyDaysCount;
    }

    public static void main(String[] args) {
        System.out.println("Probando Bird Watcher");
       
        int[] avesDeLaSemana = {2, 5, 0, 7, 4, 1, 3};
        BirdWatcher observador = new BirdWatcher(avesDeLaSemana);
        
        System.out.println("Aves vistas hoy (último día): " + observador.getToday());
        
        observador.incrementTodaysCount();
        System.out.println("Aves vistas hoy (después de incrementar 1): " + observador.getToday());
        
        System.out.println("¿Hubo algún día sin ver aves?: " + observador.hasDayWithoutBirds());
        System.out.println("Total de aves en los primeros 4 días: " + observador.getCountForFirstDays(4));
        System.out.println("Cantidad de días muy ocupados (5 o más aves): " + observador.getBusyDays());
    }
}