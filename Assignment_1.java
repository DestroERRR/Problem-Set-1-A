
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
     
     double a = 1;     //these variable names because can't use same variables but letters are good;
     double b = 5;     // 3 variables needed for quadratic formula; ax^2 + bx + c 
     double c = 6;
     
     double x1;         //to hold when -b + sqrt(...
     double x2;         //to hold when -b - sqrt(...
     
     /* Because the quadratic formula calls for -b + or -, 
        2 variables are  needed
     */
     
     x1 = ( ( (-1*b) + Math.sqrt(b*b - 4*a*c) ) / (a*2));     //quadratic calculations 
     x2 = ( ( (-1*b) - Math.sqrt(b*b - 4*a*c) ) / (a*2));     //variables to hold answers
     
    
    
     System.out.println("QUADRATIC FORMULA");
     System.out.print("The solutions for " + (int)a + "x^2 + " + (int)b + "x + " + (int)c + " are " + x2 + " and " + x1 + ".");
     System.out.println("");    //formatting for the next formula(s) 
     System.out.println("");    
     
     
     //Slope Formula
     
     x1 = 0.0;          //x and y of first set 
     double y1 = 0.0;
     
     x2 = 2.0;          //x and y of second set 
     double y2 = 3.0;
     
     double m;                 //variable to hold slope answer 
     
     m = (y2 - y1) / (x2 - x1);        // y2 - y1 / x2 - x1 to calc slope 
     
     System.out.println("SLOPE FORMULA");
     System.out.print("A line connecting the points " + "(" + (int)x1 + ", " + (int)y1 + ") and " + "(" + (int)x2 + ", " + (int)y2 + ") has a slope of " + m);
     System.out.println("");
     System.out.println("");
    
     
     //Midpoint Formula 
     
     x1 = 0.0;          // x and y of first set
     y1 = 0.0;
     
     x2 = 2.0;          //x and y of second set 
     y2 = 3.0;
     
     double mx;                 //midpoint for x and midpoint for y
     double my;
     
     mx = ( (x1 + x2)  /2);      //both x and y midpoints; mx holds x
     my = ( (y1 + y2) /2);       //                        my holds y
     
     System.out.println ("MIDPOINT FORMULA");
     System.out.print( "The midpoint between (" + (int)x1 + ", " + (int)y1 + ") and " + "(" + (int)x2 + ", " + (int)y2 + ") is " + "(" + mx + ", " + my + ")");
     System.out.println("");
     System.out.println("");
    
     //Sum of an Arithmetic 
     
     a = 1.0; //first term
     double numArt = 5; // number of terms; must be double because n is being divided by 2 and needs to hold decimals 
     double d = 1.0; //common difference
     
     double sumAr; //variable to hold answer for the arithmetic series; summer XD 
     
     sumAr = ( (numArt/2)*((2*a)+(numArt-1)*d));      // formula for arithmetic 
     
     System.out.println("SUM OF AN ARITHMETIC SERIES");
     System.out.println("The sum of the first " + (int)numArt + " terms of an arithmetic series that starts with " + a);
     System.out.print("and increases by " + d + " is " + sumAr);
     System.out.println("");
     System.out.println("");
     
     //Sum of Geometric Series
     a = 3.0; //first term
     double r = 2.0; //common ratio 
     double numGeo = 3; //number of terms for geometric series
     
     double sumG; //variable to hold answer for geometric series 
     
     sumG = (a*(1- Math.pow(r, numGeo)) ) / (1-r);  //formula for geometric 
     
     System.out.println("SUM OF A FINITE GEOMETRIC SERIES");
     System.out.println("The sum of the first " + (int)numGeo + " terms of a finite geometric series that starts with " + a);
     System.out.print("and increases by a rate of " + r + " is " + sumG);
     System.out.println("");
     System.out.println("");        //for any other formulas that need to be added 
    }

    
    
    
}