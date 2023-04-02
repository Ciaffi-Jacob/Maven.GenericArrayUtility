package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {
    private T[] inputArray;

    public ArrayUtility(T[] inputArray) {
        this.inputArray = inputArray;
    }

    ArrayList<T> arrayList = new ArrayList<>();

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        this.arrayList.addAll(Arrays.asList(inputArray));
        this.arrayList.addAll(Arrays.asList(arrayToMerge));
        Integer count = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == valueToEvaluate) {
                count += 1;
            }
        }
        return count;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        this.arrayList.addAll(Arrays.asList(inputArray));
        this.arrayList.addAll(Arrays.asList(arrayToMerge));
        int tempCount;
        int highest = 0;
        T mostFreq = null;
        for (int i = 0; i < arrayList.size() -1; i++) {
            tempCount = 0;
            for (int j = 0; j < arrayList.size(); j++) { //compares current index and adds to tempCount
                if(arrayList.get(i) == arrayList.get(j)){
                    tempCount++;
                }
            }
            if(tempCount > highest){
                mostFreq = arrayList.get(i);
                highest = tempCount;
            }

        }
        return mostFreq;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        Integer count = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == valueToEvaluate) {
                count += 1;
            }
        }
        return count;
    }

    public T[] removeValue(T valueToRemove) {
        this.arrayList.addAll(Arrays.asList(inputArray)); //coping inputarray to arraylist to make removal easier

        for (int i = arrayList.size() -1; i > 0; i--) { //iterating down so size of arraylist does not cause issues
            if (valueToRemove == arrayList.get(i)) {
                arrayList.remove(i);
            }
        }
        return (T[]) arrayList.toArray();
    }
}
