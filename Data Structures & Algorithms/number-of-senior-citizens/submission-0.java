class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for (String detail : details){
            if (detail.length() < 15) continue;
            String sAge = detail.substring(11, 13);
            int age = Integer.parseInt(sAge);
            if (age > 60) count++;
            
        }
        return count;
    }
}