package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {
    private T[] inputArray;
    public ArrayUtility(T[] inputArray){
        this.inputArray = inputArray;
    }
    ArrayList<T> arrayList = new ArrayList<>();
    public void toArrayList(T[] inputArray){

    }
    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        return 0;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        return  null;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        Integer count = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == valueToEvaluate){
                count += 1;
            }
        }
        return  count;
    }

    public T[] removeValue(T valueToRemove) {
        this.arrayList.addAll(Arrays.asList(inputArray));
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.remove(i);
        }
        T[] whatsLeft = (T[]) arrayList.toArray();
        return  whatsLeft;
    }
}
