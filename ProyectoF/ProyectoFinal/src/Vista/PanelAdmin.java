package Vista;

import javax.swing.JOptionPane;
import Logica.*;

public class PanelAdmin extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PanelAdmin.class.getName());
    
    private FrmRegistro home;
    private Sistema huesped;
    
    
    public PanelAdmin() {
        
        this.home = home;
        this.huesped = huesped;
        initComponents();
        setLocationRelativeTo(null);
    }
    
    
    public Sistema getHuesped() {
        return huesped;
    }

    public void setObjSistema(Sistema Huesped) {
        this.huesped = Huesped;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pswClave = new javax.swing.JPasswordField();
        btnIniciarSesion = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("LOGIN");

        jLabel2.setText("Usuario:");

        jLabel3.setText("Contraseña:");

        btnIniciarSesion.setBackground(new java.awt.Color(51, 102, 255));
        btnIniciarSesion.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("INICIAR SESION");
        btnIniciarSesion.addActionListener(this::btnIniciarSesionActionPerformed);

        btnRegistrarse.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(51, 153, 255));
        btnRegistrarse.setText("REGISTRAR ADMIN");
        btnRegistrarse.addActionListener(this::btnRegistrarseActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario)
                            .addComponent(pswClave, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(btnRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pswClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed

        String usuario, clave;

        usuario = txtUsuario.getText();
        clave = new String(pswClave.getPassword());

        Cuenta cliente = huesped.inicioSesion(usuario, clave);

        if(cliente != null){

            home.setCliente(cliente);
            home.inicio();
            home.setVisible(true);
            this.setVisible(false);

        }else{JOptionPane.showMessageDialog(this, "Los datos son INCORRECTOS", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed

        if(txtUsuario.getText().equals("") && pswClave.getPassword().equals("")){

            JOptionPane.showMessageDialog(this, "CUENTA NO EXISTE","Error - Incio Sesion", JOptionPane.ERROR_MESSAGE);
        }else{
            FrmRegistro.setVisible(true);
            this.setVisible(false);

        }
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new PanelAdmin().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField pswClave;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    
}
