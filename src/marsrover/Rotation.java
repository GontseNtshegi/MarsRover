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
public class Rotation extends Direction {
    private static final Position RotateLeft = new Position();
    public Rotation()
    {
        super();
    }
    public Rotation(String letter)
    {
        super(letter);
    }
}