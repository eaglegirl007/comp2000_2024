import javax.swing.*;
import java.awt.*;

public class Cell extends JPanel {
    int x;
    int y;
    int width;
    int height;
    Color borderColour;
    Color innerColour;

    Cell(int CuX, int CuY, int CuWidth, int CuHeight, Color CuBorderColour, Color CuInnerColour) {
        x = CuX;
        y = CuY;
        width = CuWidth;
        height = CuHeight;
        borderColour = CuBorderColour;
        innerColour = CuInnerColour;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(borderColour);
        g.drawRect(x, y, width, height);
        g.setColor(innerColour);
        g.fillRect(x, y, width, height);
    }
}