import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
       //1
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
        System.out.println("ArrayList original ordenado:");






    }
}