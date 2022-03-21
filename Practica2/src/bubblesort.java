
import java.awt.BorderLayout;
import java.awt.Dimension;
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
public class bubblesort extends Thread {
    
    @Override 
    public void run(){
    
   
        
        int aux;
        
        
       
           
             for (int i = 0; i < Principal.Arreglo.length; i++) {
                 for (int j = i+1; j < Principal.Arreglo.length; j++) {
                     
                  if(Principal.Arreglo[i]>Principal.Arreglo[j]){
                  
                      aux = Principal.Arreglo[i];
                 
                  Principal.Arreglo[i]=Principal.Arreglo[j];
                 
                  
                  Principal.Arreglo[j]=aux;
                  
                 
                  
                   
                    
                  
              } 
                  
                  Principal.datos3.setValue(Principal.Arreglo[i], "Numeros", Principal.nombres[i]);
        
         JFreeChart grafico_barras = ChartFactory.createBarChart3D(
        Principal.titu, 
        Principal.TitulosY, 
        Principal.TitulosX,
         Principal.datos3,
         PlotOrientation.VERTICAL,
         true,
         true,
         false
                
        ); 
        
       ChartPanel panel = new ChartPanel(grafico_barras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(400,200)); 
        
        Principal.jPanel4.removeAll();
        Principal.jPanel4.setLayout(new BorderLayout()); 
        Principal.jPanel4.add(panel,BorderLayout.NORTH); 
        
        
        Principal.jPanel4.repaint();
        Principal.jPanel4.revalidate();
        
          Principal.pasos=Principal.pasos+1;
            String pp1= String.valueOf(Principal.pasos); 
            Principal.LabelPasos.setText(pp1);
       try {
            
             Thread.sleep(500); 
             
             
             
             
             
             
             
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
             }
                  
            
                 
             }
        
      Principal.t.stop();  
      
      
        
    
    
    
    
    }
    
    
    
  
    
 
    
    
    
    
}
