//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /*
         * Ask the user for these values using*\
         JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
         * JOptionPane.YES_NO_OPTION);
         */
   String a = JOptionPane.showInputDialog(null, "Is it a weekend(yes or no)?");
   String b = JOptionPane.showInputDialog(null, "Is it a vacation?(yes or no)?");

   if(a.equalsIgnoreCase("yes")||b.equalsIgnoreCase("yes")) {
	   JOptionPane.showMessageDialog(null, "WAKE UP AT 6:30 A.M. ANYWAY! WELCOME TO MY WORLD! HAHAHAHAHA");
   }
   else {
	   JOptionPane.showMessageDialog(null, "Wake up! The early bird gets the worm!");
   }
   
   /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
         */
    }
}
