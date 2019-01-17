package hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LeftJoin {

    public Set<Object[]> leftJoin(HashMap<String, String> hm1, HashMap<String, String> hm2) {
        Set<Object[]> totalHash = new HashSet<>();
        for (Object key : hm1.keySet()) {
            totalHash.add(key, hm1.get(key));
            if (hm2.containsKey(key)) {
                totalHash.add(hm2.get(key));
            } else {
                totalHash.add("Null");
            }
        }
        return totalHash;
    }
}
