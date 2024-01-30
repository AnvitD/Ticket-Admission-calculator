
/**
 * This program calculates the admission fee based on a person's age.
 *
 */
import java.util.Scanner;
public class AdmissionFeeV1
{
    public static void main(String [] args)
    {
        //Declare and initialize variables
        String yearsOld = "";                          
        int age = -1;                                  
        boolean isChild = false;                       
        double admissionFee = 6.00;                    
        double tax = 0.075;                            

        Scanner in = new Scanner(System.in);

        //Input
        System.out.print("Please enter your age: ");
        yearsOld = in.nextLine();
        age = Integer.parseInt(yearsOld);

        //Processing
        if(age <= 10)                                 
        {                                              
           isChild = true;                           
           admissionFee = 4.50;                        
        }                                              

        admissionFee += admissionFee * tax;            

        //Output
        System.out.println();
        System.out.println("Discount: " + isChild);
        System.out.println("Please pay: " + admissionFee);
       }//end of main method
    }//end of class
