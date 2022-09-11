package ch10.sort;

import java.util.Arrays;

class Demo {
    public static void main(String[] args) {
        String[] data = {"E","D","C","B","A"};
        InsertionSort.sort(data);
        System.out.println(Arrays.toString(data));
    }
}

class InsertionSort {
    public static void sort(Comparable[] data){
        int len = data.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if(data[i].compareTo(data[j]) > 0){
                    Comparable tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }
            }
        }
    }
}
