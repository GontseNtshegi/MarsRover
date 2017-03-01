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
public class Position extends Grid { 
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    public Position()
    {
        super();
       
    }
    public Position(int x,int y)
    {
        super(x,y);
 
    }
   
    public String toString()
    {
     return this.x+" "+this.y;
    }
    public Position swap()
    {
        Position temp = new Position();
        temp.x=this.y;
        temp.y=this.x;
        return temp;
    }
    public Position multiply(Position direction)
    {
        Position temp = new Position();
        temp.x=direction.x*this.x;
        temp.y=direction.y*this.y;
        
        return temp;
    }
   
       public Position add(Position direction)
    {
        Position temp = new Position();
        temp.x=direction.x+this.x;
        temp.y=direction.y+this.y;
        
        return temp;
    }
   
}
