package Ventanas.Alumnos;

import javax.swing.JOptionPane;
import practico4.ejercicio1.Alumno;
import practico4.ejercicio1.Menu;

public class RegistarAlumnos extends javax.swing.JInternalFrame {
    public RegistarAlumnos() {
        initComponents();
        
        this.setSize(500, 500);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jNombre = new javax.swing.JTextField();
        jLegajoAlumno = new javax.swing.JTextField();
        jApellido = new javax.swing.JTextField();
        jBotonRegister = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registrar Alumno");

        jNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNombreActionPerformed(evt);
            }
        });

        jLegajoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLegajoAlumnoActionPerformed(evt);
            }
        });

        jApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jApellidoActionPerformed(evt);
            }
        });

        jBotonRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgRegister.png"))); // NOI18N
        jBotonRegister.setText("Registrar Alumno");
        jBotonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonRegisterActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setText("Legajo Alumno");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setText("Apellido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBotonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLegajoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLegajoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jBotonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNombreActionPerformed
    }//GEN-LAST:event_jNombreActionPerformed
    private void jLegajoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLegajoAlumnoActionPerformed
    }//GEN-LAST:event_jLegajoAlumnoActionPerformed
    private void jApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jApellidoActionPerformed
    }//GEN-LAST:event_jApellidoActionPerformed
    
    // BOTON REGISTER ALUMNO 
    private void jBotonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonRegisterActionPerformed
        
        String nombre = jNombre.getText();
        String LegajoA = jLegajoAlumno.getText();
        String apellido =  jApellido.getText();
        
        // NO DEJAR QUE DEJA ALGO VACIO
        if(LegajoA.isEmpty()){
            JOptionPane.showMessageDialog(null, "Legajo no puede estar vacio..");
            return;
        }
         if(nombre.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nombre no puede estar vacio..");
            return;
        }
         if(apellido.isEmpty()){
            JOptionPane.showMessageDialog(null, "Apellido no puede estar vacio..");
            return;
        }
        // NO DEJAR QUE DEJA ALGO VACIO
        
        // CONVERTIR LEGAJO A INT  Y MAS VERIFICACIONES//
        int legajoint;
            try {
                legajoint = Integer.parseInt(LegajoA);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Numero no valido. :/");
                return;
         }
         if(legajoint <= 0){
             JOptionPane.showMessageDialog(null, "El numero no puede ser negativo. :%");
             return;
         } 
         if(legajoint > 99999){
             JOptionPane.showMessageDialog(null, "El numero no puede superar los 5 digitos :/");
             return;
         }
         // CONVERTIR LEGAJO A INT  Y MAS VERIFICACIONES//
         
         // AGREGAR ALUMNO //
         Alumno nuevoAlumno = new Alumno(legajoint, apellido, nombre);
         if (Menu.alumnos.contains(nuevoAlumno)) {
            JOptionPane.showMessageDialog(null, "Ya existe un alumno con ese legajo.");
            return;
        }
         Menu.alumnos.add(nuevoAlumno);
        JOptionPane.showMessageDialog(null, "Alumno registrado: \n"+"\n"+ "Legajo: "+ legajoint + "\n"+ "Nombre: "+ nombre + "\n"+"Apellido: "+ apellido + "\n"+ "\n"+ "Añadido Exitosamente");
        // AGREGAR ALUMNO //
        
        // LIMPIAR TEXTO //s
        jLegajoAlumno.setText("");
        jNombre.setText("");
        jApellido.setText("");
        // LIMPIAR TEXTO //
        
        
        
    }//GEN-LAST:event_jBotonRegisterActionPerformed
    // BOTON REGISTER ALUMNO 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jApellido;
    private javax.swing.JButton jBotonRegister;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jLegajoAlumno;
    private javax.swing.JTextField jNombre;
    // End of variables declaration//GEN-END:variables
}


/* 
             /\_/\           ___
            = o_o =_______    \ \ 
             __^      __(  \.__) )
         (@)<_____>__(_____)____/
 */