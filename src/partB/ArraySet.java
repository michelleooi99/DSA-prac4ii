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
    private T[] array = (T[])new Comparable[5];
    private int numberOfEntries = 0;
    
    public boolean add(T newElement){
        if(!exist(newElement)){
            
        }
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
    
    public boolean checkSubset(Set anotherSet){
        
    }
    
    public void union(Set anotherSet){
        
    }
    
    public Set intersection(Set anotehrSet){
        
    }

    private boolean exist(T newElement) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void shiftToLeft(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
