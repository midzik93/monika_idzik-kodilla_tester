import java.util.Scanner;

public class UserDialogs {
    public static String getUsername() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your name:");
            String name = scanner.nextLine().trim();
            if (name.length() >= 2) {
                return name;
            }
            System.out.println("Name is too short. Try again.");
        }
    }
    public static String getUserSelection() {
        Scanner scanner = new Scanner (System.in);
        while (true) {
            System.out.println("Select calculation (A-add, S-subtract, D-divide, M-multiply:");
            String calc = scanner.nextLine().toUpperCase();
            switch (calc){    //calc jest to wyrażenie jakie chcemy sprawdzić
                case "A": return "ADD";   // w przypadku A ma zostać wykonana instrucja ADD i przypisana do Calc
                case "S": return "SUB";
                case "D": return "DIV";
                case "M": return "MUL";
                default:     //gdy żaden z powyższych przypadków nie jest prawidłowy
                    System.out.println("Wrong calculation. Try again.");
            }
        }
    }
    //jeszcze potrzebujemy metode na wprowadzenie liczby

    public static int getValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int val= scanner.nextInt();
        return val;
    }
}