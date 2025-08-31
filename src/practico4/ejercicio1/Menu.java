package practico4.ejercicio1;

import Ventanas.Alumnos.BorrarAlumno;
import Ventanas.Alumnos.RegistarAlumnos;
import Ventanas.Alumnos.VerAlumnos;
import Ventanas.Materias.MateriasIncriptas;
import Ventanas.Materias.VerMaterias;
import Ventanas.Registrarse.Register;
import Ventanas.Registrarse.RegistrarMateria;
import java.util.HashSet;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Menu.class.getName());
    
    public static HashSet<Alumno> alumnos = new HashSet<>();
    public static HashSet<Materia> materias = new HashSet<>();
    
    
    public Menu() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        materias.add(new Materia(1, "Matemática I", 1));
        materias.add(new Materia(2, "Algoritmos", 1));
        materias.add(new Materia(3, "Análisis II", 2));
        
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jAlumnos = new javax.swing.JMenu();
        jVerAlumnos = new javax.swing.JMenuItem();
        jAgregarAlumnos = new javax.swing.JMenuItem();
        jBorrarAlumno = new javax.swing.JMenuItem();
        jMaterias = new javax.swing.JMenu();
        jVerMaterias = new javax.swing.JMenuItem();
        jMateriasIncriptas = new javax.swing.JMenuItem();
        jRegister = new javax.swing.JMenu();
        jRegisterMaterias = new javax.swing.JMenuItem();
        jbotonrRegisMateria = new javax.swing.JMenuItem();
        jSalir = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgEscritorio.jpg"))); // NOI18N

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(185, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jAlumnos.setText("Alumno");

        jVerAlumnos.setText("Ver Alumnos");
        jVerAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVerAlumnosActionPerformed(evt);
            }
        });
        jAlumnos.add(jVerAlumnos);

        jAgregarAlumnos.setText("Agregar Alumno");
        jAgregarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarAlumnosActionPerformed(evt);
            }
        });
        jAlumnos.add(jAgregarAlumnos);

        jBorrarAlumno.setText("Borrar un Alumno");
        jBorrarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBorrarAlumnoActionPerformed(evt);
            }
        });
        jAlumnos.add(jBorrarAlumno);

        jMenuBar1.add(jAlumnos);

        jMaterias.setText("Materias");

        jVerMaterias.setText("Ver Materias");
        jVerMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVerMateriasActionPerformed(evt);
            }
        });
        jMaterias.add(jVerMaterias);

        jMateriasIncriptas.setText("Materias Incriptas");
        jMateriasIncriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMateriasIncriptasActionPerformed(evt);
            }
        });
        jMaterias.add(jMateriasIncriptas);

        jMenuBar1.add(jMaterias);

        jRegister.setText("Registrarse");

        jRegisterMaterias.setText("Inscribirse  a una Materias");
        jRegisterMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegisterMateriasActionPerformed(evt);
            }
        });
        jRegister.add(jRegisterMaterias);

        jbotonrRegisMateria.setText("Registrar una Materia");
        jbotonrRegisMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbotonrRegisMateriaActionPerformed(evt);
            }
        });
        jRegister.add(jbotonrRegisMateria);

        jMenuBar1.add(jRegister);

        jSalir.setText("Salir");
        jSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSalirMouseClicked(evt);
            }
        });
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jAgregarAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarAlumnosActionPerformed
        
        RegistarAlumnos agregaralumno = new RegistarAlumnos();
        jDesktopPane1.add(agregaralumno);
        agregaralumno.setVisible(true);
        
    }//GEN-LAST:event_jAgregarAlumnosActionPerformed

    private void jVerAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVerAlumnosActionPerformed
         
        if (Menu.alumnos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay alumnos registrados.", "Sin datos", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        VerAlumnos veralu = new VerAlumnos();
        jDesktopPane1.add(veralu);
        veralu.setVisible(true);
        
    }//GEN-LAST:event_jVerAlumnosActionPerformed

    private void jBorrarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBorrarAlumnoActionPerformed
        
        BorrarAlumno borrar = new BorrarAlumno();
        jDesktopPane1.add(borrar);
        borrar.setVisible(true);
        
    }//GEN-LAST:event_jBorrarAlumnoActionPerformed

    private void jVerMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVerMateriasActionPerformed
        
        VerMaterias materiasver = new VerMaterias();
        jDesktopPane1.add(materiasver);
        materiasver.setVisible(true);
    }//GEN-LAST:event_jVerMateriasActionPerformed

    private void jMateriasIncriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMateriasIncriptasActionPerformed
        
        MateriasIncriptas incriptas= new MateriasIncriptas();
        jDesktopPane1.add(incriptas);
        incriptas.setVisible(true);
        
    }//GEN-LAST:event_jMateriasIncriptasActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
    }//GEN-LAST:event_jSalirActionPerformed

    private void jSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSalirMouseClicked
        int respuesta = JOptionPane.showConfirmDialog(this,  "Esta seguro ?","Confirmar Salir",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
    if (respuesta == JOptionPane.YES_OPTION) {
        dispose();
        System.exit(0);
    }
    
    }//GEN-LAST:event_jSalirMouseClicked

    private void jRegisterMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegisterMateriasActionPerformed
        
        Register incriptas= new Register();
        jDesktopPane1.add(incriptas);
        incriptas.setVisible(true);
        
    }//GEN-LAST:event_jRegisterMateriasActionPerformed

    private void jbotonrRegisMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbotonrRegisMateriaActionPerformed
        RegistrarMateria epico = new RegistrarMateria();
        jDesktopPane1.add(epico);
        epico.setVisible(true);
    }//GEN-LAST:event_jbotonrRegisMateriaActionPerformed
    
    
    
    public static void main(String args[]) {
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> new Menu().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jAgregarAlumnos;
    private javax.swing.JMenu jAlumnos;
    private javax.swing.JMenuItem jBorrarAlumno;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMaterias;
    private javax.swing.JMenuItem jMateriasIncriptas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jRegister;
    private javax.swing.JMenuItem jRegisterMaterias;
    private javax.swing.JMenu jSalir;
    private javax.swing.JMenuItem jVerAlumnos;
    private javax.swing.JMenuItem jVerMaterias;
    private javax.swing.JMenuItem jbotonrRegisMateria;
    // End of variables declaration//GEN-END:variables
}


/* 
             /\_/\           ___
            = o_o =_______    \ \ 
             __^      __(  \.__) )
         (@)<_____>__(_____)____/
 */