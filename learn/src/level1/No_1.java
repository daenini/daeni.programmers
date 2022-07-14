package level1;

import java.util.ArrayList;

public class No_1 {

    public static void main(String[] args) {
        int[] num = {5,6,3,1,2,4,5,6,1,1,8,9};
        int k =num[0];
        ArrayList<Integer> arrNum = new ArrayList<Integer>();
        // 정렬
        for(int i =1; i<num.length; i++) {
            for(int j =0; j<num.length-1; j++) {
                if(num[j] >= num[j+1]) {
                    int temp = 0;
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        // 중복된 값 나오면 제거
        for(int i=0; i< num.length; i++) {
            for(int j =i+1; j<num.length-1; j++) {
                if(num[i]==num[j]) {
                    k = num[i];
                    break;
                }
            }
            if(k != num[i]) {
                arrNum.add(num[i]);
            }
        }
        for(int i =0; i<arrNum.size(); i++) {
            System.out.print(arrNum.get(i)+" ");
        }
    }

}