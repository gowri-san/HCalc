import javax.swing.JOptionPane;

public class Main
{
    public static void main(String[] args)
    {
        String height = JOptionPane.showInputDialog("Enter your height (cm) ");
        String message = "Your height is " + height + " cm.";
        JOptionPane.showMessageDialog(null, message);
    }
}
