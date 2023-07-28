
import java.util.Scanner;

public class RelationalPractice2 {
    public static void main( String args[] ) {
    
        double x = 0 ;
        double y = 0 ;

     // Input Statement 
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter x :");
        x = scan.nextDouble();
        System.out.println("Enter y :");
        y = scan.nextDouble();


     //Relational & Logical Operators
     if (x == 0 && y==0) { 
    System.out.println(x+","+y+" is in the origin");
     } else if (x > 0 && y > 0){
        System.out.println(x+","+y+" is in the 1st quadrant");
     } else if ( x < 0 && y > 0){
        System.out.println(x+","+y+" is in the 2nd quadrant");
     } else if ( x < 0 && y < 0){
        System.out.println(x+","+y+" is in the 3rd quadrant");
     } else {
        System.out.println(x+","+y+" is in the 4th quadrant");
     }

    }

}
