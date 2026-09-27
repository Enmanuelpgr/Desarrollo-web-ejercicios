import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        return languages.isEmpty();
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        return languages.get(0);
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
        return languages.contains(language);
    }

    public boolean isExciting() {
        return languages.contains("Java") || languages.contains("Kotlin");
    }

    public static void main(String[] args) {
        System.out.println("Probando Karl's Languages");
        LanguageList miLista = new LanguageList();
        
        System.out.println("¿Está vacía al inicio?: " + miLista.isEmpty());
        
        miLista.addLanguage("Python");
        miLista.addLanguage("Java");
        miLista.addLanguage("C++");
        
        System.out.println("Cantidad de lenguajes: " + miLista.count());
        System.out.println("Primer lenguaje: " + miLista.firstLanguage());
        System.out.println("¿Contiene Java o Kotlin (Es emocionante)?: " + miLista.isExciting());
        
        miLista.removeLanguage("Java");
        System.out.println("¿Es emocionante después de borrar Java?: " + miLista.isExciting());
    }
}