package IBM;
import java.util.*;
public class Groupanagrams {
      public static List<List<String>> group(String[] str){
        Map<String,List<String>> map=new HashMap<>();
        for(String s:str){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String key=String.valueOf(ch);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
