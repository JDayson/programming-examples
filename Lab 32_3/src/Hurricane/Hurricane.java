/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hurricane;
import javax.swing.*;  
import java.awt.event.*;  
import java.awt.*;  
import java.util.*;  
import java.lang.*;  
import java.lang.String;  
/**
 *
 * @author Administrator
 */
public class Hurricane extends JFrame {
    private int category; 
    private BorderLayout border = new BorderLayout();  
    private String hurricaneName = "";  
    private ArrayList<ActionListener> actionListenerList;  

    public Hurricane() {
        new TestHurricaneBean();
    }
    public void setCategory(int category){  
        this.category = category;  
        if(category >= 3) {  
            processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, null));  
        }  
    }  
    public int getCategory() {  
        return this.category;  
    }  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        Hurricane hurricane = new Hurricane();   
    }
    public synchronized void addActionListener(ActionListener listener) {  
        if(actionListenerList == null) {  
            actionListenerList = new ArrayList<ActionListener>(2);  
        }  
        if(!actionListenerList.contains(listener)) {  
            actionListenerList.add(listener);  
        }  
    }  
    public synchronized void removeActionListener(ActionListener listener) {  
        if(actionListenerList != null && actionListenerList.contains(listener)) {  
            actionListenerList.remove(listener);  
        }  
    }  
    private void processEvent(ActionEvent e) {  
        ArrayList list;  
        synchronized(this) {  
            if(actionListenerList == null) return;  
            list = (ArrayList)actionListenerList.clone();  
        }  
        for(int i = 0; i < list.size(); i++) {  
            ActionListener listener = (ActionListener)list.get(i);  
            listener.actionPerformed(e);  
        }  
    }  
} 