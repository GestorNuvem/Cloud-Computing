// Exercise 6.6: SphereTest.java

// Java core packages
import java.awt.*;
import java.awt.event.*;

// Java extension packages
import javax.swing.*;

public class SphereTest extends JApplet
   implements ActionListener {

   JLabel promptLabel;
   JTextField inputField;

   public void init()
   {
      Container container = getContentPane();
      container.setLayout( new FlowLayout() );

      promptLabel = new JLabel( "Enter sphere radius: " );
      inputField = new JTextField( 10 );
      inputField.addActionListener( this );
      container.add( promptLabel );
      container.add( inputField );
   }

   public void actionPerformed( ActionEvent actionEvent )
   {
      double radius =
         Double.parseDouble( actionEvent.getActionCommand() );

      showStatus( "Volume is " + sphereVolume( radius ) );
   }

   public double sphereVolume( double radius )
   {
      double volume =
         ( 4.0 / 3.0 ) * Math.PI * Math.pow( radius, 3 );

      return volume;
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
