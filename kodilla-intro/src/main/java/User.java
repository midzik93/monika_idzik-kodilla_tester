import java.util.stream.StreamSupport;

public class User {
    private String name;
    private int age;

    //konstruktor
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //metoda zwracająca imię
    public String getName() {
        return name;
    }

    //metoda zwracająca wiek.
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        //inicjowanie tablicy o rozmiarze 10
        User[] users = new User[10];

        //Tworzenie i umieszczenie obiektór w tablicy
        users[0] = new User("Monika", 30);
        users[1] = new User("Jarosław", 55);
        users[2] = new User("Anna", 53);
        users[3] = new User("Karol", 18);
        users[4] = new User("Joanna", 30);
        users[5] = new User("Anna", 25);
        users[6] = new User("Lucyna", 60);
        users[7] = new User("Katarzyna", 28);
        users[0].setAge(1000);


        //obliczanie sumy wieku users
        int sum = 0;//inicjalizacja zmiennej 0 (przechowuje sumy)
        int count = 0;
        for (User user : users) {         //pęta for-each , iteruje przez każdy element tablicy 'users'
            if (user != null) {      // sprawdzanie czy bieżący element 'user' w tabeli nie jest null
                sum += user.getAge(); //dla usera który nie jest null pobierany jest wiek za pomocą user.getAge() i dodaje do sum
                count++;
                // System.out.println("Suma wieku użytkownika to: " + sum);
            }
        }

        double avg = (double) sum / count;    // (double)sum konweruje zmienną sum na typ double
        System.out.println("Srednia wieku użytkowników to: " + avg);
        System.out.println("Użytkownicy poniżej średniej wieku: ");
        for (User user : users) {
            if (user != null && user.getAge() < avg) {
                System.out.println(user.getName() + " , wiek: " + user.getAge());
            }
        }
    }
}
