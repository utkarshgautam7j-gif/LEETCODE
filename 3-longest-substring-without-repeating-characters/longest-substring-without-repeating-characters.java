import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int left =0;
        HashSet<Character> set = new HashSet<>();
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max= Math.max(max,right-left+1);
        }
        return max;
    }
}

/*
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int max = 0;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(check(s, i, j)){
                    max = Math.max(max, j - i + 1);
                }
                else{
                    break;
                }
            }
        }

        return max;
    }

    public boolean check(String s, int Start, int end){
        int[] freq = new int[256];

        for(int i = Start; i <= end; i++){
            int c = s.charAt(i);
            freq[c]++;

            if(freq[c] > 1){
                return false;
            }
        }

        return true;
    }
}
*/