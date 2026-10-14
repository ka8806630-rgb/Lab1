import javax.swing.JOptionPane;

public class HelloWorldSwing {
    public static void main(String[] args) {
        if (args.length > 0) {
            JOptionPane.showMessageDialog(null, "Welcome " + args[0] + " to JAVA");
        } else {
            JOptionPane.showMessageDialog(null, "Welcome to JAVA World!");
        }
    }
}