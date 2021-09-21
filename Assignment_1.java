
/*
 * AP Comp Sci 
 * Problem Set 1-A
 * Sept 20, 2021;   Due date is Sept,21,2021
 * Jason Shi
 * Block 1-1 
*/
public class Assignment_1
{
 public static void main (String[] args){
     //Quadratic Formula 
     
     double a1 = 1;     //these variable names because can't use same variables but letters are good;
     double b1 = 5;     // 3 variables needed for quadratic formula; ax^2 + bx + c 
     double c1 = 6;
     
     double x1;         //to hold when -b + sqrt(...
     double y1;         //to hold when -b - sqrt(...
     
     /* Because the quadratic formula calls for -b + or -, 
        2 variables are  needed
     */
     
     x1 = ( ( (-1*b1) + Math.sqrt(b1*b1 - 4*a1*c1) ) / (a1*2));     //quadratic calculations 
     y1 = ( ( (-1*b1) - Math.sqrt(b1*b1 - 4*a1*c1) ) / (a1*2));
     
    
    
     System.out.println("QUADRATIC FORMULA");
     System.out.print("The solutions for " + (int)a1 + "x^2 + " + (int)b1 + "x + " + (int)c1 + " are " + y1 + " and " + x1 + ".");
     System.out.println("");    //formatting for the next formula(s) 
     System.out.println("");    
     
     
     //Slope Formula
     
     double a2x = 0.0;          //x and y of first set 
     double a2y = 0.0;
     
     double b2x = 2.0;          //x and y of second set 
     double b2y = 3.0;
     
     double m1;                 //variable to hold slope answer 
     
     m1 = (b2y - a2y) / (b2x - a2x);        // y2 - y1 / x2 - x1 to calc slope 
     
     System.out.println("SLOPE FORMULA");
     System.out.print("A line connecting the points " + "(" + (int)a2x + ", " + (int)a2y + ") and " + "(" + (int)b2x + ", " + (int)b2y + ") has a slope of " + m1);
     System.out.println("");
     System.out.println("");
    
     
     //Midpoint Formula 
     
     double a3x = 0.0;          // x and y of first set
     double a3y = 0.0;
     
     double b3x = 2.0;          //x and y of second set 
     double b3y = 3.0;
     
     double m2x;
     double m2y;
     
     m2x = ( (a3x + b3x)  /2);      //both x and y midpoints; m2x holds x
     m2y = ( (a3y + b3y) /2);       //                        m2y holds y
     
     System.out.println ("MIDPOINT FORMULA");
     System.out.print( "The midpoint between (" + (int)a3x + ", " + (int)a3y + ") and " + "(" + (int)b3x + ", " + (int)b3y + ") is " + "(" + m2x + ", " + m2y + ")");
     System.out.println("");
     System.out.println("");
    
     //Sum of an Arithmetic 
     
     double a4 = 1.0; //first term
     double numArt = 5; // number of terms; must be double because n is being divided by 2 and needs to hold decimals 
     double d = 1.0; //common difference
     
     double sumAr; //variable to hold answer for the arithmetic series; summer XD 
     
     sumAr = ( (numArt/2)*((2*a4)+(numArt-1)*d));      // formula for arithmetic 
     
     System.out.println("SUM OF AN ARITHMETIC SERIES");
     System.out.println("The sum of the first " + (int)numArt + " terms of an arithmetic series that starts with " + a4);
     System.out.print("and increases by " + d + " is " + sumAr);
     System.out.println("");
     System.out.println("");
     
     //Sum of Geometric Series
     double a5 = 3.0; //first term
     double r = 2.0; //common ratio 
     double numGeo = 3; //number of terms for geometric series
     
     double sumG; //variable to hold answer for geometric series 
     
     sumG = (a5*(1- Math.pow(r, numGeo)) ) / (1-r);  //formula for geometric 
     
     System.out.println("SUM OF A FINITE GEOMETRIC SERIES");
     System.out.println("The sum of the first " + (int)numGeo + " terms of a finite geometric series that starts with " + a5);
     System.out.print("and increases by a rate of " + r + " is " + sumG);
     System.out.println("");
     System.out.println("");        //for any other formulas that need to be added 
    }

    
    
    
}