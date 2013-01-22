/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package homework34_5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class PaneApplet extends JApplet {
    private JMenuItem jmiErrorMsg, jmiInfoMsg, jmiQuestionMsg, jmiWarnMsg,
            jmiPlainMsg, jmiCustomMsg, jmiYesNoMsg, jmiYesNoCancMsg, jmiOKMsg,
            jmiTxtFieldMsg, jmiComboBoxMsg, jmiListMsg, jmiCustMsg;
    
    public PaneApplet(){
        JMenuBar jmb = new JMenuBar();
        setJMenuBar(jmb);
        
        JMenu messageMenu = new JMenu("Message Dialog");
        messageMenu.setMnemonic('M');
        jmb.add(messageMenu);
        
        JMenu conformationMenu = new JMenu("Conformation Dialog");
        conformationMenu.setMnemonic('C');
        jmb.add(conformationMenu);
        
        JMenu inputMenu = new JMenu("Input Dialog");
        inputMenu.setMnemonic('I');
        jmb.add(inputMenu);
        
        JMenu optionMenu = new JMenu("Option Dialog");
        optionMenu.setMnemonic('O');
        jmb.add(optionMenu);
        
        messageMenu.add(jmiErrorMsg = new JMenuItem("Error Message", 'E'));
        messageMenu.add(jmiInfoMsg = new JMenuItem("Information Message", 'I'));
        messageMenu.add(jmiQuestionMsg = 
                new JMenuItem("Question Message", 'Q'));
        messageMenu.add(jmiWarnMsg = new JMenuItem("Warning Message", 'W'));
        messageMenu.add(jmiPlainMsg = new JMenuItem("Plain Message", 'P'));
        messageMenu.add(jmiCustomMsg = new JMenuItem("Custom Icon", 'C'));
        conformationMenu.add(jmiYesNoMsg = new JMenuItem("YES_NO_OPTION", 'Y'));
        conformationMenu.add(jmiYesNoCancMsg = 
                new JMenuItem("YES_NO_CANCEL_OPTION", 'C'));
        conformationMenu.add(jmiOKMsg = new JMenuItem("OK_OPTION", 'O'));
        inputMenu.add(jmiTxtFieldMsg = new JMenuItem("TextField Input", 'T'));
        inputMenu.add(jmiComboBoxMsg = new JMenuItem("ComboBox Input", 'C'));
        inputMenu.add(jmiListMsg = new JMenuItem("List Input", 'L'));
        optionMenu.add(jmiCustMsg = new JMenuItem("Custom Option", 'C'));
        
        jmiErrorMsg.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(
                    rootPane, "This is the error message", "Error", WIDTH);
            }
        });

        jmiInfoMsg.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(
                    rootPane, "This is the information message", 
                    "Information", WIDTH);
            }
        });

        jmiQuestionMsg.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(
                    rootPane, "This is the question message", 
                    "Question", WIDTH);
            }
        });

        jmiWarnMsg.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(
                    rootPane, "This is the warning message", "Warning", WIDTH);
            }
        });

        jmiPlainMsg.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(
                    rootPane, "This is the plain message", "Plain", WIDTH);
            }
        });

        jmiCustomMsg.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(
                    rootPane, "This is the custom icon message",
                    "Custom Icon", WIDTH);
            }
        });

        jmiYesNoMsg.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(
                    rootPane, "This is the yes or no option", "YES_NO", WIDTH);
            }
        });

        jmiYesNoCancMsg.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(
                    rootPane, "This is the yes no cancel option", 
                    "YES_NO_CANCEL", WIDTH);
            }
        });

        jmiOKMsg.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(
                    rootPane, "This is the ok cancel option",
                    "OK_CANCEL", WIDTH);
            }
        });

        jmiTxtFieldMsg.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(
                    rootPane, "This is the textfield input",
                    "TextField", WIDTH);
            }
        });

        jmiComboBoxMsg.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(
                    rootPane, "This is the combobox input", "ComboBox", WIDTH);
            }
        });

        jmiListMsg.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(
                    rootPane, "This is the list input", "List Input", WIDTH);
            }
        });

        jmiCustMsg.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(
                    rootPane, "This is the custom option", "Custom", WIDTH);
            }
        });
    }
}
