public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.substring(logLine.indexOf(":") + 1).trim();
    }

    public static String logLevel(String logLine) {
        return logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]")).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }

    public static void main(String[] args) {
        System.out.println("=== Probando Log Levels ===");
        
        String logError = "[ERROR]: Invalid operation";
        String logWarning = "[WARNING]:  Disk space is low  ";
        String logInfo = "[INFO]: System booted";
        
        System.out.println("--- Prueba de Mensajes ---");
        System.out.println("Mensaje 1: '" + message(logError) + "'");
        System.out.println("Mensaje 2 (limpiando espacios): '" + message(logWarning) + "'");
        
        System.out.println("\n--- Prueba de Niveles ---");
        System.out.println("Nivel 1: " + logLevel(logError));
        System.out.println("Nivel 2: " + logLevel(logInfo));
        
        System.out.println("\n--- Prueba de Reformateo ---");
        System.out.println("Formato final: " + reformat(logError));
        System.out.println("Formato final: " + reformat(logWarning));
    }
}