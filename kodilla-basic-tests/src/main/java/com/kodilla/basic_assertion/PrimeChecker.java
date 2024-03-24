package com.kodilla.basic_assertion;

public class PrimeChecker {

    private int count;

    public boolean isPrime(int number) {
        if (number <2){
            return false;
        }
        for (int i=2; i<number; i++){
            if(number % i==0){ //jeśli reszta z dzielnia jest równa 0 -> false
                return false;
            }
        }
        return true; //niezależnie od wielkości zwracamy true
    }
    public int getCount(){
        return count;
    }

    public void incrementCount() {
        this.count++;
    }

}

//    przekazujemy liczbę 14, oczekujemy false,
//        przekazujemy liczbę 13, oczekujemy true,
//        przekazujemy cyfrę 2, oczekujemy true,
//        przekazujemy cyfrę 1, oczekujemy false,
//        przekazujemy cyfrę 0, oczekujemy false,
//        przekazujemy cyfrę -6, oczekujemy false.