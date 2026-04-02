class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> table1 = new HashMap<>();
        HashMap<Character,Integer> table2 = new HashMap<>();

        if(s.length() != t.length()) {
            return false;
        }

        for(char c : s.toCharArray()) {
            if(table1.containsKey(c)) {
                table1.put(c,table1.get(c)+1);
            }
            else {
                table1.put(c,1);
            }
        }
        for(char c : t.toCharArray()) {
             if(table2.containsKey(c)) {
                table2.put(c,table2.get(c)+1);
            }
            else {
                table2.put(c,1);
            }
        }
        if(table1.size()!=table2.size()) {
                return false;
            }

        for(char c :s.toCharArray()) {
            
            if(!table1.get(c).equals(table2.get(c))) {
                return false;
            }
        }
        return true;
    }
}
