import java.util.*;

public class MergeTwoMaps {

    public static Map mergeMaps(Map map1, Map map2) {
        Map mergedMap = new HashMap(map1);

        for (Object key : map2.keySet()) {
            if (mergedMap.containsKey(key)) {
                mergedMap.put(key, (Integer) mergedMap.get(key) + (Integer) map2.get(key));
            } else {
                mergedMap.put(key, map2.get(key));
            }
        }

        return mergedMap;
    }

    public static void main(String[] args) {
        Map map1 = new HashMap();
        map1.put("A", 1);
        map1.put("B", 2);

        System.out.println("Map1: " + map1);

        Map map2 = new HashMap();
        map2.put("B", 3);
        map2.put("C", 4);

        System.out.println("Map2: " + map2);

        Map resultMap = mergeMaps(map1, map2);

        System.out.println("Merged Map: " + resultMap);
    }
}

