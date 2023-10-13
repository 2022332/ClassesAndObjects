/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author Ari
 */
public abstract class Shape {
    private boolean isFilled = true;
    protected String colour = "Purple";
    
    public Shape() {
        System.out.println("Shape 1");
    }
    
    public Shape(boolean isFilled, String colour) {
        this.isFilled = isFilled;
        this.colour = colour;
        System.out.println("Shape 2");
    }
    
    public boolean isIsFilled() {
        return isFilled;
    }

    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public abstract double getArea();
    
}
