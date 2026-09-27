public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double produccionPerfecta = speed * 221;
        
        if (speed >= 1 && speed <= 4){
            return produccionPerfecta * 1.0;
        } else if (speed >= 5 && speed <= 8){
            return produccionPerfecta * 0.90;
        } else if (speed == 9){
            return produccionPerfecta * 0.80;
        } else if (speed == 10){
            return produccionPerfecta * 0.77;
        } else {
            return 0.0;
        }
    }

    public int workingItemsPerMinute(int speed) {
        double produccionPorHora = productionRatePerHour(speed);
        return (int) (produccionPorHora / 60);
    }

    public static void main(String[] args) {
        CarsAssemble ensambladora = new CarsAssemble();
        
        int[] velocidadesDePrueba = {1, 6, 10};
        
        for (int velocidad : velocidadesDePrueba) {
            System.out.println("Probando con velocidad: " + velocidad );
            
            double produccionPorHora = ensambladora.productionRatePerHour(velocidad);
            System.out.println("Producción por hora: " + produccionPorHora);
            
            int produccionPorMinuto = ensambladora.workingItemsPerMinute(velocidad);
            System.out.println("Autos terminados por minuto: " + produccionPorMinuto);
            System.out.println("--------------------------------------------------\n");
        }
    }
}