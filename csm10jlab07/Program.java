/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jlab07;

/**
 *
 * @author Nick
 */
public class Program {
 public static void main(String[] args){
 // test cases

 // default constructor
 Line slopeOfOne = new Line();

 // test the get / set methods
 System.out.println("Test Get / Set");
 slopeOfOne.setA(-1);
 System.out.println("A == -1 ? " + (slopeOfOne.getA() == -1));
 slopeOfOne.setB(1);
 System.out.println("B == 1 ? " + (slopeOfOne.getB() == 1));
 slopeOfOne.setC(1);
 System.out.println("C == 1 ? " + (slopeOfOne.getC() == 1));
 System.out.println();

 // special constructor
 Line slopeOfTwo = new Line(-2, 1, 2);
 System.out.println("Test special constructor");
 System.out.println("A == -2 ? " + (slopeOfTwo.getA() == -2));
 System.out.println("B == 1 ? " + (slopeOfTwo.getB() == 1));
 System.out.println("C == 2 ? " + (slopeOfTwo.getC() == 2));
 System.out.println();
 
 Line slope3= new Line(3, 0, 1);
 Line slope4= new Line(5, 1, 2);
 Line slope5= new Line(-1, 1, 1);
 Line slope6= new Line(-4, 2, 4);
 Line slope7= new Line(1, 1, 1);

 // slope defined
 System.out.println("Test slope defined");
 System.out.println("Slope defined ? " + slopeOfOne.getSlope());
 System.out.println();

 // slope undefined
 System.out.println("Test slope undefined");
 System.out.println("Slope NaN ? " + Double.isNaN(slope3.getSlope()));
 System.out.println();

 // Not required, but probably good to do
 // Horizontal
 //System.out.println("Test Horizontal");
 //System.out.println("IsHorizontal ? " + );

 // not horizontal
 //System.out.println("Not Horizontal ? " +);
 //System.out.println();
 // Not horizontal

 // Not required, but probably good to do
 // vertical
 //System.out.println("Test Vertical");
 //System.out.println("IsVertical ? " + );
 // not vertical
 //System.out.println("Not Vertical ? " +));
 //System.out.println();


 System.out.println("Test parallel"); 
 // parallelTo
 System.out.println("Are parallel? " + slopeOfTwo.parallelTo(slope6));
 // not parallelTo
 System.out.println("Are not parallel? " + slopeOfOne.parallelTo(slope4));
 System.out.println();

 // perpendicularTo
 System.out.println("Test perpendicular");

 System.out.println("Are perpendicular? " + slopeOfOne.perpendicularTo(slope7));
 // not perpendicularTo
 System.out.println("Are not perpendicular? " + slopeOfOne.perpendicularTo(slope4));
 System.out.println();

 System.out.println("Test equality");
 // equal (same coefficient)

 System.out.println("Same coefficients, are equal? " + slopeOfOne.equals(slope5));
 // equal (multiple of coefficients)

 System.out.println("Different coefficients, same multiplier, are equal? " + slopeOfTwo.equals(slope6));

 // not equal
 System.out.println("Are not equal? " + slopeOfOne.equals(slope4));


 }
} 