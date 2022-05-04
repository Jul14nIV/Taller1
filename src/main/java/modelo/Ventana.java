package modelo;

import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bcast
 */
public class Ventana extends JFrame {

    //Atributos tabla
    private DefaultTableModel dfTable;
    private Object[] o = new Object[4];
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    public static LinkedList contenedor = new LinkedList();

    private JPanel panel;
    private JLabel nombreL;
    private JLabel matriculaL;
    private JLabel carreraL;
    private JLabel correoL;
    private JTextField nombreTF;
    private JTextField matriculaTF;
    private JTextField carreraTF;
    private JTextField correoTF;
    private JButton limpiar;
    private JButton agregar;
    private JButton eliminar;
    private JTable tabla;
    private JScrollPane scroll;

    public Ventana() {
        this.panel = new JPanel();
        this.nombreL = new JLabel("Nombre");
        this.matriculaL = new JLabel("Matricula");
        this.carreraL = new JLabel("Carrera");
        this.correoL = new JLabel("Correo");
        this.nombreTF = new JTextField();
        this.matriculaTF = new JTextField();
        this.carreraTF = new JTextField();
        this.correoTF = new JTextField();
        this.limpiar = new JButton("Limpiar");
        this.agregar = new JButton("Agregar");
        this.eliminar = new JButton("Eliminar");
        this.tabla = new JTable();
        this.scroll = new JScrollPane();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.agregarComponentes();

    }

    public void agregarComponentes() {
        tabla.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Nombre", "Matricula", "Carrera", "Correo"
                }
        ));
        scroll.setViewportView(tabla);
        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(scroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(matriculaL)
                                                        .addComponent(nombreL))
                                                .addGap(18, 18, 18)
                                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(matriculaTF, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                        .addComponent(nombreTF))
                                                .addGap(42, 42, 42)
                                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(carreraL)
                                                        .addComponent(correoL))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(correoTF, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                        .addComponent(carreraTF))))
                                .addContainerGap(30, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(nombreL)
                                                        .addComponent(nombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(carreraL)
                                                        .addComponent(carreraTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(correoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(matriculaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(matriculaL))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(correoL)
                                                .addGap(18, 18, 18)))
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(eliminar)
                                        .addComponent(agregar)
                                        .addComponent(limpiar))
                                .addGap(18, 18, 18)
                                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    public void llenarTabla(Estudiante e) {
        this.estudiantes.add(e);
        o[0] = e.getNombre();
        o[1] = e.getMatricula();
        o[2] = e.getCarrera();
        o[3] = e.getCorreo();
        dfTable.addRow(o);
        
    }

    public void eliminarEstudiante() {
        int fila = this.tabla.getSelectedRow();
        if (fila >= 0) {
            this.estudiantes.remove(fila);
            dfTable.removeRow(fila);
        }
    }
    
    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {

        int fila = tabla.getRowCount();
        for (int i = fila - 1; i >= 0; i--) {
            dfTable.removeRow(i);
        }

    }

    private void agregarActionPerfomed(java.awt.event.ActionEvent evt) {       
        
        String []o=new String[4];
        o[0]=nombreTF.getText();
        o[1]=nombreTF.getText();
        o[2]=nombreTF.getText();
        o[3]=nombreTF.getText();
        dfTable.addRow(o);
        
        //LIMPIAR CAMPOS DESPUES DE GUARDAR
        nombreTF.setText("");
        matriculaTF.setText("");
        carreraTF.setText("");
        correoTF.setText("");
        
    }
    
    private void eliminarActionPerfomed(java.awt.event.ActionEvent evt){
        eliminarEstudiante();
    
    }
    

}