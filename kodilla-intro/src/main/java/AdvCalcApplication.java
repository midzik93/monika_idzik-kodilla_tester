public class AdvCalcApplication {
    public static void main(String[] args) {

        UserDialogs userDialogs = new UserDialogs();
        String name = UserDialogs.getUsername();


        AdvCalculator calculator = new AdvCalculator();
        double result = calculator.calculate();
        System.out.println("Result " + result);
    }
}
