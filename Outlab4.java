/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outlab4;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
/**
 *
 * @author Peter Mitzel
 */
public class Outlab4 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * 
     * This is the driver class that asks for the name of the input file and prints a couple of lines for the output. It also handles the File output.
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        LinkedList myList = new LinkedList();
        FileManager loader = new FileManager();
        
        System.out.println("\nEnter the name of the file :\n");
        
        PrintStream out = new PrintStream (new File("LinkedListProgram.txt"));
        System.setOut(out);
        
        
        String input = scanner.next();
        System.out.println("\nProgram 4");
        System.out.println("---------\n");
        loader.fileLoader(input);
        System.out.println("End of Program 4");
    }
    
}
