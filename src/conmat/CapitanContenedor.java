/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conmat;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class CapitanContenedor extends javax.swing.JFrame{
    public String usuarioactivo;
    public String idusuarioactivo;
    public String textomonitor = "Seleccione";
    
    /**
     * Creates new form Contenedor
     */
    public CapitanContenedor() {
        initComponents();
        this.setLocationRelativeTo(null);
        JlMonitorNombre.setText(textomonitor);
        monitorinformacion.setText(usuarioactivo);

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
        jSeparator1 = new javax.swing.JSeparator();
        JlMonitorNombre = new javax.swing.JLabel();
        BtnConcursos = new javax.swing.JButton();
        BtnParticipantes = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        monitorinformacion = new javax.swing.JLabel();
        BtnMinimizar = new javax.swing.JLabel();
        BtnCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 58, 170, -1));

        JlMonitorNombre.setBackground(new java.awt.Color(255, 255, 255));
        JlMonitorNombre.setFont(new java.awt.Font("Decker", 1, 22)); // NOI18N
        JlMonitorNombre.setForeground(new java.awt.Color(102, 102, 102));
        JlMonitorNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(JlMonitorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 150, 40));

        BtnConcursos.setBackground(new java.awt.Color(255, 255, 255));
        BtnConcursos.setForeground(new java.awt.Color(255, 255, 255));
        BtnConcursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_concurso_capitan_100.png"))); // NOI18N
        BtnConcursos.setBorder(null);
        BtnConcursos.setContentAreaFilled(false);
        BtnConcursos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnConcursos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/select.png"))); // NOI18N
        BtnConcursos.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/select.png"))); // NOI18N
        BtnConcursos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/select.png"))); // NOI18N
        BtnConcursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnConcursosMouseClicked(evt);
            }
        });
        jPanel1.add(BtnConcursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        BtnParticipantes.setBackground(new java.awt.Color(255, 255, 255));
        BtnParticipantes.setForeground(new java.awt.Color(255, 255, 255));
        BtnParticipantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Proveedores.png"))); // NOI18N
        BtnParticipantes.setBorder(null);
        BtnParticipantes.setContentAreaFilled(false);
        BtnParticipantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnParticipantes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/select.png"))); // NOI18N
        BtnParticipantes.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/select.png"))); // NOI18N
        BtnParticipantes.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/select.png"))); // NOI18N
        BtnParticipantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnParticipantesMouseClicked(evt);
            }
        });
        jPanel1.add(BtnParticipantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 900));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel2MouseMoved(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo_grande.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 590, 540));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 1090, 860));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel3MouseMoved(evt);
            }
        });

        monitorinformacion.setBackground(new java.awt.Color(255, 255, 255));
        monitorinformacion.setFont(new java.awt.Font("Decker", 1, 14)); // NOI18N
        monitorinformacion.setForeground(new java.awt.Color(102, 102, 102));

        BtnMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        BtnMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        BtnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_minimisar_32px.png"))); // NOI18N
        BtnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnMinimizarMouseClicked(evt);
            }
        });

        BtnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        BtnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        BtnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_cerrar_32px.png"))); // NOI18N
        BtnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(monitorinformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 310, Short.MAX_VALUE)
                .addComponent(BtnMinimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnCerrar)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(monitorinformacion, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnMinimizar)
                    .addComponent(BtnCerrar))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 1090, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
    mandadatos();
    }//GEN-LAST:event_jPanel1MouseMoved

    private void BtnConcursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnConcursosMouseClicked
        JlMonitorNombre.setText("Clientes");
        CapitanConcursos pantallaclientes = new CapitanConcursos();
        pantallaclientes.recibeusuario(idusuarioactivo, usuarioactivo);
        pantallaclientes.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnConcursosMouseClicked

    private void BtnParticipantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnParticipantesMouseClicked
        JlMonitorNombre.setText("Proveedores");
        CapitanParticipantes pantallaproveedores = new CapitanParticipantes();
        pantallaproveedores.recibeusuario(idusuarioactivo, usuarioactivo);
        pantallaproveedores.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnParticipantesMouseClicked

    private void jPanel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseMoved
        mandadatos();
    }//GEN-LAST:event_jPanel2MouseMoved

    private void jPanel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseMoved
        mandadatos();
    }//GEN-LAST:event_jPanel3MouseMoved

    private void BtnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMinimizarMouseClicked
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_BtnMinimizarMouseClicked

    private void BtnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCerrarMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea Cerrar Esta Ventana?", "Salir", dialog);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_BtnCerrarMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CapitanContenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CapitanContenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CapitanContenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CapitanContenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CapitanContenedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnCerrar;
    private javax.swing.JButton BtnConcursos;
    private javax.swing.JLabel BtnMinimizar;
    private javax.swing.JButton BtnParticipantes;
    private javax.swing.JLabel JlMonitorNombre;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel monitorinformacion;
    // End of variables declaration//GEN-END:variables
   
    public void recibeusuario(String idusuario, String usuario){
        idusuarioactivo = idusuario;
        usuarioactivo = usuario;
        Date now = new Date(System.currentTimeMillis());
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat hour = new SimpleDateFormat("HH:mm:ss");
        String informacion = "Bienvenido " + usuarioactivo + " " + date.format(now) + " " + hour.format(now);
        monitorinformacion.setText(informacion);
    }
    
    public void mandadatos(){
        Date now = new Date(System.currentTimeMillis());
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat hour = new SimpleDateFormat("HH:mm:ss");
        String informacion = "Bienvenido " + usuarioactivo + " " + date.format(now) + " " + hour.format(now);
        monitorinformacion.setText(informacion);
    }
}



