import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Stap 2.
        Integer[] numeric = {1,2,3,4,5,6,7,8,9,0};
        // Stap 3.
        String[] alphabetic={"een", "twee", "drie", "vier", "five", "zes", "zeven", "acht", "negen", "zero"};
       // Stap 12.
        boolean play = true;
        String ongeldig = "ongeldige invoer";
        Scanner scanner = new Scanner(System.in);
        // Stap 9.
        Translator translator = new Translator(alphabetic, numeric);

        // Stap 13.
        while (play){
            // Stap 14.
            System.out.println("Type 'x' om te stoppen \nType 'v' om te vertalen");
            String input = scanner.nextLine();

        // Stap 15.
            if(input.equalsIgnoreCase("x")){
                play = false;
            } else if(input.equalsIgnoreCase("v")){
                System.out.println("Type een cijfer in van 0 t/m 9");
                int number = scanner.nextInt();
                scanner.nextLine();
                if(number < 10){
                    String result = translator.translate(number);
                    System.out.println("De vertaling van " + number + " is " + result);
                } else {
                    System.out.println(ongeldig);
                }
            } else {
                System.out.println(ongeldig);
            }
        }


    }
}
