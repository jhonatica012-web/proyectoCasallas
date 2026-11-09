
package Vista;

import Logica.*;

import javax.swing.JOptionPane;


public class FrmRegistro extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmRegistro.class.getName());

    private PanelAdmin login;
    
    public FrmRegistro(PanelAdmin login) {
        this.login = login;
    
        initComponents();
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pswClave = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        pswConfirmar = new javax.swing.JPasswordField();
        btnRegistrarse = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("CREAR CUENTA");

        jLabel3.setText("Nombre:");

        jLabel7.setText("Usuario:");

        jLabel8.setText("Contraseña:");

        pswClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pswClaveKeyTyped(evt);
            }
        });

        jLabel9.setText("Confirmar Contraseña:");

        pswConfirmar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pswConfirmarKeyTyped(evt);
            }
        });

        btnRegistrarse.setBackground(new java.awt.Color(51, 102, 255));
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("REGISTRARSE");
        btnRegistrarse.addActionListener(this::btnRegistrarseActionPerformed);

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pswConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pswClave, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(pswClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pswConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(btnRegistrarse)
                .addGap(8, 8, 8)
                .addComponent(btnCancelar)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pswClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswClaveKeyTyped

        if (pswClave.getPassword().length > 10) {
            evt.consume();
        }
    }//GEN-LAST:event_pswClaveKeyTyped

    private void pswConfirmarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswConfirmarKeyTyped

        if (pswConfirmar.getPassword().length > 10) {
            evt.consume();
        }
    }//GEN-LAST:event_pswConfirmarKeyTyped

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed

        boolean validacion = validar();
        Cuenta datos = capturaDatos();

        if (validacion == true) {
            if (datos != null) {
                login.getHuesped().registrar(datos);

                login.setVisible(true);
                this.setVisible(false);
                JOptionPane.showMessageDialog(this, "Registrado con exito");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(this, "Las contraseñas no son iguales");
            }
        }

    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed
    
    
    
    
    public void limpiar() {

        
        txtNombre.setText("");
        txtUsuario.setText("");
        pswClave.setText("");
        pswConfirmar.setText("");

    }
    
    
    
    
    public Cuenta capturaDatos() {
        String nombre, usuario, clave, confirmacion;

        
        nombre = txtNombre.getText();    
        usuario = txtUsuario.getText();
        clave = new String(pswClave.getPassword());
        confirmacion = new String(pswConfirmar.getPassword());

        if (clave.equals(confirmacion)) {

            return new Cuenta(nombre, usuario, clave, confirmacion);
        } else {

            return null;
        }

    }
    
    public boolean validar() {

        if (txtNombre.getText().equals("") || txtNombre.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Completar campo Nombre", "Alerta", JOptionPane.WARNING_MESSAGE);
            txtNombre.requestFocus();
            return false;
        } else if (txtUsuario.getText().equals("") || txtUsuario.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Completar campo Usuario", "Alerta", JOptionPane.WARNING_MESSAGE);
            txtUsuario.requestFocus();
            return false;

        } else if (pswClave.getPassword().length == 0) {
            JOptionPane.showMessageDialog(this, "Completar campo Contraseña", "Alerta", JOptionPane.WARNING_MESSAGE);
            pswClave.requestFocus();
            return false;

        } else if (pswConfirmar.getPassword().length == 0) {
            JOptionPane.showMessageDialog(this, "Completar campo Confirmar Contraseña", "Alerta", JOptionPane.WARNING_MESSAGE);
            pswConfirmar.requestFocus();
            return false;

        } else if (pswConfirmar.getPassword().length < 8 || pswConfirmar.getPassword().length > 10) {
            JOptionPane.showMessageDialog(this, "La contraseña debe tener un entre 8 a 10 caracteres", "Alerta", JOptionPane.WARNING_MESSAGE);
            pswConfirmar.requestFocus();
            return false;

        } else if (pswClave.getPassword().length < 8 || pswClave.getPassword().length > 10) {
            JOptionPane.showMessageDialog(this, "La contraseña debe tener un entre 8 a 10 caracteres", "Alerta", JOptionPane.WARNING_MESSAGE);
            pswClave.requestFocus();
            return false;

        }
        {   JOptionPane.showMessageDialog(this, "Validado con exito", "Validacion", JOptionPane.PLAIN_MESSAGE);
            return true;

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pswClave;
    private javax.swing.JPasswordField pswConfirmar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
