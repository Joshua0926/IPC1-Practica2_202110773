
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RANDY
 */
public class ClaseCronometro extends Thread {
   
    
    ClaseCronometro(JLabel Tiempo) {
      
    }
    @Override
    public void run(){
        try {
          int x=0;
          while(Principal.iniciaHilo){
          
          Thread.sleep(1000);
              
              ejecutarHiloCronometro(x);
                
              x++;
          
          }
          
        } catch (Exception e) {
        } 
    
    
    }

    private void ejecutarHiloCronometro(int x) {
       
        
        Principal.segundos++;
        if (Principal.segundos>59) {
            Principal.segundos=0;
            Principal.minutos++;
            
        }
        
     String textSeg="", textMin="";
     textSeg+=Principal.segundos;
     textMin+=Principal.minutos;
     
     String reloj = (Principal.minutos<=9?"0":"")+Principal.minutos+":"+(Principal.segundos<=9?"0":"")+Principal.segundos;
     
     Principal.Label_Tiempo.setText(reloj); 
     
     
    }
    
    
    


   
    
    
    
 
    
}
