package nyc.c4q.JVidals1;

/**
 * Created by s3a on 4/1/15.
 * Janneisy Vidals
 * 2.1 Accesscode
 * HW Excercises
 * Description:
 *
 *  Write a class called LinearSearch which implements a static method search which accepts as
 *  input an ArrayList alist and an integer x, and returns the first
 *  index it sees of x in alist. If the integer is not present return in the list return -1.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class LinearSearch {

    public static int search(ArrayList<Integer> alist, int number){

        if(alist.contains(number)){

            return alist.indexOf(number);
        }

        else
            return -1;
    }

    public static void main (String [] args) {

        //Created an ArrayList containing integers
        ArrayList alist = new ArrayList();
        alist.add(3);
        alist.add(45);
        alist.add(1);
        alist.add(99);


        System.out.print(search(alist,7));
    }
}
