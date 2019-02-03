package SDA.ProductMenager;

import SDA.BubbleSort;

public class BubbleSortString implements BubbleSort<String> {


    @Override
    public String[] sort(String[] tablica) {

            char[] a = tekst.toCha();
            char temp;
            for(int i =0 ; i<a.length; i++)
                for (int j = 0; j < a.length; j++) {
                    if(a[j] > a[j+1]){
                        temp = a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    }
                }
            return tekst;
        }
    }
}
