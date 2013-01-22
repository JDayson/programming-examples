/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hwlab14_2;

import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author Administrator
 */
public class OvalButton extends JButton {
    OvalButton(){
        
    }
    OvalButton(String s){
        this.setText(s);
    }
    @Override
    protected void paintComponent(Graphics g){
        int width = getSize().width;
        int height = getSize().height;
        super.paintComponent(g);
        g.drawOval((int)(0.1 * width), (int)(0.1 * height), (int)(0.8 * width),(int)(0.8 * height));
    }
}
