/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg33_6;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
/**
 *
 * @author Administrator
 */
public class DisplayFigure extends JApplet {
    private JRadioButton jrbTop = new JRadioButton("Top");
    private JRadioButton jrbLeft = new JRadioButton("Left");
    private JRadioButton jrbRight = new JRadioButton("Right");
    private JRadioButton jrbBottom = new JRadioButton("Bottom");
    private JTabbedPane jtpFigures = new JTabbedPane();
    private FigurePanel squarePanel = new FigurePanel();
    private FigurePanel rectanglePanel = new FigurePanel();
    private FigurePanel circlePanel = new FigurePanel();
    private FigurePanel ovalPanel = new FigurePanel();
    private JPanel p2 = new JPanel();
    ButtonGroup btg = new ButtonGroup();
    private JSplitPane jspSplitFrame = new JSplitPane(
            JSplitPane.VERTICAL_SPLIT, jtpFigures,
            p2);
    private boolean isStandAlone = false;
    String host = "localhost";
    
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Display Figures");
        DisplayFigure applet = new DisplayFigure();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        applet.isStandAlone = true;
        if (args.length == 1) applet.host = args[0];
        frame.add(applet, BorderLayout.CENTER);
        applet.init();
        applet.start();
        frame.pack();
        frame.setVisible(true);
    }
    
    public DisplayFigure(){
        squarePanel.setType(FigurePanel.LINE);
        rectanglePanel.setType(FigurePanel.RECTANGLE);
        circlePanel.setType(FigurePanel.ROUND_RECTANGLE);
        ovalPanel.setType(FigurePanel.OVAL);
        
        add(jspSplitFrame, BorderLayout.CENTER);
        jtpFigures.add(squarePanel, "Line");
        jtpFigures.add(rectanglePanel, "Rectangle");
        jtpFigures.add(circlePanel, "Round Rectangle");
        jtpFigures.add(ovalPanel, "Oval");
        
        jtpFigures.setToolTipTextAt(0, "Square");
        jtpFigures.setToolTipTextAt(1, "Rectangle");
        jtpFigures.setToolTipTextAt(2, "Circle");
        jtpFigures.setToolTipTextAt(3, "Oval");
        p2.setLayout(new GridLayout(1, 4));
        p2.add(jrbTop);
        p2.add(jrbLeft);
        p2.add(jrbRight);
        p2.add(jrbBottom);
        p2.setBorder(new TitledBorder("Specify Tab Location"));
    
        jrbTop.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                jtpFigures.setTabPlacement(JTabbedPane.TOP);
                p2.validate();
            }
        });
        jrbLeft.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                jtpFigures.setTabPlacement(JTabbedPane.LEFT);
                p2.validate();
            }
        });
        jrbRight.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                jtpFigures.setTabPlacement(JTabbedPane.RIGHT);
                p2.validate();
            }
        });
        jrbBottom.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                jtpFigures.setTabPlacement(JTabbedPane.BOTTOM);
                p2.validate();
            }
        });
    }
}
