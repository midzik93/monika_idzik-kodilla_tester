public class Notebook {
    int weight ;  //atrybuty klasy Notebook. Konstrukto przekaże klasie tę włąsciwość
int price;
int year;
public Notebook (int weight, int price, int year){//tworzenie konstuktora który zawiera argumenty int weight (typ i nazwa)
this.weight =weight; // this <- w ramach konstruktora chcemy się odwołać do atrybuty klasy
this.price=price;
this.year=year;
}
public void checkPrice () {
    if (this.price < 600) {
        System.out.println("This notebook is very cheap");
    } else if (this.price >= 600 && this.price <= 1000) {
        System.out.println("This price is good");
    } else {
        System.out.println("This notebook is expensive");
    }
}
    public void checkWeight (){
if (this.weight <1000) {
    System.out.println(" This laptop is lightweight");
} else if (this.weight >= 1000 && this.weight <=1200){
    System.out.println(" This laptop isn't too heavy");
} else {
    System.out.println(" This laptop is very heavy");
}

    }
    public void checkYearAndPrice(){
    if (this.price <1500 && this.year <= 2020) {
        System.out.println("Very low range");
    }else if (this.price >= 1500 && this.price <= 2500 && this.year < 2021) {
        System.out.println("Low range");
    } else if (this.price >= 2500 && this.price <3000 && this.year <=2021){
        System.out.println("Avarage range");
        } else if (this.price >= 3000 && this.price < 8000 && this.year <=2023){
        System.out.println("High range");
    } else if (this.price >= 8000 && this.year >=2023){
        System.out.println("Very high range");
    }
} }
