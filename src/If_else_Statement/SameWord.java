package If_else_Statement;

public class SameWord {

    public static void main(String... args) {

        /*
        Write a method that will print matching words that will ignore the case
        Ex: alexandria, Alexandria = match
        Ex: alexandria, Miami = doesnt match
         */

        word("alexandria", "Alexandria");
    }

    public static void word(String first, String second) {
        if (first.equalsIgnoreCase(second)) {
            System.out.println("your first word is " + first + " and it matches second word " + second);
        } else {
            System.out.println("your word doesnt match " + first + " , " + second);
        }
    }
}
