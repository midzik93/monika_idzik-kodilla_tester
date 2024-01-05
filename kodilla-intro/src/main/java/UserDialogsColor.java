import java.security.PrivateKey;
import java.util.Scanner;

public class UserDialogsColor {
    public static void getUserChoose() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select R-Red, B-Blue, G-Green, W-White, Y-Yellow:");
        while (true) {
            String chooseColor = scanner.nextLine().toUpperCase();
            switch (chooseColor) {
                case "R" -> System.out.println("Red");
                case "B" -> System.out.println("Blue");
                case "G" -> System.out.println("Green");
                case "W" -> System.out.println("White");
                case "Y" -> System.out.println("Yellow");

                default -> System.out.println("No letter has been added or the correct one has not been added");
            }

        }

    }

    public static void main(String[] args) {
        UserDialogsColor.getUserChoose();
    }


}

