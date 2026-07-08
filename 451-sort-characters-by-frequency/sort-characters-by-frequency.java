import java.util.*;
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        Character[] arr =new Character[s.length()];
        for (int i = 0; i< s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        Arrays.sort(arr,(a,b)->{
            if(map.get(b).equals(map.get(a))){
                return a-b;
            }
            return map.get(b)-map.get(a);
        });

        StringBuilder sb = new StringBuilder();
        for(char ch : arr){
            sb.append(ch);
        }
        return sb.toString();


    }
}