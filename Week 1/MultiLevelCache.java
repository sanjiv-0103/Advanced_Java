import java.util.*;

public class MultiLevelCache {

    HashMap<String, String> L1 = new HashMap<>();
    HashMap<String, String> L2 = new HashMap<>();

    public String getVideo(String id) {

        if (L1.containsKey(id)) {
            return "L1 Cache Hit";
        }

        if (L2.containsKey(id)) {
            L1.put(id, L2.get(id));
            return "L2 Cache Hit -> Promoted to L1";
        }

        String data = "VideoFromDatabase";
        L2.put(id, data);

        return "Loaded from DB";
    }

    public static void main(String[] args) {
        MultiLevelCache cache = new MultiLevelCache();

        System.out.println(cache.getVideo("v1"));
        System.out.println(cache.getVideo("v1"));
    }
}