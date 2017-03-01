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
public class Rover {
    private Position position;
    private Direction direction;
     private final Position[] INSTRUCTIONDIRECTION ={new Position(-1,1),new Position(1,-1)};
    public Rover()
    {
        this.position=null;
        this.direction=null;
    }
    public Rover(Position pos,Direction dir)
    {
        this.position=pos;
        this.direction=dir;
    }
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Direction getDirection() {
        return direction;
    }
    public void setDirection(Direction direction) {
        this.direction=direction;
    }
    public void executeInstructions(String instruction)
    {
 
            if(instruction.equalsIgnoreCase("L"))
            {
                rotate(INSTRUCTIONDIRECTION[0]);
            }
            else if(instruction.equalsIgnoreCase("R"))
            {
                rotate(INSTRUCTIONDIRECTION[1]);
            }
            else
            {
                move();
            }
    }
    public void rotate(Position rotate)
    {
       //first do the swap
       Position swap= this.direction.position.swap();
       
        //then  multiply
        this.direction.position=swap.multiply(rotate); //returns new direction
        this.direction.setDirection();
        //and return results
        
    }
    public void move()//moves once in the direction its facing
    {
       this.position=this.position.add(this.direction.position);
       
       
    }
    @Override
    public String toString()
    {
        return this.position+" "+this.direction;
    }
}
