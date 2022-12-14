/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import entidades.Usuario;
import java.awt.Color;

/**
 *
 * @author Usuario
 */
public class Game extends javax.swing.JFrame {
    public Game() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgView = new javax.swing.JPanel();
        Dragon = new javax.swing.JLabel();
        lblBtn = new javax.swing.JLabel();
        btn = new javax.swing.JLabel();
        lblBtn1 = new javax.swing.JLabel();
        btn1 = new javax.swing.JLabel();
        lblBtn2 = new javax.swing.JLabel();
        btn2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        BienvenidaUsuario = new javax.swing.JLabel();
        BGImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bgView.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Dragon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Dragon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Rpg\\src\\main\\java\\imagenes\\dragon.png")); // NOI18N
        bgView.add(Dragon, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 430, 310));

        lblBtn.setFont(new java.awt.Font("Acme", 1, 24)); // NOI18N
        lblBtn.setForeground(new java.awt.Color(204, 204, 255));
        lblBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtn.setText("Iniciar Nuevo");
        bgView.add(lblBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 100, 180, 80));

        btn.setFont(new java.awt.Font("Acme", 1, 24)); // NOI18N
        btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Rpg\\src\\main\\java\\imagenes\\Button.png")); // NOI18N
        bgView.add(btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 90, 240, 100));

        lblBtn1.setFont(new java.awt.Font("Acme", 1, 24)); // NOI18N
        lblBtn1.setForeground(new java.awt.Color(204, 204, 255));
        lblBtn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtn1.setText("Continuar");
        bgView.add(lblBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 290, 180, 80));

        btn1.setFont(new java.awt.Font("Acme", 1, 24)); // NOI18N
        btn1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Rpg\\src\\main\\java\\imagenes\\Button.png")); // NOI18N
        bgView.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 280, 240, 100));

        lblBtn2.setFont(new java.awt.Font("Acme", 1, 24)); // NOI18N
        lblBtn2.setForeground(new java.awt.Color(204, 204, 255));
        lblBtn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtn2.setText("Configurar");
        bgView.add(lblBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 470, 180, 80));

        btn2.setFont(new java.awt.Font("Acme", 1, 24)); // NOI18N
        btn2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Rpg\\src\\main\\java\\imagenes\\Button.png")); // NOI18N
        bgView.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 460, 240, 100));

        jPanel1.setBackground(new java.awt.Color(73, 95, 205));
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
                .addContainerGap(1245, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        bgView.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BienvenidaUsuario.setText("jLabel1");
        bgView.add(BienvenidaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 190, 50));

        BGImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BGImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Rpg\\src\\main\\java\\imagenes\\background.jpg")); // NOI18N
        bgView.add(BGImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        getContentPane().add(bgView, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    int xMouse, yMouse;
    
    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setForeground(Color.white);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setForeground(Color.black);
    }//GEN-LAST:event_exitMouseExited

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed
   
    public void Imprimir(Usuario usuario){
        BienvenidaUsuario.setText("Hola invocador " + usuario.getNombre());
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGImage;
    private javax.swing.JLabel BienvenidaUsuario;
    private javax.swing.JLabel Dragon;
    private javax.swing.JPanel bgView;
    private javax.swing.JLabel btn;
    private javax.swing.JLabel btn1;
    private javax.swing.JLabel btn2;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBtn;
    private javax.swing.JLabel lblBtn1;
    private javax.swing.JLabel lblBtn2;
    // End of variables declaration//GEN-END:variables
}
