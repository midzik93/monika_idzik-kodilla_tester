import java.awt.*;

public class FirstClass {
    public static void main(String[] args) {//System.out.println(notebook);   // przekazywanie całego obiektu notebook do System.out.println
        Notebook notebook = new Notebook(600, 3000, 2021);
        System.out.println("notebook.weight: " + notebook.weight + " notebook.price: " + notebook.price);// wywołujemy zmienną weight z obiektu notebook
        notebook.checkPrice();  //weryfikacja dla wszystkich
        notebook.checkWeight();
        notebook.checkYearAndPrice();

        Notebook heavyNotebook = new Notebook(2500, 5000, 2023);
        System.out.println("heavyNotebook.weight: " + heavyNotebook.weight + " heavyNotebook.price: " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearAndPrice();

        Notebook oldNotebook = new Notebook(2000, 1500, 2018);
        System.out.println("oldNotebook.weight: " + oldNotebook.weight + " oldNotebook.price: " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearAndPrice();

        Notebook cheapNotebook = new Notebook(2000, 1000, 2020);
        System.out.println("cheapNotebook.weight: " + cheapNotebook.weight + " cheapNotebook.price: " + cheapNotebook.price);
        cheapNotebook.checkPrice();
        cheapNotebook.checkWeight();
        cheapNotebook.checkYearAndPrice();

        Notebook expensiveNotebook = new Notebook(2000, 8000, 2023);
        System.out.println("expensiveNotebook.weight: " + expensiveNotebook.weight + " expensiveNotebook.price: " + expensiveNotebook.price);
        expensiveNotebook.checkPrice();
        expensiveNotebook.checkWeight();
        expensiveNotebook.checkYearAndPrice();

//        if (notebook.price < 900) {    //metoda ta weryfikuje konkretny obiekt np notebook, czy oldNotebook
//    System.out.println("This notebook is cheap");
//}else {
//    System.out.println("This notebook is expensive");
//}
    }
}

