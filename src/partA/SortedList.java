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
public interface SortedList<T> {
    public void add(T newEntry);
    public boolean remove(T anEntry);
    public int getNumberOfEntries();
    public boolean isEmpty();
}
