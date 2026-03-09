import java.util.*;

public class RateLimiter {

    HashMap<String, Integer> requestCount = new HashMap<>();
    int limit = 5;

    public void request(String client) {
        int count = requestCount.getOrDefault(client, 0);

        if (count < limit) {
            requestCount.put(client, count + 1);
            System.out.println("Request allowed");
        } else {
            System.out.println("Rate limit exceeded");
        }
    }

    public static void main(String[] args) {
        RateLimiter rl = new RateLimiter();

        for (int i = 0; i < 7; i++)
            rl.request("user1");
    }
}