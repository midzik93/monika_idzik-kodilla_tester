public class LastElement {
    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50}; // Przykładowa tablica

        if (myArray.length > 0) {
            int lastIndex = myArray.length - 1; // Indeks ostatniego elementu
            int lastElement = myArray[lastIndex]; // Pobranie wartości ostatniego elementu
            System.out.println("Ostatni element tablicy: " + lastElement);
        } else {
            System.out.println("Tablica jest pusta");
        }
    }
}
