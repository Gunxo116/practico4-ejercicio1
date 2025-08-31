package Ventanas.Materias;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import practico4.ejercicio1.Materia;
import practico4.ejercicio1.Menu;

public class VerMaterias extends javax.swing.JInternalFrame {
    
    private DefaultTableModel modelo = new  DefaultTableModel();

    public VerMaterias() {
        initComponents();
        
        this.setSize(500, 500);
        jTable1.setModel(modelo);
        armarCabecera();
        verMaterias();
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelListaMaterias = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBotonRecargar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ver Materias");

        jLabelListaMaterias.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabelListaMaterias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelListaMaterias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgMaterias.png"))); // NOI18N
        jLabelListaMaterias.setText("Lista de Materias");

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

        jBotonRecargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgRecargar.png"))); // NOI18N
        jBotonRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonRecargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBotonRecargar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabelListaMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelListaMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBotonRecargar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonRecargarActionPerformed
        modelo.setRowCount(0);

        if (Menu.materias.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay Materias registradas.", "Sin datos", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (Materia a : Menu.materias) { Object[] fila = { a.getIdmateria(), a.getNombre(), a.getAnio()};
            modelo.addRow(fila);
        }

    }//GEN-LAST:event_jBotonRecargarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonRecargar;
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
