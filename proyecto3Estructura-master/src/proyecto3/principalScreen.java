/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.graphstream.algorithm.Dijkstra;
import org.graphstream.graph.Edge;
import org.graphstream.graph.implementations.*;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.Path;
import org.graphstream.ui.view.Viewer;

/**
 *
 * @author oscarito
 */
public class principalScreen extends javax.swing.JFrame {
    /**
     * Creates new form principalScreen
     */
    public principalScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jDialog1 = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstUsers = new javax.swing.JList<>();
        cmbUsers = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDialog2 = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstUsers1 = new javax.swing.JList<>();
        cmbUsers1 = new javax.swing.JComboBox<>();
        btnShowWay = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnShowGraph = new javax.swing.JButton();
        btnShowFriends = new javax.swing.JButton();
        btnMeet = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jScrollPane1.setViewportView(jTextPane1);

        lstUsers.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(lstUsers);

        cmbUsers.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbUsersItemStateChanged(evt);
            }
        });

        jLabel1.setText("Select User");

        jLabel2.setText("All Friends");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbUsers, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
                        .addGap(27, 27, 27))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        lstUsers1.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(lstUsers1);

        cmbUsers1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbUsers1ItemStateChanged(evt);
            }
        });

        btnShowWay.setText("Show Way");

        jLabel3.setText("Select User");

        jLabel4.setText("All unknow people (Select one)");

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog2Layout.createSequentialGroup()
                        .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDialog2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnShowWay))
                            .addComponent(cmbUsers1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                        .addGap(27, 27, 27))
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(cmbUsers1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnShowWay)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnShowGraph.setText("Show Graph");
        btnShowGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowGraphActionPerformed(evt);
            }
        });

        btnShowFriends.setText("Show Friends");
        btnShowFriends.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnShowFriendsMouseClicked(evt);
            }
        });

        btnMeet.setText("Meet New People");
        btnMeet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeetActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Load File");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnShowGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnShowFriends, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMeet, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnShowGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnShowFriends, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMeet, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowGraphActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShowGraphActionPerformed

    private void btnMeetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMeetActionPerformed

    private void btnShowFriendsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowFriendsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShowFriendsMouseClicked

    private void cmbUsersItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbUsersItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbUsersItemStateChanged

    private void cmbUsers1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbUsers1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbUsers1ItemStateChanged
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principalScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principalScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principalScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principalScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        principalScreen controller = new principalScreen();
        /* Create and display the form */
        Graph graph = new SingleGraph("Friendly");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                controller.setVisible(true);
            }
        });
        bindEvents(controller, graph);
        buildGraph(graph);
    }
    public static void bindEvents(principalScreen controller, Graph graph) {
        
        controller.btnShowGraph.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                graph.getEdge("Oscar->David").setAttribute("ui.style", "fill-color: blue;");
                clearStyle(graph);
		Viewer viewer = graph.display();
                viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
            }
        });
        controller.btnShowWay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearStyle(graph);
                String selectedUser = controller.cmbUsers1.getSelectedItem().toString();
                String selectedFriend = controller.lstUsers1.getSelectedValue();
                Iterator<Path> pathIterator = computeDijstra(selectedUser, selectedFriend, graph);
                if (!pathIterator.hasNext()) {
                    JOptionPane.showMessageDialog(controller, "The users cannot be connected.", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                int contPaths = 0;
                String[] colorEdges = {"blue", "red", "yellow", "#A94989"};
                while (pathIterator.hasNext()) {
                    Path nextPath = pathIterator.next();
                    Iterator allEdge = nextPath.getEdgeIterator();
                    while(allEdge.hasNext()) {
                        Edge actualEdge = ((Edge)allEdge.next());
                        actualEdge.setAttribute("ui.style", "fill-color: " + colorEdges[contPaths] + ";");
                        //Fix with color friend edge (<->)
                        if (graph.getEdge(actualEdge.getNode1() + "->" + actualEdge.getNode0()) != null) {
                            graph.getEdge(actualEdge.getNode1() + "->" + actualEdge.getNode0()).setAttribute("ui.style", "fill-color: blue;");
                        }
                    }
                    contPaths++;
                }
                
		Viewer viewer = graph.display();
                viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
            }
        });
        controller.btnShowFriends.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                controller.jDialog1.pack();
                controller.jDialog1.setLocationRelativeTo(controller);
                controller.jDialog1.setVisible(true);
            }
        });
        controller.btnMeet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                controller.jDialog2.pack();
                controller.jDialog2.setLocationRelativeTo(controller);
                controller.jDialog2.setVisible(true);
            }
        });
        controller.jDialog1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                DefaultComboBoxModel modelo = (DefaultComboBoxModel)controller.cmbUsers.getModel();
                for (Node user : graph) {
                    modelo.addElement(user);
                }
            }
        });
        controller.jDialog2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                DefaultComboBoxModel modelo = (DefaultComboBoxModel)controller.cmbUsers1.getModel();
                for (Node user : graph) {
                    modelo.addElement(user);
                }
            }
        });
        controller.cmbUsers.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                controller.lstUsers.setModel(new DefaultListModel());
                ArrayList<String> friends = getFriends(controller.cmbUsers.getSelectedItem().toString(), graph);
                
                DefaultListModel modelo = (DefaultListModel)controller.lstUsers.getModel();
                for (String friend : friends) {
                    modelo.addElement(friend);
                }
            }
        });
        controller.cmbUsers1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                controller.lstUsers1.setModel(new DefaultListModel());
                DefaultListModel modelo = (DefaultListModel)controller.lstUsers1.getModel();
                String selectedUser = controller.cmbUsers1.getSelectedItem().toString();
                for (Node friend : graph) {
                    if (!friend.toString().equals(selectedUser) && graph.getEdge(selectedUser + "->" + friend.toString()) == null)
                        modelo.addElement(friend.toString());
                }
            }
        });
        controller.jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFileChooser myFile = new JFileChooser();
                FileNameExtensionFilter filterFiles = new  FileNameExtensionFilter("txt","txt");
                myFile.setFileFilter(filterFiles);
                int accepted = myFile.showDialog(myFile, "Open");
                
                if (accepted == JFileChooser.APPROVE_OPTION) {
                    String nameFile = myFile.getSelectedFile().toString();
                    buildGraph(nameFile, graph);
                }
            }
        });
    }
    public static void buildGraph(String nameFile,Graph graph) {
        graph.clear();
        File archivoConfig = new File(nameFile);
        Scanner sc = null;
        try{
            sc = new Scanner( archivoConfig );
            while( sc.hasNext() ){
                String actual = sc.nextLine();
                String[] users = actual.split(",");
                if(users.length == 2){
                    if (graph.getNode(users[0]) == null) {
                        graph.addNode(users[0]);            
                    }
                    if (graph.getNode(users[1]) == null) {
                        graph.addNode(users[1]);  
                    }
                    graph.addEdge(users[0] + "->" + users[1], users[0], users[1], true);
                }
            }
        } catch (Exception e) {
        }
        graph.setStrict(false);
        graph.setAutoCreate(true);
        for (Node node : graph) {
            node.addAttribute("ui.label", node.getId());
        } 
    }
    public static void buildGraph(Graph graph) {
        buildGraph("./friends.txt", graph);
    }
    public static Iterator<Path> computeDijstra(String user1, String user2, Graph graph) {
        Dijkstra dijkstra = new Dijkstra(Dijkstra.Element.NODE, null, null);
        dijkstra.init(graph);
        dijkstra.setSource(graph.getNode(user1));
        dijkstra.compute();

        // Print all the shortest paths between A and F
        return dijkstra.getAllPathsIterator(graph.getNode(user2));


    }
    public static boolean areFriends(String user1, String user2, Graph graph) {
        return graph.getEdge(user1 + "->" + user2) != null && graph.getEdge(user2 + "->" + user1) != null;
    }
    public static void clearStyle(Graph graph) {
        for (Edge edge : graph.getEachEdge()) {
            edge.setAttribute("ui.style", "fill-color: black;");
        }
    }
    public static ArrayList getFriends(String user, Graph graph) {
        Node nodeUser = graph.getNode(user);
        ArrayList<String> friends = new ArrayList<String>();
        if (nodeUser != null) {
            for (Edge n : nodeUser.getEachEdge()) {
                if (!user.toString().equals(n.getNode1().toString()) && areFriends(n.getNode1().toString(), n.getNode0().toString(), graph))
                   friends.add(n.getNode1().toString());
            }
        }
        return friends;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMeet;
    private javax.swing.JButton btnShowFriends;
    private static javax.swing.JButton btnShowGraph;
    private javax.swing.JButton btnShowWay;
    private javax.swing.JComboBox<String> cmbUsers;
    private javax.swing.JComboBox<String> cmbUsers1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JList<String> lstUsers;
    private javax.swing.JList<String> lstUsers1;
    // End of variables declaration//GEN-END:variables
}
