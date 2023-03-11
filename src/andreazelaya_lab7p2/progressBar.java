package andreazelaya_lab7p2;

import javax.swing.JProgressBar;

public class progressBar extends Thread{
    private JProgressBar barra;
    private double mB;
    boolean isAlive;

    public progressBar(JProgressBar barra, double mB) {
        this.barra = barra;
        this.mB = mB;
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

    public boolean isIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }
    
    
    
    public void run(){
        while(isAlive){
            barra.setValue(barra.getValue()+100);
            
            
        }
    }
}
