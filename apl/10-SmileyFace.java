import java.awt.*;
import javax.swing.*;

public class SmileyFace extends JFrame {
    public SmileyFace() {
        setTitle("Smiley Face");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add(new SmileyPanel());
    }

    class SmileyPanel extends JPanel {
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            setBackground(Color.white);
            
            g.setColor(Color.yellow);
            g.fillOval(100, 80, 200, 200); 
            
            g.setColor(Color.black);
            g.fillOval(150, 130, 20, 20); 
            g.fillOval(230, 130, 20, 20); 
            
            g.drawArc(150, 160, 100, 60, 180, 180); 
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SmileyFace frame = new SmileyFace();
            frame.setVisible(true);
        });
    }
}
