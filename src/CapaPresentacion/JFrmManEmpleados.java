/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;
import CapaNegocio.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import interfaces.ISaldos;



public class JFrmManEmpleados extends javax.swing.JFrame {
    
    private static JFrmManEmpleados unicainstancia;
    
    public static JFrmManEmpleados getInstancia(){
        if(unicainstancia==null)
            unicainstancia = new JFrmManEmpleados();
        return unicainstancia;
        
    }
    public ArrayList<Sereno> ListaSereno = new ArrayList();
    public ArrayList<Administrativos> ListaAdministrativo = new ArrayList();

    /**
     * Creates new form JFrmManEmpleados
     */
    public JFrmManEmpleados() {
        initComponents();
        txtsec.setVisible(false);
        jLabel6.setVisible(false);
        
       
        txtran.setVisible(false);
        txtsal.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtcod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtape = new javax.swing.JTextField();
        txtdni = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        optAdm = new javax.swing.JRadioButton();
        optSer = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtsec = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtran = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtsal = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtmostrar = new javax.swing.JTextArea();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Codigo");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido");

        jLabel5.setText("DNI");

        optAdm.setText("Administrativo");
        optAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optAdmActionPerformed(evt);
            }
        });

        optSer.setText("Serenazgo");
        optSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optSerActionPerformed(evt);
            }
        });

        jLabel6.setText("Sector");

        jLabel8.setText("Rango");

        txtran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtranActionPerformed(evt);
            }
        });

        jLabel9.setText("Saldo");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        txtmostrar.setColumns(20);
        txtmostrar.setRows(5);
        jScrollPane1.setViewportView(txtmostrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(optAdm)
                                .addGap(108, 108, 108)
                                .addComponent(optSer))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(58, 58, 58)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtnom)
                                            .addComponent(txtape)
                                            .addComponent(txtsec, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                            .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnGuardar)
                                        .addGap(113, 113, 113)
                                        .addComponent(btnListar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addGap(58, 58, 58)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtran, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtsal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 118, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optAdm)
                    .addComponent(optSer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtsec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnListar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optAdmActionPerformed
        activarCuadros();
         txtmostrar.setText(null);
    }//GEN-LAST:event_optAdmActionPerformed

    private void optSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optSerActionPerformed
        activarCuadros();
        txtmostrar.setText(null);
        
    }//GEN-LAST:event_optSerActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        txtmostrar.setText(null);
        if(optAdm.isSelected()){
        for(Administrativos objS : ListaAdministrativo)
          txtmostrar.append(objS.toString());
 }
  if(optSer.isSelected()){
        for(Sereno objS : ListaSereno)
          txtmostrar.append(objS.toString());
 }
    }//GEN-LAST:event_btnListarActionPerformed
/*
     txtmostrar.setText("Los Datos son: \n" +txtnomb.getText()+"\n"+txtdir.getText()+"\n"
               +txtruc.getText()+"\n  LA CUENTA TOTAL ES :"+txttotalcompleto.getText());
    */
    
    public double saldo;
    public int rango;
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
         
        if(optAdm.isSelected()){
            String codigo = txtcod.getText();
            String nombre = txtnom.getText();
            String apellido = txtape.getText();
            String dni = txtdni.getText();
            String sector = txtsec.getText();
            ListaAdministrativo.add(new Administrativos(codigo,nombre,apellido,dni,sector));
        }
       
         if(optSer.isSelected()){
            String codigo = txtcod.getText();//Lector.leer("Ingrese Codigo ");
            String nombre = txtnom.getText();//Lector.leer("Ingrese Nombre ");
            String apellido = txtape.getText();//Lector.leer("Ingrese Apellido ");
            String dni = txtdni.getText();//Lector.leer("Ingrese DNI ");
            rango = Integer.parseInt(txtran.getText());//Lector.leer("Ingrese Rango del sereno");
            //double saldo = calcularSaldo();   //Double.parseDouble(txtsal.getText());
            double saldo = 150 * rango;
           ListaSereno.add(new Sereno(codigo,nombre,apellido,dni,rango,saldo));
           txtsal.setText(String.valueOf(saldo));
         }
         limpiar();
                 
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtranActionPerformed
         double saldo = 150 * rango;
        txtsal.setText(String.valueOf(saldo));
    }//GEN-LAST:event_txtranActionPerformed
public void activarCuadros(){
    
    if(optAdm.isSelected())
  {
      txtsec.setVisible(true);//setEnabled(true);
      jLabel6.setVisible(true);
  }else if (!optAdm.isSelected())
  {
        txtsec.setVisible(false);//setEnabled(true);
        jLabel6.setVisible(false);
     
  }
    
    if(optSer.isSelected())
  {
     
     txtran.setVisible(true);
     txtsal.setVisible(true);
     jLabel8.setVisible(true);
     jLabel9.setVisible(true);
  }else if (!optSer.isSelected())
  {
    
     txtran.setVisible(false);
     txtsal.setVisible(false);
     jLabel8.setVisible(false);
     jLabel9.setVisible(false);
     
  }
}
     
public void limpiar(){
    txtcod.setText(null);
    txtape.setText(null);
    txtdni.setText(null);
   
    txtnom.setText(null);
    txtran.setText(null);
    txtsal.setText(null);
    txtsec.setText(null);
    txtcod.requestFocus();
}
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
            java.util.logging.Logger.getLogger(JFrmManEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmManEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmManEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmManEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrmManEmpleados.getInstancia();
                new JFrmManEmpleados().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton optAdm;
    private javax.swing.JRadioButton optSer;
    private javax.swing.JTextField txtape;
    private javax.swing.JTextField txtcod;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextArea txtmostrar;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtran;
    private javax.swing.JTextField txtsal;
    private javax.swing.JTextField txtsec;
    // End of variables declaration//GEN-END:variables
}
