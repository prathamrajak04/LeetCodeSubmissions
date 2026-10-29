class Solution {
    public int countKeyChanges(String s) {
        String lowerS = s.toLowerCase();
        int changes = 0;
        
        
        for (int i = 1; i < lowerS.length(); i++) {
            if (lowerS.charAt(i) != lowerS.charAt(i - 1)) {
                changes++;
            }
        }
        
        return changes;
    }
}
