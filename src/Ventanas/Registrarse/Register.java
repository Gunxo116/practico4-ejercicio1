package Ventanas.Registrarse;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import practico4.ejercicio1.Alumno;
import practico4.ejercicio1.Materia;
import practico4.ejercicio1.Menu;



public class Register extends javax.swing.JInternalFrame {
    
     private DefaultTableModel modelo = new  DefaultTableModel();
    
    private void cargarCombo() {
        jComboAlumnos.removeAllItems();
        jComboAlumnos.addItem(null); 
        for (Alumno a : Menu.alumnos) {
            jComboAlumnos.addItem(a); 
        }
        
        jComboMaterias.removeAllItems();
        jComboMaterias.addItem(null); 
        for (Materia materia : Menu.materias) {
            jComboMaterias.addItem(materia);
        }

    }
    
    public Register() {
        initComponents();
        
        this.setSize(500, 500);
        
        armarCabecera();
        verMaterias();
        cargarCombo();
        modelo.setRowCount(0);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelListaMaterias = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboAlumnos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboMaterias = new javax.swing.JComboBox<>();
        jBotonInscribirse = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabelListaMaterias.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabelListaMaterias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelListaMaterias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgFormulario.png"))); // NOI18N
        jLabelListaMaterias.setText("Formulario de Inscripcion");

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("Elija al Alumno");

        jComboAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboAlumnosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setText("Elija la Materia");

        jComboMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboMateriasActionPerformed(evt);
            }
        });

        jBotonInscribirse.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jBotonInscribirse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgRegister.png"))); // NOI18N
        jBotonInscribirse.setText("Inscribirse");
        jBotonInscribirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonInscribirseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboAlumnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboMaterias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(jLabelListaMaterias)
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jBotonInscribirse, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabelListaMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(jBotonInscribirse, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboAlumnosActionPerformed
        Alumno seleccionado = (Alumno) jComboAlumnos.getSelectedItem();
        if (seleccionado == null) {
            modelo.setRowCount(0);
            return;
        }
    }//GEN-LAST:event_jComboAlumnosActionPerformed

    private void jComboMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboMateriasActionPerformed
        
        Materia seleccionadoM = (Materia) jComboMaterias.getSelectedItem();
        if (seleccionadoM == null) {
            modelo.setRowCount(0);
            return;
        }
        
    }//GEN-LAST:event_jComboMateriasActionPerformed
    private void jBotonInscribirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonInscribirseActionPerformed
        
        Alumno seleccionadoA = (Alumno) jComboAlumnos.getSelectedItem();
        if (seleccionadoA == null) {
            modelo.setRowCount(0);
            return;
        }
        Materia seleccionadoM = (Materia) jComboMaterias.getSelectedItem();
        if (seleccionadoM == null) {
            modelo.setRowCount(0);
            return;
        }
        
        seleccionadoA.agregarMateria(seleccionadoM);
        JOptionPane.showMessageDialog(this, seleccionadoA.getNombre() + " se ha inscripto en " + seleccionadoM.getNombre(), "Exito", JOptionPane.INFORMATION_MESSAGE);

        jComboAlumnos.setSelectedItem(null);
        jComboMaterias.setSelectedItem(null);

    }//GEN-LAST:event_jBotonInscribirseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonInscribirse;
    private javax.swing.JComboBox<Alumno> jComboAlumnos;
    private javax.swing.JComboBox<Materia> jComboMaterias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelListaMaterias;
    // End of variables declaration//GEN-END:variables

    
    private void armarCabecera(){
        modelo.addColumn("Id_Materia");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
    }
    
    private void verMaterias(){
        
         for (Materia a : Menu.materias) { Object[] fila = { a.getIdmateria(), a.getNombre(), a.getAnio()}; 
            modelo.addRow(fila);
        }
        if (Menu.materias.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay Materias registradas.", "Sin datos", JOptionPane.INFORMATION_MESSAGE);
            return;
            
        }
    }


    
/* 
             /\_/\           ___
            = o_o =_______    \ \ 
             __^      __(  \.__) )
         (@)<_____>__(_____)____/
 */

}
