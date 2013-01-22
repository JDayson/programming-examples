
package lab15_3;

import javax.swing.*;
import java.awt.*;

public class BallCanvas extends JPanel{
    private int radius = 20;
    private int x = 0, y = 0;

    @Override
    public void setLocation(Point p) {
        super.setLocation(p);
    }

    @Override
    public void setLocation(int x, int y) {
        super.setLocation(x, y);
    }
    public void moveUp(){
        y -= 10;
        setLocation(x, y);
        repaint();
    }
    public void moveDown(){
        y += 10;
        setLocation(x, y);
        repaint();
    }
    public void moveLeft(){
        x -= 10;
        setLocation(x, y);
        repaint();
    }
    public void moveRight(){
        x += 10;
        setLocation(x, y);
        repaint();
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(getWidth() / 2 - radius, getHeight() / 2 - radius, 2 * radius, 2 * radius);
    }
}
