/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

/**
 *
 * @author laboratorio
 */
public class FrmModuloConsultas extends javax.swing.JFrame {

    /**
     * Creates new form FrmModuloConsultas
     */
    public FrmModuloConsultas() {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("ModuloConsultas");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TADatosMostrarCitasCartago = new javax.swing.JTextArea();
        btnMostrarCitasCartago = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TADatosMostrarVehiculosToyota = new javax.swing.JTextArea();
        btnMostarVehiculoToyota = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TADatosMostrarVehiculosNissan = new javax.swing.JTextArea();
        btnMostarVehiculoNissan = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TADatosMostrarCitasCartago.setColumns(20);
        TADatosMostrarCitasCartago.setRows(5);
        jScrollPane1.setViewportView(TADatosMostrarCitasCartago);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, 220));

        btnMostrarCitasCartago.setText("Mostrar Citas");
        btnMostrarCitasCartago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarCitasCartagoActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrarCitasCartago, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 40));

        jTabbedPane1.addTab("Citas Cartago", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TADatosMostrarVehiculosToyota.setColumns(20);
        TADatosMostrarVehiculosToyota.setRows(5);
        jScrollPane2.setViewportView(TADatosMostrarVehiculosToyota);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, 220));

        btnMostarVehiculoToyota.setText("Mostrar Toyota");
        btnMostarVehiculoToyota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostarVehiculoToyotaActionPerformed(evt);
            }
        });
        jPanel2.add(btnMostarVehiculoToyota, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 40));

        jTabbedPane1.addTab("Toyota", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TADatosMostrarVehiculosNissan.setColumns(20);
        TADatosMostrarVehiculosNissan.setRows(5);
        jScrollPane3.setViewportView(TADatosMostrarVehiculosNissan);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, 220));

        btnMostarVehiculoNissan.setText("Mostrar Nissan ");
        btnMostarVehiculoNissan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostarVehiculoNissanActionPerformed(evt);
            }
        });
        jPanel3.add(btnMostarVehiculoNissan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 40));

        jTabbedPane1.addTab("Nissan", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarCitasCartagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarCitasCartagoActionPerformed
   
    TADatosMostrarCitasCartago.setText(""); 
    
    TADatosMostrarCitasCartago.setText(PantallaPrincipal.Gestora.MostrarCitasCartago());
        
    }//GEN-LAST:event_btnMostrarCitasCartagoActionPerformed

    private void btnMostarVehiculoToyotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostarVehiculoToyotaActionPerformed
   
    TADatosMostrarVehiculosToyota.setText(""); 
        
    TADatosMostrarVehiculosToyota.setText(PantallaPrincipal.Gestora.MostrarToyota());
        
    }//GEN-LAST:event_btnMostarVehiculoToyotaActionPerformed

    private void btnMostarVehiculoNissanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostarVehiculoNissanActionPerformed
       
     TADatosMostrarVehiculosNissan.setText("");   
        
     TADatosMostrarVehiculosNissan.setText(PantallaPrincipal.Gestora.MostrarNissan());   
        
    }//GEN-LAST:event_btnMostarVehiculoNissanActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TADatosMostrarCitasCartago;
    private javax.swing.JTextArea TADatosMostrarVehiculosNissan;
    private javax.swing.JTextArea TADatosMostrarVehiculosToyota;
    private javax.swing.JButton btnMostarVehiculoNissan;
    private javax.swing.JButton btnMostarVehiculoToyota;
    private javax.swing.JButton btnMostrarCitasCartago;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
