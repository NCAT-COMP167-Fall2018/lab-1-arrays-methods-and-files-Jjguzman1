/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playerstats;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BlueJai5000
 */
public class PlayerStats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] names = new String[80];
        int [] scores = new int[80];
        
        readData(names, scores, args[0]);
        
        System.out.println(names[0] + " " + scores[0]);
    }
    
    public static void readData(String[] names, int[] scores, String filename){
       try {
            Scanner reader = new Scanner(new File(filename));
            
            int currentIndex = 0;
            while(reader.hasNext()){
                String[] line = reader.nextLine().split(" ");
                names[currentIndex] = line[0];
                scores[currentIndex] = Integer.parseInt(line[1]);
                currentIndex++;
            }
            //Anything that depends on reader ^^(above this javadoc).
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PlayerStats.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("File not found in  main method.");
        }
    }
    /**
     * SortData will sort the top 10 player's names and scores
     * @param names
     * @param scores will determine placement
     * @param filename
     */
    public static void sortData(String[] names, int[] scores, String filename){
            try {
                Scanner sorter = new Scanner(new File(filename));
            
                int currentIndex = 0;
                
            //Anything that depends on reader ^^(above this javadoc).
            }catch (FileNotFoundException ex) {
            Logger.getLogger(PlayerStats.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("File not found in  main method.");
             }
    }
}
