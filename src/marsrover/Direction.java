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
    public Position[] CONSTDIRECTION ={new Position(0,1),new Position(0,-1),new Position(0,1),new Position(0,1)};
    public Direction()
    {
        this.position = new Position();
        this.direction ="";
    }
    public Direction(String letter)
    {
       
    }
}
   
    
