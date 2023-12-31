
package aulico02.igu;

import aulico02.logica.Empresa;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;





/**
 *
 * @author marus
 */
public class MostrarEmpresas extends javax.swing.JInternalFrame {
 DefaultTableModel modelo = new DefaultTableModel();
    public ArrayList<Empresa>listaEmpresa;

 
    public MostrarEmpresas(ArrayList<Empresa> listaEmpresas) {
        initComponents();
        this.setSize(800, 525);
        this.setResizable(false);
        this.setTitle("BUSQUEDA POR RUBRO");
        String ids[] = {"Razon Social", "Cuit"};
        modelo.setColumnIdentifiers(ids);
        jtEmpresas.setModel(modelo);
          actualizarTabla(listaEmpresas);
    }
  
   public void actualizarTabla(ArrayList<Empresa> listaEmpresas) {
    DefaultTableModel modelo = (DefaultTableModel) jtEmpresas.getModel();
    modelo.setRowCount(0); // Limpia la tabla
    
    for (Empresa empresa : listaEmpresas) {
        Object[] rowData = {empresa.getRazonSocial(), empresa.getCuit()};
        modelo.addRow(rowData);
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEmpresas = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();
        jbMostrarEmpresas = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 215, 188));

        jLabel1.setFont(new java.awt.Font("ItalicT", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("MOSTRAR EMPRESAS");

        jtEmpresas.setBackground(new java.awt.Color(204, 204, 255));
        jtEmpresas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 204)));
        jtEmpresas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtEmpresas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtEmpresas.setRowHeight(20);
        jScrollPane1.setViewportView(jtEmpresas);

        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aulico02/imagenes/icons8-cerrar-ventana-20.png"))); // NOI18N
        jbSalir.setText("EXIT");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbMostrarEmpresas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aulico02/imagenes/categorias.png"))); // NOI18N
        jbMostrarEmpresas.setText("MOSTRAR EMPRESAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jbMostrarEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel1)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbMostrarEmpresas))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbMostrarEmpresas;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTable jtEmpresas;
    // End of variables declaration//GEN-END:variables
}
