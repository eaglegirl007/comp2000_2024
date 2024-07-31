import javax.swing.*;
import java.awt.*;

public class Grid extends JFrame {
    int xLength;
    int yLength;
    Cell[] arr1;
    Cell[] arr2;

    Grid(int xGridLength, int yGridLength) {
        xLength = xGridLength;
        yLength = yGridLength;
        for (int i = xLength; i < 710; i += 35) {
            for (int j = yLength; j < 710; j += 35) {
                Cell cell = new Cell(i, j, 35, 35, Color.black, Color.white);

            }
        }
    }
}