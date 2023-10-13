/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classesandobjects;

import shapes.Rectangle;
import shapes.Shape;
import shapes.Shapes2D;
import shapes.Square;
import shapes.Triangle;

/**
 *
 * @author Ari
 */
public class ClassesAndObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Triangle tri1 = new Triangle();
        Triangle tri2 = new Triangle();
        Triangle tri3 = new Triangle();
        Triangle tri4 = new Triangle();
        Triangle tri5 = new Triangle();
        Triangle tri6 = new Triangle();
        
        int[] sideLenghts = new int[18];
        //The lenghts of tri1's sides will be first, then the lenghts of the tri2's sides, etc.
        sideLenghts[0] = 5;
        sideLenghts[1] = 8;
        sideLenghts[2] = 9;
        
        //tri5 (4, 7, 2)
        sideLenghts[12] = 4;
        sideLenghts[13] = 7;
        sideLenghts[14] = 2;
        
        //we want to set the middle side of each triangle to be 3
        sideLenghts[1] = 3;
        sideLenghts[4] = 3;
        sideLenghts[7] = 3;
        sideLenghts[10] = 3;
        sideLenghts[13] = 3;
        sideLenghts[16] = 3;
        
        Person ari = new Person();
        //ari.favTriangle = tri4;
       
        System.out.println("--- Rectangles ---");
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(true, "Black", 5, 6);
        System.out.println(rect1.getArea());
        
        System.out.println(rect1.getColour());
        System.out.println(tri5.getColour());
        
        Person p4 = new Person("Ari", 22);
        Person p3 = new Person(32,"Per");
        Person p1= new Person();
        Person p2 = new Person(5);
        

        Square sq1 = new Square(true, "Purple", 10);
        Rectangle sq2 = new Square(false, "Red", 5);
        Shape sq3 = new Square(true, "Violet", 7);
        Shape tri10 = new Triangle();
        sq1.getArea();
        
        Shapes2D sq4 = new Square(true, "Black", 2);
        sq4.calculateAngles();
    }  
}
