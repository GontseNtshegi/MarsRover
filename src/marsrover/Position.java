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
    Grid grid;
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
   public Position(int x,int y,Grid grid)
    {
        super(x,y);
        this.grid=grid;
 
    }
    @Override
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

    public int compareTo(Position pos) {
       if(this.x==pos.x && this.y==pos.y)
       {
           return 0;
       }
       else
           return this.x>pos.x ?1:-1;
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
