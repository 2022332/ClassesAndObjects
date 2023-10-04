/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classesandobjects;

import shapes.Rectangle;
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
        ari.favTriangle = tri4;
        
        Rectangle rect1 = new Rectangle();
        System.out.println(rect1.getArea());
        System.out.println(rect1.getColor());
        System.out.println(tri3.getColor());
    }  
}
