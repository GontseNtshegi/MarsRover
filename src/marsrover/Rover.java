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
    private Position position;//Rover has a position on the grid and thus hold a Position object
    private Direction direction;//Rover also holds a Direction Object
     private final Position[] INSTRUCTIONDIRECTION ={new Position(-1,1),new Position(1,-1)};//Rover can be rotated 90 degrees to the left or right and thus holds rotation vectors for that
    public Rover()//default constructor
    {
        this.position=null;//initial the position is null
        this.direction=null;//and so is the direction
    }
    public Rover(Position pos,Direction dir)//Parameterised constructor
    {
        this.position=pos;//assigns position
        this.direction=dir;//assign direction
    }
    public Position getPosition() {//Accessor method
        return position;
    }

    public void setPosition(Position position) {//Setter method
        this.position = position;
    }

    public Direction getDirection() {//Accessor method
        return direction;
    }
    public void setDirection(Direction direction) {//Setter method
        this.direction=direction;
    }
    public void executeInstructions(String instruction)//method to handle instructions to the rover
    {
        char[] instructionChars=instruction.toCharArray();//receives a String of characters and transforms it to chars
        
        for(int i=0;i<instructionChars.length;i++){//loop through the instruction
            
          
            if(instructionChars[i]=='L')//if a character of value L is found
            {
                rotate(INSTRUCTIONDIRECTION[0]);//rotate the rover 90 degrees to the left
            }
            else if(instructionChars[i]=='R')//if a character of value R is found
            {
                rotate(INSTRUCTIONDIRECTION[1]);//rotate the rover 90 degrees to the right
            }
            else // if character M is found
            {
                move();//move the rover one space to the direction
            }
        }
    }
    public void rotate(Position rotate)//method to rotate the rover
    {
       //first do the swap on the rovers direction
       Position swap= this.direction.position.swap();
       
        //then  multiply the swap with the right or left rotation
        this.direction.position=swap.multiply(rotate); //returns new direction
        this.direction.setDirection();//then set the direction symbol
        //and return results
        
    }
    public void move()//moves once in the direction of the rover
    {
        Position temp =this.position.add(this.direction.position);
        
           this.position=temp;//adds the current rovers position to the new direction
         
       
       
    }
    @Override
    public String toString()//to string
    {
        return this.position+" "+this.direction;
    }
}
