package main.java.sspdev.leetcode.top150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class _380_InsertDeleteGetRandom {

    static public class RandomizedSet {

        private final Map<Integer, Integer> map;
        private final List<Integer> list;
        private final Random random = new Random();

        public RandomizedSet() {
            map = new HashMap<>();
            list = new ArrayList<>();
        }

        public boolean insert(int val) {
            if (map.containsKey(val)) {
                return false;
            }
            map.put(val, list.size());
            list.add(list.size(), val);
            return true;
        }

        public boolean remove(int val) {
            if (!map.containsKey(val)) {
                return false;
            }
            var lastElement = list.get(list.size() - 1);
            var idx = map.get(val);
            map.put(lastElement, idx);
            list.remove(list.size() - 1);
            map.remove(val);
            return true;
        }

        public int getRandom() {
            return list.get(random.nextInt(list.size()));
        }

    }
}
