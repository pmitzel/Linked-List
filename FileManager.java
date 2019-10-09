/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outlab4;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Del Peter
 */
public class FileManager {
    
    /**
     * Method to read in the file and add nodes to the linked list as well as read in the k and m values
     * @param file
     */
    public void fileLoader(String file){
     
        Node people;
        int k;
        int m;
        try{
            FileReader fR = new FileReader(file);
            BufferedReader bR = new BufferedReader(fR);
            String line = bR.readLine();
            
            while(!line.equals("0 0 0")){
                LinkedList list = new LinkedList();
                String [] info = line.split(" ");
                System.out.println("N = " + info[0] + ", k = " + info[1] + ", m = " + info[2] + "\n\n");
                line = bR.readLine();
                for(int i = 1; i <= Integer.parseInt(info[0]); i++){
                    people = new Node(i);
                    list.addNode(people);
                }
                k = Integer.parseInt(info[1]);
                m = Integer.parseInt(info[2]);
                list.setIterators(k, m);
                
            }
            
            bR.close();
        }
        
        catch(Exception e){
        }
        
    }
    
    
}
