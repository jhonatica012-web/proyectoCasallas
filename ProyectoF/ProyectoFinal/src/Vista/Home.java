package Vista;

import Logica.*;


public class Home extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Home.class.getName());
    
    
    private PanelAdmin menuPrincipal;
    private FrmRegistro frmRegistro;    
    private Sistema huesped;
    
    public Home() {
        menuPrincipal = new PanelAdmin(this);
        frmRegistro = new FrmRegistro(this);
        huesped  = new Sistema();
        initComponents();
        setLocationRelativeTo(null);
    }

    
    public void setCliente(Cuenta huesped) {
        this.huesped = huesped;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pnlMenu = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnReserva = new javax.swing.JButton();
        btnHabitacion = new javax.swing.JButton();
        btnResumen = new javax.swing.JButton();
        btnHuesped = new javax.swing.JButton();
        pnlContenedor = new javax.swing.JPanel();
        pnlHome = new javax.swing.JPanel();
        pnlEncabezado = new javax.swing.JPanel();
        lblSaludo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pnlIndicadores = new javax.swing.JPanel();
        pnlHabitaciones = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnlHuespedes = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pnlReservas = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pnlIngresos = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        pnlBotones = new javax.swing.JPanel();
        btnHabitaciones = new javax.swing.JButton();
        btnHuespedes = new javax.swing.JButton();
        btnReservas = new javax.swing.JButton();
        btnPagos = new javax.swing.JButton();
        pnlHuesped = new javax.swing.JPanel();
        pnlEncabezadoH = new javax.swing.JPanel();
        lblDocumento = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblTelefonoH = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        pnlBotonesH = new javax.swing.JPanel();
        btnRegistrarH = new javax.swing.JButton();
        btnModificarH = new javax.swing.JButton();
        btnBuscarH = new javax.swing.JButton();
        btnLimpiarH = new javax.swing.JButton();
        btnEliminarH = new javax.swing.JButton();
        pnlTablaH = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHuespedes = new javax.swing.JTable();
        pnlReserva = new javax.swing.JPanel();
        pnlEncabezadoR = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtCodigoR = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cmbHabitacion = new javax.swing.JComboBox<>();
        spnPersonas = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        spnFechaEntrada = new javax.swing.JSpinner();
        spnFechaSalida = new javax.swing.JSpinner();
        jLabel22 = new javax.swing.JLabel();
        cmbEstadoR = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        btnBusqueda = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblReservas = new javax.swing.JTable();
        pnlTablaR = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblReservas1 = new javax.swing.JTable();
        pnlBotonesR = new javax.swing.JPanel();
        btnRegistrarR = new javax.swing.JButton();
        btnModificarR = new javax.swing.JButton();
        btnBuscarR = new javax.swing.JButton();
        btnLimpiarR = new javax.swing.JButton();
        btnEliminarR = new javax.swing.JButton();
        pnlPagos = new javax.swing.JPanel();
        pnlTablaP = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblPagos = new javax.swing.JTable();
        pnlBotonesP = new javax.swing.JPanel();
        btnRegistrarP = new javax.swing.JButton();
        btnModificarP = new javax.swing.JButton();
        btnBuscarP = new javax.swing.JButton();
        btnLimpiarP = new javax.swing.JButton();
        btnEliminarP = new javax.swing.JButton();
        pnlEncabezadoP = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtCodigoPago = new javax.swing.JTextField();
        txtCodigoReserva = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtNombreHuesped = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        cmbMetodoPago = new javax.swing.JComboBox<>();
        cmbEstadoP = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        spnFechaPago = new javax.swing.JSpinner();
        pnlHabitacion = new javax.swing.JPanel();
        pnlEncabezadoHa = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        cmbTipo = new javax.swing.JComboBox<>();
        spnCapacidad = new javax.swing.JSpinner();
        txtPnoche = new javax.swing.JTextField();
        cmbEstado = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JTextField();
        pnlTablaHa = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHabitaciones = new javax.swing.JTable();
        pnlBotonesHa = new javax.swing.JPanel();
        btnRegistrarHa = new javax.swing.JButton();
        btnModificarHa = new javax.swing.JButton();
        btnBuscarHa = new javax.swing.JButton();
        btnLimpiarHa = new javax.swing.JButton();
        btnEliminarHa = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMenu.setBackground(new java.awt.Color(23, 43, 70));

        btnLogout.setBackground(new java.awt.Color(41, 67, 99));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icons8-salida-20.png"))); // NOI18N
        btnLogout.setText("Cerrar Sesion");
        btnLogout.setBorder(null);
        btnLogout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLogout.addActionListener(this::btnLogoutActionPerformed);

        btnInicio.setBackground(new java.awt.Color(41, 67, 99));
        btnInicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icons8-casa-30.png"))); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setBorder(null);
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInicio.setMinimumSize(new java.awt.Dimension(100, 34));
        btnInicio.addActionListener(this::btnInicioActionPerformed);

        btnReserva.setBackground(new java.awt.Color(41, 67, 99));
        btnReserva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReserva.setForeground(new java.awt.Color(255, 255, 255));
        btnReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icons8-calendario-30.png"))); // NOI18N
        btnReserva.setText("Reserva");
        btnReserva.setBorder(null);
        btnReserva.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReserva.addActionListener(this::btnReservaActionPerformed);

        btnHabitacion.setBackground(new java.awt.Color(41, 67, 99));
        btnHabitacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        btnHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icons8-cama-30.png"))); // NOI18N
        btnHabitacion.setText("Habitacion");
        btnHabitacion.setBorder(null);
        btnHabitacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHabitacion.addActionListener(this::btnHabitacionActionPerformed);

        btnResumen.setBackground(new java.awt.Color(41, 67, 99));
        btnResumen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnResumen.setForeground(new java.awt.Color(255, 255, 255));
        btnResumen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icons8-editar-30.png"))); // NOI18N
        btnResumen.setText("Resumen");
        btnResumen.setBorder(null);
        btnResumen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnResumen.addActionListener(this::btnResumenActionPerformed);

        btnHuesped.setBackground(new java.awt.Color(41, 67, 99));
        btnHuesped.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHuesped.setForeground(new java.awt.Color(255, 255, 255));
        btnHuesped.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icons8-huésped-30.png"))); // NOI18N
        btnHuesped.setText("Huesped");
        btnHuesped.setBorder(null);
        btnHuesped.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHuesped.addActionListener(this::btnHuespedActionPerformed);

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(btnResumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHuesped, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnResumen, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pnlContenedor.setBackground(new java.awt.Color(243, 245, 247));
        pnlContenedor.setForeground(new java.awt.Color(23, 43, 70));
        pnlContenedor.setLayout(new java.awt.CardLayout());

        pnlHome.setBackground(new java.awt.Color(243, 245, 247));

        pnlEncabezado.setBackground(new java.awt.Color(255, 255, 255));
        pnlEncabezado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 6, true));

        lblSaludo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSaludo.setForeground(new java.awt.Color(23, 43, 70));
        lblSaludo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icons8-usuario-30.png"))); // NOI18N
        lblSaludo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(85, 85, 85));
        jLabel7.setText("Administra fácilmente las habitaciones, huéspedes, reservas y pagos de tu hotel.");

        javax.swing.GroupLayout pnlEncabezadoLayout = new javax.swing.GroupLayout(pnlEncabezado);
        pnlEncabezado.setLayout(pnlEncabezadoLayout);
        pnlEncabezadoLayout.setHorizontalGroup(
            pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlEncabezadoLayout.createSequentialGroup()
                .addComponent(lblSaludo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlEncabezadoLayout.setVerticalGroup(
            pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEncabezadoLayout.createSequentialGroup()
                .addComponent(lblSaludo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlIndicadores.setBackground(new java.awt.Color(255, 255, 255));

        pnlHabitaciones.setBackground(new java.awt.Color(255, 255, 255));
        pnlHabitaciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HABITACIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 12), new java.awt.Color(23, 43, 70))); // NOI18N

        jLabel8.setBackground(new java.awt.Color(197, 164, 109));
        jLabel8.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel8.setText("---");

        jLabel9.setBackground(new java.awt.Color(85, 85, 85));
        jLabel9.setText("Total De Habitaciones");

        javax.swing.GroupLayout pnlHabitacionesLayout = new javax.swing.GroupLayout(pnlHabitaciones);
        pnlHabitaciones.setLayout(pnlHabitacionesLayout);
        pnlHabitacionesLayout.setHorizontalGroup(
            pnlHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHabitacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        pnlHabitacionesLayout.setVerticalGroup(
            pnlHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHabitacionesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlHuespedes.setBackground(new java.awt.Color(255, 255, 255));
        pnlHuespedes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HUESPEDES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 12), new java.awt.Color(23, 43, 70))); // NOI18N

        jLabel11.setBackground(new java.awt.Color(85, 85, 85));
        jLabel11.setText("Huespedes Registrados");

        jLabel10.setBackground(new java.awt.Color(197, 164, 109));
        jLabel10.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel10.setText("---");

        javax.swing.GroupLayout pnlHuespedesLayout = new javax.swing.GroupLayout(pnlHuespedes);
        pnlHuespedes.setLayout(pnlHuespedesLayout);
        pnlHuespedesLayout.setHorizontalGroup(
            pnlHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHuespedesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        pnlHuespedesLayout.setVerticalGroup(
            pnlHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHuespedesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        pnlReservas.setBackground(new java.awt.Color(255, 255, 255));
        pnlReservas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RESERVAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 12), new java.awt.Color(23, 43, 70))); // NOI18N

        jLabel15.setBackground(new java.awt.Color(85, 85, 85));
        jLabel15.setText("Reservas Registradas");

        jLabel14.setBackground(new java.awt.Color(197, 164, 109));
        jLabel14.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel14.setText("---");

        javax.swing.GroupLayout pnlReservasLayout = new javax.swing.GroupLayout(pnlReservas);
        pnlReservas.setLayout(pnlReservasLayout);
        pnlReservasLayout.setHorizontalGroup(
            pnlReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReservasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlReservasLayout.setVerticalGroup(
            pnlReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReservasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addContainerGap())
        );

        pnlIngresos.setBackground(new java.awt.Color(255, 255, 255));
        pnlIngresos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INGRESOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 12), new java.awt.Color(23, 43, 70))); // NOI18N

        jLabel12.setBackground(new java.awt.Color(197, 164, 109));
        jLabel12.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel12.setText("$--");

        jLabel13.setBackground(new java.awt.Color(85, 85, 85));
        jLabel13.setText("Ingresos Del Hotel");

        javax.swing.GroupLayout pnlIngresosLayout = new javax.swing.GroupLayout(pnlIngresos);
        pnlIngresos.setLayout(pnlIngresosLayout);
        pnlIngresosLayout.setHorizontalGroup(
            pnlIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIngresosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlIngresosLayout.setVerticalGroup(
            pnlIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIngresosLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlIndicadoresLayout = new javax.swing.GroupLayout(pnlIndicadores);
        pnlIndicadores.setLayout(pnlIndicadoresLayout);
        pnlIndicadoresLayout.setHorizontalGroup(
            pnlIndicadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIndicadoresLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlIndicadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlReservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlIndicadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlHuespedes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlIngresos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        pnlIndicadoresLayout.setVerticalGroup(
            pnlIndicadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIndicadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlIndicadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlHuespedes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlIndicadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlIngresos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlReservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlBotones.setBackground(new java.awt.Color(255, 255, 255));

        btnHabitaciones.setBackground(new java.awt.Color(23, 43, 70));
        btnHabitaciones.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHabitaciones.setForeground(new java.awt.Color(255, 255, 255));
        btnHabitaciones.setText("Habitaciones");
        btnHabitaciones.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnHabitaciones.setFocusable(false);
        btnHabitaciones.addActionListener(this::btnHabitacionesActionPerformed);

        btnHuespedes.setBackground(new java.awt.Color(23, 43, 70));
        btnHuespedes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHuespedes.setForeground(new java.awt.Color(255, 255, 255));
        btnHuespedes.setText("Huespedes");
        btnHuespedes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnHuespedes.setFocusable(false);

        btnReservas.setBackground(new java.awt.Color(23, 43, 70));
        btnReservas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReservas.setForeground(new java.awt.Color(255, 255, 255));
        btnReservas.setText("Reservas");
        btnReservas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnReservas.setFocusable(false);

        btnPagos.setBackground(new java.awt.Color(23, 43, 70));
        btnPagos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPagos.setForeground(new java.awt.Color(255, 255, 255));
        btnPagos.setText("Pagos");
        btnPagos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnPagos.setFocusable(false);

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonesLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHuespedes, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHabitaciones)
                    .addComponent(btnHuespedes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReservas)
                    .addComponent(btnPagos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlIndicadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlIndicadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlContenedor.add(pnlHome, "card2");

        pnlHuesped.setBackground(new java.awt.Color(243, 245, 247));
        pnlHuesped.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GESTION DE HUESPEDES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 16), new java.awt.Color(23, 43, 70))); // NOI18N
        pnlHuesped.setForeground(new java.awt.Color(23, 43, 70));

        pnlEncabezadoH.setBackground(new java.awt.Color(255, 255, 255));

        lblDocumento.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblDocumento.setForeground(new java.awt.Color(23, 43, 70));
        lblDocumento.setText("Documento");
        lblDocumento.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombre.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(23, 43, 70));
        lblNombre.setText("Nombre");
        lblNombre.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblTelefonoH.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblTelefonoH.setForeground(new java.awt.Color(23, 43, 70));
        lblTelefonoH.setText("Telefono");
        lblTelefonoH.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblCorreo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(23, 43, 70));
        lblCorreo.setText("Correo");
        lblCorreo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txtDocumento.setForeground(new java.awt.Color(51, 51, 51));
        txtDocumento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(213, 220, 229), 2, true));

        txtNombre.setForeground(new java.awt.Color(51, 51, 51));
        txtNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(213, 220, 229), 2, true));

        txtTelefono.setForeground(new java.awt.Color(51, 51, 51));
        txtTelefono.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(213, 220, 229), 2, true));

        txtCorreo.setForeground(new java.awt.Color(51, 51, 51));
        txtCorreo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(213, 220, 229), 2, true));

        javax.swing.GroupLayout pnlEncabezadoHLayout = new javax.swing.GroupLayout(pnlEncabezadoH);
        pnlEncabezadoH.setLayout(pnlEncabezadoHLayout);
        pnlEncabezadoHLayout.setHorizontalGroup(
            pnlEncabezadoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEncabezadoHLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlEncabezadoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEncabezadoHLayout.createSequentialGroup()
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEncabezadoHLayout.createSequentialGroup()
                        .addGroup(pnlEncabezadoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlEncabezadoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlEncabezadoHLayout.createSequentialGroup()
                        .addComponent(lblTelefonoH, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addGap(61, 61, 61))
        );
        pnlEncabezadoHLayout.setVerticalGroup(
            pnlEncabezadoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEncabezadoHLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(pnlEncabezadoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(lblDocumento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEncabezadoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEncabezadoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(lblTelefonoH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEncabezadoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pnlBotonesH.setBackground(new java.awt.Color(255, 255, 255));

        btnRegistrarH.setBackground(new java.awt.Color(23, 43, 70));
        btnRegistrarH.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btnRegistrarH.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarH.setText("Registrar");
        btnRegistrarH.setFocusable(false);
        btnRegistrarH.addActionListener(this::btnRegistrarHActionPerformed);

        btnModificarH.setBackground(new java.awt.Color(23, 43, 70));
        btnModificarH.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btnModificarH.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarH.setText("Modificar");
        btnModificarH.setFocusable(false);

        btnBuscarH.setBackground(new java.awt.Color(23, 43, 70));
        btnBuscarH.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btnBuscarH.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarH.setText("Buscar");
        btnBuscarH.setFocusable(false);

        btnLimpiarH.setBackground(new java.awt.Color(23, 43, 70));
        btnLimpiarH.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btnLimpiarH.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarH.setText("Limpiar");
        btnLimpiarH.setFocusable(false);

        btnEliminarH.setBackground(new java.awt.Color(23, 43, 70));
        btnEliminarH.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btnEliminarH.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarH.setText("Eliminar");
        btnEliminarH.setFocusable(false);

        javax.swing.GroupLayout pnlBotonesHLayout = new javax.swing.GroupLayout(pnlBotonesH);
        pnlBotonesH.setLayout(pnlBotonesHLayout);
        pnlBotonesHLayout.setHorizontalGroup(
            pnlBotonesHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesHLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrarH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificarH)
                .addGap(10, 10, 10)
                .addComponent(btnBuscarH)
                .addGap(12, 12, 12)
                .addComponent(btnEliminarH)
                .addGap(14, 14, 14)
                .addComponent(btnLimpiarH))
        );
        pnlBotonesHLayout.setVerticalGroup(
            pnlBotonesHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonesHLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBotonesHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarH)
                    .addComponent(btnModificarH)
                    .addComponent(btnRegistrarH)
                    .addComponent(btnLimpiarH)
                    .addComponent(btnEliminarH))
                .addGap(22, 22, 22))
        );

        pnlTablaH.setBackground(new java.awt.Color(255, 255, 255));

        tblHuespedes.setBackground(new java.awt.Color(23, 43, 70));
        tblHuespedes.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        tblHuespedes.setForeground(new java.awt.Color(255, 255, 255));
        tblHuespedes.setModel(new javax.swing.table.DefaultTableModel(
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
        tblHuespedes.setFocusable(false);
        tblHuespedes.setGridColor(new java.awt.Color(213, 220, 229));
        jScrollPane3.setViewportView(tblHuespedes);

        javax.swing.GroupLayout pnlTablaHLayout = new javax.swing.GroupLayout(pnlTablaH);
        pnlTablaH.setLayout(pnlTablaHLayout);
        pnlTablaHLayout.setHorizontalGroup(
            pnlTablaHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        pnlTablaHLayout.setVerticalGroup(
            pnlTablaHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlHuespedLayout = new javax.swing.GroupLayout(pnlHuesped);
        pnlHuesped.setLayout(pnlHuespedLayout);
        pnlHuespedLayout.setHorizontalGroup(
            pnlHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHuespedLayout.createSequentialGroup()
                .addGroup(pnlHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlTablaH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBotonesH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHuespedLayout.createSequentialGroup()
                .addComponent(pnlEncabezadoH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlHuespedLayout.setVerticalGroup(
            pnlHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHuespedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlEncabezadoH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTablaH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBotonesH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlContenedor.add(pnlHuesped, "card3");

        pnlReserva.setBackground(new java.awt.Color(243, 245, 247));
        pnlReserva.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GESTION DE RESERVAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 16), new java.awt.Color(23, 43, 70))); // NOI18N

        pnlEncabezadoR.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setText("Codigo");

        jLabel18.setText("Habitacion");

        jLabel19.setText("Personas");

        cmbHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR HABITACION", " " }));

        jLabel20.setText("Fecha Entrada");

        jLabel21.setText("Fecha Salida");

        spnFechaEntrada.setModel(new javax.swing.SpinnerDateModel());
        spnFechaEntrada.setEditor(new javax.swing.JSpinner.DateEditor(spnFechaEntrada, ""));

        spnFechaSalida.setModel(new javax.swing.SpinnerDateModel());
        spnFechaSalida.setEditor(new javax.swing.JSpinner.DateEditor(spnFechaSalida, ""));

        jLabel22.setText("Estado De Reserva");

        cmbEstadoR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PENDIENTE", "CONFIRMADA", "FINALIZADA", "CANCELADA", " " }));

        btnBusqueda.setText("Buscar");

        tblReservas.setBackground(new java.awt.Color(23, 43, 70));
        tblReservas.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        tblReservas.setForeground(new java.awt.Color(255, 255, 255));
        tblReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblReservas.setFocusable(false);
        tblReservas.setGridColor(new java.awt.Color(213, 220, 229));
        jScrollPane4.setViewportView(tblReservas);

        javax.swing.GroupLayout pnlEncabezadoRLayout = new javax.swing.GroupLayout(pnlEncabezadoR);
        pnlEncabezadoR.setLayout(pnlEncabezadoRLayout);
        pnlEncabezadoRLayout.setHorizontalGroup(
            pnlEncabezadoRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEncabezadoRLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlEncabezadoRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEncabezadoRLayout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEncabezadoRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cmbEstadoR, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spnFechaEntrada, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlEncabezadoRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(cmbHabitacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18)
                            .addComponent(txtCodigoR, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45)
                .addGroup(pnlEncabezadoRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21)
                    .addComponent(spnFechaSalida)
                    .addComponent(spnPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addGroup(pnlEncabezadoRLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );
        pnlEncabezadoRLayout.setVerticalGroup(
            pnlEncabezadoRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEncabezadoRLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEncabezadoRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusqueda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEncabezadoRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlEncabezadoRLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEncabezadoRLayout.createSequentialGroup()
                        .addComponent(txtCodigoR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbEstadoR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTablaR.setBackground(new java.awt.Color(255, 255, 255));

        tblReservas1.setBackground(new java.awt.Color(23, 43, 70));
        tblReservas1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        tblReservas1.setForeground(new java.awt.Color(255, 255, 255));
        tblReservas1.setModel(new javax.swing.table.DefaultTableModel(
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
        tblReservas1.setFocusable(false);
        tblReservas1.setGridColor(new java.awt.Color(213, 220, 229));
        jScrollPane6.setViewportView(tblReservas1);

        javax.swing.GroupLayout pnlTablaRLayout = new javax.swing.GroupLayout(pnlTablaR);
        pnlTablaR.setLayout(pnlTablaRLayout);
        pnlTablaRLayout.setHorizontalGroup(
            pnlTablaRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaRLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTablaRLayout.setVerticalGroup(
            pnlTablaRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTablaRLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlBotonesR.setBackground(new java.awt.Color(255, 255, 255));

        btnRegistrarR.setBackground(new java.awt.Color(23, 43, 70));
        btnRegistrarR.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btnRegistrarR.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarR.setText("Registrar");
        btnRegistrarR.addActionListener(this::btnRegistrarRActionPerformed);

        btnModificarR.setBackground(new java.awt.Color(23, 43, 70));
        btnModificarR.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btnModificarR.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarR.setText("Modificar");

        btnBuscarR.setBackground(new java.awt.Color(23, 43, 70));
        btnBuscarR.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btnBuscarR.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarR.setText("Buscar");

        btnLimpiarR.setBackground(new java.awt.Color(23, 43, 70));
        btnLimpiarR.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btnLimpiarR.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarR.setText("Limpiar");

        btnEliminarR.setBackground(new java.awt.Color(23, 43, 70));
        btnEliminarR.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btnEliminarR.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarR.setText("Eliminar");

        javax.swing.GroupLayout pnlBotonesRLayout = new javax.swing.GroupLayout(pnlBotonesR);
        pnlBotonesR.setLayout(pnlBotonesRLayout);
        pnlBotonesRLayout.setHorizontalGroup(
            pnlBotonesRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegistrarR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificarR)
                .addGap(10, 10, 10)
                .addComponent(btnBuscarR)
                .addGap(12, 12, 12)
                .addComponent(btnEliminarR)
                .addGap(14, 14, 14)
                .addComponent(btnLimpiarR)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBotonesRLayout.setVerticalGroup(
            pnlBotonesRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonesRLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBotonesRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarR)
                    .addComponent(btnModificarR)
                    .addComponent(btnRegistrarR)
                    .addComponent(btnLimpiarR)
                    .addComponent(btnEliminarR))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout pnlReservaLayout = new javax.swing.GroupLayout(pnlReserva);
        pnlReserva.setLayout(pnlReservaLayout);
        pnlReservaLayout.setHorizontalGroup(
            pnlReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEncabezadoR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlTablaR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlBotonesR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlReservaLayout.setVerticalGroup(
            pnlReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReservaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlEncabezadoR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTablaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBotonesR, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlContenedor.add(pnlReserva, "card4");

        pnlPagos.setBackground(new java.awt.Color(243, 245, 247));
        pnlPagos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GESTION DE PAGOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 16), new java.awt.Color(23, 43, 70))); // NOI18N

        tblPagos.setBackground(new java.awt.Color(23, 43, 70));
        tblPagos.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        tblPagos.setForeground(new java.awt.Color(255, 255, 255));
        tblPagos.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPagos.setFocusable(false);
        tblPagos.setGridColor(new java.awt.Color(213, 220, 229));
        jScrollPane5.setViewportView(tblPagos);

        javax.swing.GroupLayout pnlTablaPLayout = new javax.swing.GroupLayout(pnlTablaP);
        pnlTablaP.setLayout(pnlTablaPLayout);
        pnlTablaPLayout.setHorizontalGroup(
            pnlTablaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        pnlTablaPLayout.setVerticalGroup(
            pnlTablaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );

        pnlBotonesP.setBackground(new java.awt.Color(255, 255, 255));

        btnRegistrarP.setBackground(new java.awt.Color(23, 43, 70));
        btnRegistrarP.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btnRegistrarP.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarP.setText("Registrar");
        btnRegistrarP.addActionListener(this::btnRegistrarPActionPerformed);

        btnModificarP.setBackground(new java.awt.Color(23, 43, 70));
        btnModificarP.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btnModificarP.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarP.setText("Modificar");

        btnBuscarP.setBackground(new java.awt.Color(23, 43, 70));
        btnBuscarP.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btnBuscarP.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarP.setText("Buscar");

        btnLimpiarP.setBackground(new java.awt.Color(23, 43, 70));
        btnLimpiarP.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btnLimpiarP.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarP.setText("Limpiar");

        btnEliminarP.setBackground(new java.awt.Color(23, 43, 70));
        btnEliminarP.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btnEliminarP.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarP.setText("Eliminar");

        javax.swing.GroupLayout pnlBotonesPLayout = new javax.swing.GroupLayout(pnlBotonesP);
        pnlBotonesP.setLayout(pnlBotonesPLayout);
        pnlBotonesPLayout.setHorizontalGroup(
            pnlBotonesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesPLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnRegistrarP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificarP)
                .addGap(10, 10, 10)
                .addComponent(btnBuscarP)
                .addGap(12, 12, 12)
                .addComponent(btnEliminarP)
                .addGap(14, 14, 14)
                .addComponent(btnLimpiarP)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBotonesPLayout.setVerticalGroup(
            pnlBotonesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonesPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBotonesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarP)
                    .addComponent(btnModificarP)
                    .addComponent(btnRegistrarP)
                    .addComponent(btnLimpiarP)
                    .addComponent(btnEliminarP))
                .addGap(22, 22, 22))
        );

        pnlEncabezadoP.setBackground(new java.awt.Color(255, 255, 255));

        jLabel23.setText("Codigo De Pago");

        jLabel24.setText("Codigo De Reserva");

        jLabel25.setText("Nombre Del Huesped");

        jLabel26.setText("Valor");

        jLabel27.setText("Metodo De Pago");

        jLabel28.setText("Estado");

        cmbMetodoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EFECTIVO", "TARJETA DEBITO", "TARJETA CREDITO", "TRANSFERENCIA", " " }));

        cmbEstadoP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PENDIENTE", "PAGADO", "ANULADO" }));

        jLabel29.setText("Fecha De Pago");

        spnFechaPago.setModel(new javax.swing.SpinnerDateModel());
        spnFechaPago.setEditor(new javax.swing.JSpinner.DateEditor(spnFechaPago, ""));

        javax.swing.GroupLayout pnlEncabezadoPLayout = new javax.swing.GroupLayout(pnlEncabezadoP);
        pnlEncabezadoP.setLayout(pnlEncabezadoPLayout);
        pnlEncabezadoPLayout.setHorizontalGroup(
            pnlEncabezadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEncabezadoPLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlEncabezadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEncabezadoPLayout.createSequentialGroup()
                        .addGroup(pnlEncabezadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoPago)
                            .addComponent(txtNombreHuesped)
                            .addComponent(cmbMetodoPago, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlEncabezadoPLayout.createSequentialGroup()
                                .addGroup(pnlEncabezadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel25))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(68, 68, 68)
                        .addGroup(pnlEncabezadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlEncabezadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbEstadoP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtValor)
                                .addComponent(txtCodigoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel24))
                        .addGap(36, 36, 36))
                    .addGroup(pnlEncabezadoPLayout.createSequentialGroup()
                        .addGroup(pnlEncabezadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(spnFechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlEncabezadoPLayout.setVerticalGroup(
            pnlEncabezadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEncabezadoPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEncabezadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEncabezadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEncabezadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEncabezadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEncabezadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEncabezadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEstadoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(spnFechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlPagosLayout = new javax.swing.GroupLayout(pnlPagos);
        pnlPagos.setLayout(pnlPagosLayout);
        pnlPagosLayout.setHorizontalGroup(
            pnlPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPagosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlEncabezadoP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBotonesP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTablaP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlPagosLayout.setVerticalGroup(
            pnlPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPagosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlEncabezadoP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTablaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBotonesP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlContenedor.add(pnlPagos, "card5");

        pnlHabitacion.setBackground(new java.awt.Color(243, 245, 247));
        pnlHabitacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GESTION DE HABITACION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 16), new java.awt.Color(23, 43, 70))); // NOI18N

        pnlEncabezadoHa.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(23, 43, 70));
        jLabel1.setText("Numero:");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1.setName(""); // NOI18N

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(23, 43, 70));
        jLabel2.setText("Tipo:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel2.setName(""); // NOI18N

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(23, 43, 70));
        jLabel3.setText("Capacidad:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel3.setName(""); // NOI18N

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(23, 43, 70));
        jLabel4.setText("Precio Noche:");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel4.setName(""); // NOI18N

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(23, 43, 70));
        jLabel5.setText("Estado:");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel5.setName(""); // NOI18N

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(23, 43, 70));
        jLabel6.setText("Buscar");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel6.setName(""); // NOI18N

        txtNumero.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtNumero.setForeground(new java.awt.Color(51, 51, 51));
        txtNumero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(213, 220, 229), 2, true));

        cmbTipo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmbTipo.setForeground(new java.awt.Color(51, 51, 51));
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INDIVIDUAL", "DOBLE", "MATRIMONIAL", "FAMILIAR" }));
        cmbTipo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(213, 220, 229), 2, true));

        spnCapacidad.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        spnCapacidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(213, 220, 229), 2, true));
        spnCapacidad.setEditor(new javax.swing.JSpinner.NumberEditor(spnCapacidad, ""));

        txtPnoche.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtPnoche.setForeground(new java.awt.Color(51, 51, 51));
        txtPnoche.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(213, 220, 229), 2, true));

        cmbEstado.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmbEstado.setForeground(new java.awt.Color(51, 51, 51));
        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DISPONIBLE", "OCUPADA", "MATENIMIENTO", " " }));
        cmbEstado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(213, 220, 229), 2, true));

        txtBuscar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(51, 51, 51));
        txtBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(213, 220, 229), 2, true));

        javax.swing.GroupLayout pnlEncabezadoHaLayout = new javax.swing.GroupLayout(pnlEncabezadoHa);
        pnlEncabezadoHa.setLayout(pnlEncabezadoHaLayout);
        pnlEncabezadoHaLayout.setHorizontalGroup(
            pnlEncabezadoHaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEncabezadoHaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlEncabezadoHaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEncabezadoHaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spnCapacidad)
                    .addComponent(txtPnoche)
                    .addComponent(cmbEstado, 0, 329, Short.MAX_VALUE)
                    .addComponent(txtNumero)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBuscar))
                .addContainerGap())
        );
        pnlEncabezadoHaLayout.setVerticalGroup(
            pnlEncabezadoHaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEncabezadoHaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEncabezadoHaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEncabezadoHaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEncabezadoHaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spnCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEncabezadoHaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPnoche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEncabezadoHaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEncabezadoHaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        tblHabitaciones.setBackground(new java.awt.Color(23, 43, 70));
        tblHabitaciones.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        tblHabitaciones.setForeground(new java.awt.Color(255, 255, 255));
        tblHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
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
        tblHabitaciones.setGridColor(new java.awt.Color(213, 220, 229));
        tblHabitaciones.setSelectionBackground(new java.awt.Color(220, 230, 241));
        tblHabitaciones.setSelectionForeground(new java.awt.Color(23, 43, 70));
        jScrollPane2.setViewportView(tblHabitaciones);

        javax.swing.GroupLayout pnlTablaHaLayout = new javax.swing.GroupLayout(pnlTablaHa);
        pnlTablaHa.setLayout(pnlTablaHaLayout);
        pnlTablaHaLayout.setHorizontalGroup(
            pnlTablaHaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
            .addGroup(pnlTablaHaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE))
        );
        pnlTablaHaLayout.setVerticalGroup(
            pnlTablaHaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
            .addGroup(pnlTablaHaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
        );

        pnlBotonesHa.setBackground(new java.awt.Color(255, 255, 255));

        btnRegistrarHa.setBackground(new java.awt.Color(23, 43, 70));
        btnRegistrarHa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrarHa.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarHa.setText("Registrar");
        btnRegistrarHa.addActionListener(this::btnRegistrarHaActionPerformed);

        btnModificarHa.setBackground(new java.awt.Color(23, 43, 70));
        btnModificarHa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnModificarHa.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarHa.setText("Modificar");

        btnBuscarHa.setBackground(new java.awt.Color(23, 43, 70));
        btnBuscarHa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarHa.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarHa.setText("Buscar");

        btnLimpiarHa.setBackground(new java.awt.Color(23, 43, 70));
        btnLimpiarHa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiarHa.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarHa.setText("Limpiar");

        btnEliminarHa.setBackground(new java.awt.Color(23, 43, 70));
        btnEliminarHa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminarHa.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarHa.setText("Eliminar");

        javax.swing.GroupLayout pnlBotonesHaLayout = new javax.swing.GroupLayout(pnlBotonesHa);
        pnlBotonesHa.setLayout(pnlBotonesHaLayout);
        pnlBotonesHaLayout.setHorizontalGroup(
            pnlBotonesHaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesHaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnRegistrarHa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificarHa)
                .addGap(10, 10, 10)
                .addComponent(btnBuscarHa)
                .addGap(12, 12, 12)
                .addComponent(btnEliminarHa)
                .addGap(14, 14, 14)
                .addComponent(btnLimpiarHa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBotonesHaLayout.setVerticalGroup(
            pnlBotonesHaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonesHaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBotonesHaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarHa)
                    .addComponent(btnModificarHa)
                    .addComponent(btnRegistrarHa)
                    .addComponent(btnLimpiarHa)
                    .addComponent(btnEliminarHa))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout pnlHabitacionLayout = new javax.swing.GroupLayout(pnlHabitacion);
        pnlHabitacion.setLayout(pnlHabitacionLayout);
        pnlHabitacionLayout.setHorizontalGroup(
            pnlHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHabitacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHabitacionLayout.createSequentialGroup()
                        .addGroup(pnlHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlBotonesHa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlTablaHa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlHabitacionLayout.createSequentialGroup()
                        .addComponent(pnlEncabezadoHa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlHabitacionLayout.setVerticalGroup(
            pnlHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHabitacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlEncabezadoHa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTablaHa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBotonesHa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlContenedor.add(pnlHabitacion, "card6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 631, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(pnlContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        menuPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        pnlContenedor.removeAll();
        pnlContenedor.add(pnlHome);
        pnlContenedor.repaint();
        pnlContenedor.revalidate();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacionActionPerformed
        pnlContenedor.removeAll();
        pnlContenedor.add(pnlHabitacion);
        pnlContenedor.repaint();
        pnlContenedor.revalidate();
    }//GEN-LAST:event_btnHabitacionActionPerformed

    private void btnHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuespedActionPerformed
        pnlContenedor.removeAll();
        pnlContenedor.add(pnlHuesped);
        pnlContenedor.repaint();
        pnlContenedor.revalidate();
    }//GEN-LAST:event_btnHuespedActionPerformed

    private void btnResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumenActionPerformed
        pnlContenedor.removeAll();
        pnlContenedor.add(pnlPagos);
        pnlContenedor.repaint();
        pnlContenedor.revalidate();
    }//GEN-LAST:event_btnResumenActionPerformed

    private void btnHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHabitacionesActionPerformed

    private void btnRegistrarHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarHActionPerformed

    private void btnRegistrarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarRActionPerformed

    private void btnRegistrarHaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarHaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarHaActionPerformed

    private void btnRegistrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarPActionPerformed

    private void btnReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservaActionPerformed
        pnlContenedor.removeAll();
        pnlContenedor.add(pnlReserva);
        pnlContenedor.repaint();
        pnlContenedor.revalidate();
    }//GEN-LAST:event_btnReservaActionPerformed

public void inicio(){
        lblSaludo.setText("!Bienvenido ,\n" + huesped.getUsuario() + "a la Gestion de Inventarios");
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarH;
    private javax.swing.JButton btnBuscarHa;
    private javax.swing.JButton btnBuscarP;
    private javax.swing.JButton btnBuscarR;
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnEliminarH;
    private javax.swing.JButton btnEliminarHa;
    private javax.swing.JButton btnEliminarP;
    private javax.swing.JButton btnEliminarR;
    private javax.swing.JButton btnHabitacion;
    private javax.swing.JButton btnHabitaciones;
    private javax.swing.JButton btnHuesped;
    private javax.swing.JButton btnHuespedes;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnLimpiarH;
    private javax.swing.JButton btnLimpiarHa;
    private javax.swing.JButton btnLimpiarP;
    private javax.swing.JButton btnLimpiarR;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnModificarH;
    private javax.swing.JButton btnModificarHa;
    private javax.swing.JButton btnModificarP;
    private javax.swing.JButton btnModificarR;
    private javax.swing.JButton btnPagos;
    private javax.swing.JButton btnRegistrarH;
    private javax.swing.JButton btnRegistrarHa;
    private javax.swing.JButton btnRegistrarP;
    private javax.swing.JButton btnRegistrarR;
    private javax.swing.JButton btnReserva;
    private javax.swing.JButton btnReservas;
    private javax.swing.JButton btnResumen;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbEstadoP;
    private javax.swing.JComboBox<String> cmbEstadoR;
    private javax.swing.JComboBox<String> cmbHabitacion;
    private javax.swing.JComboBox<String> cmbMetodoPago;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDocumento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSaludo;
    private javax.swing.JLabel lblTelefonoH;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlBotonesH;
    private javax.swing.JPanel pnlBotonesHa;
    private javax.swing.JPanel pnlBotonesP;
    private javax.swing.JPanel pnlBotonesR;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JPanel pnlEncabezado;
    private javax.swing.JPanel pnlEncabezadoH;
    private javax.swing.JPanel pnlEncabezadoHa;
    private javax.swing.JPanel pnlEncabezadoP;
    private javax.swing.JPanel pnlEncabezadoR;
    private javax.swing.JPanel pnlHabitacion;
    private javax.swing.JPanel pnlHabitaciones;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlHuesped;
    private javax.swing.JPanel pnlHuespedes;
    private javax.swing.JPanel pnlIndicadores;
    private javax.swing.JPanel pnlIngresos;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPagos;
    private javax.swing.JPanel pnlReserva;
    private javax.swing.JPanel pnlReservas;
    private javax.swing.JPanel pnlTablaH;
    private javax.swing.JPanel pnlTablaHa;
    private javax.swing.JPanel pnlTablaP;
    private javax.swing.JPanel pnlTablaR;
    private javax.swing.JSpinner spnCapacidad;
    private javax.swing.JSpinner spnFechaEntrada;
    private javax.swing.JSpinner spnFechaPago;
    private javax.swing.JSpinner spnFechaSalida;
    private javax.swing.JSpinner spnPersonas;
    private javax.swing.JTable tblHabitaciones;
    private javax.swing.JTable tblHuespedes;
    private javax.swing.JTable tblPagos;
    private javax.swing.JTable tblReservas;
    private javax.swing.JTable tblReservas1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigoPago;
    private javax.swing.JTextField txtCodigoR;
    private javax.swing.JTextField txtCodigoReserva;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreHuesped;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPnoche;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
