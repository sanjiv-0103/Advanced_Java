import java.util.*;

class DNSEntry {
    String ip;
    long expiry;

    DNSEntry(String ip, long ttl) {
        this.ip = ip;
        this.expiry = System.currentTimeMillis() + ttl;
    }
}

public class DNSCache {

    HashMap<String, DNSEntry> cache = new HashMap<>();

    public String resolve(String domain) {
        if (cache.containsKey(domain)) {
            DNSEntry e = cache.get(domain);

            if (System.currentTimeMillis() < e.expiry)
                return e.ip;
        }

        String newIp = "192.168.1.1";
        cache.put(domain, new DNSEntry(newIp, 5000));
        return newIp;
    }

    public static void main(String[] args) {
        DNSCache dns = new DNSCache();
        System.out.println(dns.resolve("google.com"));
    }
}