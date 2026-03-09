import java.util.*;

public class WebsiteAnalytics {

    HashMap<String, Integer> pageViews = new HashMap<>();

    public void visit(String page) {
        pageViews.put(page, pageViews.getOrDefault(page, 0) + 1);
    }

    public void showTopPages() {
        for (String page : pageViews.keySet()) {
            System.out.println(page + " : " + pageViews.get(page));
        }
    }

    public static void main(String[] args) {
        WebsiteAnalytics wa = new WebsiteAnalytics();

        wa.visit("/news");
        wa.visit("/news");
        wa.visit("/sports");

        wa.showTopPages();
    }
}