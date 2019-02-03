package SDA;

import SDA.ProductMenager.ProdProvider;
import SDA.ProductMenager.Product;
import SDA.ProductMenager.ProductComparator;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Algorytmy a = new Algorytmy();
        System.out.println(a.getPrime(-20, 5));

//        Student A = new Student(5,"adas","walczak");
//        Student B = new Student(12,"tomek","papaj");
//        Student C = new Student(55,"bartek","okon");
//
//        System.out.println(A.compareTo(B));
//        List<Student> studenci = Arrays.asList(A,B,C);
//        List<Integer> integersy = Arrays.asList(1,2,3,4,4,5,6,-1);
//        System.out.println(integersy);
//        Collections.sort(integersy);
//        System.out.println(integersy);
//
//        System.out.println(studenci);
//        Collections.sort(studenci);
//        System.out.println(studenci);

//###################### TASKI ##########################
        TDL b = new TDL();
        b.toDoList.add(new Task(Priority.HIGH, "zakupy", "kup jablka", Status.NOWE));
        b.toDoList.add(new Task(Priority.LOW, "anna", "idz do szkoly", Status.WTRAKCIE));
        b.toDoList.add(new Task(Priority.HIGH, "baba", "ugotuj obiad", Status.WTRAKCIE));
        b.toDoList.add(new Task(Priority.MED, "prysznic", "wez prysznic", Status.ZAKONCZONE));
        TaskComparator porownaj = new TaskComparator();

        b.printAll();

        b.getSortedByName(porownaj.compTaskByName);
        b.getSortedByPriority(porownaj.compTaskByPriority);
        b.getSortedNyName2(porownaj.compTaskByName,"DESC");




        System.out.println();
        b.printAll();
////#################### USEZRY ###################
//        List<User> listaUserow = new LinkedList<>();
//        listaUserow.add(new User(Priority.HIGH,25,"adas",1));
//        listaUserow.add(new User(Priority.MED,84,"bartek",22));
//        listaUserow.add(new User(Priority.LOW,32,"darek",3));
//        listaUserow.add(new User(Priority.HIGH,85,"zenon",43));
//        listaUserow.add(new User(Priority.MED,5,"cezary",5));
//
//        for (User x: listaUserow
//             ) {
//            System.out.println(x.toString());
//        }
//        listaUserow.sort(new UserComparator().compareByName);
//        listaUserow.sort(new UserComparator().compareById);
//        System.out.println();
//        for (User x: listaUserow
//        ) {
//            System.out.println(x.toString());
//        }
//#######################PROD MENAGEER #######################

        ProdProvider sklep = new ProdProvider();
        sklep.addProd(new Product(2, "ball","bigball",10,2.33));
        sklep.addProd(new Product(3, "zebra","ugly zebra",2,999.33));
        sklep.addProd(new Product(4, "horse","small horse",1,50.21));
        sklep.addProd(new Product(25, "dog","big dog",4,200.00));


        System.out.println(sklep.findByID(25).getProdName());
        System.out.println();
        for (Product x: sklep.findByTekst("e")
             ) {

            System.out.println(x.getProdName());
        }
        ProductComparator porownywarka = new ProductComparator();

        for (Product x: sklep.getAllProducts()
        ) {

            System.out.println(x.getProdName());
        }



    }
}
