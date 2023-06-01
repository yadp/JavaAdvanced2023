package preparation.array;

import java.util.Arrays;

public class MainArray {

    public static void main(String[] args) {
       /* int[] arr = {};
        int[] arr2 = new int[5];


        System.out.println(arr);

        System.out.println(Arrays.toString(arr));*/



        int[] arr3 = new int[] { 1,2,3};
        System.out.println(Arrays.toString(arr3));
        int numEven = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i]%2==0){
                numEven++;
            }
        }

        System.out.println("Number of Even "+ numEven);
        System.out.println("Number of Odd "+ (arr3.length-numEven));

    }
}
