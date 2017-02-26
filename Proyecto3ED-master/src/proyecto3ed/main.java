package proyecto3ed;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
import static org.graphstream.algorithm.Toolkit.diameter;

public class main extends javax.swing.JFrame {

    Graph grafo;

    public main() {
        initComponents();
        grafo = new MultiGraph("CIUDADES");
        grafo.setStrict(false);
        grafo.setAutoCreate(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdFriends = new javax.swing.JDialog();
        tfCity1 = new javax.swing.JTextField();
        tfCity2 = new javax.swing.JTextField();
        jlName1 = new javax.swing.JLabel();
        jlName2 = new javax.swing.JLabel();
        bVerify = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taResult = new javax.swing.JTextArea();
        cb_eleccion = new javax.swing.JComboBox<>();
        bLoad = new javax.swing.JButton();
        bDraw = new javax.swing.JButton();
        bFriends = new javax.swing.JButton();
        lTitulo = new javax.swing.JLabel();
        bExit = new javax.swing.JButton();

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

        javax.swing.GroupLayout jdFriendsLayout = new javax.swing.GroupLayout(jdFriends.getContentPane());
        jdFriends.getContentPane().setLayout(jdFriendsLayout);
        jdFriendsLayout.setHorizontalGroup(
            jdFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdFriendsLayout.createSequentialGroup()
                .addGroup(jdFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jdFriendsLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jdFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlName1)
                            .addComponent(jlName2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jdFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfCity2, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(tfCity1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addGroup(jdFriendsLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(cb_eleccion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bVerify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jdFriendsLayout.createSequentialGroup()
                        .addGap(0, 26, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        jdFriendsLayout.setVerticalGroup(
            jdFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdFriendsLayout.createSequentialGroup()
                .addGroup(jdFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdFriendsLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jdFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlName1))
                        .addGap(18, 18, 18)
                        .addGroup(jdFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCity2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlName2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_eleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jdFriendsLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(bVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bLoad.setText("Cargar archivo txt");
        bLoad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bLoadMouseClicked(evt);
            }
        });

        bDraw.setText("Dibujar Grafo");
        bDraw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bDrawMouseClicked(evt);
            }
        });

        bFriends.setText("Verificar Rutas");
        bFriends.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bFriendsMouseClicked(evt);
            }
        });

        lTitulo.setFont(new java.awt.Font("Old English Text MT", 1, 24)); // NOI18N
        lTitulo.setForeground(new java.awt.Color(51, 51, 255));
        lTitulo.setText("Red de Aeropuertos");

        bExit.setText("Salir");
        bExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 75, Short.MAX_VALUE)
                .addComponent(lTitulo)
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bDraw, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bFriends, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(bExit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo)
                .addGap(27, 27, 27)
                .addComponent(bLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bDraw, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bFriends, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bExit)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bLoadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bLoadMouseClicked
        try {
            String dir = System.getProperty("user.home");
            JFileChooser chooser = new JFileChooser(dir + "/Desktop");
            FileFilter filter = new FileNameExtensionFilter(null, "txt");
            chooser.setAcceptAllFileFilterUsed(false);
            chooser.setFileFilter(filter);
            chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                if (chooser.getSelectedFile().getName().endsWith("txt")) {
                    File file = chooser.getSelectedFile();
                    FileReader in = new FileReader(file);
                    BufferedReader reader = new BufferedReader(in);
                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (line.contains(",")) {
                            String[] vertices = line.split(",");
                            Node nodo1 = null;
                            Node nodo2 = null;
                            if (grafo.getNode(vertices[0]) == null) {
                                grafo.addNode(vertices[0]);
                                System.out.println(vertices[0]);
                                nodo1 = grafo.getNode(vertices[0]);
                                nodo1.addAttribute("ui.label", vertices[0]);

                            } else {
                                nodo1 = grafo.getNode(vertices[0]);
                            }
                            if (grafo.getNode(vertices[1]) == null) {
                                grafo.addNode(vertices[1]);
                                System.out.println(vertices[1]);
                                nodo2 = grafo.getNode(vertices[1]);
                                nodo2.setAttribute("ui.label", vertices[1]);
                            } else {
                                nodo2 = grafo.getNode(vertices[1]);
                            }
                            if (grafo.getEdge(nodo1.getId() + nodo2.getId()) == null) {
                                grafo.addEdge(nodo1.getId() + nodo2.getId(), nodo1, nodo2, true).addAttribute("Precio", vertices[3]);
                                grafo.getEdge(nodo1.getId()+nodo2.getId()).addAttribute("Distancia", vertices[4]);
                            }
                        }
                    }

                    JOptionPane.showMessageDialog(this, "Se cargaron los datos al grafo con exito!");
                    reader.close();
                    in.close();
                } else {
                    JOptionPane.showMessageDialog(this, "Archivo invalido, debe cargar un archivo .txt!");
                }
            }
        } catch (IOException | NullPointerException e) {
            grafo.clear();
            JOptionPane.showMessageDialog(this, "Ocurrio un error cargando los datos. Revise si el archivo txt tiene el formato correcto (Persona1,Persona2)");
        }
    }//GEN-LAST:event_bLoadMouseClicked

    private void bDrawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bDrawMouseClicked
        if (grafo.getEachNode() != null) {
            grafo.display(true).setCloseFramePolicy(Viewer.CloseFramePolicy.CLOSE_VIEWER);
        } else {
            JOptionPane.showMessageDialog(this, "No hay un grafo creado, cargue datos a partir de un archivo txt primero!");
        }
    }//GEN-LAST:event_bDrawMouseClicked

    private void bFriendsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bFriendsMouseClicked
        if (grafo.getEachNode() != null) {
            jdFriends.setModal(true);
            jdFriends.setLocationRelativeTo(this);
            jdFriends.pack();
            tfCity1.setText("");
            tfCity2.setText("");
            taResult.setText("");
            jdFriends.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No hay un grafo creado, cargue datos a partir de un archivo txt primero!");
        }
    }//GEN-LAST:event_bFriendsMouseClicked

    private void bVerifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVerifyMouseClicked
        if (tfCity1.getText().equals("") || tfCity2.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese ambos nombres (correctos) para poder verificar su Ruta");
        } else {
            taResult.setText("");
            Edge ciudad1 = grafo.getEdge(tfCity1.getText() + tfCity2.getText());
            Edge ciudad2 = grafo.getEdge(tfCity2.getText() + tfCity1.getText());
            
            if (ciudad1 == null) {
                
            } else {
                taResult.append(tfCity1.getText() + " conoce a " + tfCity2.getText());
            }
            if (ciudad2 == null) {
                
            } else {
                
            }
            if (ciudad1 != null && ciudad2 != null) {
                tfCity1.setText("");
                tfCity2.setText("");
            } else {
                Node person1 = grafo.getNode(tfCity1.getText());
                Node person2 = grafo.getNode(tfCity2.getText());
                tfCity1.setText("");
                tfCity2.setText("");
                Dijkstra dijkstra = new Dijkstra(Dijkstra.Element.EDGE, null, this.cb_eleccion.getSelectedItem().toString());
                dijkstra.init(grafo);
                dijkstra.setSource(person1);
                dijkstra.compute();
                
                Path camino = dijkstra.getPath(person2);
                Node principal;
                if (!camino.getEdgePath().isEmpty()) {
                    principal = person1;
                } else {
                    principal = null;
                }
                if (!camino.getEdgePath().isEmpty() && principal != null) {
                    if (camino.getEdgePath().size() > 1) {
                        String separator="";
                        for (Edge edge : camino.getEdgePath()) {
                            if(edge.getTargetNode()==(principal==person1?person2:person1)){
                                separator="";
                            }else{
                                separator="->";
                            }
                            taResult.append(edge.getTargetNode().getId()+separator);
                        }
                    }
                } else {
                    taResult.append("\n-"+person1.getId() + " y " + person2.getId() + " no se puede dar esa ruta");
                }
            }
        }
    }//GEN-LAST:event_bVerifyMouseClicked

    private void bExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExitMouseClicked
        grafo.clear();
        System.exit(0);
    }//GEN-LAST:event_bExitMouseClicked

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
    private javax.swing.JButton bDraw;
    private javax.swing.JButton bExit;
    private javax.swing.JButton bFriends;
    private javax.swing.JButton bLoad;
    private javax.swing.JButton bVerify;
    private javax.swing.JComboBox<String> cb_eleccion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDialog jdFriends;
    private javax.swing.JLabel jlName1;
    private javax.swing.JLabel jlName2;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JTextArea taResult;
    private javax.swing.JTextField tfCity1;
    private javax.swing.JTextField tfCity2;
    // End of variables declaration//GEN-END:variables
}
