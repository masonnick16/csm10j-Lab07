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
public class Line {
    public double a;
    public double b;
    public double c;
    public Line(){
        
    }
    
    public Line(double startA, double startB, double startC){
        a=startA;
        b=startB;
        c=startC;
    }
    public double getSlope(){
        if(b!=0)
            return (-a/b);
        else 
           return Double.NaN;
    }
    public void setA(double newA){
        a=newA;
    }
    public void setB(double newB){
        b=newB;
    }
    public void setC(double newC){
        c=newC;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    
    public boolean equals(Line line2){
        if(this.getSlope()==line2.getSlope()&&this.getC()/this.getB()==line2.getC()/line2.getB())
            return true;
        else 
            return false;
    }
    public boolean parallelTo(Line l2){
        if(this.getSlope()==l2.getSlope())
            return true;
        else
            return false;
    }
    public boolean perpendicularTo(Line l2){
        if(this.getSlope()==(-1/l2.getSlope()))
            return true;
        else
            return false;
    }
}
