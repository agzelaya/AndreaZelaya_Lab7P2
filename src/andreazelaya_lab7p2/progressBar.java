package andreazelaya_lab7p2;

import javax.swing.JProgressBar;

public class progressBar extends Thread{
    private JProgressBar barra;
    private double mB;

    public progressBar(JProgressBar barra, double mB) {
        this.barra = barra;
        this.mB = mB;
        barra.setMaximum((int)mB/10);
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public double getmB() {
        return mB;
    }

    public void setmB(double mB) {
        this.mB = mB;
    }

    
    
    
    public void run(){
        int count = 0;
        while(barra.getValue() != barra.getMaximum()){
            barra.setValue(barra.getValue()+1);
            
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
        barra.setValue(0);
        
    }
}
