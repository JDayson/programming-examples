package imageviewer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;


public class ImageViewer extends JFrame{

    private JPanel imagePanel;
    private JPanel buttonPanel;
    private JPanel imageLabel;
    private JButton button;
    private JFileChooser fileChooser;
    private Container contentPane;
    
    public ImageViewer(){
        setTitle("Image Viewer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        buildImagePanel();
        buildButtonPanel();
        button.addActionListener(new ButtonListener());
        
        //Create a file chooser
        
        pack();
        setVisible(true);
    }

    private void buildImagePanel(){
        //Create a panel
        //Create a label
        //Add the label to the panel
    }
    
    private void buildButtonPanel(){
        //Create panel
        //Create button
        //Register an action listener with the button
        //Add the button to the panel
    }
    
    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            //To reference the selected image file
            //to read the image file
            //To hold the name and path of the file
            //Indicates status of the open dialog box
            //Display an open dialog box
            fileChooserStatus = fileChooser.showOpenDialog(ImageViewer.this);
            
            if(fileChooserStatus = JFileChooser.APPROVE_OPTION){
                //Get a reference to the selected file
                //Get the path of the selected file
                //Read the image from the file
                //Store the image in the label
                //If the labeldisplays text, remove it
                //Pack the frame again to accomodate the new size of the label
            }
        }
    }
    
    public static void main(String[] args) {
        ImageViewer iv = new ImageViewer();
    }
}
