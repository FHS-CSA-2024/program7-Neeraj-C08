//import stuff here//Your code here
import java.util.Scanner;

public class program7 {
    
public static void main(String[] args){
    
    double sb;
    
    double klevins;
    
    double sn;
    
    double newSb;
    
    Scanner newNum = new Scanner(System.in);
    
    System.out.print("Enter number of schrute-bucks: ");
    
    sb = newNum.nextDouble();
    
    System.out.print("Enter number of klevins: ");
    
    klevins = newNum.nextDouble();
    
    System.out.print("Enter number of stanley-nickels");
    
    sn = newNum.nextDouble();
    
   newSb = sb + klevins*(1.0/20) + sn*(1.0/240);
   
   System.out.println(newSb);
}



}


//Paste console output below:
/*
Enter number of schrute-bucks: 7
Enter number of klevins: 17
Enter number of stanley-nickels9
7.887499999999999

*/
