package lab15_3;

import javax.swing.JFrame;

public class Lab15_3 {

    public static void main(String[] args) {
        JFrame frame = new MoveBall();
        frame.setLocation(150, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
