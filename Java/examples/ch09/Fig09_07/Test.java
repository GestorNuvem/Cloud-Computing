// Fig. 9.9: Test.java
// Demonstrate when superclass and subclass
// constructors and finalizers are called.
public class Test {

   // test when constructors and finalizers are called
   public static void main( String args[] )
   {
      Circle circle1, circle2;

      circle1 = new Circle( 4.5, 72, 29 );
      circle2 = new Circle( 10, 5, 5 );

      circle1 = null;  // mark for garbage collection
      circle2 = null;  // mark for garbage collection

      System.gc();     // call the garbage collector 
   }

}  // end class Test


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
