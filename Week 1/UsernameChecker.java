import java.util.*;

public class UsernameChecker {
    HashMap<String, Integer> users = new HashMap<>();

    public boolean checkAvailability(String username) {
        return !users.containsKey(username);
    }

    public void registerUser(String username, int userId) {
        users.put(username, userId);
    }

    public List<String> suggestAlternatives(String username) {
        List<String> suggestions = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            suggestions.add(username + i);
        }
        return suggestions;
    }

    public static void main(String[] args) {
        UsernameChecker uc = new UsernameChecker();
        uc.registerUser("Sanjiv", 1);

        System.out.println(uc.checkAvailability("Sanjiv"));
        System.out.println(uc.suggestAlternatives("Sanjiv"));
    }
}