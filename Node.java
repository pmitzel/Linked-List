/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outlab4;

/**
 *
 * @author Del Peter
 */
public class Node {
    
    private String N;
    private String k;
    private String m;
    private Node next;
    private Node prev;
    private int store;
    
    /**
     *
     * @param s
     * Method to create the variable that stores all of the values 1 to N from the input file.
     */
    public Node(int s){
        store = s;
    }
    
    /**
     * Getter for previous
     * @return
     */
    public Node getPrev(){
        return prev;
    }
    
    /**
     * Setter for previous
     * @param prev
     */
    public void setPrev(Node prev){
        this.prev = prev;
    }
    
    /**
     * Setter for next
     * @param next
     */
    public void setNext(Node next){
        this.next = next;
    }
    
    /**
     * Getter for next
     * @return
     */
    public Node getNext(){
        return next;
    }
    
    /**
     *
     * @return
     * 
     * getter for store
     */
    public int getStore(){
        return store;
    }
    
    /**
     *
     * @param store
     * 
     * Setter for score
     */
    public void setStore(int store){
        this.store = store;
    }
    
}
