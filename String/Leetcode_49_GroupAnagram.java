package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Leetcode_49_GroupAnagram {

  public static List<List<String>> Leetcode_49_GroupAnagram(String[] strs) {

    HashMap<String, List<String>> map = new HashMap<>();

    for (String str : strs) {

      char[] ch = str.toCharArray();

      Arrays.sort(ch);

      String key = new String(ch);

      if (!map.containsKey(key)) {
        map.put(key, new ArrayList<>());
      }

      map.get(key).add(str);
    }

    return new ArrayList<>(map.values());
  }

  public static void main(String[] args) {

    String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };

    List<List<String>> ans = Leetcode_49_GroupAnagram(strs);

    System.out.println(ans);
  }
}