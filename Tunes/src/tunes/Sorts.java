/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunes;

/**
 *
 * @author Ivan Day
 */
public class Sorts {
    
    public static void selectionSort(int[] numbers){
        int min, temp;
        for(int index = 0; index < numbers.length - 1; index++){
            min = index;
            for (int scan = index + 1; scan < numbers.length; scan++)
                if (numbers[scan] < numbers[min])
                    min = scan;
            
            temp = numbers[min];
            numbers[min] = numbers [index];
            numbers [index] = temp;
        }
    }
    
    public static void insertionSort (int[] numbers){
        for (int index = 1; index < numbers.length; index++){
            int key = numbers[index];
            int position = index;
            
            while (position > 0 && numbers[position-1] > key){
                numbers[position] = numbers[position-1];
                position--;
            }
            
            numbers[position] = key;
        }
    }
    
    public static void insertionSort (Comparable[] objects){
        for (int index = 1; index < objects.length; index++){
            Comparable key = objects[index];
            int position = index;
            
            while (position > 0 && objects[position-1].compareTo(key) > 0){
                objects[position] = objects[position - 1];
                position--;
            }
            
            objects[position] = key;
        }
    }
}
