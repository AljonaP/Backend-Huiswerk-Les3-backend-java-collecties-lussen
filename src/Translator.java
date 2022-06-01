import java.util.HashMap;

// Stap 4.
public class Translator {
    // Stap 5.
    HashMap<Integer, String> numericAlpha = new HashMap<>();
    // Stap 6.
    private String[] alphabetic;
    private Integer[] numeric;

    public Translator(String[] alphabetic, Integer[] numeric) {
        this.alphabetic = alphabetic;
        this.numeric = numeric;

        // Stap 7.
        for (int i = 0; i < alphabetic.length; i++) {
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }

    // Stap 10.
    public String translate(Integer number) {
        // Stap 11.
        String resultValue = numericAlpha.get(number);
        return resultValue;
    }
}
