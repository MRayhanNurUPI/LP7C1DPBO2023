/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package synchronization;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Satria Ramadhani and Modified by Muhammad Rayhan Nur
 */
public class Snack extends GameObject
{
    /**
     * Constructor.
     */
    
    // Default constructor.
    public Snack()
    {
        super(0, 0, "Snack");
        super.setHeight(30);
    }
    
    // Constructor with player position.
    public Snack(int x, int y)
    {
        super(x, y, "Snack");
        super.setHeight(30);
    }
    
    /**
     * Override interface.
     */
    
    @Override
    public void render(Graphics object)
    {
        // Set player shape.
        object.setColor(Color.decode("#FF0101"));
        object.fillOval(x, y, 30, 30);
    }
    
    public void loop() {
        
    }
    
}
