package ch10.sort;

import java.util.ArrayList;
import java.util.List;

class GenericInsertionSort {
    public static <T extends Comparable<T>> void  sort(List<T> data){
        int len = data.size();
        Object[] list = new Object[len];
        for(int i = 0; i < len ; i++){
            for(int j = i+1 ; j < len ; j++){
                if(data.get(i).compareTo(data.get(j)) > 0){
                    T tmp = data.get(i);
                    list[i] = data.get(j);
                    list[j] = data.get(i);
                }
            }
        }
    }
}
