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
    public Position position; //Direction holds a position instance variable as (x,y)
    public String direction; //String that holds direction symbol for display
    public Position[] CONSTDIRECTION ={new Position(0,1),new Position(0,-1),new Position(-1,0),new Position(1,0)};//Direction options
    public String[] SYMBOL ={"N","S","E","W"};//symbol options
    public Direction()//default constructor
    {
        this.position = new Position();//creates a default position
        this.direction ="";//empty symbol
    }
    public Direction(String letter)//parameterised constructor that takes in the direction symbol
    {
        this.direction =letter;//stores current letter
       for(int i=0;i<SYMBOL.length;i++)//loops through the symbols list
       {
           if(SYMBOL[i].equalsIgnoreCase(letter))//when a sybol is found
           {
               this.position = CONSTDIRECTION[i];//assign it to its vector direction
           }
       }
    }
    public void setDirection()//setter method
    {
        for(int i=0;i<CONSTDIRECTION.length;i++)//loops through the direction vectors
       {
        if(this.position.compareTo(CONSTDIRECTION[i])==0)//if found
        {
            this.direction = SYMBOL[i];//assign the direction string to its matching symbol
        }
       }
    }
    @Override
    public String toString()//toString method
    {
        return this.direction;//returns the direction Symbol
    }
}
   
    
