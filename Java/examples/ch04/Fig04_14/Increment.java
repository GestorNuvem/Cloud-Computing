// Fig. 4.14  Increment.java
// Preincrementing and postincrementing

public class Increment {
   public static void main( String args[] )
   {
      int c;
   
      c = 5;
      System.out.println( c );   // print 5
      System.out.println( c++ ); // print 5 then postincrement
      System.out.println( c );   // print 6

      System.out.println();      // skip a line

      c = 5;
      System.out.println( c );   // print 5
      System.out.println( ++c ); // preincrement then print 6
      System.out.println( c );   // print 6
   }
}

/**************************************************************************
 * (C) Copyright 2002 by Deitel & Associates, Inc. and Prentice Hall.     *
 * All Rights Reserved.                                                   *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/