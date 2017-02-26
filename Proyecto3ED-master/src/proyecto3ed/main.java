package proyecto3ed;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.graphstream.algorithm.Dijkstra;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.Path;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.ui.view.Viewer;

public class main extends javax.swing.JFrame {

    Graph graph;

    public main() {
        initComponents();
        graph = new MultiGraph("CIUDADES");
        graph.setStrict(false);
        graph.setAutoCreate(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdCities = new javax.swing.JDialog();
        tfCity1 = new javax.swing.JTextField();
        tfCity2 = new javax.swing.JTextField();
        jlName1 = new javax.swing.JLabel();
        jlName2 = new javax.swing.JLabel();
        bVerify = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taResult = new javax.swing.JTextArea();
        cb_eleccion = new javax.swing.JComboBox<>();
        btnShow = new javax.swing.JButton();
        btnCities = new javax.swing.JButton();
        lTitulo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi_cargar = new javax.swing.JMenuItem();
        jmi_salir = new javax.swing.JMenuItem();

        jlName1.setText("De:");

        jlName2.setText("A:");

        bVerify.setText("Verificar Ruta");
        bVerify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bVerifyMouseClicked(evt);
            }
        });

        taResult.setEditable(false);
        taResult.setColumns(20);
        taResult.setRows(5);
        jScrollPane1.setViewportView(taResult);

        cb_eleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Distancia", "Precio" }));

        javax.swing.GroupLayout jdCitiesLayout = new javax.swing.GroupLayout(jdCities.getContentPane());
        jdCities.getContentPane().setLayout(jdCitiesLayout);
        jdCitiesLayout.setHorizontalGroup(
            jdCitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdCitiesLayout.createSequentialGroup()
                .addGroup(jdCitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jdCitiesLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jdCitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlName1)
                            .addComponent(jlName2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jdCitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfCity2, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(tfCity1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addGroup(jdCitiesLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(cb_eleccion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bVerify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jdCitiesLayout.createSequentialGroup()
                        .addGap(0, 26, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        jdCitiesLayout.setVerticalGroup(
            jdCitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdCitiesLayout.createSequentialGroup()
                .addGroup(jdCitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdCitiesLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jdCitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlName1))
                        .addGap(18, 18, 18)
                        .addGroup(jdCitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCity2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlName2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_eleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jdCitiesLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(bVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnShow.setText("Dibujar Grafo");
        btnShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnShowMouseClicked(evt);
            }
        });

        btnCities.setText("Verificar Rutas");
        btnCities.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCitiesMouseClicked(evt);
            }
        });

        lTitulo.setFont(new java.awt.Font("Old English Text MT", 1, 24)); // NOI18N
        lTitulo.setForeground(new java.awt.Color(51, 51, 255));
        lTitulo.setText("Red de Aeropuertos");

        jMenu1.setText("File");

        jmi_cargar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jmi_cargar.setText("Cargar Archivo");
        jmi_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_cargarActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_cargar);

        jmi_salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jmi_salir.setText("Salir");
        jmi_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_salirActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_salir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 75, Short.MAX_VALUE)
                .addComponent(lTitulo)
                .addGap(72, 72, 72))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCities, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCities, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowMouseClicked
        if (graph.getEachNode() != null) {
            Viewer viewer = graph.display();
            viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);

        } else {
            JOptionPane.showMessageDialog(this, "No hay un graph creado, cargue datos a partir de un archivo txt primero!");
        }
    }//GEN-LAST:event_btnShowMouseClicked


    private void btnCitiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCitiesMouseClicked
        if (graph.getEachNode() != null) {
            jdCities.setModal(true);
            jdCities.setLocationRelativeTo(this);
            jdCities.pack();
            tfCity1.setText("");
            tfCity2.setText("");
            taResult.setText("");
            jdCities.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No hay un graph creado, cargue datos a partir de un archivo txt primero!");
        }
    }//GEN-LAST:event_btnCitiesMouseClicked

    private void bVerifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVerifyMouseClicked
        taResult.setText("");
        if (tfCity1.getText().equals("") || tfCity2.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese ambos nombres (correctos) para poder verificar su Ruta");
        } else {
            taResult.setText("");
            Edge ciudad1 = graph.getEdge(tfCity1.getText() + tfCity2.getText());
            Edge ciudad2 = graph.getEdge(tfCity2.getText() + tfCity1.getText());
            if (ciudad1 != null && ciudad2 != null) {
                tfCity1.setText("");
                tfCity2.setText("");
            } else {
                Node person1 = graph.getNode(tfCity1.getText());
                Node person2 = graph.getNode(tfCity2.getText());
                tfCity1.setText("");
                tfCity2.setText("");
                Dijkstra dijkstra = new Dijkstra(Dijkstra.Element.EDGE, null, this.cb_eleccion.getSelectedItem().toString());
                dijkstra.init(graph);
                dijkstra.setSource(person1);
                dijkstra.compute();

                Path camino = dijkstra.getPath(person2);
                Graph grafo;
                grafo = new MultiGraph("CIUDADES");
                String cities[] = new String[200];
                grafo.setStrict(false);
                grafo.setAutoCreate(false);
                Node principal;
                if (!camino.getEdgePath().isEmpty()) {
                    principal = person1;
                } else {
                    principal = null;
                }
                if (!camino.getEdgePath().isEmpty() && principal != null) {
                    if (camino.getEdgePath().size() > 1) {
                        String separator = "";
                        for (Edge edge : camino.getEdgePath()) {
                            if (edge.getTargetNode() == (principal == person1 ? person2 : person1)) {
                                separator = "";
                            } else {
                                separator = "->";
                            }
                            taResult.append(edge.getTargetNode().getId() + separator);
                            Node nd = edge.getTargetNode();
                            grafo.addNode(nd.getId()).addAttribute("ui.label", edge.getOpposite(nd).getId());
                            grafo.addNode(edge.getOpposite(nd).getId()).addAttribute("ui.label", edge.getTargetNode().getId());
                            grafo.addEdge(edge.getOpposite(nd).getId()+edge.getTargetNode().getId(),edge.getOpposite(nd),nd,true);
                        }
                    }
                    grafo.removeNode(grafo.getNodeCount()-1);
                    grafo.removeEdge(grafo.getEdgeCount()-1);
                    Viewer viewer = grafo.display(true);
                    viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
                } else {
                    taResult.append("\n-" + "Entre " + person1.getId() + " y " + person2.getId() + " no existe ruta");
                }
            }
        }
    }//GEN-LAST:event_bVerifyMouseClicked

    private void jmi_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_cargarActionPerformed
        try {
            String dir = System.getProperty("user.home");
            JFileChooser chooser = new JFileChooser(dir + "/Escritorio");
            FileFilter filter;
            filter = new FileNameExtensionFilter("Solo archivos txt", "txt");
            chooser.setAcceptAllFileFilterUsed(false);
            chooser.setFileFilter(filter);
            chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                if (chooser.getSelectedFile().getName().endsWith(".txt")) {
                    File file = chooser.getSelectedFile();
                    FileReader in = new FileReader(file);
                    BufferedReader reader = new BufferedReader(in);
                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (line.contains(",")) {
                            String[] vertexs = line.split(",");
                            Node nodo1 = null;
                            Node nodo2 = null;
                            if (graph.getNode(vertexs[0]) == null) {
                                graph.addNode(vertexs[0]);
                                System.out.println(vertexs[0]);
                                nodo1 = graph.getNode(vertexs[0]);
                                nodo1.addAttribute("ui.label", vertexs[0]);

                            } else {
                                nodo1 = graph.getNode(vertexs[0]);
                            }
                            if (graph.getNode(vertexs[1]) == null) {
                                graph.addNode(vertexs[1]);
                                System.out.println(vertexs[1]);
                                nodo2 = graph.getNode(vertexs[1]);
                                nodo2.setAttribute("ui.label", vertexs[1]);
                            } else {
                                nodo2 = graph.getNode(vertexs[1]);
                            }
                            if (graph.getEdge(nodo1.getId() + nodo2.getId()) == null) {
                                graph.addEdge(nodo1.getId() + nodo2.getId(), nodo1, nodo2, true).addAttribute("Precio", vertexs[3]);
                                graph.getEdge(nodo1.getId() + nodo2.getId()).addAttribute("Distancia", vertexs[4]);
                            }
                        }
                    }

                    JOptionPane.showMessageDialog(this, "Se cargaron los datos al graph con exito!");
                    reader.close();
                    in.close();
                } else {
                    JOptionPane.showMessageDialog(this, "Archivo invalido, debe cargar un archivo .txt!");
                }
            }
        } catch (IOException | NullPointerException e) {
            graph.clear();
            JOptionPane.showMessageDialog(this, "Ocurrio un error cargando los datos. Revise si el archivo txt tiene el formato correcto (Persona1,Persona2)");
        }
    }//GEN-LAST:event_jmi_cargarActionPerformed

    private void jmi_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_salirActionPerformed
        graph.clear();
        System.exit(0);
    }//GEN-LAST:event_jmi_salirActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bVerify;
    private javax.swing.JButton btnCities;
    private javax.swing.JButton btnShow;
    private javax.swing.JComboBox<String> cb_eleccion;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDialog jdCities;
    private javax.swing.JLabel jlName1;
    private javax.swing.JLabel jlName2;
    private javax.swing.JMenuItem jmi_cargar;
    private javax.swing.JMenuItem jmi_salir;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JTextArea taResult;
    private javax.swing.JTextField tfCity1;
    private javax.swing.JTextField tfCity2;
    // End of variables declaration//GEN-END:variables
    protected boolean loop = true;
}
