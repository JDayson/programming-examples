/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle.gui.program;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Administrator
 */
public class VehiclePanelProgram extends JFrame{
    VehicleColorPanel vcp = new VehicleColorPanel();
    VehicleOptionPanel vop = new VehicleOptionPanel(this);
    VehiclePricePanel vpp = new VehiclePricePanel();
    VehicleTypePanel vtp = new VehicleTypePanel(this);
    private JTabbedPane jtpFigures = new JTabbedPane();
    
    JPanel summaryPanel = new JPanel();
    JButton summaryButton = new JButton("Summary");
    
    public VehiclePanelProgram(){
        Container canvas = getContentPane();
        canvas.setLayout(new BorderLayout());
        canvas.add(jtpFigures);
        jtpFigures.add(vcp, "Vehicle Color");
        jtpFigures.add(vop, "Vehicle Options");
        jtpFigures.add(vpp, "Vehicle Price");
        jtpFigures.add(vtp, "Vehicle Type");
        
        fixUpSummaryPanel();
        jtpFigures.add(summaryPanel, "Summary");
        this.setSize(600, 350);
        this.setTitle(" Vehicle Panel Program ");
        this.show();
    }
    
    public void fixUpSummaryPanel(){
        summaryPanel.setLayout(new GridLayout(5, 2));
        JLabel lblType = new JLabel("The Type of Automobile is: ");
        JLabel lblOptions = new JLabel("The Options on the Automobile are: ");
        JLabel lblIntColor = new JLabel("The Interior Color of the Automobile is: ");
        JLabel lblExtColor = new JLabel("The Exterior Color of the Automobile is: ");
        JLabel lblPrice = new JLabel("The Price of the Automobile is: ");
        JLabel strType = new JLabel(vtp.getTypeChoice());
        JLabel strOptions = new JLabel(vop.getOptionChoice());
        JLabel strIntColor = new JLabel(vcp.getIntColorChoice());
        JLabel strExtColor = new JLabel(vcp.getExtColorChoice());
        JLabel strPrice = new JLabel(vpp.getPriceChoice());
        summaryPanel.add(lblType);
        summaryPanel.add(strType);
        summaryPanel.add(lblOptions);
        summaryPanel.add(strOptions);
        summaryPanel.add(lblIntColor);
        summaryPanel.add(strIntColor);
        summaryPanel.add(lblExtColor);
        summaryPanel.add(strExtColor);
        summaryPanel.add(lblPrice);
        summaryPanel.add(strPrice);
//        summaryPanel.add(summaryButton);
    }
    
    public void disableSunroof(){
        vop.disSunroof();
    }
    
    public void enableSunroof(){
        vop.enSunroof();
    }
    
    public void disableConvertible(){
        vtp.disCon();
    }
    
    public void enableConvertible(){
        vtp.enCon();
    }
    
    public static void main(String args[]){
        VehiclePanelProgram app = new VehiclePanelProgram();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
