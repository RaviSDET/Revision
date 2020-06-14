package Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GetOnlyKey {
public static void main(String[] args) {
	Map<Integer,String> map = new HashMap<Integer,String>();
	map.put(1, "Testing");
	map.put(2, "Automation");
	map.put(3,"SDET");
	System.out.println("Size of Map is "+map.size());
	Set<Integer> keyset = map.keySet();
	for(Integer key : keyset) {
		System.out.println(key);
	}
}
}
