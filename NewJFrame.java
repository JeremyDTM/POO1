package logicadenegocios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.Timer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author Dell
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("pie");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jToggleButton1.setText("jToggleButton1");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addGap(77, 77, 77))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String Departamento1="Primer lugar: ",Departamento2="Seg",Departamento3="3",Departamento4="4",Departamento5="5";
      
      DefaultPieDataset data = new DefaultPieDataset();
      data.setValue(Departamento1, new Double(17.5));
      data.setValue(Departamento2, new Double(17.5));
      data.setValue(Departamento3, new Double(17.5));
      data.setValue(Departamento4, new Double(17.5));
      data.setValue(Departamento5, new Double(17.5));
      JFreeChart chart;
      chart = ChartFactory.createPieChart3D("Pie Chart",data,true,true,true);
      PiePlot3D plot=(PiePlot3D)chart.getPlot();
      plot.setBackgroundPaint(Color.LIGHT_GRAY);
      plot.setStartAngle(270);
      plot.setDirection(Rotation.ANTICLOCKWISE);
      plot.setForegroundAlpha(0.5f);
      ChartPanel chartPanel = new ChartPanel(chart);
      chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
      setContentPane(chartPanel);
      final Rotator rotator = new Rotator(plot);
      rotator.start();
      ChartFrame frame=new ChartFrame("Pie Chart",chart);
      frame.setVisible(true);
      BufferedImage image = new BufferedImage(200 , 100,
      BufferedImage.TYPE_INT_RGB);
      chart.setBackgroundPaint(Color.black);
      Graphics2D g2 = image.createGraphics();
      chart.draw(g2, new Rectangle2D.Double(0, 0, 300, 100), null, null);
      g2.dispose();
      frame.setSize(450,500);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
      if(!Viaje.getViajes().isEmpty()){
      } else {
      }
      DefaultCategoryDataset dataset= new DefaultCategoryDataset();
      ArrayList<Chofer> choferes=Chofer.getChoferes();
      ArrayList<Chofer> choferesConViajes=new ArrayList<Chofer>();
      ArrayList<Chofer> top5=new ArrayList<Chofer>();
      Chofer chofer1=new Chofer( "Juan", 305280031,"jdtm23@gmail.com",83317040);
      chofer1.setCantViajes();
      choferes.add(chofer1);
      String Chofer1="Primer lugar: ",Chofer2="Segundo lugar: ",Chofer3="Tercer lugar: ",Chofer4="Cuarto lugar: ",Chofer5="Quinto lugar: ";
      int cantViajes1=0,cantViajes2=0,cantViajes3=0,cantViajes4=0,cantViajes5=0;
      if(choferes.size()!=0){
        int contador=0;
        while(choferes.size()>contador){
          System.out.println("hola");
          if(choferes.get(contador).getCantViajes()!=0){
            choferesConViajes.add(choferes.get(contador));
          }
          contador++;
        }
        contador=0;
        int mayorValor=0;
        Chofer chofer = null;
        while(contador<choferesConViajes.size()){
          
          int contador2=0;
          while(contador2<choferesConViajes.size()){
            if(choferesConViajes.get(contador2).getCantViajes()>mayorValor){
                mayorValor=choferesConViajes.get(contador2).getCantViajes();
                chofer=choferesConViajes.get(contador2);
            }
            top5.add(chofer);
            choferesConViajes.remove(chofer);
            contador2++;
          }
        }
          switch (top5.size()) {
              case 1:
                  Chofer1+=top5.get(0).getNombre();
                  cantViajes1=top5.get(0).getCantViajes();
                  break;
              case 2:
                  Chofer1+=top5.get(0).getNombre();
                  Chofer2+=top5.get(1).getNombre();
                  cantViajes1=top5.get(0).getCantViajes();
                  cantViajes2=top5.get(1).getCantViajes();
                  break;
              case 3:
                  Chofer1+=top5.get(0).getNombre();
                  Chofer2+=top5.get(1).getNombre();
                  Chofer3+=top5.get(2).getNombre();
                  cantViajes1=top5.get(0).getCantViajes();
                  cantViajes2=top5.get(1).getCantViajes();
                  cantViajes3=top5.get(2).getCantViajes();
                  break;
              case 4:
                  Chofer1+=top5.get(0).getNombre();
                  Chofer2+=top5.get(1).getNombre();
                  Chofer3+=top5.get(2).getNombre();
                  Chofer4+=top5.get(3).getNombre();
                  cantViajes1=top5.get(0).getCantViajes();
                  cantViajes2=top5.get(1).getCantViajes();
                  cantViajes3=top5.get(2).getCantViajes();
                  cantViajes4=top5.get(3).getCantViajes();
                  
                  break;
              case 5:
                  Chofer1+=top5.get(0).getNombre();
                  Chofer2+=top5.get(1).getNombre();
                  Chofer3+=top5.get(2).getNombre();
                  Chofer4+=top5.get(3).getNombre();
                  Chofer5+=top5.get(4).getNombre();
                  cantViajes1=top5.get(0).getCantViajes();
                  cantViajes2=top5.get(1).getCantViajes();
                  cantViajes3=top5.get(2).getCantViajes();
                  cantViajes4=top5.get(3).getCantViajes();
                  cantViajes5=top5.get(4).getCantViajes();
                  break;
              default:
                  break;
          }
      }
     
      dataset.setValue(cantViajes1,"cantViajes",Chofer1);
      dataset.setValue(cantViajes2,"cantViajes",Chofer2);
      dataset.setValue(cantViajes3,"cantViajes",Chofer3);
      dataset.setValue(cantViajes4,"cantViajes",Chofer4);
      dataset.setValue(cantViajes5,"cantViajes",Chofer5);
      JFreeChart chart=ChartFactory.createBarChart3D("Choferes con más viajes", "Student name", "marks", dataset, PlotOrientation.VERTICAL, false, true, false);
      CategoryPlot plot=chart.getCategoryPlot();
      plot.setRangeGridlinePaint(Color.black);
      plot.setBackgroundPaint(Color.darkGray);
      chart.setBackgroundPaint(Color.white);
      ChartFrame frame=new ChartFrame("Bar Chart for student",chart);
      frame.setVisible(true);
      frame.setSize(450,350);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}

class Rotator extends Timer implements ActionListener {

    /** The plot. */
    private PiePlot3D plot;

    /** The angle. */
    private int angle = 270;

    /**
     * Constructor.
     *
     * @param plot  the plot.
     */
    Rotator(final PiePlot3D plot) {
        super(100, null);
        this.plot = plot;
        addActionListener(this);
    }

    /**
     * Modifies the starting angle.
     *
     * @param event  the action event.
     */
    @Override
    public void actionPerformed(final ActionEvent event) {
        this.plot.setStartAngle(this.angle);
        this.angle = this.angle + 1;
        if (this.angle == 360) {
            this.angle = 0;
        }
    }

}