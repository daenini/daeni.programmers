class Solution {
    public int[] solution(String myString) {
        
        String[] splitX = myString.split("x", -1);
        int[] length = new int[splitX.length];

        for (int i = 0; i < splitX.length; i++) {
            length[i] = splitX[i].length();
        }

        return length;
    }
}