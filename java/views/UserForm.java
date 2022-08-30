package views;

import dao.UsuarioDao;
import entidades.Usuario;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import views.HomePage;

public class UserForm extends javax.swing.JFrame {

    public UserForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        flecha = new javax.swing.JLabel();
        bgRegistro = new javax.swing.JPanel();
        btnRegistro = new javax.swing.JLabel();
        IzqPanel = new javax.swing.JPanel();
        InpNombre = new javax.swing.JTextField();
        SpNombre = new javax.swing.JSeparator();
        txtNombre = new javax.swing.JLabel();
        InpApellido = new javax.swing.JTextField();
        SpApellido = new javax.swing.JSeparator();
        txtApellido = new javax.swing.JLabel();
        InpUser = new javax.swing.JTextField();
        txtUsername = new javax.swing.JLabel();
        SpUserName = new javax.swing.JSeparator();
        InpEmail = new javax.swing.JTextField();
        txtEmail = new javax.swing.JLabel();
        spEmail = new javax.swing.JSeparator();
        InpEdad = new javax.swing.JTextField();
        txtEdad = new javax.swing.JLabel();
        spEdad = new javax.swing.JSeparator();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        panel.setPreferredSize(new java.awt.Dimension(1280, 720));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Rpg\\src\\main\\java\\imagenes\\logo3.png")); // NOI18N
        panel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 510, 360));

        jPanel1.setBackground(new java.awt.Color(50, 177, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 35));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Acme", 1, 18)); // NOI18N
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });

        flecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        flecha.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Rpg\\src\\main\\java\\imagenes\\flecha - copia.png")); // NOI18N
        flecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        flecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flechaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(flecha, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1166, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(flecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 35));

        bgRegistro.setBackground(new java.awt.Color(153, 153, 255));
        bgRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnRegistro.setBackground(new java.awt.Color(153, 153, 255));
        btnRegistro.setFont(new java.awt.Font("Acme", 1, 24)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistro.setText("Registrate");
        btnRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistroMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegistroMousePressed(evt);
            }
        });

        javax.swing.GroupLayout bgRegistroLayout = new javax.swing.GroupLayout(bgRegistro);
        bgRegistro.setLayout(bgRegistroLayout);
        bgRegistroLayout.setHorizontalGroup(
            bgRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
            .addGroup(bgRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bgRegistroLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        bgRegistroLayout.setVerticalGroup(
            bgRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(bgRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bgRegistroLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panel.add(bgRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 560, 210, 60));

        IzqPanel.setBackground(new java.awt.Color(50, 177, 255));

        InpNombre.setBackground(new java.awt.Color(50, 177, 255));
        InpNombre.setFont(new java.awt.Font("Acme", 1, 28)); // NOI18N
        InpNombre.setForeground(new java.awt.Color(204, 204, 255));
        InpNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InpNombre.setBorder(null);
        InpNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        InpNombre.setOpaque(true);
        InpNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InpNombreActionPerformed(evt);
            }
        });

        SpNombre.setBackground(new java.awt.Color(153, 153, 255));
        SpNombre.setForeground(new java.awt.Color(204, 204, 255));
        SpNombre.setToolTipText("");
        SpNombre.setFont(new java.awt.Font("Acme", 1, 18)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Acme", 1, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(204, 204, 255));
        txtNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNombre.setText("Nombre");

        InpApellido.setBackground(new java.awt.Color(50, 177, 255));
        InpApellido.setFont(new java.awt.Font("Acme", 1, 28)); // NOI18N
        InpApellido.setForeground(new java.awt.Color(204, 204, 255));
        InpApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InpApellido.setBorder(null);
        InpApellido.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        InpApellido.setOpaque(true);
        InpApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InpApellidoActionPerformed(evt);
            }
        });

        SpApellido.setBackground(new java.awt.Color(153, 153, 255));
        SpApellido.setForeground(new java.awt.Color(204, 204, 255));
        SpApellido.setToolTipText("");
        SpApellido.setFont(new java.awt.Font("Acme", 1, 18)); // NOI18N

        txtApellido.setFont(new java.awt.Font("Acme", 1, 24)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(204, 204, 255));
        txtApellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtApellido.setText("Apellido");

        InpUser.setBackground(new java.awt.Color(50, 177, 255));
        InpUser.setFont(new java.awt.Font("Acme", 1, 28)); // NOI18N
        InpUser.setForeground(new java.awt.Color(204, 204, 255));
        InpUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InpUser.setBorder(null);
        InpUser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        InpUser.setOpaque(true);
        InpUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InpUserActionPerformed(evt);
            }
        });

        txtUsername.setFont(new java.awt.Font("Acme", 1, 24)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(204, 204, 255));
        txtUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtUsername.setText("Username");

        SpUserName.setBackground(new java.awt.Color(153, 153, 255));
        SpUserName.setForeground(new java.awt.Color(204, 204, 255));
        SpUserName.setToolTipText("");
        SpUserName.setFont(new java.awt.Font("Acme", 1, 18)); // NOI18N

        InpEmail.setBackground(new java.awt.Color(50, 177, 255));
        InpEmail.setFont(new java.awt.Font("Acme", 1, 28)); // NOI18N
        InpEmail.setForeground(new java.awt.Color(204, 204, 255));
        InpEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InpEmail.setBorder(null);
        InpEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        InpEmail.setOpaque(true);
        InpEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InpEmailActionPerformed(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Acme", 1, 24)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(204, 204, 255));
        txtEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEmail.setText("E-mail");

        spEmail.setBackground(new java.awt.Color(153, 153, 255));
        spEmail.setForeground(new java.awt.Color(204, 204, 255));
        spEmail.setToolTipText("");
        spEmail.setFont(new java.awt.Font("Acme", 1, 18)); // NOI18N

        InpEdad.setBackground(new java.awt.Color(50, 177, 255));
        InpEdad.setFont(new java.awt.Font("Acme", 1, 28)); // NOI18N
        InpEdad.setForeground(new java.awt.Color(204, 204, 255));
        InpEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InpEdad.setBorder(null);
        InpEdad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        InpEdad.setOpaque(true);
        InpEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InpEdadActionPerformed(evt);
            }
        });

        txtEdad.setFont(new java.awt.Font("Acme", 1, 24)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(204, 204, 255));
        txtEdad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEdad.setText("Edad");

        spEdad.setBackground(new java.awt.Color(153, 153, 255));
        spEdad.setForeground(new java.awt.Color(204, 204, 255));
        spEdad.setToolTipText("");
        spEdad.setFont(new java.awt.Font("Acme", 1, 18)); // NOI18N

        javax.swing.GroupLayout IzqPanelLayout = new javax.swing.GroupLayout(IzqPanel);
        IzqPanel.setLayout(IzqPanelLayout);
        IzqPanelLayout.setHorizontalGroup(
            IzqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IzqPanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(IzqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InpApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(IzqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(IzqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(IzqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(spEmail)
                                .addComponent(InpUser)
                                .addComponent(SpUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(InpEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(spEdad)
                                .addGroup(IzqPanelLayout.createSequentialGroup()
                                    .addGap(173, 173, 173)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(IzqPanelLayout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addGroup(IzqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(IzqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SpApellido)
                            .addComponent(InpNombre)
                            .addComponent(SpNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(IzqPanelLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(IzqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        IzqPanelLayout.setVerticalGroup(
            IzqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IzqPanelLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InpNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SpNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InpApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SpApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InpUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SpUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InpEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        panel.add(IzqPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 720));

        bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Rpg\\src\\main\\java\\imagenes\\background.jpg")); // NOI18N
        bg.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        panel.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        getContentPane().add(panel, java.awt.BorderLayout.CENTER);
        panel.getAccessibleContext().setAccessibleParent(panel);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    int xMouse, yMouse;

    //Cerramos la ventana
    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setForeground(Color.white);

    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setForeground(Color.black);
    }//GEN-LAST:event_exitMouseExited

    private void btnRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMouseEntered
        bgRegistro.setBackground(new Color(153, 85, 255));
    }//GEN-LAST:event_btnRegistroMouseEntered

    private void btnRegistroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistroMousePressed

    private void btnRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMouseExited
        bgRegistro.setBackground(new Color(153, 153, 255));
    }//GEN-LAST:event_btnRegistroMouseExited

    private void InpApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InpApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InpApellidoActionPerformed

    private void InpNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InpNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InpNombreActionPerformed

    private void InpUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InpUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InpUserActionPerformed

    private void InpEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InpEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InpEmailActionPerformed

    private void InpEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InpEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InpEdadActionPerformed

    private void btnRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMouseClicked
       //Tomamos el usuario
        Usuario user = new Usuario();
        try {
            user.setNombre(InpNombre.getText());
            user.setApellido(InpApellido.getText());
            user.setUser(InpUser.getText());
            user.setCorreo(InpEmail.getText());
            user.setEdad(Integer.parseInt(InpEdad.getText()));
            user.setActivo(true);
            UsuarioDao set = new UsuarioDao();
            if(set.agregarUsuario(user)){
                JOptionPane.showMessageDialog(this,"Se ha agregado un  nuevo usuario, ¡Bienvenido!");
            }else{
                JOptionPane.showMessageDialog(this,"Su solicitud no ha podido ser confirmada");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error inesperado, Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnRegistroMouseClicked

    private void flechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flechaMouseClicked
        this.setVisible(false);
        HomePage View = new HomePage();
        View.setVisible(true);
    }//GEN-LAST:event_flechaMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InpApellido;
    private javax.swing.JTextField InpEdad;
    private javax.swing.JTextField InpEmail;
    private javax.swing.JTextField InpNombre;
    private javax.swing.JTextField InpUser;
    private javax.swing.JPanel IzqPanel;
    private javax.swing.JSeparator SpApellido;
    private javax.swing.JSeparator SpNombre;
    private javax.swing.JSeparator SpUserName;
    private javax.swing.JLabel bg;
    private javax.swing.JPanel bgRegistro;
    private javax.swing.JLabel btnRegistro;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel flecha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panel;
    private javax.swing.JSeparator spEdad;
    private javax.swing.JSeparator spEmail;
    private javax.swing.JLabel txtApellido;
    private javax.swing.JLabel txtEdad;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtUsername;
    // End of variables declaration//GEN-END:variables
}
