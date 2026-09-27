class AnnalynsInfiltration {
    
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        boolean conPerro = petDogIsPresent && !archerIsAwake;
        boolean sinPerro = !petDogIsPresent && prisonerIsAwake && !knightIsAwake && !archerIsAwake;
        
        return conPerro || sinPerro;
    }

    public static void main(String[] args) {
        // Variables de prueba
        boolean knightIsAwake = false;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        boolean petDogIsPresent = false;

        System.out.println("Probando Annalyn's Infiltration");
      
        boolean ataqueRapido = canFastAttack(knightIsAwake);
        System.out.println("¿Puede hacer ataque rápido?: " + ataqueRapido);
        
        boolean espiar = canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake);
        System.out.println("¿Puede espiar?: " + espiar);
        
        boolean senal = canSignalPrisoner(archerIsAwake, prisonerIsAwake);
        System.out.println("¿Puede hacer señales al prisionero?: " + senal);
        
        boolean liberar = canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent);
        System.out.println("¿Puede liberar al prisionero?: " + liberar);
    }
}
