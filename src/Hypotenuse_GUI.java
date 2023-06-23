package src;
import javax.swing.JOptionPane;

// Hypotenuse Calculator using Java Swing Library
public class Hypotenuse_GUI{
  public static void main(String[] args){
    double a = Double.parseDouble(JOptionPane.showInputDialog("Opposite = "));
    double b = Double.parseDouble(JOptionPane.showInputDialog("Adjacent = "));

    double c = Math.sqrt((a*a)+(b*b));
    
    JOptionPane.showMessageDialog(null,"Hypotenuse = "+c);
  }
}
