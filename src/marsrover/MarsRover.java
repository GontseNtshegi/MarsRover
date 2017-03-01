/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marsrover;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


/**
 *
 * @author ntshegg
 */
public class MarsRover {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FileReader inputFile = null;
        
        String[] pos=new String[2];
        try{
            File file = new File("C:\\Users\\ntshegg\\Desktop\\MarsRover\\src\\marsrover\\newfile.txt");
            inputFile= new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(inputFile);

            Grid grid = new Grid(5,5);//set boundaries
            Position roverPosition = new Position(1,2);
            Direction roverDirection=new Direction("N");
            Rover rover = new Rover(roverPosition,roverDirection);
            
            rover.executeInstructions("L");
            rover.executeInstructions("M");
            System.out.println(rover);
             rover.executeInstructions("L");
            rover.executeInstructions("M");
            System.out.println(rover);
             
           /* StringBuffer content = new StringBuffer();
          
            String text;
            while((text=bufferedReader.readLine())!=null)
            {
               StringTokenizer token = new StringTokenizer(text," ");
               int i=0;
               while(token.hasMoreTokens())
               {
                   pos[i]=token.nextToken();
                   i++;
                  
               }
            
               
            }*/
            
          ///  System.out.println(Y);
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        finally{
            try
            {
            inputFile.close();
            }
            catch(IOException e)
                    {
                        e.printStackTrace();;
                    }
        }
    }
    
}
