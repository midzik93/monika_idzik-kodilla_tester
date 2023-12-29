public class Grades {
    private int[] grades;
    private int size; //zmienna size mówi nam ile aktualnie elementów mamy w tablicy
    private int lastIndex;

    public Grades() {         //obiekt Grades
        this.grades = new int[10];
        this.size = 0;
        this.lastIndex = -1;

    }


    //metoda dodająca przekazaną w argumencie ocenę do tablicy
    public void addGrade(int grade) {
        if (this.size == 10) {
            System.out.println("Nie można dodać oceny do tablicy");
            return;    //przerywamy metodę
        }
        this.grades[this.size] = grade;
        this.size++;
    }

    //metoda zwracająca ostatnią ocenę
    public int getLastGrade() {
        if (lastIndex >= 0) {
            System.out.println("Ostatnia dodana ocena to " + grades[lastIndex]);
            return grades[lastIndex];
        } else {
            System.out.println("Brak ocen");
            return -1;     // wartość -1 oznacza brak ocen

        }


    }

    //metoda zwracająca średnią ocen w tablicy
    public double avarageOfGrades() {
        if (size == 0) {
            System.out.println("Brak ocen do obliczania średniej");
            return 0.0;
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += grades[i];
        }
        double avarage = sum / grades.length;
        System.out.println("Srednia z ocen to: " + avarage);
return avarage;
    }
  }


