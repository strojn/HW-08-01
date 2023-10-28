package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("перший");
        words.add("другий");
        words.add("третій");
        words.add("четвертий");
        words.add("п'ятий");
        words.add("шостий");
        words.add("сьомий");
        words.add("восьмий");
        words.add("дев'ятий");
        words.add("десятий");

        Iterator<String> it = words.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
