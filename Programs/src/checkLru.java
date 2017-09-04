import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class checkLru<K, V> extends LinkedHashMap<K, V> {
	private static Map<String, String> cache;
	private static float loadFactor = 0.75f;
	private int size;
	
	checkLru(int size){
		super(size, loadFactor, true);
		this.size = size; 
	}
	
	public static Map<String, String> getInstance(int size){
		return Collections.synchronizedMap(new checkLru<String, String>(size));
	}
	
	public boolean removeEldest(Map.Entry<K, V> eldest) {
		return size() > size;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cache = LRUCache.getInstance(3);
        cache.put("1", "A");
        cache.put("2", "B");
        cache.put("3", "C");
        System.out.println("get 1 "+cache.get("1"));
        cache.put("4", "D");
        System.out.println(cache);
        cache.get("3");
        cache.get("1");
        cache.put("5","E");
        System.out.println(cache);

	}

}
