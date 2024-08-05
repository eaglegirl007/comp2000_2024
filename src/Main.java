import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private int width = 720;
    private int height = 720;

    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        Main window = new Main();
        window.run();

    }

    class Canvas extends JPanel {
        public Canvas() {
            setPreferredSize(new Dimension(width, height));
        }

        @Override
        public void paint(Graphics g) {
            Point p = getMousePosition();
            new Grid(g, p);
        }
    }

    public void run() {
        while (true) {
            this.repaint();
        }
    }
}
