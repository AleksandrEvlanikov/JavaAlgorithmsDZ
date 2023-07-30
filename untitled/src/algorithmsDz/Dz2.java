package algorithmsDz;

//   Реализовать алгоритм пирамидальной сортировки (сортировка кучей).


import java.util.Arrays;

public class Dz2 {

    public static void main(String[] args) {

        int[] num = new int[]{3,5,6,8,9,12,11,10,1,2,4,7,-1,0};
        heapSort(num);
        System.out.println(Arrays.toString(num));

    }

    public static void heapSort(int[] num){

        int len = num.length;
        for (int i = len / 2 - 1; i >= 0 ; i--) {
          heapiFy(num, i, len);
        }
        for (int i = len - 1; i >= 0; i--) {
            int temp = num[i];
            num[i] = num[0];
            num[0] = temp;

            heapiFy(num, 0, i);
        }



    }

    private static void heapiFy(int[] num, int i, int len) {

        int l = i * 2 + 1;
        int r = i * 2 + 2;
        int max = i;
        if (l < len && num[l] > num[max]){
            max = l;
        }
        if (r < len && num[r] > num[max]){
            max = r;
        }
        if (i != max){
            int temp = num[i];
            num[i] = num[max];
            num[max] = temp;
            heapiFy(num, max, len);
        }

    }

}
