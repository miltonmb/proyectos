package proyecto3;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.graphstream.algorithm.Dijkstra;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.Path;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.ui.view.Viewer;
import org.jsoup.Jsoup;

public class main extends javax.swing.JFrame {

    Graph graph;
    ArrayList<String> ciudades = new ArrayList();
    ArrayList<Vuelo> vuelos = new ArrayList();

    public main() {
        initComponents();
        graph = new MultiGraph("CIUDADES");
        graph.setStrict(false);
        graph.setAutoCreate(false);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdCities = new javax.swing.JFrame();
        Verificar1 = new javax.swing.JPanel();
        cb_eleccion = new javax.swing.JComboBox<>();
        jlName5 = new javax.swing.JLabel();
        jlName6 = new javax.swing.JLabel();
        bVerify1 = new javax.swing.JButton();
        cb_city1 = new javax.swing.JComboBox<>();
        cb_city2 = new javax.swing.JComboBox<>();
        jd_elegirArchivo = new javax.swing.JDialog();
        cb_archivos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        bt_cargarArchivo = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        btnCities = new javax.swing.JButton();
        lTitulo = new javax.swing.JLabel();
        tf_mostrar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_ciudades = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi_cargar = new javax.swing.JMenuItem();
        jmi_cargarLocal = new javax.swing.JMenuItem();
        jmi_salir = new javax.swing.JMenuItem();
        jmi_ir = new javax.swing.JMenuItem();

        cb_eleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Distancia", "Precio" }));

        jlName5.setText("De:");

        jlName6.setText("A:");

        bVerify1.setText("Verificar Ruta");
        bVerify1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bVerify1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Verificar1Layout = new javax.swing.GroupLayout(Verificar1);
        Verificar1.setLayout(Verificar1Layout);
        Verificar1Layout.setHorizontalGroup(
            Verificar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Verificar1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Verificar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlName5)
                    .addComponent(jlName6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Verificar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Verificar1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(cb_eleccion, 0, 215, Short.MAX_VALUE))
                    .addComponent(cb_city1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_city2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bVerify1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );
        Verificar1Layout.setVerticalGroup(
            Verificar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Verificar1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Verificar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bVerify1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Verificar1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(Verificar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlName5)
                            .addComponent(cb_city1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Verificar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlName6)
                            .addComponent(cb_city2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_eleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jdCitiesLayout = new javax.swing.GroupLayout(jdCities.getContentPane());
        jdCities.getContentPane().setLayout(jdCitiesLayout);
        jdCitiesLayout.setHorizontalGroup(
            jdCitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdCitiesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Verificar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jdCitiesLayout.setVerticalGroup(
            jdCitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdCitiesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Verificar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setText("CARGAR ARCHIVO DE TEXTO");

        bt_cargarArchivo.setText("CARGAR");
        bt_cargarArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cargarArchivoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_elegirArchivoLayout = new javax.swing.GroupLayout(jd_elegirArchivo.getContentPane());
        jd_elegirArchivo.getContentPane().setLayout(jd_elegirArchivoLayout);
        jd_elegirArchivoLayout.setHorizontalGroup(
            jd_elegirArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_elegirArchivoLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jd_elegirArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_archivos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_cargarArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );
        jd_elegirArchivoLayout.setVerticalGroup(
            jd_elegirArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_elegirArchivoLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_archivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_cargarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnShow.setText("Mostrar Grafo");
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

        tf_mostrar.setEditable(false);

        tb_ciudades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ciudad 1", "Ciudad 2", "Aerolinea", "Precio", "Distancia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tb_ciudades.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(tb_ciudades);

        jMenu1.setText("File");

        jmi_cargar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jmi_cargar.setText("Cargar Archivo de Internet");
        jmi_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_cargarActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_cargar);

        jmi_cargarLocal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jmi_cargarLocal.setText("Cargar archivo local");
        jmi_cargarLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_cargarLocalActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_cargarLocal);

        jmi_salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jmi_salir.setText("Salir");
        jmi_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_salirActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_salir);

        jmi_ir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jmi_ir.setText("Ir a pagina Web");
        jmi_ir.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jmi_irMouseDragged(evt);
            }
        });
        jmi_ir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_irActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_ir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_mostrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCities, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lTitulo)
                        .addGap(20, 20, 20)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCities, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowMouseClicked
        if (loop == true) {
            System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
            graph.addAttribute("ui.stylesheet", "url('http://www.proyectoestructura.esy.es/estiloGrafo.css')");
            Viewer viewer = graph.display();
            viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);

        } else {
            JOptionPane.showMessageDialog(this, "No hay un grafo creado, cargue datos a partir de un archivo txt primero!");
        }
    }//GEN-LAST:event_btnShowMouseClicked


    private void btnCitiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCitiesMouseClicked
        if (loop == true) {
            jdCities.setLocation(this.getX() / 2, this.getY() / 2);
            jdCities.pack();
            jdCities.setVisible(true);
            DefaultComboBoxModel modeloCiudad1 = new DefaultComboBoxModel();
            DefaultComboBoxModel modeloCiudad2 = new DefaultComboBoxModel();
            for (int i = 0; i < ciudades.size(); i++) {
                modeloCiudad1.addElement(ciudades.get(i));
                modeloCiudad2.addElement(ciudades.get(i));
            }
            this.cb_city1.setModel(modeloCiudad1);
            this.cb_city2.setModel(modeloCiudad2);
            System.out.println(cb_city1.getModel().getSize());
            System.out.println(cb_city2.getModel().getSize());
        } else {
            JOptionPane.showMessageDialog(this, "No hay un grafo creado, cargue datos a partir de un archivo txt primero!");
        }
    }//GEN-LAST:event_btnCitiesMouseClicked

    private void jmi_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_cargarActionPerformed
        /*Aqui se llena el comboBox que contiene el nombre
        de los archivos .txt almacenados dentro del host, utilizando una libreria
        llamada jsoup, y lo qe hace es que parsea el html del host, y busca todos
        los href, y luego si el name contiene un .txt, se agrega al modelo del comboBox*/
        try {
            DefaultComboBoxModel m = new DefaultComboBoxModel();
            String name = "";
            org.jsoup.nodes.Document doc = Jsoup.connect("http://www.proyectoestructura.esy.es/uploads").get();
            for (org.jsoup.nodes.Element file : doc.select("a[href]")) {
                name = file.attr("href");
                if (name.contains(".txt")) {
                    m.addElement(name);
                }
            }
            this.cb_archivos.setModel(m);
            this.jd_elegirArchivo.pack();
            this.jd_elegirArchivo.setResizable(false);
            this.jd_elegirArchivo.setVisible(true);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "No tiene conexion a internet");
        }
    }//GEN-LAST:event_jmi_cargarActionPerformed
    private boolean cargarDeInternet(String archivo) {
        /*Utilizando un host, para guardar los archivos.txt, se utiliza un URL para obtener el archivo
        luego se lee, y se coloca dentro de un arreglo de String  divido por el .split(","), luego se crea
        un objeto vuelo, el cual guarda los datos*/
        try {
            URL oracle = new URL("http://www.proyectoestructura.esy.es/uploads/" + archivo);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(oracle.openStream()));
            BufferedReader reader = new BufferedReader(in);
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(",")) {
                    String[] nodos = line.split(",");
                    Vuelo vuelo;
                    vuelo = new Vuelo(nodos[0], nodos[1], nodos[2], Double.parseDouble(nodos[3]), Double.parseDouble(nodos[4]));
                    vuelos.add(vuelo);
                    Node nodo1 = null;
                    Node nodo2 = null;
                    /*primero se obtiene el nodo con el nombre de alguna ciudad y se mira si el nodo
                    esta vacio, sí el nodo esta vacio, entonces lo que se hace es agregar el nodo al grafo
                    y se agrega la ciudad dentro de un arraylist, y al objeto nodo1, se le agrega el graph.get(vuelo.getCiudad()),
                    ahora si el nodo no esta vacio lo unico que se hace es asignar al nodo1 el graph.get(vuelo.getCiudad())*/
                    if (graph.getNode(vuelo.getCiudad()) == null) {
                        graph.addNode(vuelo.getCiudad());
                        ciudades.add(vuelo.getCiudad());
                        System.out.println(vuelo.getCiudad());
                        nodo1 = graph.getNode(vuelo.getCiudad());
                        nodo1.setAttribute("ui.label", vuelo.getCiudad());
                        nodo1.setAttribute("xy", 1, 3);

                    } else {
                        nodo1 = graph.getNode(vuelo.getCiudad());
                    }
                    /*En este caso se hace lo mismo que en la decision anterior, solamente que ahora con la ciudad2*/
                    if (graph.getNode(vuelo.getCiudad2()) == null) {
                        graph.addNode(vuelo.getCiudad2());
                        System.out.println(vuelo.getCiudad2());
                        ciudades.add(vuelo.getCiudad2());
                        nodo2 = graph.getNode(vuelo.getCiudad2());
                        nodo2.setAttribute("ui.label", vuelo.getCiudad2());
                        nodo2.setAttribute("xy", 1, 3);
                    } else {
                        nodo2 = graph.getNode(nodos[1]);
                    }
                    /*Se revisa si el Edge del grafo entre ambas ciudades este vacio*/
                    if (graph.getEdge(nodo1.getId() + nodo2.getId()) == null) {
                        graph.addEdge(nodo1.getId() + nodo2.getId(), nodo1, nodo2, true).setAttribute("Precio", vuelo.getPrecio());
                        graph.getEdge(nodo1.getId() + nodo2.getId()).setAttribute("Distancia", vuelo.getDistancia());
                        graph.getEdge(nodo1.getId() + nodo2.getId()).setAttribute("Aerolinea", vuelo.getAerolinea());
                        //graph.getEdge(nodo1.getId() + nodo2.getId()).setAttribute("ui.label", "Distancia: " + vuelo.getDistancia() + " Precio:" + vuelo.getPrecio() + " Aerolinea:" + vuelo.getAerolinea());

                    }
                }
            }
            reader.close();
            in.close();
            loop = true;
        } catch (IOException | NullPointerException e) {
            graph.clear();
            e.printStackTrace();
        }
        return loop;
    }

    private boolean cargarLocal() {
        /*En el caso de que el usuario no tenga una conexion a internet, existe el metodo 
        cargarLocal(), que como su nombre lo dice, lo que hace es que le permite al usuario cargar archivos .txt
        desde su computadora, luego sigue la misma logica que el cargarDeInternet()*/
        try {
            JFileChooser chooser = new JFileChooser("./dist");
            FileFilter filter;
            filter = new FileNameExtensionFilter("Solo archivos de texto", "txt");
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
                            String[] nodos = line.split(",");
                            Vuelo vuelo;
                            vuelo = new Vuelo(nodos[0], nodos[1], nodos[2], Double.parseDouble(nodos[3]), Double.parseDouble(nodos[4]));
                            Node nodo1 = null;
                            Node nodo2 = null;
                            vuelos.add(vuelo);
                            if (graph.getNode(vuelo.getCiudad()) == null) {
                                graph.addNode(vuelo.getCiudad());
                                ciudades.add(vuelo.getCiudad());
                                System.out.println(vuelo.getCiudad());
                                nodo1 = graph.getNode(vuelo.getCiudad());
                                nodo1.setAttribute("ui.label", vuelo.getCiudad());
                                nodo1.setAttribute("xy", 1, 3);

                            } else {
                                nodo1 = graph.getNode(vuelo.getCiudad());
                            }
                            if (graph.getNode(vuelo.getCiudad2()) == null) {
                                graph.addNode(vuelo.getCiudad2());
                                System.out.println(vuelo.getCiudad2());
                                ciudades.add(vuelo.getCiudad2());
                                nodo2 = graph.getNode(vuelo.getCiudad2());
                                nodo2.setAttribute("ui.label", vuelo.getCiudad2());
                                nodo2.setAttribute("xy", 1, 3);
                            } else {
                                nodo2 = graph.getNode(nodos[1]);
                            }
                            if (graph.getEdge(nodo1.getId() + nodo2.getId()) == null) {
                                graph.addEdge(nodo1.getId() + nodo2.getId(), nodo1, nodo2, true).setAttribute("Precio", vuelo.getPrecio());
                                graph.getEdge(nodo1.getId() + nodo2.getId()).setAttribute("Distancia", vuelo.getDistancia());
                                graph.getEdge(nodo1.getId() + nodo2.getId()).setAttribute("Aerolinea", vuelo.getAerolinea());
                                //graph.getEdge(nodo1.getId() + nodo2.getId()).setAttribute("ui.label", "Distancia: " + vuelo.getDistancia() + " Precio:" + vuelo.getPrecio() + " Aerolinea:" + vuelo.getAerolinea());

                            }
                        }
                    }
                    reader.close();
                    in.close();
                    loop = true;
                } else {
                    loop = false;
                }
            }
        } catch (IOException | NullPointerException e) {
            graph.clear();
            JOptionPane.showMessageDialog(this, "Ocurrio un error cargando los datos. Revise si el archivo txt tiene el formato correcto (Ciudad1,Ciudad2,Aerolinea,costo,distancia)");
        }
        return loop;
    }
    private void jmi_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_salirActionPerformed
        graph.clear();
        System.exit(0);
    }//GEN-LAST:event_jmi_salirActionPerformed

    private void bVerify1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVerify1MouseClicked
        /*Al momento de clickear el boton de verificar rutas, lo que se hace es que
        que de ambos comboBox de ciudades, se toman las ciudades que el usuario escogio, luego entra al if
        para verificar que las ciudades que ingreso no sean las mismas, ahora si las ciudades que escogio son distintas
        lo que se hace es que se busca el nodo que contenga el id de la ciudad1, y el otro nodo con el id de la ciudad2,
        luego se crea un nuevo grafo para mostrar la ruta, y utilizando el algoritmo de dijkstra que proporciona la libreria
        de graphstream, se setea el source, para saber de donde tiene que empezar,  luego se hace .compute(), y luego obtenemos
        el Path de la ciudad1 a la ciudad2, luego dentro de un for, que va de nodo hasta el camino de nodos hasta la ciudad 2,
        se agregan los nodos al grafo, luego se mira si el numero de nodos es diferente de 0, y si lo es, entra a un for que va de
        edge hasta el camino de edges hasta ciudad2, luego se agrega el edge, del nodo0 y el nodo1, luego se manda a llamar .css del
        grafo que tambien esta almacenado dentro del host, y por ultimo se hace display del grafo
         */
        if (cb_city1.getSelectedItem().toString().equals(cb_city2.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(this, "Ha ingresado la misma ciudad!");
        } else {
            Node NodoCiudad1 = graph.getNode(cb_city1.getSelectedItem().toString());
            Node NodoCiudad2 = graph.getNode(cb_city2.getSelectedItem().toString());
            String eleccion = this.cb_eleccion.getSelectedItem().toString();
            Graph grafo = new MultiGraph(cb_city1.getSelectedItem().toString() + cb_city2.getSelectedItem().toString());
            Dijkstra dijkstra = new Dijkstra(Dijkstra.Element.EDGE, null, eleccion);
            dijkstra.init(graph);
            dijkstra.setSource(NodoCiudad1);
            dijkstra.compute();
            Path camino = dijkstra.getPath(NodoCiudad2);
            String ciudades = "";
            for (Node node : dijkstra.getPathNodes(graph.getNode(NodoCiudad2.getId()))) {
                grafo.addNode(node.getId()).addAttribute("ui.label", node.getId());
                ciudades += node.getId() + "-";
            }
            if (grafo.getNodeCount() != 0) {
                for (Edge edge : dijkstra.getPathEdges(graph.getNode(NodoCiudad2.getId()))) {
                    grafo.addEdge(edge.getId(), edge.getNode0().getId(), edge.getNode1().getId(), true).addAttribute(eleccion, Double.parseDouble(edge.getAttribute(eleccion).toString()));
                    grafo.getEdge(edge.getId()).setAttribute("Aerolinea", edge.getAttribute("Aerolinea").toString());
                }
                for (int i = 0; i < grafo.getEdgeCount(); i++) {
                    grafo.getEdge(i).setAttribute("ui.label", grafo.getEdge(i).getNode0() + " a " + grafo.getEdge(i).getNode1() + " " + eleccion + ": " + Double.parseDouble(grafo.getEdge(i).getAttribute(eleccion).toString()) + " Aerolinea: " + grafo.getEdge(i).getAttribute("Aerolinea"));
                }
                System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
                grafo.addAttribute("ui.stylesheet", "url('http://www.proyectoestructura.esy.es/estiloGrafo.css')");
                this.jdCities.dispose();
                this.tf_mostrar.setText(ciudades + this.cb_eleccion.getSelectedItem().toString() + ": " + camino.getPathWeight(this.cb_eleccion.getSelectedItem().toString()));
                this.show();
                Viewer viewer = grafo.display();
                viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
            } else {
                JOptionPane.showMessageDialog(this, "No existe ruta!");
            }
        }
    }//GEN-LAST:event_bVerify1MouseClicked

    private void bt_cargarArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cargarArchivoMouseClicked
        if (cargarDeInternet(this.cb_archivos.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(this, "Se cargaron los datos al grafo con exito!");
            DefaultTableModel model = (DefaultTableModel) this.tb_ciudades.getModel();
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }
            for (int i = 0; i < vuelos.size(); i++) {
                Vuelo x = vuelos.get(i);
                model.addRow(new Object[]{x.getCiudad(), x.getCiudad2(), x.getAerolinea(), x.getPrecio(), x.getDistancia()});
            }
            tb_ciudades.setModel(model);
            this.jd_elegirArchivo.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, conectese a Internet!");
        }
    }//GEN-LAST:event_bt_cargarArchivoMouseClicked

    private void jmi_cargarLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_cargarLocalActionPerformed
        if (cargarLocal()) {
            DefaultTableModel model = (DefaultTableModel) this.tb_ciudades.getModel();
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }
            for (int i = 0; i < vuelos.size(); i++) {
                Vuelo x = vuelos.get(i);
                model.addRow(new Object[]{x.getCiudad(), x.getCiudad2(), x.getAerolinea(), x.getPrecio(), x.getDistancia()});
            }
            tb_ciudades.setModel(model);
            JOptionPane.showMessageDialog(this, "Se ha cargado el archivo localmente!");
        } else {
            JOptionPane.showMessageDialog(this, "Error al cargar!");
        }
    }//GEN-LAST:event_jmi_cargarLocalActionPerformed

    private void jmi_irActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_irActionPerformed
        /*Abre el navegador por defecto junto con el link de la pagina creada*/
        try {
            Desktop.getDesktop().browse(new URL("http://www.proyectoestructura.esy.es/").toURI());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jmi_irActionPerformed

    private void jmi_irMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmi_irMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_irMouseDragged

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
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JPanel Verificar1;
    private javax.swing.JButton bVerify1;
    private javax.swing.JButton bt_cargarArchivo;
    private javax.swing.JButton btnCities;
    private javax.swing.JButton btnShow;
    private javax.swing.JComboBox<String> cb_archivos;
    private javax.swing.JComboBox<String> cb_city1;
    private javax.swing.JComboBox<String> cb_city2;
    private javax.swing.JComboBox<String> cb_eleccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFrame jdCities;
    private javax.swing.JDialog jd_elegirArchivo;
    private javax.swing.JLabel jlName5;
    private javax.swing.JLabel jlName6;
    private javax.swing.JMenuItem jmi_cargar;
    private javax.swing.JMenuItem jmi_cargarLocal;
    private javax.swing.JMenuItem jmi_ir;
    private javax.swing.JMenuItem jmi_salir;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JTable tb_ciudades;
    private javax.swing.JTextField tf_mostrar;
    // End of variables declaration//GEN-END:variables
    protected boolean loop = false;
}
