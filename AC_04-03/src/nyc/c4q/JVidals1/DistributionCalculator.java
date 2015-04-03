package nyc.c4q.JVidals1;

/**
 * Created by s3a on 4/1/15.
 * Janneisy Vidals
 * 2.1 Accesscode
 * HW Exercises
 * Description:
 * Due APRIL 3, 2015.
 *
 *
 * TasK:
 *  Create a class to calculate the distribution of characters in the contents of a text file. Your class called
 *  DistributionCalculator should implement a method calculate(File textFile) which accepts as input a Text file.
 *  It reads the contents of the file and returns an ArrayList which contains the distribution/percentage of characters
 *  (a-z) in the text file. You should lowercase lines before you do the calculation. Call the calculate method from main
 *  and print the distribution. You can ignore characters which do not belong in the range(a-z) for doing your calculation.
 *
 *   a = 14.44 %
 *   b  = 6.02 %
 *   ...
 *   ...
 *   z = 0.05 %
 *
 */

import java.io.File;
import java.util.ArrayList;
import  java.util.Calendar;
import java.util.Scanner;

public class DistributionCalculator {



    public static int calculate(  ) {



        Scanner input = new Scanner(new File( "file"));
        ArrayList<String>  = new ArrayList<String>();
        while (input.hasNext()){
            list.add(input.next());
        }
        input.close();



    }




    public static void main (String [] args) {





    }

}
