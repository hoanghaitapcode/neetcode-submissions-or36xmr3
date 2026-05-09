class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        int n = s1.length();
        for(int i =0;i<n;i++){
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        int n2 = s2.length();
        int left =0;
        for(int right=0;right<n2;right++){
            map2.put(s2.charAt(right),map2.getOrDefault(s2.charAt(right),0)+1);
            if(right-left+1==n) {
                if(map.equals(map2)) return true;
            
            char leftChar = s2.charAt(left);
            map2.put(leftChar,map2.get(leftChar)-1);
            if(map2.get(leftChar)==0) {
                map2.remove(leftChar);
            }
            left++;
            }
            
        }
        return false;
    }
}
