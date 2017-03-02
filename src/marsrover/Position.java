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
public class Position extends Grid implements Comparable{ 
    public Grid grid=new Grid();//Grid object to make sure the position stays within the boundaries
    
    //Accessor method
    public int getX() {//
        return x;
    }

    //setter method
    public void setX(int x) {
        this.x = x;
    }

    //Accessor method
    public int getY() {
        return y;
    }

    //setter method
    public void setY(int y) {
        this.y = y;
    }
    
    
    public Position()//default constructor
    {
        super();//call super constructor
       
    }
    public Position(int x,int y)//parameterised constructor
    {
        super(x,y);//call parameterised super constructor
 
    }
   public Position(int x,int y,Grid grid)//parameterised constructor
    {
        super(x,y);//call parameterised super constructor
        this.grid=grid;
  
    }
    @Override
    public String toString()//toString method
    {
 
     return this.x+" "+this.y;
    }
    public Position swap()//swap current position
    {
        Position temp = new Position();//creates a new temporary position
        temp.x=this.y;//x becomes y
        temp.y=this.x;//And y becomes x
        return temp; //return the change
    }
    public Position multiply(Position direction)//multiply two positions using vector multiplication
    {
        Position temp = new Position();//creates new variable to hold result
        temp.x=direction.x*this.x;//x multiplies x
        temp.y=direction.y*this.y;//and y multiplies y
            
        return temp;//return temp
    }
   
       public Position add(Position direction)//add two positions using vector addition
    {
        Position temp = new Position();//creates new variable to hold result
        temp.x=direction.x+this.x; //x is added to x
        temp.y=direction.y+this.y;//y is added to y
        
        return temp;
    }
    public boolean isOutofBounds(Position pos) throws IndexOutOfBoundsException
    {
        if(pos.x>=0 && pos.x<=this.grid.x )//checks if the position is not out of bounds
            return false;
        
        else
            throw new IndexOutOfBoundsException("Rover is out of the grid");
            
            
            
      
    }
       @Override
    public int compareTo(Object pos) {//compares two positions if they are equal
        
        Position pos1 = (Position)pos;
       if(this.x==pos1.x && this.y==pos1.y)// both x's and y's should be equal
       {
           return 0;
       }
       else
           return this.x>pos1.x ?1:-1;
    }
 
}
