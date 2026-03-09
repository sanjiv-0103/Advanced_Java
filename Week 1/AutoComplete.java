import java.util.*;

public class AutoComplete {

    HashMap<String, Integer> queries = new HashMap<>();

    public void addQuery(String q) {
        queries.put(q, queries.getOrDefault(q, 0) + 1);
    }

    public void search(String prefix) {
        for (String q : queries.keySet()) {
            if (q.startsWith(prefix))
                System.out.println(q);
        }
    }

    public static void main(String[] args) {
        AutoComplete ac = new AutoComplete();

        ac.addQuery("java tutorial");
        ac.addQuery("javascript guide");

        ac.search("jav");
    }
}