package JINH23;
public class Main {
    public static void main(String[] args) {
        final byte krueger = 42;
        final byte meyer = 121;
        byte skillnad = meyer - krueger;

        System.out.println("Hur många har Freddy Krueger dödat? " + krueger );
        System.out.println("Hur många har Michael Meyer dödat? " + meyer );
        System.out.println("Det skiljer med " + skillnad + " offer");
    }
}