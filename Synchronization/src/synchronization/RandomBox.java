/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package synchronization;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Satria Ramadhani
 */
public class RandomBox extends GameObject
{
    /**
     * Constructor.
     */
    
    // Default constructor.
    public RandomBox()
    {
        super(0, 0, "RandomBox");
        super.setHeight(30);
    }
    
    // Constructor with random box position.
    public RandomBox(int x, int y)
    {
        super(x, y, "RandomBox");
        super.setHeight(30);
    }
    
    /**
     * Override interface.
     */
    
    @Override
    public void render(Graphics object)
    {
        // Set random box shape.
        object.setColor(Color.decode("#FF0000"));
        object.fillRect(x, y, 30, 30);
    }
    
    @Override
    public void loop()
    {
        // Initialize velocity, so object can move.
        this.x += this.velX;
        this.y += this.velY;
        
        // Initialize random box bound, so it won't get offset the display.
        x = Game.clamp(x, 0, (Game.width - 50));
        y = Game.clamp(y, 0, (Game.height - 70));
    }
}
