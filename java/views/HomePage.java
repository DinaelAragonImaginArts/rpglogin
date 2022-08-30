package views;


import java.awt.Color;
import views.LoginForm;
import views.UserForm;


public class HomePage extends javax.swing.JFrame {

    public HomePage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        bgRegistro = new javax.swing.JPanel();
        btnRegistro = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        bgInicio = new javax.swing.JPanel();
        btnInicio = new javax.swing.JLabel();
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
        panel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 510, 360));

        bgRegistro.setBackground(new java.awt.Color(153, 153, 255));
        bgRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnRegistro.setBackground(new java.awt.Color(153, 153, 255));
        btnRegistro.setFont(new java.awt.Font("Acme", 1, 24)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistro.setText("Registrarse");
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

        panel.add(bgRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 500, 210, 60));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 1245, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        panel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 35));

        bgInicio.setBackground(new java.awt.Color(153, 153, 255));
        bgInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        javax.swing.GroupLayout bgInicioLayout = new javax.swing.GroupLayout(bgInicio);
        bgInicio.setLayout(bgInicioLayout);
        bgInicioLayout.setHorizontalGroup(
            bgInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
            .addGroup(bgInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bgInicioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        bgInicioLayout.setVerticalGroup(
            bgInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(bgInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bgInicioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panel.add(bgInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 210, 60));

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

    private void btnRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMouseClicked
        UserForm Registro = new UserForm();
        Registro.setVisible(true); 
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistroMouseClicked

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        LoginForm Login = new LoginForm();
        Login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnInicioMouseClicked

    private void btnInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseEntered
        bgInicio.setBackground(new Color(153, 85, 255));
    }//GEN-LAST:event_btnInicioMouseEntered

    private void btnInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseExited
        bgInicio.setBackground(new Color(153, 153, 255));
    }//GEN-LAST:event_btnInicioMouseExited

    private void btnInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInicioMousePressed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JPanel bgInicio;
    private javax.swing.JPanel bgRegistro;
    private javax.swing.JLabel btnInicio;
    private javax.swing.JLabel btnRegistro;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
