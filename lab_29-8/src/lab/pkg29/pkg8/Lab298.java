/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg29.pkg8;
import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import javax.swing.*;
/**
 *
 * @author Administrator
 */
public class Lab298 extends JApplet{
    private JProgressBar jpb = new JProgressBar();
    private JTextArea jtaResult = new JTextArea();
    private JTextField jtfPrimeCount = new JTextField();
    private JButton jbtDisplayPrime = new JButton("Display Prime");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        jpb.setStringPainted(true);
        jpb.setValue(0);
        jpb.setMaximum(100);
        jtaResult.setWrapStyleWord(true);
        jtaResult.setLineWrap(true);
        
        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter the prime number count"));
        panel.add(jtfPrimeCount);
        panel.add(jbtDisplayPrime);
        
        add(jpb, BorderLayout.NORTH);
        add(new JScrollPanel(jtaResult), BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);
        
        jbtDisplayPrime.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                ComputePrime task = new ComputePrime(
                        Integer.parseInt(jtfPrimeCount.getText()), jtaResult);
                
                task.addPropertyChangeListener(new PropertyChangeListener(){
                    @Override
                    public void propertyChange(PropertyChangeEvent e){
                        if ("progress".equals(e.getPropertyName())){
                            jpb.setValue((Integer)e.getNewValue());
                        }
                    }
                });
                
                task.execute();
            }
        });
    }
    
    static class CumputePrime extends SwingWorker<Integer, Integer>{
        private int count;
        private JTextArea result;
        
        public ComputePrime(int count, JTextArea result){
            this.count = count;
            this.result = result;
        }
        
        @Override
        protected Integer doInBackground(){
            publishPrimeNumbers(count);
            return 0;
        }
        
        @Override
        protected void process(java.util.List<Integer> list){
            for (int i = 0; i < list.size(); i++)
                result.append(list.get(i) + " ");
        }
        
        private void publishPrimeNumbers(int n){
            int count1 = 0;
            int number = 2;
            
            while (count1 <= n){
                if (isPrime(number)){
                    count1++;
                    setProgress(100 * count1 / n);
                    publish(number);
                }
                number++
            }
        }
        
        private static boolean isPrime(int number){
            for (int divisor = 2; divisor <= number / 2; divisor++){
                if (number % divisor == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
