package Ventanas.Registrarse;

import javax.swing.JOptionPane;
import practico4.ejercicio1.Materia;
import practico4.ejercicio1.Menu;


public class RegistrarMateria extends javax.swing.JInternalFrame {
    
    
    
    public RegistrarMateria() {
        initComponents();
        
        this.setSize(500, 500);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jAñoMateria = new javax.swing.JTextField();
        jIDMateria = new javax.swing.JTextField();
        jNombreMateria = new javax.swing.JTextField();
        jBotonRegister = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jAñoMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAñoMateriaActionPerformed(evt);
            }
        });

        jIDMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIDMateriaActionPerformed(evt);
            }
        });

        jNombreMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNombreMateriaActionPerformed(evt);
            }
        });

        jBotonRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgRegister.png"))); // NOI18N
        jBotonRegister.setText("Registrar Materia");
        jBotonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonRegisterActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Año");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setText("ID_Materia");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setText("Nombre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAñoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jIDMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jBotonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jIDMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAñoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(57, 57, 57)
                .addComponent(jBotonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAñoMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAñoMateriaActionPerformed

    }//GEN-LAST:event_jAñoMateriaActionPerformed

    private void jIDMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIDMateriaActionPerformed

    }//GEN-LAST:event_jIDMateriaActionPerformed

    private void jNombreMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNombreMateriaActionPerformed

    }//GEN-LAST:event_jNombreMateriaActionPerformed

    private void jBotonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonRegisterActionPerformed

        String anio = jAñoMateria.getText();
        String id_Materia = jIDMateria.getText();
        String nombreM =  jNombreMateria.getText();

        // NO DEJAR QUE DEJA ALGO VACIO
        if(id_Materia.isEmpty()){
            JOptionPane.showMessageDialog(null, "id_Materia no puede estar vacio..");
            return;
        }
        if(nombreM.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nombre no puede estar vacio..");
            return;
        }
        if(anio.isEmpty()){
            JOptionPane.showMessageDialog(null, "Año no puede estar vacio..");
            return;
        }
        // NO DEJAR QUE DEJA ALGO VACIO

        // CONVERTIR LEGAJO A INT  Y MAS VERIFICACIONES//
        int id_materia2;
        try {
            id_materia2 = Integer.parseInt(id_Materia);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Numero no valido. :/");
            return;
        }
        if(id_materia2 <= 0){
            JOptionPane.showMessageDialog(null, "El numero no puede ser negativo. :%");
            return;
        }
        if(id_materia2 > 99999){
            JOptionPane.showMessageDialog(null, "El numero no puede superar los 5 digitos :/");
            return;
        }
        
        // AÑO
        int anio2;
        try {
            anio2 = Integer.parseInt(anio);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "año no valido :/");
            return;
        }
        if(anio2 <= 0){
            JOptionPane.showMessageDialog(null, "El numero no puede ser negativo. :%");
            return;
        }
        if(anio2 > 99999){
            JOptionPane.showMessageDialog(null, "El numero no puede superar los 5 digitos :/");
            return;
        }
        // AÑO
        
        
        // CONVERTIR LEGAJO A INT  Y MAS VERIFICACIONES//

        // AGREGAR ALUMNO //
        Materia nuevaMateria = new Materia(id_materia2, nombreM, anio2);
        
        
        if (Menu.materias.contains(nuevaMateria)) {
            JOptionPane.showMessageDialog(this, "Ya existe una materia con ese ID.");
            return;
        }

        Menu.materias.add(nuevaMateria);
        
        
        JOptionPane.showMessageDialog(null, "Materia Registrada: \n"+"\n"+ "Id_materia: "+ id_materia2 + "\n"+ "Nombre: "+ nombreM + "\n"+"Año: "+ anio + "\n"+ "\n"+ "Añadida Exitosamente");

        // LIMPIAR TEXTO //s
        jIDMateria.setText("");
        jAñoMateria.setText("");
        jNombreMateria.setText("");
        // LIMPIAR TEXTO //

    }//GEN-LAST:event_jBotonRegisterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAñoMateria;
    private javax.swing.JButton jBotonRegister;
    private javax.swing.JTextField jIDMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jNombreMateria;
    // End of variables declaration//GEN-END:variables


/* 
             /\_/\           ___
            = o_o =_______    \ \ 
             __^      __(  \.__) )
         (@)<_____>__(_____)____/
 */

}


