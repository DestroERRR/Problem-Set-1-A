
/*
 * AP Comp Sci 
 * Problem Set 1-A
 * Sept 20, 2021;   Due date is Sept,21,2021
 * Jason Shi
 * 
*/
public class Assignment_1
{
 public static void main (String[] args){
     //Quadratic Formula 
     
     double a1 = 1;
     double b1 = 5;
     double c1 = 6;
     
     double x1;
     double y1; 
     
     x1 = ( ( (-1*b1) + Math.sqrt(b1*b1 - 4*a1*c1) ) / (a1*2));
     y1 = ( ( (-1*b1) - Math.sqrt(b1*b1 - 4*a1*c1) ) / (a1*2));
     
     System.out.println("QUADRATIC FORMULA");
     System.out.println(x1);
     System.out.print("The solutions for " + a1 + "x^2 + " + b1 + "x + " + c1 + " are " + x1 + " and " + y1);
     System.out.println("");
     System.out.println("");
     
     
     //Slope Formula
     
     double a2x = 0.0;
     double a2y = 0.0;
     
     double b2x = 2.0;
     double b2y = 3.0;
     
     double m1;
     
     m1 = (b2y - a2y) / (b2x - a2x);
     
     System.out.println("SLOPE FORMULA");
     System.out.print("A line connecting the points " + "(" + a2x + "," + a2y + ") and " + "(" + b2x + "," + b2y + ") is " + m1);
     System.out.println("");
     System.out.println("");
    
     
     //Midpoint Formula 
     
     double a3x = 0.0;
     double a3y = 0.0;
     
     double b3x = 2.0;
     double b3y = 3.0;
     
     double m2a;
     double m2b;
     
     m2a = ( (a3x + b3x)  /2);
     m2b = ( (a3y + b3y) /2); 
     
     System.out.println ("MIDPOINT FORMULA");
     //System.out.println("(" + m2a + "," + m2b + ")");
     //System.out.println( "(" + a3x + "," + a3y + ")" );
     //System.out.println( "(" + b3x + "," + b3y + ")" );
     System.out.print( "The midpoint between (" + a3x + "," + a3y + ") and " + "(" + b3x + "," + b3y + ") is " + "(" + m2a + "," + m2b + ")");
     System.out.println("");
     System.out.println("");
    
     //Sum of an Arithmetic 
     
    }

    
    
    
}