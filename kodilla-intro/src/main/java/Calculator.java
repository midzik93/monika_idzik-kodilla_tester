public class Calculator {
    static final double PI = 3.1215927;
    static int counter;

    public Calculator() {   //instrucja zwiększająca wartość tego pola podczas tworzenia objektu
        counter++;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double circleArea(double r) {
        String name = UserDialogs.getUsername(); // wywołanie metody bezpośrednio na klasie (bez tworzenia obiektu)
        System.out.println(" Hi. " + name + " Thank you for using our software.");
        return PI * r * r;
    }

    public double circlePerimeter(double r) {
        return 2 * PI * r;
    }

    public static void main(String[] args) {
        String name = UserDialogs.getUsername(); // Pobieranie imienia z klawiatury
    }
}
