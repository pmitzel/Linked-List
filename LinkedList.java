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
public class LinkedList {
    
    
    private int N, k, m;
    private Node head;
    private int size = 0;
    
    /**
     * Method to create circular linked list and add nodes to it
     * @param node
     */
    public void addNode(Node node){
        if(head == null){
            head = node;
            head.setNext(head);
            head.setPrev(head);
            size++;
        }else{
            head.getPrev().setNext(node);
            node.setPrev(head.getPrev());
            head.setPrev(node);
            node.setNext(head);
            size++;
        }
    }
    
    /**
     * Method that handles the iteration of k and m keeping in mind that certain cases where there are fewer nodes add restrictions.
     * @param k
     * @param m
     */
    public void setIterators(int k, int m){
        Node iter1, iter2;
        iter1 = head;
        iter2 = head.getPrev();
        System.out.println("\n");
        System.out.println("Output");
        System.out.println("------");
        while(iter1.getNext() != iter1 && head != null){
            for(int i = 1; i < k; i++){
                iter1 = iter1.getNext();
            }
            for(int i = 1; i < m; i++){
                iter2 = iter2.getPrev();
        }
            //List of size 2
            if(iter1.getNext().getNext() == iter1){
                if(iter1 == iter2){
                    System.out.println(iter1.getStore());
                    iter1.getPrev().setNext(iter1.getNext());
                    iter1.getNext().setPrev(iter1.getPrev());
                    iter2 = iter2.getPrev();
                    iter1 = iter1.getNext();
                    
                }else{
                    System.out.println(iter1.getStore() + " " + iter2.getStore());
                    head = null;
                }
            }else{
                System.out.println(iter1.getStore() + " " + iter2.getStore());
            
                iter1.getPrev().setNext(iter1.getNext());
                iter1.getNext().setPrev(iter1.getPrev());
            
                iter2.getPrev().setNext(iter2.getNext());
                iter2.getNext().setPrev(iter2.getPrev());
                if(iter1.getNext() == iter2){
                        iter1 = iter2.getNext();
                    }else if(iter1.getPrev() == iter2){
                        iter1 = iter2.getPrev();
                    }else{
                       iter1 = iter1.getNext(); 
                    }
                iter2 = iter2.getPrev();
                
            }
        }
        if(head != null){
            System.out.println(iter1.getStore());
        }
        
        System.out.println("\n");
    }
    
    /**
     * This method was just for testing to make sure the file read in correctly
     */
    public void printList(){
        Node iterator = head;
        for(int i = 0; i < size; i++){
            System.out.println(iterator.getStore());
            iterator = iterator.getNext();
        }
    }
}
