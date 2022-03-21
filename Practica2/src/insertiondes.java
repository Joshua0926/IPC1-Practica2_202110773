
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
public class insertiondes extends Thread {
    
    @Override
            public void run(){
         
        
        
              
        
         
          insertiondes o = new insertiondes();
           o.sort2(Principal.Arreglo);
            
            for (int i = 0; i < Principal.Arreglo.length; i++) {
            
        
            
            Principal.datos4.setValue(Principal.Arreglo[i], "Numeros", Principal.nombres[i]); 
        
         JFreeChart grafico_barras = ChartFactory.createBarChart3D(
       Principal.titu, 
        Principal.TitulosY, 
        Principal.TitulosX,
         Principal.datos4,
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
      Principal.t.stop();     
     
     }
   public void sort2(int arr[] )
    {
        Principal.pasos=0;
        int n = arr.length;
        
        for (int i = 1; i < n; ++i) {
            
        if (arr[i]==0) {
               
           }
           else{
            int key = arr[i];
           
            int j = i - 1;
 
           
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
               
                j = j - 1;
            Principal.pasos=Principal.pasos+1;
            String pp1= String.valueOf(Principal.pasos); 
            Principal.LabelPasos.setText(pp1); 
            }
            arr[j + 1] = key;
            
            
   
        }

        }
    }
    
}
