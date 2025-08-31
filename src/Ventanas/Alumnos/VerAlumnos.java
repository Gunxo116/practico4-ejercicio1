package Ventanas.Alumnos;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import practico4.ejercicio1.Alumno;
import practico4.ejercicio1.Menu;

public class VerAlumnos extends javax.swing.JInternalFrame {
    
    private DefaultTableModel modelo = new  DefaultTableModel();
    
    public VerAlumnos() {
        initComponents();
        
        this.setSize(500, 500);
        jTableAlumnos.setModel(modelo);
        armarCabecera();
        verAlumnos();
        
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlumnos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jBotonRecargar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Alumnos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableAlumnos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableAlumnos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 390, 330));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgAlumno.png"))); // NOI18N
        jLabel1.setText("Lista de Alumnos ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 280, 50));

        jBotonRecargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgRecargar.png"))); // NOI18N
        jBotonRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonRecargarActionPerformed(evt);
            }
        });
        getContentPane().add(jBotonRecargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 50, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonRecargarActionPerformed
        modelo.setRowCount(0);
        
        if (Menu.alumnos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay alumnos registrados.", "Sin datos", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (Alumno a : Menu.alumnos) { Object[] fila = { a.getLegajo(), a.getNombre(), a.getApellido() }; 
            modelo.addRow(fila);
        }
        
        
    }//GEN-LAST:event_jBotonRecargarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonRecargar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlumnos;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera(){
        modelo.addColumn("Legajo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apallido");
    }
    
    private void verAlumnos(){
        
        for (Alumno a : Menu.alumnos) { Object[] fila = { a.getLegajo(), a.getNombre(), a.getApellido() }; 
            modelo.addRow(fila);
        }
        if (Menu.alumnos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay alumnos registrados.", "Sin datos", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
    }

}


/* 
             /\_/\           ___
            = o_o =_______    \ \ 
             __^      __(  \.__) )
         (@)<_____>__(_____)____/
 */
    





