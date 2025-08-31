
package Ventanas.Materias;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import practico4.ejercicio1.Alumno;
import practico4.ejercicio1.Materia;
import practico4.ejercicio1.Menu;


public class MateriasIncriptas extends javax.swing.JInternalFrame {
    
    private DefaultTableModel modelo = new  DefaultTableModel();
    
    private void cargarCombo() {
        jComboAlumnos.removeAllItems();
        jComboAlumnos.addItem(null); 
        for (Alumno a : Menu.alumnos) {
            jComboAlumnos.addItem(a); 
        }

    }
    
    private void mostrarMaterias(Alumno a) {
        modelo.setRowCount(0);

        if (a.getMaterias().isEmpty()) {
            JOptionPane.showMessageDialog(this, a.getNombre() + " no esta inscripto en ninguna materia :/  ");
            return;
        }

        for (Materia m : a.getMaterias()) {
            Object[] fila = {m.getIdmateria(), m.getNombre(), m.getAnio()};
            modelo.addRow(fila);
        }
    }
    
    public MateriasIncriptas() {
        initComponents();
        this.setSize(500, 500);
        
        jTable1.setModel(modelo);
        armarCabecera();
        verMaterias();
        cargarCombo();
        modelo.setRowCount(0);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelListaMaterias = new javax.swing.JLabel();
        jComboAlumnos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Materias Insciptas");

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("Elija al Alumno");

        jLabelListaMaterias.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabelListaMaterias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelListaMaterias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgFormulario.png"))); // NOI18N
        jLabelListaMaterias.setText("Materias Inscriptas");

        jComboAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboAlumnosActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabelListaMaterias)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboAlumnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(83, 83, 83))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelListaMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboAlumnosActionPerformed
        
        Alumno seleccionado = (Alumno) jComboAlumnos.getSelectedItem();
        
        if (seleccionado == null) {
            modelo.setRowCount(0);
            return;
        }

        mostrarMaterias(seleccionado);
        
    }//GEN-LAST:event_jComboAlumnosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Alumno> jComboAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelListaMaterias;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
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
