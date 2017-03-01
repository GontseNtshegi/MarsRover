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
        
        Vector<String> pos=new Vector<String>();
        try{
            File file = new File("C:\\Users\\ntshegg\\Desktop\\MarsRover\\src\\marsrover\\newfile.txt");
            inputFile= new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(inputFile);
            
            int[] gridPos = new int[2];
            Grid grid = null;//set boundaries
            Grid roverPosition = null;
            Direction roverDirection=null;
            Rover rover = null;
            
           StringBuffer content = new StringBuffer();
            String text;
            int i=0;
            while((text=bufferedReader.readLine())!=null)
            {
               StringTokenizer token = new StringTokenizer(text," ");
               
               while(token.hasMoreTokens())
               {
                   if(i<2)
                   {
                       gridPos[i]=(Integer.parseInt(token.nextToken()));
                       i++;
                   }
                   else{
                   pos.add(token.nextToken());
                   }
                  
               }
            
              
            }
            grid = new Grid(gridPos[0],gridPos[1]);
            
            for(int j=0;j<pos.size();j=j+4)
            {
               
                roverPosition = new Position(Integer.parseInt(pos.get(j)),Integer.parseInt(pos.get(j+1)));
                roverDirection=new Direction(pos.get(j+2));
                rover = new Rover((Position)roverPosition,roverDirection);
                rover.executeInstructions(pos.get(j+3));
                System.out.println(rover);
            }
         
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
