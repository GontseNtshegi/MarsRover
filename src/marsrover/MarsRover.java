/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marsrover;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Vector;


/**
 *
 * @author ntshegg
 */
public class MarsRover {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("UnusedAssignment")
    public static void main(String[] args) {
        // TODO code application logic here
        
        FileReader inputFile = null;
        
        Vector<String> pos=new Vector<>();//creates a vector object to store file contents
        try{
            File file = new File(args[0]);//opens up a new file with passed arguments
            inputFile= new FileReader(file);//reads a file
            BufferedReader bufferedReader = new BufferedReader(inputFile);//open file to allow it to access contents
           
            int[] gridPos = new int[2];//variable to store grid positions
            Grid grid = null;//init boundaries
            Grid roverPosition = null;//init rover position
            Direction roverDirection=null;//init rover direction
            Rover rover = null;//init rover
            
           StringBuffer content = new StringBuffer();//variable to store file contents
            String text;//string to store every line of the file
            int i=0;
            while((text=bufferedReader.readLine())!=null)//loop through the file
            {
               StringTokenizer token = new StringTokenizer(text," ");//string tokeize the line to get space separated words
               
               while(token.hasMoreTokens())//if there is a word
               {
                   if(i<2)//we know for a fact that the first two numbers in the file are grid positions
                   {
                       gridPos[i]=(Integer.parseInt(token.nextToken()));//assign the numbers to the grid
                       i++;//increment the index
                   }
                   else{
                   pos.add(token.nextToken());//add it to the vector
                   }
                  
               }
            
              
            }
            grid = new Grid(gridPos[0],gridPos[1]);//creates new grid
            
            for(int j=0;j<pos.size();j=j+4)//loopsthrough the grid to find the next 4 lines
            {
               
                roverPosition = new Position(Integer.parseInt(pos.get(j)),Integer.parseInt(pos.get(j+1)),grid);//creates a new rovers position
                roverDirection=new Direction(pos.get(j+2));//creates a new rovers direction
                rover = new Rover((Position)roverPosition,roverDirection);//creates the rover
                rover.executeInstructions(pos.get(j+3));//execute instructions
                
                  System.out.println(rover);//then printout the results to stdout
                
            }
        }
        catch(IOException e)//catch any IO Exception
        {
            System.out.println(e.getMessage());//printout the error to stdout
        }
         catch(IndexOutOfBoundsException e)//catch any all Exception
        {
            System.out.println(e.getMessage());//printout the error to stdout
        }
        finally{
            try
            {
            inputFile.close();
            }
            catch(IOException e)
                    {
                        e.printStackTrace();
                    }
        }
    }
    
}
