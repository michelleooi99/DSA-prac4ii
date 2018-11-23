/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partB;

/**
 *
 * @author Tarc
 */
public class ArraySet<T> implements Set<T> {
    private T[] array = (T[])new Object[10];
    private int numberOfEntries = 0;
    
    public boolean add(T newElement){
        boolean success = false;
        
        if(isFull()){
            expandArray();
        }
        
        if(!exist(newElement)){
            numberOfEntries++;
            success = true;
        }
        
        return success;
    }
    
    public boolean remove(T anElement){
        boolean success = false;

        if(!isEmpty()){
            for(int i = 0; i < numberOfEntries; i++){
                if(anElement.equals(array[i])){
                    shiftToLeft(i);
                    success = true;
                    numberOfEntries--;
                    break;
                }
            } 
        }
        
        return success;
    }
    
    public boolean checkSubset(Set set2){
        boolean isMember = false;
        
        for(int i = 0; i < set2.getNumberOfEntries(); i++){
            if(exist((T) set2.get(i)))
                isMember = true;
            else
                isMember = false;
                break;
        }
        
        return isMember;    
    }
    
    public void union(Set set2){
        //loop every item i in set2
        add(set2.get(i));
    }
    
    public Set intersection(Set anotehrSet){
        Set newSet = new ArraySet();
        //similar to checkSubset()
        //loop item j in set2
        //if item i exist in array
        //add item i into newSet
        return newSet;
    }
    
    public int getNumberOfEntries(){
        return numberOfEntries;
    }

    private boolean exist(T newElement) {
        
    }

    private boolean isEmpty() {
        
    }

    private void shiftToLeft(int i) {
        
    }

    private boolean isFull() {
        
    }

    private void expandArray() {
        
    }
}
