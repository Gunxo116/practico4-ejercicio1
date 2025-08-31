package Ventanas.Alumnos;

import javax.swing.JOptionPane;
import practico4.ejercicio1.Alumno;
import practico4.ejercicio1.Menu;

public class BorrarAlumno extends javax.swing.JInternalFrame {

    public BorrarAlumno() {
        initComponents();
        
        this.setSize(500, 500);
        congfing();
        
    }
   
    private void congfing() {
        
        BuscarPor1.add(jRadioLegajo);
        BuscarPor1.add(jRadioNombre);
        BuscarPor1.add(jRadioApellido);
        
        jRadioLegajo.setSelected(true);
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BuscarPor1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioLegajo = new javax.swing.JRadioButton();
        jRadioApellido = new javax.swing.JRadioButton();
        jRadioNombre = new javax.swing.JRadioButton();
        jboton = new javax.swing.JLabel();
        jTextBuscardor = new javax.swing.JTextField();
        jBotonBusca = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Borrar un Alumno");

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("Buscar y Borrar Alumno");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setText("Ingresar: ");

        jRadioLegajo.setText("Legajo");

        jRadioApellido.setText("Apellido");

        jRadioNombre.setText("Nombre");

        jboton.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jboton.setText("Buscar por:");

        jTextBuscardor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscardorActionPerformed(evt);
            }
        });

        jBotonBusca.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jBotonBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgBuscar.png"))); // NOI18N
        jBotonBusca.setText("Buscar");
        jBotonBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonBuscaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jboton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioLegajo)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioNombre)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioApellido))
                            .addComponent(jTextBuscardor)))
                    .addComponent(jLabel1))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jBotonBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioLegajo)
                            .addComponent(jRadioApellido)
                            .addComponent(jRadioNombre)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jboton)))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextBuscardor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(50, 50, 50)
                .addComponent(jBotonBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextBuscardorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscardorActionPerformed
    }//GEN-LAST:event_jTextBuscardorActionPerformed

    private void jBotonBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonBuscaActionPerformed
        
        String x = jTextBuscardor.getText().trim();
        if (x.isEmpty()) {
            if (jRadioLegajo.isSelected()) {
                JOptionPane.showMessageDialog(this, "El legajo no puede estar vacío.");
            } else if (jRadioNombre.isSelected()) {
                JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío.");
            } else if (jRadioApellido.isSelected()) {
                JOptionPane.showMessageDialog(this, "El apellido no puede estar vacío.");
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, seleccione un criterio de búsqueda.");
            }
            return;
        }
      
         // SELECCION LEGAJO // 
         if (jRadioLegajo.isSelected()) {
             
             int legajo;
             try{
                 legajo = Integer.parseInt(x);
             }catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Numero no valido. :/");
                    return;
             }
             if(legajo <= 0){
                 JOptionPane.showMessageDialog(null, "El numero no puede ser negativo. :%");
                 return;
             } 
             if(legajo > 99999){
                 JOptionPane.showMessageDialog(null, "El numero no puede superar los 5 digitos :/");
                 return;
             }

             boolean encontrado=false;
            
             for (Alumno a : Menu.alumnos) {
                if (a.getLegajo() == legajo) {
                    int confirmar = JOptionPane.showConfirmDialog(this, 
                     "Alumno Encontrado: \n"+ "Legajo: "+ a.getLegajo() + "\n"+ "Nombre: "+ a.getNombre()+ "\n"+"Apellido: "+ a.getApellido() + "\n"+ "\n" +"Borrar Alumno? "+  JOptionPane.YES_NO_OPTION );
                    
                    if (confirmar == JOptionPane.YES_OPTION) {
                        Menu.alumnos.remove(a);
                        JOptionPane.showMessageDialog(this, "Alumno eliminado con éxito.");
                    } else {
                        JOptionPane.showMessageDialog(this, "Borrado cancelado.");
                    }
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "No se encontraron alumnos con ese Legajo '" + x + "'");
            }
            jTextBuscardor.setText("");
            
         // SELECCION NOMBRE //
         } else if (jRadioNombre.isSelected()) {
             
             boolean encontrado=false;
            
             for (Alumno a : Menu.alumnos) {
                if (a.getNombre().equalsIgnoreCase(x)) {
                    int confirmar = JOptionPane.showConfirmDialog(this, 
                     "Alumno Encontrado: \n"+ "Legajo: "+ a.getLegajo() + "\n"+ "Nombre: "+ a.getNombre()+ "\n"+"Apellido: "+ a.getApellido() + "\n"+ "\n" +"Borrar Alumno? "+  JOptionPane.YES_NO_OPTION );
                    
                    if (confirmar == JOptionPane.YES_OPTION) {
                        Menu.alumnos.remove(a);
                        JOptionPane.showMessageDialog(this, "Alumno eliminado con éxito.");
                    } else {
                        JOptionPane.showMessageDialog(this, "Borrado cancelado.");
                    }
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "No se encontraron alumnos con nombre '" + x + "'");
            }
            jTextBuscardor.setText("");
             
         // SELECCION APELLIDO //
         } else if (jRadioApellido.isSelected()) {
            
             boolean encontrado=false;
            
             for (Alumno a : Menu.alumnos) {
                if (a.getApellido().equalsIgnoreCase(x)) {
                    int confirmar = JOptionPane.showConfirmDialog(this, 
                     "Alumno Encontrado: \n"+ "Legajo: "+ a.getLegajo() + "\n"+ "Nombre: "+ a.getNombre()+ "\n"+"Apellido: "+ a.getApellido() + "\n"+ "\n" +"Borrar Alumno? "+  JOptionPane.YES_NO_OPTION );
                    
                    if (confirmar == JOptionPane.YES_OPTION) {
                        Menu.alumnos.remove(a);
                        JOptionPane.showMessageDialog(this, "Alumno eliminado con éxito.");
                    } else {
                        JOptionPane.showMessageDialog(this, "Borrado cancelado.");
                    }
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "No se encontraron alumnos con ese Apellido '" + x + "'");
            }
            jTextBuscardor.setText("");
             
         } else {
            JOptionPane.showMessageDialog(this, "Seleccione un criterio de búsqueda.");
         }
         
         
         
    }//GEN-LAST:event_jBotonBuscaActionPerformed
         

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BuscarPor1;
    private javax.swing.JButton jBotonBusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioApellido;
    private javax.swing.JRadioButton jRadioLegajo;
    private javax.swing.JRadioButton jRadioNombre;
    private javax.swing.JTextField jTextBuscardor;
    private javax.swing.JLabel jboton;
    // End of variables declaration//GEN-END:variables



/* 
             /\_/\           ___
            = o_o =_______    \ \ 
             __^      __(  \.__) )
         (@)<_____>__(_____)____/
 */       
    
}

