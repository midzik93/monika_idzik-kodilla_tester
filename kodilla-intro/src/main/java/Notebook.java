public class Notebook {
    int weight;  //atrybuty klasy Notebook. Konstrukto przekaże klasie tę włąsciwość
    int price;
    int year;

    public Notebook(int weight, int price, int year) {//tworzenie konstuktora który zawiera argumenty int weight (typ i nazwa)
        this.weight = weight; // this <- w ramach konstruktora chcemy się odwołać do atrybuty klasy
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (price < 600) {
            System.out.println("This notebook is very cheap");
        } else if (price >= 600 && price <= 1000) {
            System.out.println("This price is good");
        } else {
            System.out.println("This notebook is expensive");
        }
    }

    public void checkWeight() {
        if (weight < 1000) {
            System.out.println(" This laptop is lightweight");
        } else if (weight >= 1000 && weight <= 1200) {
            System.out.println(" This laptop isn't too heavy");
        } else {
            System.out.println(" This laptop is very heavy");
        }

    }

    public void checkYearAndPrice() {
        if (price < 1500 && year <= 2020) {
            System.out.println("Very low range");
        } else if (price >= 1500 && price <= 2500 && year < 2021) {
            System.out.println("Low range");
        } else if (price >= 2500 && price < 3000 && year <= 2021) {
            System.out.println("Avarage range");
        } else if (price >= 3000 && price < 8000 && year <= 2023) {
            System.out.println("High range");
        } else if (price >= 8000 && year >= 2023) {
            System.out.println("Very high range");
        }
    }
}
