package SDA;

import java.util.ArrayList;

public class Algorytmy {

    public ArrayList<Integer> getPrime(int from, int to){
        ArrayList<Integer> wynik = new ArrayList<>();
        boolean isPrime = true;

        //Warunki brzegowe
        if (to < 2) {
            wynik.add(1);
            return wynik;
        }
        if (from < 2) from = 2;
        // obliczanie
        for (int i = from; i <= to; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                wynik.add(i);
            }
            isPrime = true;
        }
        //wynik
        return wynik;
    }




}
