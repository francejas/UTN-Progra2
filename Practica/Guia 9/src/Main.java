import java.util.*;

public class Main {
    public static void main(String[] args) {
       //1

        /*
        Random rand = new Random();

        ArrayList<Integer> arrayList =  new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();

        int limite = 10;

        for (int i = 0; i < limite ; i++) {
            arrayList.add(rand.nextInt(11));
        }

        System.out.println("ArrayList original desordenado:");
        System.out.println(arrayList);

        Collections.sort(arrayList);

        System.out.println("\nArrayList original ordenado (con duplicados):");
        System.out.println(arrayList);

        hashSet.addAll(arrayList);
        System.out.println("\nHashSet con elementos únicos (sin duplicados):");
        System.out.println(hashSet);


         */

        ArrayList<Integer> arrayListIntRand = new ArrayList<>();

        TreeSet<Integer> treeSet = new TreeSet<>();

        int limite = 20;

        Random random = new Random();


        for (int i = 0; i < limite ; i++) {
            arrayListIntRand.add(random.nextInt(11));
        }

        System.out.println("Lista original generada (con duplicados):");
        System.out.println(arrayListIntRand);

        treeSet.addAll(arrayListIntRand);
        System.out.println("\nNúmeros en orden ascendente (usando TreeSet):");
        System.out.println(treeSet);
        System.out.println("\nNúmeros en orden descendente (usando descendingSet()):");
        System.out.println(treeSet.descendingSet());





    }
}