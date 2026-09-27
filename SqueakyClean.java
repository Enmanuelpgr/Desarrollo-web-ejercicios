public class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder result = new StringBuilder();
        boolean isAfterDash = false;
        
        for (char c : identifier.toCharArray()) {
            if (c == ' ') {
                result.append('_');
            } else if (Character.isISOControl(c)) {
                result.append("CTRL");
            } else if (c == '-') {
                isAfterDash = true;
            } else if (Character.isLetter(c)) {
                if (c >= 'α' && c <= 'ω') {
                    continue; 
                }
                
                if (isAfterDash) {
                    result.append(Character.toUpperCase(c));
                    isAfterDash = false;
                } else {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("Probando Squeaky Clean");
        System.out.println("Espacios: " + SqueakyClean.clean("my   Id"));
        System.out.println("Control chars: " + SqueakyClean.clean("my\0Id"));
        System.out.println("Kebab-case: " + SqueakyClean.clean("a-camel-case"));
        System.out.println("Letras griegas (omitidas): " + SqueakyClean.clean("MyΟβιεγτFinder"));
    }
}