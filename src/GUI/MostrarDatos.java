/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author laboratorio
 */
public class MostrarDatos extends javax.swing.JFrame {

    /**
     * Creates new form MostrarDatos
     */
    public MostrarDatos() {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("Mostrar Datos");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMostrarVehiculos = new javax.swing.JButton();
        btnMostrarCitas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taMostrar = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnMostrarVehiculos.setText("Vehiculos");
        btnMostrarVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarVehiculosActionPerformed(evt);
            }
        });

        btnMostrarCitas.setText("Citas");
        btnMostrarCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarCitasActionPerformed(evt);
            }
        });

        taMostrar.setEditable(false);
        taMostrar.setColumns(20);
        taMostrar.setRows(5);
        jScrollPane1.setViewportView(taMostrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMostrarVehiculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMostrarCitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMostrarVehiculos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMostrarCitas)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarVehiculosActionPerformed
        // TODO add your handling code here:
        taMostrar.setText(PantallaPrincipal.Gestora.MostrarVehiculos());
    }//GEN-LAST:event_btnMostrarVehiculosActionPerformed

    private void btnMostrarCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarCitasActionPerformed
        // TODO add your handling code here:
        taMostrar.setText(PantallaPrincipal.Gestora.MostrarCitas());
    }//GEN-LAST:event_btnMostrarCitasActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarCitas;
    private javax.swing.JButton btnMostrarVehiculos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taMostrar;
    // End of variables declaration//GEN-END:variables
}
