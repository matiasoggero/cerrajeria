/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;
import java.sql.*;
import conexion.Conectar;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class EditarCliente extends javax.swing.JFrame {

    String user,cliente;
    int id_cl = 0;
    
    public EditarCliente() {
        initComponents();
        user = Login.user;
        cliente = InformacionCliente.cliente;
        setSize(600,450);
        setTitle("informacion de " + cliente + " - sesion de " + user);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        ImageIcon wallpaper = new ImageIcon("src/imagenes/wallpaperPrincipal.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();
        
        try {
            Connection cn = Conectar.DataBase();
            PreparedStatement pst = cn.prepareStatement(
                    "select * from clientes where nombre_cliente = '" + cliente + "'");
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                id_cl = rs.getInt("id_cliente");
                txt_nom.setText(rs.getString("nombre_cliente"));
                txt_cuit.setText(rs.getString("cuit"));
                txt_mail.setText(rs.getString("mail"));
                txt_dir.setText(rs.getString("dir_cliente"));
                txt_tel.setText(rs.getString("tel_cliente"));
                txt_user.setText(rs.getString("responsable"));
            }
            cn.close();
            
        } catch (SQLException e) {
            System.err.println("error al cargar cliente " + e);
        }
        
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/LLaves.png"));
        return retValue;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txt_dir = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_tel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_cuit = new javax.swing.JTextField();
        txt_nom = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        txt_user = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Direccion:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        txt_dir.setBackground(new java.awt.Color(13, 71, 161));
        txt_dir.setForeground(new java.awt.Color(255, 255, 255));
        txt_dir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_dir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_dir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 210, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefono:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mail:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cuit:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        txt_tel.setBackground(new java.awt.Color(13, 71, 161));
        txt_tel.setForeground(new java.awt.Color(255, 255, 255));
        txt_tel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_tel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 210, 30));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Responsable:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        txt_cuit.setBackground(new java.awt.Color(13, 71, 161));
        txt_cuit.setForeground(new java.awt.Color(255, 255, 255));
        txt_cuit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_cuit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_cuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 210, 30));

        txt_nom.setBackground(new java.awt.Color(13, 71, 161));
        txt_nom.setForeground(new java.awt.Color(255, 255, 255));
        txt_nom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nom.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 210, 30));

        txt_mail.setBackground(new java.awt.Color(13, 71, 161));
        txt_mail.setForeground(new java.awt.Color(255, 255, 255));
        txt_mail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_mail.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 210, 30));

        txt_user.setEditable(false);
        txt_user.setBackground(new java.awt.Color(13, 71, 161));
        txt_user.setForeground(new java.awt.Color(255, 255, 255));
        txt_user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_user.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 210, 30));

        jButton1.setBackground(new java.awt.Color(0, 51, 204));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Actualizar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 210, 30));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombre, cuit, mail, direccion, telefono;
        int validacion = 0;
        
        nombre = txt_nom.getText().trim();
        cuit = txt_cuit.getText().trim();
        mail = txt_mail.getText().trim();
        direccion = txt_dir.getText().trim();
        telefono = txt_tel.getText().trim();
        
        if(nombre.equals("")){
            validacion++;
        }
        if(cuit.equals("")){
            validacion++;
        }
        if(mail.equals("")){
            validacion++;
        }
        if(direccion.equals("")){
            validacion++;
        }
        if(nombre.equals("")){
            validacion++;
        }if(telefono.equals("")){
            validacion++;
        }
        
        if (validacion == 0) {
            
            try {
                Connection cn = Conectar.DataBase();
                PreparedStatement pst = cn.prepareStatement(
                        "update clientes set nombre_cliente=?,cuit=?,mail=?,dir_cliente=?,tel_cliente=?,responsable=?"
                                + "where id_cliente ='" + id_cl + "'");
                
                pst.setString(1, nombre);
                pst.setString(2, cuit);
                pst.setString(3, mail);
                pst.setString(4, direccion);
                pst.setString(5, telefono);
                pst.setString(6, user);
                
                pst.executeUpdate();
                cn.close();
                JOptionPane.showMessageDialog(null, "actualizacion exitosa.");
                this.dispose();
                
            } catch (SQLException e) {
                System.err.println("error al acyualizar el cliente " + e);
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "debes completar todo los campos.");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(EditarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JTextField txt_cuit;
    private javax.swing.JTextField txt_dir;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JTextField txt_tel;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
