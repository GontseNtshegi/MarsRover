/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marsrover;

/**
 *
 * @author ntshegg
 */
public class Direction {
    public Position position;
    public String direction;
    public Position[] CONSTDIRECTION ={new Position(0,1),new Position(0,-1),new Position(-1,0),new Position(1,0)};
    public String[] SYMBOL ={"N","S","E","W"};
    public Direction()
    {
        this.position = new Position();
        this.direction ="";
    }
    public Direction(String letter)
    {
        this.direction =letter;
       for(int i=0;i<SYMBOL.length;i++)
       {
           if(SYMBOL[i].equalsIgnoreCase(letter))
           {
               this.position = CONSTDIRECTION[i];
           }
       }
    }
    public void setDirection()
    {
        for(int i=0;i<CONSTDIRECTION.length;i++)
       {
        if(this.position.compareTo(CONSTDIRECTION[i])==0)
        {
            this.direction = SYMBOL[i];
        }
       }
    }
    @Override
    public String toString()
    {
        return this.direction;
    }
}
   
    
