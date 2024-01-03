public class AdvCalculator {
    //klasa ta będzie pytała użytkownika jakiego działania chce użyć

    public double calculate() {
        String userSelected = UserDialogs.getUserSelection();
        int a = UserDialogs.getValue();
        int b = UserDialogs.getValue();
        return switch (userSelected) {             //swich gdy chcemu wybrać jeden z przypadków
            case "ADD" -> a + b;
            case "SUB" -> a - b;  //następuje przypisana wyniku do słowa rezult
            case "DIV" -> a / b;
            case "MUL" -> a * b;
            default -> 0;
        };


    }

}
