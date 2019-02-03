package SDA;

import SDA.ProductMenager.BubbleSortString;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args) {
        Integer[] a = {1, 6, 4, 2, 7, 9, 0, 3};
        BubbleSort<Integer> intSort = new BubbleSortInt();
        intSort.sort(a);
        BubbleSort<String> strSort = new BubbleSortString();
        strSort.sort(a);
    }

}
