import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Test {
    public static void main(String s[]) {
        JFrame frame = new JFrame("JFrame Example");
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        panel.setLayout(new FlowLayout());
        panel2.setLayout(new FlowLayout());

        JLabel label = new JLabel("JFrame By Example");
        JButton button = new JButton();
        button.setText("Button");
        panel.add(label);
        panel.add(button);

        JLabel label2 = new JLabel("JFrame By Example2");
        JButton button2 = new JButton();
        button.setText("Button2");
        panel2.add(label2);
        panel2.add(button2);

        frame.add(panel);
        frame.add(panel2);
        frame.setSize(200, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
} 