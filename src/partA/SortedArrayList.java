/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partA;

/**
 *
 * @author Tarc
 */
public class SortedArrayList<T extends Comparable> implements SortedList<T> {
    private T[] array = (T[])new Comparable[5];
    private int numberOfEntries = 0;
    
    public void add(T newEntry){
        int location = numberOfEntries;
        
        if(isFull()){
            expandArray();
        }
        
        for (int i = 0; i < numberOfEntries; i++){
            if(newEntry.compareTo(array[i]) < 0){
                location = i;
                break;
            }
        }
        
        pushToRight(location);
        array[location] = newEntry;
        numberOfEntries++;
        
    }
    public boolean remove(T anEntry){
        boolean success = false;
        
        if(!isEmpty()){
            for(int i = 0; i < numberOfEntries; i++){
                if(anEntry.equals(array[i])){
                    shiftToLeft(i);
                    success = true;
                    numberOfEntries--;
                    break;
                }
            } 
        }
        
        return success;
    }
    
    public int getNumberOfEntries(){
        return numberOfEntries;
    }
    public boolean isEmpty(){
        if(numberOfEntries == 0)
            return true;
        else
            return false;
    }

    private void expandArray() {
        T[] oldArray = array;
        
        int size = oldArray.length;
        array = (T[])new Comparable[2 * size];
        
        for(int i = 0; i < size; i++){
            array[i] = oldArray[i];
        }
    }

    private boolean isFull() {
        if(numberOfEntries == array.length)
            return true;
        else
            return false;
    }

    private void pushToRight(int start) {
        for (int i = numberOfEntries; i > start; i--){
            array[i] = array[i - 1];
        }
    }

    private void shiftToLeft(int start) {
        for (int i = start; i < numberOfEntries - 1; i++){
            array[i] = array[i + 1];
        }
    }
    
    public String toString(){
        String s = "";
        
        for(int i = 0; i < numberOfEntries; i++){
            s = s + array[i] + " ";
        }
        
        return s;
    }
    
}
