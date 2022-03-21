
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
public class insertionsort extends Thread {
    
    @Override
     public void run(){
         
        
        
              
        
         
           insertionsort o = new insertionsort();
           o.InsertionSort(Principal.Arreglo);
            
            for (int i = 0; i < Principal.Arreglo.length; i++) {
            
        
            
            Principal.datos2.setValue(Principal.Arreglo[i], "Numeros", Principal.nombres[i]); 
        
         JFreeChart grafico_barras = ChartFactory.createBarChart3D(
        Principal.titu, 
        Principal.TitulosY, 
        Principal.TitulosX,
         Principal.datos2,
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
        
        
                System.out.println(Principal.Arreglo[i]);
        
         try {
            Thread.sleep(500); 
            
            
            
            
            
            
            
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        
     }
      Principal.t.stop();     
     
     }
     
     
     public void InsertionSort(int [] array){
     
     int aux;
     int cont1;
     int cont2;
         for (cont1 = 1;  cont1 < array.length; cont1++) {
           
             aux=array[cont1];
             
            for (cont2 = cont1-1; cont2 >= 0 && array[cont2]>aux; cont2--) {
         
                array[cont2+1]=array[cont2];
                array[cont2]=aux;
                
             }
             
             
         }
            
     
     
     }
        
} 
           
        
        
        
        
       
              
        
        
        
       
        
       
        
        
        
            
       
             
     
     
     
      
        
     
     
  
    
    
    
