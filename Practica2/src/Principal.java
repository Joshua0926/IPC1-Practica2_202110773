


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author RANDY
 */
public class Principal extends javax.swing.JFrame {

 
   static public Timer t;
    static int segundos = 0;
     static int minutos = 0;
    
   static String titu="";
    static String TitulosX;
    static String TitulosY;
     String [] DatosY = new String[100];
    static int[] Arreglo = new int[14];
    static int[] ArregloDes = new int[14];
    static String nombresDes[] = new String [16] ; 
     static boolean iniciaHilo=true;
     private boolean corriendo=false;
    static String nombres[] = new String [16] ;
    static DefaultCategoryDataset datos1 = new DefaultCategoryDataset();
     static DefaultCategoryDataset datos2 = new DefaultCategoryDataset();
      static DefaultCategoryDataset datos3 = new DefaultCategoryDataset();
       static DefaultCategoryDataset datos4 = new DefaultCategoryDataset();
       static DefaultCategoryDataset datos5 = new DefaultCategoryDataset();
       
    insertionsort hilo1 = new insertionsort();
    bubblesort hilo2 = new bubblesort();
    insertiondes hilo3 = new insertiondes();
    bubbledes hilo4 = new bubbledes();
     
int contador=0;
static int pasos=0;
    
     
    
     
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Practica 2");
        t= new Timer(1000, acciones);
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Direccion = new javax.swing.ButtonGroup();
        Metodo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Examinar = new javax.swing.JButton();
        GenerarGrafica = new javax.swing.JButton();
        bt_Ascendente = new javax.swing.JRadioButton();
        bt_Descendente = new javax.swing.JRadioButton();
        bt_BubbleSort = new javax.swing.JRadioButton();
        bt_InsertionSort = new javax.swing.JRadioButton();
        Ordenar = new javax.swing.JButton();
        bt_Reporte = new javax.swing.JButton();
        Ruta = new javax.swing.JTextField();
        TituloGrafica = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Label_Tiempo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        LabelPasos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 204, 0));

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 0, 24)); // NOI18N
        jLabel2.setText("Algoritmos de Ordenamiento");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(229, 229, 229))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(39, 39, 39))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        Examinar.setText("Examinar");
        Examinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExaminarActionPerformed(evt);
            }
        });

        GenerarGrafica.setText("Generar Grafica");
        GenerarGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarGraficaActionPerformed(evt);
            }
        });

        Direccion.add(bt_Ascendente);
        bt_Ascendente.setText("Ascendente");

        Direccion.add(bt_Descendente);
        bt_Descendente.setText("Descendente");

        Metodo.add(bt_BubbleSort);
        bt_BubbleSort.setText("Bubble Sort");

        Metodo.add(bt_InsertionSort);
        bt_InsertionSort.setText("Insertion Sort");

        Ordenar.setText("Ordenar");
        Ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenarActionPerformed(evt);
            }
        });

        bt_Reporte.setText("Reporte");
        bt_Reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(GenerarGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Examinar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_Ascendente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_Descendente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_BubbleSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_InsertionSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_Reporte)
                            .addComponent(Ordenar))
                        .addGap(63, 63, 63))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Examinar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GenerarGrafica)
                .addGap(36, 36, 36)
                .addComponent(bt_Ascendente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_Descendente)
                .addGap(33, 33, 33)
                .addComponent(bt_BubbleSort)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_InsertionSort)
                .addGap(34, 34, 34)
                .addComponent(Ordenar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_Reporte)
                .addContainerGap(250, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel1.setText("Cronometro");

        Label_Tiempo.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        Label_Tiempo.setText("00:00");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 553, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        jLabel3.setText("Pasos");

        LabelPasos.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        LabelPasos.setText("00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Ruta)
                            .addComponent(TituloGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(Label_Tiempo))
                                    .addGap(32, 32, 32)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(LabelPasos)
                                .addGap(44, 44, 44)))))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(Ruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TituloGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Label_Tiempo)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LabelPasos))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    private ActionListener acciones = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            
        ++segundos;
        if(segundos==60){
        segundos=0;
        ++minutos;
        
        }
        
     actualizarLabel();
     
            
        }
    
    
    };
    
    private void actualizarLabel(){
    
     String reloj = (minutos<=9?"0":"")+minutos+":"+(segundos<=9?"0":"")+segundos;
      Label_Tiempo.setText(reloj); 
    }
    
    
    private void OrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenarActionPerformed
        // TODO add your handling code here:
     
        
       if(Principal.bt_Ascendente.isSelected() == true &&    Principal.bt_InsertionSort.isSelected() == true){   
           
           segundos=0;
           minutos=0;
           pasos=0;
           
           
      //      if(corriendo==false){
        //        iniciaHilo=true;
          //      corriendo=true; 
            //    iniciarHiloCronometro();
                hilo1.start();
                t.start();
                
       // }
      
           
        
       
                
                
        
        
       }
       
       
     else  if(Principal.bt_Ascendente.isSelected() == true && Principal.bt_BubbleSort.isSelected() == true){   
      
            segundos=0;
           minutos=0;
           pasos=0;
           hilo2.start();
           t.start();
           
           //if(evt.getSource()==Ordenar){
         //   if(corriendo==false){
              //  iniciaHilo=true;
            //    corriendo=true; 
          //      iniciarHiloCronometro();
        
        //}
      
       //     }
        
        
           
        
       }
        
       else if(Principal.bt_Descendente.isSelected() == true &&    Principal.bt_InsertionSort.isSelected() == true){   
      
         segundos=0;
           minutos=0;
        pasos=0;
           hilo3.start();
           t.start();
           
        //   if(evt.getSource()==Ordenar){
          //  if(corriendo==false){
            //    iniciaHilo=true;
        //        corriendo=true; 
          //      iniciarHiloCronometro();
        
      //  }
      
    //        }
        
        
        
        
       }
        
      else  if(Principal.bt_Descendente.isSelected() == true && Principal.bt_BubbleSort.isSelected() == true){   
      
           segundos=0;
           minutos=0;
           
           pasos=0;
           
           
           
 //         if(evt.getSource()==Ordenar){
   //         if(corriendo==false){
    //            iniciaHilo=true;
      //          corriendo=true; 
        //        iniciarHiloCronometro();
                hilo4.start();
                t.start();
                
   //     }
      
  //          }
        
        
          
        
       }
     
     
     
        
    }//GEN-LAST:event_OrdenarActionPerformed

    private void GenerarGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarGraficaActionPerformed
        // TODO add your handling code here:
        
        
        
        String filename = Ruta.getText();
        File file = new File(filename);
       titu= TituloGrafica.getText();
        
         try {
                Scanner inputStream = new Scanner(file);
                
        String Encabezado = inputStream.next();
        String[] Encabezado1 = Encabezado.split(",");
       TitulosY = Encabezado1[0];
       TitulosX= Encabezado1[1];
        
                while(inputStream.hasNext()){
                    
                   
                        
                    
                    String data = inputStream.next();
                    
                    String values[] = data.split(",");
                    
                    int valoresy = Integer.parseInt(values[1]);
                    
                    
                        
                   datos1.setValue(valoresy, "Numeros", values[0]);
                   datos2.setValue(valoresy, "Numeros", values[0]);
                   datos3.setValue(valoresy, "Numeros", values[0]);
                   datos4.setValue(valoresy, "Numeros", values[0]);
                   datos5.setValue(valoresy, "Numeros", values[0]);
                
                   
                    
                    
                      Arreglo[contador]= valoresy; 
                      nombres[contador]= values[0];  
                      ArregloDes[contador]= valoresy;
                      nombresDes[contador]=values[0];
                   
                    System.out.println(Arreglo[contador] + "********");
                    
                    
                 
                  
                   
                   
                    JFreeChart grafico_barras = ChartFactory.createBarChart3D(
        titu,
        TitulosY,
        TitulosX,
         datos1,
         PlotOrientation.VERTICAL,
         true,
         true,
         false
                
        ); 
        
        ChartPanel panel = new ChartPanel(grafico_barras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(400,200)); 
        
        jPanel4.setLayout(new BorderLayout()); 
        jPanel4.add(panel,BorderLayout.NORTH); 
        
        pack();
        repaint();        
                        
        contador = contador +1;                 
                    
                  
                    
                    System.out.println(values[0]+ values[1]);
                  
                      
                     
                    
                   
                           
                }
                
                
                 
                
                
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        
        
        
        
        
    //   for (int i = 0; i < Titulos.length; i++) {
            
      //  int n1 = Integer.parseInt(String.valueOf(Titulos[i]));
        
        //datos.setValue(n1, "Numeros", "Cuba");
        //datos.setValue(n1, "Numeros", "Guate");
        
        //break;
    //}
        
        
    }//GEN-LAST:event_GenerarGraficaActionPerformed

    private void ExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExaminarActionPerformed
        // TODO add your handling code here:
        
        JFileChooser fc=new JFileChooser();
        
        
        
        int seleccion=fc.showOpenDialog(this);
        
        if(seleccion==JFileChooser.APPROVE_OPTION){
            File fichero=fc.getSelectedFile();
            
            this.Ruta.setText(fichero.getAbsolutePath());
            
            
        
        }
        
        
    }//GEN-LAST:event_ExaminarActionPerformed

    private void bt_ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ReporteActionPerformed
        // TODO add your handling code here:
        
           String cadenaLibros = "<!Doctype html>\n" +
"<html>\n" +
"<head>\n" +
" <title Algoritmos De Ordenamiento>\n" +
"</title>\n" +
"</head>\n" +
"<style> table, th, td {\n" +
"		border:1px solid rgb(156, 148, 148);\n" +
"		}\n" +
"</style>\n" +
"<body>\n" +
"\n"+
"<h2 style=\"color:black; text-align:center;\">Joshua David Osorio Tally   Carnet: 202110773</h2>\n";
           
      String TipoAlgoritmo="";
           if(Principal.bt_BubbleSort.isSelected() == true){
               TipoAlgoritmo = bt_BubbleSort.getText();
           
           }
           else if (Principal.bt_InsertionSort.isSelected() == true){
               TipoAlgoritmo = bt_InsertionSort.getText();
               
           } 
           
     cadenaLibros+=      
"<h1 style=\"color:black; text-align:center;\">Algoritmo Usado: "+TipoAlgoritmo+"</h1>\n"+
           
          
           

"<h2 style=\"color:black; text-align:center;\">"+"Tiempo Total: "+Label_Tiempo.getText()+"</h2>\n" +

"<h2 style=\"color:black; text-align:center;\">"+"Pasos Realizados: "+LabelPasos.getText()+"</h2>\n" +
             
             
"<br>\n" +      
             
      "<h2 style=\"color:black; text-align:center;\">Datos Desordenados</h2>\n" + 
             
    "<table style=\"margin: 0 auto;\">" +
    "<tr>"+
	"<th>"+TitulosY+"</th>\n"+
	"<th>"+TitulosX+"</th>\n"+
        
	
	
"</tr>"  ;
        
        for (int i = 0; i < ArregloDes.length ; i++) {
            
            
            cadenaLibros += "<tr>";
            cadenaLibros += "<td>" + nombresDes[i] + "</td>";
            cadenaLibros += "<td>" + ArregloDes[i] + "</td>";
          //  cadenaLibros += "<td>" + Pu.getListaReportes()[i].getTipo()+ "</td>";
            
            cadenaLibros += "</tr>";
            
            
        }
    
    cadenaLibros += "</table>\n" +
            "<br>\n" + 
            
 "<h2 style=\"color:black; text-align:center;\">Datos Ordenados</h2>\n" +           
            
     
             
             
             
             
"<table style=\"margin: 0 auto;\">" +
    "<tr>"+
	"<th>"+TitulosY+"</th>\n"+
	"<th>"+TitulosX+"</th>\n"+
        
	
	
"</tr>"  ;
        
        for (int i = 0; i < Arreglo.length ; i++) {
            
            
            cadenaLibros += "<tr>";
            cadenaLibros += "<td>" + nombres[i] + "</td>";
            cadenaLibros += "<td>" + Arreglo[i] + "</td>";
          //  cadenaLibros += "<td>" + Pu.getListaReportes()[i].getTipo()+ "</td>";
            
            cadenaLibros += "</tr>";
            
            
        }
    
    cadenaLibros += "</table>\n" +
            
        "<body>\n" +
        "\n" +
        "</html>"  ; 
        
       
        
        File Libros = new File(TituloGrafica.getText()+".html");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(Libros));
            bw.write(cadenaLibros);
            bw.close();
            
        } catch (Exception e) {
        }
        
        
    }//GEN-LAST:event_bt_ReporteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Direccion;
    private javax.swing.JButton Examinar;
    private javax.swing.JButton GenerarGrafica;
    public static javax.swing.JLabel LabelPasos;
    public static javax.swing.JLabel Label_Tiempo;
    private javax.swing.ButtonGroup Metodo;
    private javax.swing.JButton Ordenar;
    private javax.swing.JTextField Ruta;
    private javax.swing.JTextField TituloGrafica;
    public static javax.swing.JRadioButton bt_Ascendente;
    public static javax.swing.JRadioButton bt_BubbleSort;
    public static javax.swing.JRadioButton bt_Descendente;
    public static javax.swing.JRadioButton bt_InsertionSort;
    private javax.swing.JButton bt_Reporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

    private void iniciarHiloCronometro() {
        if (iniciaHilo==true) {
          
          ClaseCronometro miCronometro= new ClaseCronometro(Label_Tiempo);
          miCronometro.start();
        }
        
        
        
    }
}
