/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab15_3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class MoveBall extends JFrame {
    private JButton jbtUP = new JButton("UP");
    private JButton jbtDOWN = new JButton("DOWN");
    private JButton jbtLEFT = new JButton("LEFT");
    private JButton jbtRIGHT = new JButton("RIGHT");
    private BallCanvas canvas = new BallCanvas();
    
    MoveBall(){
        JPanel panel = new JPanel();
        panel.add(jbtLEFT);
        panel.add(jbtUP);
        panel.add(jbtDOWN);
        panel.add(jbtRIGHT);
        this.add(canvas, BorderLayout.CENTER);
        this.add(panel, BorderLayout.SOUTH);
        jbtUP.setVisible(true);
        jbtDOWN.setVisible(true);
        jbtLEFT.setVisible(true);
        jbtRIGHT.setVisible(true);
        
        jbtUP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.moveUp();
            }
        });
        jbtDOWN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.moveDown();
            }
        });
        jbtLEFT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.moveLeft();
            }
        });
        jbtRIGHT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.moveRight();
            }
        });
        
    }
}
