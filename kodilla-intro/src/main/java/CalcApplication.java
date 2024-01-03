public class CalcApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();    // [1]
        double area = calculator.circleArea(10);
        System.out.println("Area of the Circle with radius 10 equals: " + area);

        Calculator calculator1 = new Calculator();  //[2]
        double perimeter = calculator1.circlePerimeter(5);
        System.out.println("Perimeter of the Circle with radius 10 equals: " + perimeter);

        double p = Calculator.PI;  // [3]  // pole static powoduje, ze możemy z niego korzystać bez tworzenia obiektu klasy calculator
        // odwołujemy się tylko do pola PI przy pomocy klasy. Przed kropką jest nazwa klasy
        System.out.println("The value of a pi constant is equal to " + p);

        Calculator calculator2 = new Calculator();  //[4]
        System.out.println(calculator2.counter);   // w wyniku mamy liczbę 3
        // liczba 3 oznacza, że zmienna conter została użyta dla wszystkich 3 obiektów klasy Calculator
        // wartość 0 została zmodyfikowana o linię [1], [2], [4]
    }
}
