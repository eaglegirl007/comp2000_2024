import javax.swing.*;
import java.awt.*;

public class Cell extends JPanel {
    int x;
    int y;
    Graphics g;
    Point p;
    int size = 35;

    Cell(Graphics graphics, int CuX, int CuY, Point mousePos) {
        x = CuX;
        y = CuY;
        g = graphics;
        p = mousePos;

        if (p != null && (p.x - 10) / size == x && (p.y - 10) / size == y)

        {
            g.setColor(Color.GRAY);
        } else {
            g.setColor(Color.WHITE);
        }
        graphics.fillRect(x * size + 10, y * size + 10, size, size);
        g.setColor(Color.BLACK);
        graphics.drawRect(x * size + 10, y * size + 10, size, size);
    }
}