public class Lasagna {

    public static void main(String[] args) {
        Lasagna miLasagna = new Lasagna();
        
        System.out.println("Minutos esperados en el horno: " + miLasagna.expectedMinutesInOven());
        System.out.println("Minutos restantes : " + miLasagna.remainingMinutesInOven(30));
        System.out.println("Tiempo de preparación, 2 capas: " + miLasagna.preparationTimeInMinutes(2));
        System.out.println("Tiempo total 3 capas, 20 min transcurridos: " + miLasagna.totalTimeInMinutes(3, 20));
    }

   public int expectedMinutesInOven(){
        return 40;
   }
   public int remainingMinutesInOven(int minutosTranscurridos){
        return expectedMinutesInOven() - minutosTranscurridos;
   }
   public int preparationTimeInMinutes(int numeroDeCapas){
    return numeroDeCapas * 2;
   }
   public int totalTimeInMinutes(int numeroDeCapas, int minutosTranscurridos){
    return preparationTimeInMinutes(numeroDeCapas) + minutosTranscurridos;
   }
}