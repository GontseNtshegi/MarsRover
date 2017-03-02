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
public class Grid {//Parent to Position
    public int x;
    public int y;
    
    public Grid()//default constructor
    {
        this.x=0;
        this.y=0;
    }
    public Grid(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    @Override
     public String toString()
    {
     return this.x+" "+this.y;
    }
}
