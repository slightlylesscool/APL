import java.awt.*;
import java.awt.event.*;

public class Move extends Frame implements ActionListener {
    Button up = new Button("Up");
    Button down = new Button("Down");
    Button right = new Button("Right");
    Button left = new Button("Left");
    Button topLeft = new Button("Top-Left");
    Button topRight = new Button("Top-Right");
    Button bottomLeft = new Button("Bottom-Left");
    Button bottomRight = new Button("Bottom-Right");
    Button exit = new Button("Exit");

    int x = 200;
    int y = 200;
    Object s;

    Move() {
        setSize(600, 600);
        setTitle("Move Object");
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        setBackground(Color.white);

        add(up);
        add(down);
        add(right);
        add(left);
        add(topLeft);
        add(topRight);
        add(bottomLeft);
        add(bottomRight);
        add(exit);

        Button[] buttons = {up, down, right, left, topLeft, topRight, bottomLeft, bottomRight, exit};
        for (Button button : buttons) {
            button.setPreferredSize(new Dimension(100, 40));
            button.setBackground(Color.LIGHT_GRAY);
            button.addActionListener(this);
        }
    }

    public void actionPerformed(ActionEvent ae) {
        s = ae.getSource();
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);

        if (s == up) {
            y = Math.max(0, y - 20);
        } else if (s == down) {
            y = Math.min(getHeight() - 70, y + 20);
        } else if (s == right) {
            x = Math.min(getWidth() - 70, x + 20);
        } else if (s == left) {
            x = Math.max(0, x - 20);
        } else if (s == topLeft) {
            x = Math.max(0, x - 20);
            y = Math.max(0, y - 20);
        } else if (s == topRight) {
            x = Math.min(getWidth() - 70, x + 20);
            y = Math.max(0, y - 20);
        } else if (s == bottomLeft) {
            x = Math.max(0, x - 20);
            y = Math.min(getHeight() - 70, y + 20);
        } else if (s == bottomRight) {
            x = Math.min(getWidth() - 70, x + 20);
            y = Math.min(getHeight() - 70, y + 20);
        } else if (s == exit) {
            System.exit(0);
        }

        g.setColor(Color.black);
        g.fillRect(x, y, 100, 100);
    }

    public static void main(String args[]) {
        Move m = new Move();
        m.setVisible(true);
    }
}
