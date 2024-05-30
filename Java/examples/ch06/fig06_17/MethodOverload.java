// Fig. 6.17: MethodOverload.java
// Overloaded methods with identical signatures and
// different return types.

// Java extension packages
import javax.swing.JApplet;

public class MethodOverload extends JApplet {
   
   // first definition of method square with double argument
   public int square( double x )
   {
      return x * x;
   }
   
   // second definition of method square with double argument
   // causes syntax error
   public double square( double y )
   {
      return y * y;
   }

}  // end class MethodOverload



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
