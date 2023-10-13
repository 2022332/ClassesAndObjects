/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author Ari
 */
public class Rectangle extends Shape implements Shapes2D{
    private double height = 5.0;
    private double width = 6.2;

    public Rectangle(boolean isFilled, String colour, int height, int width) {
        super(isFilled, colour);
        this.height = height;
        this.width = width;
    }

    public Rectangle() {
    }
    
    @Override
    public double calculateAngles() {
        return 90;
    }
    
    public double getHeight() {
        return height;
    }
    
    public double getWidth() {
        return width;
    }
    
    @Override
    public double getArea() {
        return width * height;
    }
}
