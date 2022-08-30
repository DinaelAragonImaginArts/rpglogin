package views;

import dao.UsuarioDao;
import entidades.Usuario;
import java.awt.Color;
import javax.swing.JOptionPane;
import views.Game;
public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        flecha = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        bgRegistro = new javax.swing.JPanel();
        btnInicio = new javax.swing.JLabel();
        IzqPanel = new javax.swing.JPanel();
        InpUser = new javax.swing.JTextField();
        txtUsername = new javax.swing.JLabel();
        SpUserName = new javax.swing.JSeparator();
        InpEmail = new javax.swing.JTextField();
        txtEmail = new javax.swing.JLabel();
        spEmail = new javax.swing.JSeparator();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        panel.setPreferredSize(new java.awt.Dimension(1280, 720));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Rpg\\src\\main\\java\\imagenes\\logo3.png")); // NOI18N
        panel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 510, 360));

        bgRegistro.setBackground(new java.awt.Color(153, 153, 255));
        bgRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnInicio.setBackground(new java.awt.Color(153, 153, 255));
        btnInicio.setFont(new java.awt.Font("Acme", 1, 24)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnInicio.setText("Iniciar");
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInicioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnInicioMousePressed(evt);
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
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        bgRegistroLayout.setVerticalGroup(
            bgRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(bgRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bgRegistroLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panel.add(bgRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 560, 210, 60));

        IzqPanel.setBackground(new java.awt.Color(50, 177, 255));

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

        javax.swing.GroupLayout IzqPanelLayout = new javax.swing.GroupLayout(IzqPanel);
        IzqPanel.setLayout(IzqPanelLayout);
        IzqPanelLayout.setHorizontalGroup(
            IzqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IzqPanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(IzqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(IzqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(InpUser)
                        .addComponent(SpUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(IzqPanelLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(IzqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        IzqPanelLayout.setVerticalGroup(
            IzqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IzqPanelLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InpUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SpUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
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

    private void btnInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseEntered
        bgRegistro.setBackground(new Color(153, 85, 255));
    }//GEN-LAST:event_btnInicioMouseEntered

    private void btnInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInicioMousePressed

    private void btnInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseExited
        bgRegistro.setBackground(new Color(153, 153, 255));
    }//GEN-LAST:event_btnInicioMouseExited

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
      Usuario inicio = new Usuario();
        try {
          inicio.setUser(InpUser.getText());
          inicio.setCorreo(InpEmail.getText());
          UsuarioDao get = new UsuarioDao();
          if(get.iniciar(inicio)){
              this.setVisible(false);
              Game NewGame = new Game();
              NewGame.setVisible(true);
          }else{
              JOptionPane.showMessageDialog(this, "Ha ocurrido un error con su confirmacion intentelo de nuevo");
          }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error el usuario no ha podido ser confirmado");
        }
         
    }//GEN-LAST:event_btnInicioMouseClicked

    private void InpEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InpEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InpEmailActionPerformed

    private void InpUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InpUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InpUserActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InpEmail;
    private javax.swing.JTextField InpUser;
    private javax.swing.JPanel IzqPanel;
    private javax.swing.JSeparator SpUserName;
    private javax.swing.JLabel bg;
    private javax.swing.JPanel bgRegistro;
    private javax.swing.JLabel btnInicio;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel flecha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panel;
    private javax.swing.JSeparator spEmail;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtUsername;
    // End of variables declaration//GEN-END:variables
}
