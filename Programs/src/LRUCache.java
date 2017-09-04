import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
public class LRUCache<K, V> extends LinkedHashMap<K, V> {
 
    private static float loadFactor = 0.75f;
    private static Map<String, String> cache ;
    int size;
 
    private LRUCache(int size) {
        super(size, loadFactor, true);
        this.size = size;
    }
 
    public static Map<String, String> getInstance(int size) {
    	return Collections.synchronizedMap(new LRUCache<String,String>(size));
        
    }
 
    //@Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > size;
    }
 
    public static void main(String[] args) {
        cache = LRUCache.getInstance(3);
        cache.put("1", "A");
        cache.put("2", "B");
        cache.put("3", "C");
        System.out.println("get 1 "+cache.get("1"));
        cache.put("4", "D");
        System.out.println(cache);
        cache.get("3");
        cache.put("5","E");
        System.out.println(cache);
    }
 
}