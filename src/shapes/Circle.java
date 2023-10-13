/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author Ari
 */
public class Circle extends Shape{
    private double radius;
    
    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }
}
