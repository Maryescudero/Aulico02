
package aulico02.igu;


import aulico02.logica.Categorias;
import aulico02.logica.Empleado;
import aulico02.logica.Empresa;
import java.util.ArrayList;
import java.util.TreeSet;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marus
 */
public class IngresoDatos extends javax.swing.JFrame {
    public static TreeSet<Empleado> empleados = new TreeSet<>();
    ArrayList<Empresa>listaEmpresas= new ArrayList<Empresa>();
    ArrayList<Empleado>listaEmpleados = new ArrayList<Empleado>();
    
    /**
     * Creates new form Menu
     */
    public IngresoDatos() {
        initComponents();
        this.setSize(1064, 640);
        this.setLocationRelativeTo(null);// formulario centrado
        this.setResizable(false);
        this.setTitle("INGRESO DATOS");
        jdEscritorio = new JDesktopPane();
        this.setContentPane(jdEscritorio);
        jdEscritorio.add(this.jpIngresoEmpresa);
        jdEscritorio.add(this.jpIngresoEmpleado);
        
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jpEscriorio = new javax.swing.JPanel();
        jdEscritorio = new javax.swing.JDesktopPane();
        jpIngresoEmpresa = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfRazonSocial = new javax.swing.JTextField();
        jtfCuit = new javax.swing.JTextField();
        jbCrearEmpresa = new javax.swing.JButton();
        jbMostrarEmpresas = new javax.swing.JButton();
        jpIngresoEmpleado = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtfDni = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jcbCategorias = new javax.swing.JComboBox<>();
        jtfSueldo = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jcbEmpresa = new javax.swing.JComboBox<>();
        jbMostrarEmpleados = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiConsulEmpresa = new javax.swing.JRadioButtonMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiConsulEmpleado = new javax.swing.JRadioButtonMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmiExit = new javax.swing.JRadioButtonMenuItem();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpEscriorio.setPreferredSize(new java.awt.Dimension(1000, 600));

        jpIngresoEmpresa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Algerian", 2, 24)); // NOI18N
        jLabel1.setText("INGRESO DATOS DE EMPRESAS");

        jLabel2.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        jLabel2.setText("Razon Social:");

        jLabel3.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        jLabel3.setText("Cuit:");

        jtfRazonSocial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jtfCuit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jbCrearEmpresa.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        jbCrearEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aulico02/imagenes/nuevo-producto.png"))); // NOI18N
        jbCrearEmpresa.setText("CREAR");
        jbCrearEmpresa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jbCrearEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearEmpresaActionPerformed(evt);
            }
        });

        jbMostrarEmpresas.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        jbMostrarEmpresas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aulico02/imagenes/icons8-carpeta-de-documentos-25.png"))); // NOI18N
        jbMostrarEmpresas.setText("MOSTRAR EMPRESA");
        jbMostrarEmpresas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jbMostrarEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarEmpresasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpIngresoEmpresaLayout = new javax.swing.GroupLayout(jpIngresoEmpresa);
        jpIngresoEmpresa.setLayout(jpIngresoEmpresaLayout);
        jpIngresoEmpresaLayout.setHorizontalGroup(
            jpIngresoEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIngresoEmpresaLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1)
                .addContainerGap(173, Short.MAX_VALUE))
            .addGroup(jpIngresoEmpresaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpIngresoEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCrearEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpIngresoEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpIngresoEmpresaLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbMostrarEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
        );
        jpIngresoEmpresaLayout.setVerticalGroup(
            jpIngresoEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIngresoEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jpIngresoEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jtfRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jpIngresoEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbMostrarEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCrearEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jpIngresoEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Algerian", 2, 24)); // NOI18N
        jLabel4.setText("INGRESO DATOS EMPLEADOS");

        jLabel5.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        jLabel5.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        jLabel6.setText("Apellido:");

        jLabel7.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        jLabel7.setText("Documento:");

        jLabel8.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        jLabel8.setText("Puestos Disponibles: ");

        jLabel9.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        jLabel9.setText("Sueldo:");

        jLabel10.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        jLabel10.setText("Empresas:");

        jcbCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new Categorias[] { Categorias.JEFE,Categorias.GERENTE,Categorias.ADMINISTRATIVO }));

        jbGuardar.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aulico02/imagenes/icons8-guardar-16.png"))); // NOI18N
        jbGuardar.setText("GUARDAR");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aulico02/imagenes/icons8-cerrar-ventana-20.png"))); // NOI18N
        jbSalir.setText("SALIR");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jcbEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new Empresa[] {  }));

        jbMostrarEmpleados.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        jbMostrarEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aulico02/imagenes/cliente.png"))); // NOI18N
        jbMostrarEmpleados.setText("MOSTRAR EMPLEADOS");
        jbMostrarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarEmpleadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpIngresoEmpleadoLayout = new javax.swing.GroupLayout(jpIngresoEmpleado);
        jpIngresoEmpleado.setLayout(jpIngresoEmpleadoLayout);
        jpIngresoEmpleadoLayout.setHorizontalGroup(
            jpIngresoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIngresoEmpleadoLayout.createSequentialGroup()
                .addGroup(jpIngresoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpIngresoEmpleadoLayout.createSequentialGroup()
                        .addGroup(jpIngresoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpIngresoEmpleadoLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jpIngresoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jpIngresoEmpleadoLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtfDni))
                                    .addGroup(jpIngresoEmpleadoLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(35, 35, 35)
                                        .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpIngresoEmpleadoLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(36, 36, 36)
                                        .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(51, 51, 51)
                                .addGroup(jpIngresoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)))
                            .addGroup(jpIngresoEmpleadoLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jbMostrarEmpleados)))
                        .addGroup(jpIngresoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpIngresoEmpleadoLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpIngresoEmpleadoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jpIngresoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jpIngresoEmpleadoLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpIngresoEmpleadoLayout.setVerticalGroup(
            jpIngresoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIngresoEmpleadoLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpIngresoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jcbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(28, 28, 28)
                .addGroup(jpIngresoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jtfSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jpIngresoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jcbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jpIngresoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbMostrarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        jdEscritorio.setLayer(jpIngresoEmpresa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jpIngresoEmpleado, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdEscritorioLayout = new javax.swing.GroupLayout(jdEscritorio);
        jdEscritorio.setLayout(jdEscritorioLayout);
        jdEscritorioLayout.setHorizontalGroup(
            jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdEscritorioLayout.createSequentialGroup()
                .addContainerGap(228, Short.MAX_VALUE)
                .addGroup(jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpIngresoEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpIngresoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(329, 329, 329))
        );
        jdEscritorioLayout.setVerticalGroup(
            jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpIngresoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpIngresoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpEscriorioLayout = new javax.swing.GroupLayout(jpEscriorio);
        jpEscriorio.setLayout(jpEscriorioLayout);
        jpEscriorioLayout.setHorizontalGroup(
            jpEscriorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEscriorioLayout.createSequentialGroup()
                .addComponent(jdEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpEscriorioLayout.setVerticalGroup(
            jpEscriorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEscriorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jpEscriorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 600));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aulico02/imagenes/categorias.png"))); // NOI18N
        jMenu1.setText("EMPRESAS");
        jMenu1.setPreferredSize(new java.awt.Dimension(150, 50));

        jmiConsulEmpresa.setSelected(true);
        jmiConsulEmpresa.setText("CONSULTAS");
        jmiConsulEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsulEmpresaActionPerformed(evt);
            }
        });
        jMenu1.add(jmiConsulEmpresa);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aulico02/imagenes/nuevo-cliente.png"))); // NOI18N
        jMenu2.setText("EMPLEADOS");
        jMenu2.setPreferredSize(new java.awt.Dimension(150, 50));

        jmiConsulEmpleado.setSelected(true);
        jmiConsulEmpleado.setText("CONSULTAS");
        jmiConsulEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsulEmpleadoActionPerformed(evt);
            }
        });
        jMenu2.add(jmiConsulEmpleado);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aulico02/imagenes/cerrar-sesion.png"))); // NOI18N
        jMenu3.setText("EXIT");
        jMenu3.setPreferredSize(new java.awt.Dimension(150, 50));

        jmiExit.setSelected(true);
        jmiExit.setText("EXIT");
        jmiExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExitActionPerformed(evt);
            }
        });
        jMenu3.add(jmiExit);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiConsulEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsulEmpleadoActionPerformed
   
        MostrarEmpleados nuevo = new MostrarEmpleados(listaEmpleados);
        nuevo.setVisible(true);
        jdEscritorio.add(nuevo);
        jdEscritorio.moveToFront(nuevo);
       
    }//GEN-LAST:event_jmiConsulEmpleadoActionPerformed

    private void jmiExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExitActionPerformed
        // salgo a la pagina ppal
        JOptionPane.showMessageDialog(this, "SU CARGA HA SIDO EXITOSA");
        Principal salida = new Principal();
        salida.setVisible(true);
    }//GEN-LAST:event_jmiExitActionPerformed

    private void jmiConsulEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsulEmpresaActionPerformed
 
        MostrarEmpresas nuevo = new MostrarEmpresas(listaEmpresas);
        nuevo.setVisible(true);
        jdEscritorio.add(nuevo);
        jdEscritorio.moveToFront(nuevo);
    }//GEN-LAST:event_jmiConsulEmpresaActionPerformed

    private void jbCrearEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearEmpresaActionPerformed
        Empresa e = new Empresa(jtfRazonSocial.getText(), Integer.parseInt(jtfCuit.getText()));
       
        if (!listaEmpresas.contains(e)) {
            jcbEmpresa.addItem(e);
            listaEmpresas.add(e);
            jbGuardar.setEnabled(true);
            jbSalir.setEnabled(true);
            // Notifica al usuario que el empleado se ha guardado correctamente
            JOptionPane.showMessageDialog(this, "Empresa guardado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(this, "Esta empresa ya existe");
        }
        jtfRazonSocial.setText("");
        jtfCuit.setText("");
    }//GEN-LAST:event_jbCrearEmpresaActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        // Captura los datos ingresados en la interfaz
        String nombre = jtfNombre.getText();
        String apellido = jtfApellido.getText();

        // Asegúrate de manejar errores de conversión de tipos
        try {
            int dni = Integer.parseInt(jtfDni.getText());
            double sueldo = Double.parseDouble(jtfSueldo.getText());
            Categorias categoria = (Categorias) jcbCategorias.getSelectedItem();
            Empresa empresa = (Empresa) jcbEmpresa.getSelectedItem();

            // Crea un nuevo objeto Empleado
            Empleado empleado = new Empleado(nombre, apellido, dni, sueldo, categoria, empresa);

            // Agrega el empleado a la lista de empleados
            listaEmpleados.add(empleado);

            // Limpia los campos después de guardar el empleado
            jtfNombre.setText("");
            jtfApellido.setText("");
            jtfDni.setText("");
            jtfSueldo.setText("");

            // Notifica al usuario que el empleado se ha guardado correctamente
            JOptionPane.showMessageDialog(this, "Empleado guardado exitosamente.");
        } catch (NumberFormatException e) {
            // Maneja excepciones si los valores ingresados no son números válidos
            JOptionPane.showMessageDialog(this, "Error: Ingrese valores numéricos válidos en campos numéricos.");
        } catch (Exception e) {
            // Maneja otras excepciones que puedan ocurrir
            JOptionPane.showMessageDialog(this, "Error al guardar el empleado.");
        }

        // Limpiar los campos después de agregar el empleado
        jtfNombre.setText("");
        jtfApellido.setText("");
        jtfDni.setText("");
        jtfSueldo.setText("");
    }//GEN-LAST:event_jbGuardarActionPerformed


    private void jbMostrarEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarEmpresasActionPerformed
        MostrarEmpresas mostrarEmpresasInternalFrame = new MostrarEmpresas(listaEmpresas);//instancio mi jIframe, que s emuestre
        jdEscritorio.add(mostrarEmpresasInternalFrame);
        mostrarEmpresasInternalFrame.setVisible(true);
    }//GEN-LAST:event_jbMostrarEmpresasActionPerformed

    private void jbMostrarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarEmpleadosActionPerformed

        if (listaEmpleados.isEmpty()) {
            JOptionPane.showMessageDialog(this, "La lista de empleados está vacía.");
        } else {
            MostrarEmpleados mostrarEmpleadosInternalFrame = new MostrarEmpleados(listaEmpleados);
            jdEscritorio.add(mostrarEmpleadosInternalFrame);
            mostrarEmpleadosInternalFrame.setVisible(true);
        }  
    }//GEN-LAST:event_jbMostrarEmpleadosActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        JOptionPane.showMessageDialog(this," SU CARGA HA SIDO EXITOSA");
        System.exit(WIDTH);// salgo del sistema, imprimo cartel
    }//GEN-LAST:event_jbSalirActionPerformed

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
            java.util.logging.Logger.getLogger(IngresoDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JButton jbCrearEmpresa;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbMostrarEmpleados;
    private javax.swing.JButton jbMostrarEmpresas;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Categorias> jcbCategorias;
    private javax.swing.JComboBox<Empresa> jcbEmpresa;
    private javax.swing.JDesktopPane jdEscritorio;
    private javax.swing.JRadioButtonMenuItem jmiConsulEmpleado;
    private javax.swing.JRadioButtonMenuItem jmiConsulEmpresa;
    private javax.swing.JRadioButtonMenuItem jmiExit;
    private javax.swing.JPanel jpEscriorio;
    private javax.swing.JPanel jpIngresoEmpleado;
    private javax.swing.JPanel jpIngresoEmpresa;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfCuit;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfRazonSocial;
    private javax.swing.JTextField jtfSueldo;
    // End of variables declaration//GEN-END:variables
}
