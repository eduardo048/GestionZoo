/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Controladores.Archivos;
import Modelos.Zoo;
import Modelos.Animal;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author eduar
 */
public class Ventana extends javax.swing.JFrame {
    private Zoo miZoo=null;
    public Ventana() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupAlimentacionAnimal = new javax.swing.ButtonGroup();
        jFileChooserFotoAnimales = new javax.swing.JFileChooser();
        jFileChooserArchivos = new javax.swing.JFileChooser();
        jTabbedPanel1 = new javax.swing.JTabbedPane();
        jPanelInicio = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelGestionZoo = new javax.swing.JPanel();
        jPanelIntroducirDatosZoo = new javax.swing.JPanel();
        jLabelTitulozooDeDatosZoo = new javax.swing.JLabel();
        jLabelNombreZoo = new javax.swing.JLabel();
        jLabelSuperficieZoo = new javax.swing.JLabel();
        jLabelCiudadZoo = new javax.swing.JLabel();
        jTextFieldNombreZoo = new javax.swing.JTextField();
        jTextFieldSuperficieZoo = new javax.swing.JTextField();
        jComboBoxCiudadesZoo = new javax.swing.JComboBox<>();
        jButtonCrearZooBoton = new javax.swing.JButton();
        jPanelVerZoo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldVeerNombreZoo = new javax.swing.JTextField();
        jTextFieldVerSuperficieZoo = new javax.swing.JTextField();
        jComboBoxVerCiudadZoo = new javax.swing.JComboBox<>();
        jButtonModificarZoo = new javax.swing.JButton();
        jButtonVerTodoLosDatosZoo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaVerZooCompleto = new javax.swing.JTextArea();
        jPanelGestionAnimal = new javax.swing.JPanel();
        jPanelIntroducirDatosAnimales = new javax.swing.JPanel();
        jLabelTitulozooDeDatosAnimal = new javax.swing.JLabel();
        jLabelNombreAnimal = new javax.swing.JLabel();
        jLabelTextoEspecie = new javax.swing.JLabel();
        jLabelTextoEdad = new javax.swing.JLabel();
        jButtonCrearAnimal = new javax.swing.JButton();
        jLabelTextoAlimentacion = new javax.swing.JLabel();
        jTextFieldNombreAnimal = new javax.swing.JTextField();
        jTextFieldEspecieAnimal = new javax.swing.JTextField();
        jRadioButtonAlimentacionCarnivoro = new javax.swing.JRadioButton();
        jRadioButtonAlimentacionOmnivoro = new javax.swing.JRadioButton();
        jRadioButtonAlimentacionDetritivoros = new javax.swing.JRadioButton();
        jRadioButtonAlimentacionHerbívoros = new javax.swing.JRadioButton();
        jSliderEdadAnimal = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jLabelArchivoImagen = new javax.swing.JLabel();
        jTextFieldArchivoImagenAnimal = new javax.swing.JTextField();
        jPanelVerAnimal = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldModificarNombreAnimal = new javax.swing.JTextField();
        jTextFieldModficarEspecieAnimal = new javax.swing.JTextField();
        jButtonModificarAnimal = new javax.swing.JButton();
        jButtonEliminarAnimal = new javax.swing.JButton();
        jComboBoxAnimalesParaModificar = new javax.swing.JComboBox<>();
        jButtonVerAnimal = new javax.swing.JButton();
        jLabelTextoAlimentacion1 = new javax.swing.JLabel();
        jTextFieldModificarEdadAnimal = new javax.swing.JTextField();
        jTextFieldModificarAlimentacionAnimal = new javax.swing.JTextField();
        jLabelVerImagenAnimal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanelIntroducirDatosHabitat = new javax.swing.JPanel();
        jLabelTitulozooDeDatosHabitatN = new javax.swing.JLabel();
        jLabelNombreHabitat = new javax.swing.JLabel();
        jLabelTextoClima = new javax.swing.JLabel();
        jLabelTextoTamaño = new javax.swing.JLabel();
        jButtonCrearHabitat = new javax.swing.JButton();
        jLabelTextoCapacidad = new javax.swing.JLabel();
        jTextFieldNombreHabitat = new javax.swing.JTextField();
        jTextFieldClimaHabitat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCapacidadHabitat = new javax.swing.JTextField();
        jTextFieldTamañoHabitat = new javax.swing.JTextField();
        jComboBoxAnimalHabitat = new javax.swing.JComboBox<>();
        jLabelAnimalesHabitat = new javax.swing.JLabel();
        jPanelIntroducirDatosAnimales2 = new javax.swing.JPanel();
        jLabelTitulozooDeDatosHabitat = new javax.swing.JLabel();
        jButtonEditarHabitat = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButtonEliminarHabitat = new javax.swing.JButton();
        jComboBoxVerHabitat = new javax.swing.JComboBox<>();
        jButtonVerHabitat = new javax.swing.JButton();
        jLabelNombreHabitat1 = new javax.swing.JLabel();
        jTextFieldVerNombreHabitat = new javax.swing.JTextField();
        jLabelTextoClima1 = new javax.swing.JLabel();
        jTextFieldVerClimaHabitat = new javax.swing.JTextField();
        jLabelTextoTamaño1 = new javax.swing.JLabel();
        jTextFieldVerTamañoHabitat = new javax.swing.JTextField();
        jLabelTextoCapacidad1 = new javax.swing.JLabel();
        jTextFieldVerCapacidadHabitat = new javax.swing.JTextField();
        jLabelAnimalesHabitat1 = new javax.swing.JLabel();
        jComboBoxVerAnimalHabitat = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabelEstado = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArchivos = new javax.swing.JMenu();
        jMenuItemGuardarZoo = new javax.swing.JMenuItem();
        jMenuItemLeerZoo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelInicio.setBackground(new java.awt.Color(204, 255, 204));
        jPanelInicio.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/gettyimages-173681964-612x612.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel1.setFont(new java.awt.Font("Segoe Script", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("BIENVENIDO A LA APLICACION DEL ZOO");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanelInicioLayout = new javax.swing.GroupLayout(jPanelInicio);
        jPanelInicio.setLayout(jPanelInicioLayout);
        jPanelInicioLayout.setHorizontalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelInicioLayout.setVerticalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        jTabbedPanel1.addTab("Inicio", jPanelInicio);

        jPanelGestionZoo.setBackground(new java.awt.Color(204, 255, 204));

        jPanelIntroducirDatosZoo.setBackground(new java.awt.Color(153, 255, 204));
        jPanelIntroducirDatosZoo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanelIntroducirDatosZoo.setForeground(new java.awt.Color(0, 0, 0));

        jLabelTitulozooDeDatosZoo.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosZoo.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosZoo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosZoo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosZoo.setText("Introduce los datos del Zoo");

        jLabelNombreZoo.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelNombreZoo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombreZoo.setText("Nombre");

        jLabelSuperficieZoo.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelSuperficieZoo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSuperficieZoo.setText("Superficie");

        jLabelCiudadZoo.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelCiudadZoo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCiudadZoo.setText("Ciudad");

        jTextFieldNombreZoo.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldNombreZoo.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldSuperficieZoo.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldSuperficieZoo.setForeground(new java.awt.Color(0, 0, 0));

        jComboBoxCiudadesZoo.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jComboBoxCiudadesZoo.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxCiudadesZoo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Madrid", "Toledo", "Albacete", "Valencia", "Barcelona", "Sevilla", " " }));
        jComboBoxCiudadesZoo.setSelectedIndex(-1);

        jButtonCrearZooBoton.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jButtonCrearZooBoton.setText("Crear Zoo");
        jButtonCrearZooBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearZooBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelIntroducirDatosZooLayout = new javax.swing.GroupLayout(jPanelIntroducirDatosZoo);
        jPanelIntroducirDatosZoo.setLayout(jPanelIntroducirDatosZooLayout);
        jPanelIntroducirDatosZooLayout.setHorizontalGroup(
            jPanelIntroducirDatosZooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntroducirDatosZooLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelIntroducirDatosZooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelSuperficieZoo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCiudadZoo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelNombreZoo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelIntroducirDatosZooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxCiudadesZoo, 0, 179, Short.MAX_VALUE)
                    .addComponent(jTextFieldSuperficieZoo)
                    .addComponent(jTextFieldNombreZoo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIntroducirDatosZooLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanelIntroducirDatosZooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIntroducirDatosZooLayout.createSequentialGroup()
                        .addComponent(jLabelTitulozooDeDatosZoo, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIntroducirDatosZooLayout.createSequentialGroup()
                        .addComponent(jButtonCrearZooBoton)
                        .addGap(101, 101, 101))))
        );
        jPanelIntroducirDatosZooLayout.setVerticalGroup(
            jPanelIntroducirDatosZooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntroducirDatosZooLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabelTitulozooDeDatosZoo)
                .addGap(18, 18, 18)
                .addGroup(jPanelIntroducirDatosZooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreZoo)
                    .addComponent(jTextFieldNombreZoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanelIntroducirDatosZooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSuperficieZoo)
                    .addComponent(jTextFieldSuperficieZoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanelIntroducirDatosZooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCiudadZoo)
                    .addComponent(jComboBoxCiudadesZoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(jButtonCrearZooBoton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelVerZoo.setBackground(new java.awt.Color(153, 255, 204));
        jPanelVerZoo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanelVerZoo.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Datos del zoo");

        jLabel6.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nombre");

        jLabel7.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Superficie");

        jLabel8.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Ciudad");

        jTextFieldVeerNombreZoo.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldVeerNombreZoo.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldVerSuperficieZoo.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldVerSuperficieZoo.setForeground(new java.awt.Color(0, 0, 0));

        jComboBoxVerCiudadZoo.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jComboBoxVerCiudadZoo.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxVerCiudadZoo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Madrid", "Toledo", "Albacete", "Valencia", "Barcelona", "Sevilla", " " }));
        jComboBoxVerCiudadZoo.setSelectedIndex(-1);

        jButtonModificarZoo.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jButtonModificarZoo.setText("Modificar Zoo");
        jButtonModificarZoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarZooActionPerformed(evt);
            }
        });

        jButtonVerTodoLosDatosZoo.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jButtonVerTodoLosDatosZoo.setText("Ver Zoo Completo");
        jButtonVerTodoLosDatosZoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerTodoLosDatosZooActionPerformed(evt);
            }
        });

        jTextAreaVerZooCompleto.setEditable(false);
        jTextAreaVerZooCompleto.setColumns(20);
        jTextAreaVerZooCompleto.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextAreaVerZooCompleto.setForeground(new java.awt.Color(0, 0, 0));
        jTextAreaVerZooCompleto.setRows(5);
        jScrollPane1.setViewportView(jTextAreaVerZooCompleto);

        javax.swing.GroupLayout jPanelVerZooLayout = new javax.swing.GroupLayout(jPanelVerZoo);
        jPanelVerZoo.setLayout(jPanelVerZooLayout);
        jPanelVerZooLayout.setHorizontalGroup(
            jPanelVerZooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVerZooLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelVerZooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVerZooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxVerCiudadZoo, 0, 179, Short.MAX_VALUE)
                    .addComponent(jTextFieldVerSuperficieZoo)
                    .addComponent(jTextFieldVeerNombreZoo))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVerZooLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelVerZooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVerZooLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVerZooLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVerZooLayout.createSequentialGroup()
                        .addGroup(jPanelVerZooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonVerTodoLosDatosZoo)
                            .addComponent(jButtonModificarZoo))
                        .addGap(69, 69, 69))))
        );
        jPanelVerZooLayout.setVerticalGroup(
            jPanelVerZooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVerZooLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanelVerZooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldVeerNombreZoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelVerZooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldVerSuperficieZoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelVerZooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxVerCiudadZoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonModificarZoo)
                .addGap(24, 24, 24)
                .addComponent(jButtonVerTodoLosDatosZoo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelGestionZooLayout = new javax.swing.GroupLayout(jPanelGestionZoo);
        jPanelGestionZoo.setLayout(jPanelGestionZooLayout);
        jPanelGestionZooLayout.setHorizontalGroup(
            jPanelGestionZooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGestionZooLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jPanelIntroducirDatosZoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanelVerZoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanelGestionZooLayout.setVerticalGroup(
            jPanelGestionZooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGestionZooLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelGestionZooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelIntroducirDatosZoo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelVerZoo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPanel1.addTab("Zoo", jPanelGestionZoo);

        jPanelGestionAnimal.setBackground(new java.awt.Color(204, 255, 204));

        jPanelIntroducirDatosAnimales.setBackground(new java.awt.Color(153, 255, 204));
        jPanelIntroducirDatosAnimales.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanelIntroducirDatosAnimales.setForeground(new java.awt.Color(0, 0, 0));

        jLabelTitulozooDeDatosAnimal.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosAnimal.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosAnimal.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosAnimal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosAnimal.setText("Introduce los datos del Animal");

        jLabelNombreAnimal.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelNombreAnimal.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombreAnimal.setText("Nombre");

        jLabelTextoEspecie.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelTextoEspecie.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTextoEspecie.setText("Especie");

        jLabelTextoEdad.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelTextoEdad.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTextoEdad.setText("Edad");

        jButtonCrearAnimal.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jButtonCrearAnimal.setText("Crear Animal");
        jButtonCrearAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearAnimalActionPerformed(evt);
            }
        });

        jLabelTextoAlimentacion.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelTextoAlimentacion.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTextoAlimentacion.setText("Alimentacion");

        jTextFieldNombreAnimal.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldNombreAnimal.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldEspecieAnimal.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldEspecieAnimal.setForeground(new java.awt.Color(0, 0, 0));

        buttonGroupAlimentacionAnimal.add(jRadioButtonAlimentacionCarnivoro);
        jRadioButtonAlimentacionCarnivoro.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jRadioButtonAlimentacionCarnivoro.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonAlimentacionCarnivoro.setText("Carnivoro");

        buttonGroupAlimentacionAnimal.add(jRadioButtonAlimentacionOmnivoro);
        jRadioButtonAlimentacionOmnivoro.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jRadioButtonAlimentacionOmnivoro.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonAlimentacionOmnivoro.setText("Omnivoro");

        buttonGroupAlimentacionAnimal.add(jRadioButtonAlimentacionDetritivoros);
        jRadioButtonAlimentacionDetritivoros.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jRadioButtonAlimentacionDetritivoros.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonAlimentacionDetritivoros.setText("Detritivoros");

        buttonGroupAlimentacionAnimal.add(jRadioButtonAlimentacionHerbívoros);
        jRadioButtonAlimentacionHerbívoros.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jRadioButtonAlimentacionHerbívoros.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonAlimentacionHerbívoros.setText("Herbívoros");

        jSliderEdadAnimal.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jSliderEdadAnimal.setForeground(new java.awt.Color(0, 0, 0));
        jSliderEdadAnimal.setMajorTickSpacing(20);
        jSliderEdadAnimal.setMinorTickSpacing(5);
        jSliderEdadAnimal.setPaintLabels(true);
        jSliderEdadAnimal.setPaintTicks(true);

        jLabelArchivoImagen.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelArchivoImagen.setForeground(new java.awt.Color(0, 0, 0));
        jLabelArchivoImagen.setText("<html><a href=''> Seleccionar archivo de imagen</a> </html>");
        jLabelArchivoImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelArchivoImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelArchivoImagenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelIntroducirDatosAnimalesLayout = new javax.swing.GroupLayout(jPanelIntroducirDatosAnimales);
        jPanelIntroducirDatosAnimales.setLayout(jPanelIntroducirDatosAnimalesLayout);
        jPanelIntroducirDatosAnimalesLayout.setHorizontalGroup(
            jPanelIntroducirDatosAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIntroducirDatosAnimalesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jRadioButtonAlimentacionHerbívoros, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(jPanelIntroducirDatosAnimalesLayout.createSequentialGroup()
                .addGroup(jPanelIntroducirDatosAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIntroducirDatosAnimalesLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanelIntroducirDatosAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelIntroducirDatosAnimalesLayout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelIntroducirDatosAnimalesLayout.createSequentialGroup()
                                .addGroup(jPanelIntroducirDatosAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRadioButtonAlimentacionOmnivoro, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButtonAlimentacionCarnivoro, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addComponent(jRadioButtonAlimentacionDetritivoros))))
                    .addGroup(jPanelIntroducirDatosAnimalesLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jButtonCrearAnimal))
                    .addGroup(jPanelIntroducirDatosAnimalesLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanelIntroducirDatosAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelArchivoImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldArchivoImagenAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelIntroducirDatosAnimalesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTextoAlimentacion))
                    .addGroup(jPanelIntroducirDatosAnimalesLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanelIntroducirDatosAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelTitulozooDeDatosAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelIntroducirDatosAnimalesLayout.createSequentialGroup()
                                .addGroup(jPanelIntroducirDatosAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelIntroducirDatosAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabelTextoEspecie, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                        .addComponent(jLabelTextoEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabelNombreAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelIntroducirDatosAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelIntroducirDatosAnimalesLayout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addGroup(jPanelIntroducirDatosAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldNombreAnimal)
                                            .addComponent(jTextFieldEspecieAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)))
                                    .addGroup(jPanelIntroducirDatosAnimalesLayout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jSliderEdadAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelIntroducirDatosAnimalesLayout.setVerticalGroup(
            jPanelIntroducirDatosAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntroducirDatosAnimalesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabelTitulozooDeDatosAnimal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelIntroducirDatosAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreAnimal)
                    .addComponent(jTextFieldNombreAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelIntroducirDatosAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTextoEspecie)
                    .addComponent(jTextFieldEspecieAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanelIntroducirDatosAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIntroducirDatosAnimalesLayout.createSequentialGroup()
                        .addComponent(jLabelTextoEdad)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSliderEdadAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTextoAlimentacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelIntroducirDatosAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButtonAlimentacionHerbívoros)
                    .addComponent(jRadioButtonAlimentacionCarnivoro))
                .addGap(18, 18, 18)
                .addGroup(jPanelIntroducirDatosAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanelIntroducirDatosAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButtonAlimentacionOmnivoro)
                        .addComponent(jRadioButtonAlimentacionDetritivoros)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelArchivoImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldArchivoImagenAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCrearAnimal)
                .addGap(24, 24, 24))
        );

        jPanelVerAnimal.setBackground(new java.awt.Color(153, 255, 204));
        jPanelVerAnimal.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanelVerAnimal.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Modificar los datos del Animal");

        jLabel10.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Nombre");

        jLabel11.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Especie");

        jLabel12.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Edad");

        jTextFieldModificarNombreAnimal.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldModificarNombreAnimal.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldModficarEspecieAnimal.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldModficarEspecieAnimal.setForeground(new java.awt.Color(0, 0, 0));

        jButtonModificarAnimal.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jButtonModificarAnimal.setText("Modificar Animal");
        jButtonModificarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarAnimalActionPerformed(evt);
            }
        });

        jButtonEliminarAnimal.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jButtonEliminarAnimal.setText("Eliminar Animal");

        jComboBoxAnimalesParaModificar.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jComboBoxAnimalesParaModificar.setForeground(new java.awt.Color(0, 0, 0));

        jButtonVerAnimal.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jButtonVerAnimal.setText("Ver Animal");
        jButtonVerAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerAnimalActionPerformed(evt);
            }
        });

        jLabelTextoAlimentacion1.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelTextoAlimentacion1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTextoAlimentacion1.setText("Alimentacion");

        jTextFieldModificarEdadAnimal.setFont(new java.awt.Font("Segoe Script", 0, 12)); // NOI18N
        jTextFieldModificarEdadAnimal.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldModificarAlimentacionAnimal.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldModificarAlimentacionAnimal.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanelVerAnimalLayout = new javax.swing.GroupLayout(jPanelVerAnimal);
        jPanelVerAnimal.setLayout(jPanelVerAnimalLayout);
        jPanelVerAnimalLayout.setHorizontalGroup(
            jPanelVerAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVerAnimalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonModificarAnimal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonEliminarAnimal)
                .addGap(191, 191, 191))
            .addGroup(jPanelVerAnimalLayout.createSequentialGroup()
                .addGroup(jPanelVerAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelVerImagenAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelVerAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelVerAnimalLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelVerAnimalLayout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addComponent(jComboBoxAnimalesParaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelVerAnimalLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanelVerAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(40, 40, 40)
                            .addGroup(jPanelVerAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldModficarEspecieAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldModificarNombreAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldModificarEdadAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanelVerAnimalLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabelTextoAlimentacion1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldModificarAlimentacionAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelVerAnimalLayout.createSequentialGroup()
                            .addGap(106, 106, 106)
                            .addComponent(jButtonVerAnimal))
                        .addGroup(jPanelVerAnimalLayout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(jLabel9))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelVerAnimalLayout.setVerticalGroup(
            jPanelVerAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVerAnimalLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxAnimalesParaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jButtonVerAnimal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVerAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldModificarNombreAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVerAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldModficarEspecieAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVerAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldModificarEdadAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVerAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTextoAlimentacion1)
                    .addComponent(jTextFieldModificarAlimentacionAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelVerImagenAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelVerAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModificarAnimal)
                    .addComponent(jButtonEliminarAnimal))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout jPanelGestionAnimalLayout = new javax.swing.GroupLayout(jPanelGestionAnimal);
        jPanelGestionAnimal.setLayout(jPanelGestionAnimalLayout);
        jPanelGestionAnimalLayout.setHorizontalGroup(
            jPanelGestionAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGestionAnimalLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jPanelIntroducirDatosAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelVerAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanelGestionAnimalLayout.setVerticalGroup(
            jPanelGestionAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGestionAnimalLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelGestionAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelIntroducirDatosAnimales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelVerAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 448, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPanel1.addTab("Animal", jPanelGestionAnimal);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(358, 420));

        jPanelIntroducirDatosHabitat.setBackground(new java.awt.Color(153, 255, 204));
        jPanelIntroducirDatosHabitat.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanelIntroducirDatosHabitat.setForeground(new java.awt.Color(0, 0, 0));

        jLabelTitulozooDeDatosHabitatN.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosHabitatN.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosHabitatN.setText("Introduce los datos del Habitat");

        jLabelNombreHabitat.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelNombreHabitat.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombreHabitat.setText("Nombre");

        jLabelTextoClima.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelTextoClima.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTextoClima.setText("Clima");

        jLabelTextoTamaño.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelTextoTamaño.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTextoTamaño.setText("Tamaño");

        jButtonCrearHabitat.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jButtonCrearHabitat.setText("Crear Habitat");

        jLabelTextoCapacidad.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelTextoCapacidad.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTextoCapacidad.setText("Capacidad");

        jTextFieldNombreHabitat.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldNombreHabitat.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldClimaHabitat.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldClimaHabitat.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldCapacidadHabitat.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldCapacidadHabitat.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldTamañoHabitat.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldTamañoHabitat.setForeground(new java.awt.Color(0, 0, 0));

        jLabelAnimalesHabitat.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelAnimalesHabitat.setForeground(new java.awt.Color(0, 0, 0));
        jLabelAnimalesHabitat.setText("Animales");

        javax.swing.GroupLayout jPanelIntroducirDatosHabitatLayout = new javax.swing.GroupLayout(jPanelIntroducirDatosHabitat);
        jPanelIntroducirDatosHabitat.setLayout(jPanelIntroducirDatosHabitatLayout);
        jPanelIntroducirDatosHabitatLayout.setHorizontalGroup(
            jPanelIntroducirDatosHabitatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntroducirDatosHabitatLayout.createSequentialGroup()
                .addGroup(jPanelIntroducirDatosHabitatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIntroducirDatosHabitatLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelIntroducirDatosHabitatLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabelTitulozooDeDatosHabitatN, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelIntroducirDatosHabitatLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanelIntroducirDatosHabitatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTextoTamaño)
                            .addGroup(jPanelIntroducirDatosHabitatLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jComboBoxAnimalHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelIntroducirDatosHabitatLayout.createSequentialGroup()
                                .addGroup(jPanelIntroducirDatosHabitatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNombreHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelTextoClima, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanelIntroducirDatosHabitatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldClimaHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldTamañoHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNombreHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanelIntroducirDatosHabitatLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jButtonCrearHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIntroducirDatosHabitatLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanelIntroducirDatosHabitatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAnimalesHabitat)
                    .addGroup(jPanelIntroducirDatosHabitatLayout.createSequentialGroup()
                        .addComponent(jLabelTextoCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCapacidadHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(86, 86, 86))
        );
        jPanelIntroducirDatosHabitatLayout.setVerticalGroup(
            jPanelIntroducirDatosHabitatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntroducirDatosHabitatLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelTitulozooDeDatosHabitatN)
                .addGap(18, 18, 18)
                .addGroup(jPanelIntroducirDatosHabitatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreHabitat)
                    .addComponent(jTextFieldNombreHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanelIntroducirDatosHabitatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelTextoClima)
                    .addComponent(jTextFieldClimaHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanelIntroducirDatosHabitatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelTextoTamaño)
                    .addComponent(jTextFieldTamañoHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelIntroducirDatosHabitatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTextoCapacidad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldCapacidadHabitat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelIntroducirDatosHabitatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxAnimalHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAnimalesHabitat))
                .addGap(39, 39, 39)
                .addComponent(jButtonCrearHabitat)
                .addGap(26, 26, 26))
        );

        jPanelIntroducirDatosAnimales2.setBackground(new java.awt.Color(153, 255, 204));
        jPanelIntroducirDatosAnimales2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanelIntroducirDatosAnimales2.setForeground(new java.awt.Color(0, 0, 0));

        jLabelTitulozooDeDatosHabitat.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitat.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosHabitat.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosHabitat.setText("Modificar los datos del Habitat");

        jButtonEditarHabitat.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jButtonEditarHabitat.setText("Editar Habitat");

        jButtonEliminarHabitat.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jButtonEliminarHabitat.setText("Eliminar Habitat");

        jComboBoxVerHabitat.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N

        jButtonVerHabitat.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jButtonVerHabitat.setText("Ver Habitat");

        jLabelNombreHabitat1.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelNombreHabitat1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombreHabitat1.setText("Nombre");

        jTextFieldVerNombreHabitat.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldVerNombreHabitat.setForeground(new java.awt.Color(0, 0, 0));

        jLabelTextoClima1.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelTextoClima1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTextoClima1.setText("Clima");

        jTextFieldVerClimaHabitat.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldVerClimaHabitat.setForeground(new java.awt.Color(0, 0, 0));

        jLabelTextoTamaño1.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelTextoTamaño1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTextoTamaño1.setText("Tamaño");

        jTextFieldVerTamañoHabitat.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldVerTamañoHabitat.setForeground(new java.awt.Color(0, 0, 0));

        jLabelTextoCapacidad1.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelTextoCapacidad1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTextoCapacidad1.setText("Capacidad");

        jTextFieldVerCapacidadHabitat.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldVerCapacidadHabitat.setForeground(new java.awt.Color(0, 0, 0));

        jLabelAnimalesHabitat1.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelAnimalesHabitat1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelAnimalesHabitat1.setText("Animales");

        javax.swing.GroupLayout jPanelIntroducirDatosAnimales2Layout = new javax.swing.GroupLayout(jPanelIntroducirDatosAnimales2);
        jPanelIntroducirDatosAnimales2.setLayout(jPanelIntroducirDatosAnimales2Layout);
        jPanelIntroducirDatosAnimales2Layout.setHorizontalGroup(
            jPanelIntroducirDatosAnimales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntroducirDatosAnimales2Layout.createSequentialGroup()
                .addGroup(jPanelIntroducirDatosAnimales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIntroducirDatosAnimales2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabelTitulozooDeDatosHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelIntroducirDatosAnimales2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jComboBoxVerHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelIntroducirDatosAnimales2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jButtonVerHabitat))
                    .addGroup(jPanelIntroducirDatosAnimales2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanelIntroducirDatosAnimales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelIntroducirDatosAnimales2Layout.createSequentialGroup()
                                .addComponent(jButtonEliminarHabitat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonEditarHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelIntroducirDatosAnimales2Layout.createSequentialGroup()
                                .addGroup(jPanelIntroducirDatosAnimales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNombreHabitat1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelTextoClima1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelTextoTamaño1)
                                    .addComponent(jLabelTextoCapacidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelAnimalesHabitat1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelIntroducirDatosAnimales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelIntroducirDatosAnimales2Layout.createSequentialGroup()
                                        .addComponent(jTextFieldVerCapacidadHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldVerClimaHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldVerNombreHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldVerTamañoHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxVerAnimalHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelIntroducirDatosAnimales2Layout.setVerticalGroup(
            jPanelIntroducirDatosAnimales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntroducirDatosAnimales2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelTitulozooDeDatosHabitat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxVerHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonVerHabitat)
                .addGap(12, 12, 12)
                .addGroup(jPanelIntroducirDatosAnimales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreHabitat1)
                    .addComponent(jTextFieldVerNombreHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelIntroducirDatosAnimales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTextoClima1)
                    .addComponent(jTextFieldVerClimaHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelIntroducirDatosAnimales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTextoTamaño1)
                    .addComponent(jTextFieldVerTamañoHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelIntroducirDatosAnimales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIntroducirDatosAnimales2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(105, 105, 105))
                    .addGroup(jPanelIntroducirDatosAnimales2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanelIntroducirDatosAnimales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTextoCapacidad1)
                            .addComponent(jTextFieldVerCapacidadHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelIntroducirDatosAnimales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAnimalesHabitat1)
                            .addComponent(jComboBoxVerAnimalHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanelIntroducirDatosAnimales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditarHabitat)
                    .addComponent(jButtonEliminarHabitat))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanelIntroducirDatosHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelIntroducirDatosAnimales2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelIntroducirDatosHabitat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelIntroducirDatosAnimales2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );

        jTabbedPanel1.addTab("Habitat", jPanel2);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabelEstado.setBackground(new java.awt.Color(153, 255, 204));
        jLabelEstado.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        jLabelEstado.setForeground(new java.awt.Color(0, 0, 0));
        jLabelEstado.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jMenuArchivos.setText("File");

        jMenuItemGuardarZoo.setText("Guardar archivo zoo.dat");
        jMenuItemGuardarZoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGuardarZooActionPerformed(evt);
            }
        });
        jMenuArchivos.add(jMenuItemGuardarZoo);

        jMenuItemLeerZoo.setText("Leer archivo zoo.dat");
        jMenuItemLeerZoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLeerZooActionPerformed(evt);
            }
        });
        jMenuArchivos.add(jMenuItemLeerZoo);

        jMenuBar1.add(jMenuArchivos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPanel1)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 104, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 524, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCrearAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearAnimalActionPerformed
        String nombreAnimal = this.jTextFieldNombreAnimal.getText();
        String especieAnimal = this.jTextFieldEspecieAnimal.getText();
        int edadAnimal = this.jSliderEdadAnimal.getValue();
        String alimentacionAnimal="";
        
        if(this.jRadioButtonAlimentacionCarnivoro.isSelected()){
            alimentacionAnimal="Carnivoro";
        }else if(this.jRadioButtonAlimentacionHerbívoros.isSelected()){
            alimentacionAnimal="Herbivoro";
        }else if(this.jRadioButtonAlimentacionDetritivoros.isSelected()){
            alimentacionAnimal="Detritivoro";
        }else if(this.jRadioButtonAlimentacionOmnivoro.isSelected()){
            alimentacionAnimal="Omnivoro";
        }
        String imagen=this.jTextFieldArchivoImagenAnimal.getText();
        Animal nuevo = new Animal(nombreAnimal, especieAnimal, edadAnimal, alimentacionAnimal, imagen );
        
        if(this.miZoo==null){
            this.jLabelEstado.setText("Aun no se ha creado el animal.");
        }else{
            this.miZoo.anadirAnimal(nuevo);
            this.jLabelEstado.setText("Se ha añadido el animal ya");
            
            //Tengo que crear el combobox par añadir el animal en lo de modificar
            this.jComboBoxAnimalesParaModificar.addItem(nombreAnimal);
            //limpiar todo
            this.jTextFieldNombreAnimal.setText("");
            this.jTextFieldEspecieAnimal.setText("");
            this.jSliderEdadAnimal.setValue(50);
            this.buttonGroupAlimentacionAnimal.clearSelection();
            this.jTextFieldArchivoImagenAnimal.setText("");
            
        }
        
    }//GEN-LAST:event_jButtonCrearAnimalActionPerformed

    private void jLabelArchivoImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelArchivoImagenMouseClicked
        String direcctorioActual = System.getProperty("user.dir");
        
        File carpetaInicial = new File(direcctorioActual);
        this.jFileChooserFotoAnimales.setCurrentDirectory(carpetaInicial);
        this.jFileChooserFotoAnimales.showOpenDialog(null);
        
        File archivo=this.jFileChooserFotoAnimales.getSelectedFile();
        String nombreArchivo=archivo.getName();
        this.jTextFieldArchivoImagenAnimal.setText(nombreArchivo);
        
        
        
    }//GEN-LAST:event_jLabelArchivoImagenMouseClicked

    private void jButtonVerAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerAnimalActionPerformed
        String nombreAnimal=(String) this.jComboBoxAnimalesParaModificar.getSelectedItem();
        Animal buscado=this.miZoo.buscarAnimal(nombreAnimal);
        if(buscado==null){
            this.jLabelEstado.setText("No se encontro ningun animal");
        }else{
            this.jTextFieldModificarNombreAnimal.setText(buscado.getNombreAnimal());
            this.jTextFieldModficarEspecieAnimal.setText(buscado.getEspecie());
            this.jTextFieldModificarEdadAnimal.setText(Integer.toString(buscado.getEdad()));
            this.jTextFieldModificarAlimentacionAnimal.setText(buscado.getAlimentacion());
            
            String rutaImagen = "/Vistas/Imagenes/" + buscado.getImagen();
            ImageIcon img;
            Icon imagen;
            img = new ImageIcon(getClass().getResource(rutaImagen));
            imagen = new ImageIcon(img.getImage().getScaledInstance(this.jLabelVerImagenAnimal.getWidth(), this.jLabelVerImagenAnimal.getHeight(), Image.SCALE_DEFAULT));
            this.jLabelVerImagenAnimal.setIcon(imagen);
            this.jLabelEstado.setText("Datos del animal mostrado");
        }
        
    }//GEN-LAST:event_jButtonVerAnimalActionPerformed

    private void jButtonModificarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarAnimalActionPerformed
        String nombreAnimal=(String)this.jComboBoxAnimalesParaModificar.getSelectedItem();
        int indice=this.jComboBoxAnimalesParaModificar.getSelectedIndex();
        Animal buscado=this.miZoo.buscarAnimal(nombreAnimal);
        if(buscado==null){
            this.jLabelEstado.setText("No hay un animal a modificar");
        }else{
        String nombreAnimalNuevo=this.jTextFieldModificarNombreAnimal.getText();
        buscado.setNombreAnimal(nombreAnimalNuevo);
        String especieAnimalNuevo=this.jTextFieldModficarEspecieAnimal.getText();
        buscado.setEspecie(especieAnimalNuevo);
        int edadAnimalNuevo=Integer.parseInt(this.jTextFieldModificarEdadAnimal.getText());
        buscado.setEdad(edadAnimalNuevo);
        String alimentacionAnimalNuevo=this.jTextFieldModificarAlimentacionAnimal.getText();
        buscado.setAlimentacion(alimentacionAnimalNuevo);
        this.jLabelEstado.setText("El animal se ha modificado");
        
        this.jComboBoxAnimalesParaModificar.removeItemAt(indice);
        this.jComboBoxAnimalesParaModificar.addItem(nombreAnimalNuevo);
        
        
        
        
        
        }
    }//GEN-LAST:event_jButtonModificarAnimalActionPerformed

    private void jMenuItemGuardarZooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGuardarZooActionPerformed
        Archivos archivo = new Archivos();

        this.jFileChooserArchivos.showSaveDialog(this);
        File elegido=this.jFileChooserArchivos.getSelectedFile();
        
        try {
            archivo.guardarZoo(elegido, miZoo);
            this.jLabelEstado.setText("El archivo se ha guardadi");
            
        }catch (FileNotFoundException ex1) {
            this.jLabelEstado.setText("ERROR: No se ha encontrado el archivo");
        
        }catch (IOException ex) {
            this.jLabelEstado.setText("ERROR: Al escrbir en el archivo");
        }
        
    }//GEN-LAST:event_jMenuItemGuardarZooActionPerformed

    private void jMenuItemLeerZooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLeerZooActionPerformed
         Archivos archivo = new Archivos();

        this.jFileChooserArchivos.showOpenDialog(this);
        File elegido=this.jFileChooserArchivos.getSelectedFile();
        
        try {
            miZoo = archivo.leerZoo(elegido);
            this.jLabelEstado.setText("El archivo zoo.dat cargado");
            
            //Actualizar para que no deje crear mas zoos
            this.jButtonCrearZooBoton.setEnabled(false);
            
            this.jTextFieldVeerNombreZoo.setText(miZoo.getNombreZoo());
            
            
        }catch (FileNotFoundException  ex1) {
            this.jLabelEstado.setText("ERROR: No se ha encontrado el archivo");
        }catch (ClassNotFoundException ex1) {
            this.jLabelEstado.setText("ERROR: No se ha encontrado la clase Zoo");     
        }catch (IOException ex) {
            this.jLabelEstado.setText("ERROR: Al cargar la el archivo");
        }
        
        
        
    }//GEN-LAST:event_jMenuItemLeerZooActionPerformed

    private void jButtonVerTodoLosDatosZooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerTodoLosDatosZooActionPerformed

        if(this.miZoo==null){
            this.jLabelEstado.setText("El zoo se ha visualizado");
        }else{
            this.jTextAreaVerZooCompleto.setText(this.miZoo.toString());

        }
    }//GEN-LAST:event_jButtonVerTodoLosDatosZooActionPerformed

    private void jButtonModificarZooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarZooActionPerformed

        if(this.miZoo==null){
            this.jLabelEstado.setText("El zoo aun no se ha creado");
        }else{
            String nombreZooNuevo=this.jTextFieldVeerNombreZoo.getText();
            int superficieZooNuevo=Integer.parseInt(this.jTextFieldVerSuperficieZoo.getText());
            String ciudadZooNuevo=(String)this.jComboBoxVerCiudadZoo.getSelectedItem();

            //cambiamos los datos del zoo

            this.miZoo.setNombreZoo(nombreZooNuevo);
            this.miZoo.setSuperficie(superficieZooNuevo);
            this.miZoo.setCiudad(ciudadZooNuevo);

            this.jLabelEstado.setText("El zoo " + nombreZooNuevo + " con superficie " + superficieZooNuevo + " m en la ciudad " + ciudadZooNuevo);
            this.jTextAreaVerZooCompleto.setText("");
        }
    }//GEN-LAST:event_jButtonModificarZooActionPerformed

    private void jButtonCrearZooBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearZooBotonActionPerformed

        String nombreZoo=this.jTextFieldNombreZoo.getText();
        int superficieZoo=Integer.parseInt(this.jTextFieldSuperficieZoo.getText());
        String ciudadZoo=(String)this.jComboBoxCiudadesZoo.getSelectedItem();

        this.miZoo= new Zoo(nombreZoo, superficieZoo, ciudadZoo);

        this.jLabelEstado.setText("El zoo " + nombreZoo + " con superficie " + superficieZoo + " m en la ciudad " + ciudadZoo);

        this.jTextFieldNombreZoo.setText("");
        this.jTextFieldSuperficieZoo.setText("");
        this.jComboBoxCiudadesZoo.setSelectedIndex(-1);

        this.jTextFieldVeerNombreZoo.setText(miZoo.getNombreZoo());
        this.jTextFieldVerSuperficieZoo.setText(String.valueOf(miZoo.getSuperficie()));
        this.jComboBoxVerCiudadZoo.setSelectedItem(this.miZoo.getCiudad());
    }//GEN-LAST:event_jButtonCrearZooBotonActionPerformed

    
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupAlimentacionAnimal;
    private javax.swing.JButton jButtonCrearAnimal;
    private javax.swing.JButton jButtonCrearHabitat;
    private javax.swing.JButton jButtonCrearZooBoton;
    private javax.swing.JButton jButtonEditarHabitat;
    private javax.swing.JButton jButtonEliminarAnimal;
    private javax.swing.JButton jButtonEliminarHabitat;
    private javax.swing.JButton jButtonModificarAnimal;
    private javax.swing.JButton jButtonModificarZoo;
    private javax.swing.JButton jButtonVerAnimal;
    private javax.swing.JButton jButtonVerHabitat;
    private javax.swing.JButton jButtonVerTodoLosDatosZoo;
    private javax.swing.JComboBox<String> jComboBoxAnimalHabitat;
    private javax.swing.JComboBox<String> jComboBoxAnimalesParaModificar;
    private javax.swing.JComboBox<String> jComboBoxCiudadesZoo;
    private javax.swing.JComboBox<String> jComboBoxVerAnimalHabitat;
    private javax.swing.JComboBox<String> jComboBoxVerCiudadZoo;
    private javax.swing.JComboBox<String> jComboBoxVerHabitat;
    private javax.swing.JFileChooser jFileChooserArchivos;
    private javax.swing.JFileChooser jFileChooserFotoAnimales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAnimalesHabitat;
    private javax.swing.JLabel jLabelAnimalesHabitat1;
    private javax.swing.JLabel jLabelArchivoImagen;
    private javax.swing.JLabel jLabelCiudadZoo;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelNombreAnimal;
    private javax.swing.JLabel jLabelNombreHabitat;
    private javax.swing.JLabel jLabelNombreHabitat1;
    private javax.swing.JLabel jLabelNombreZoo;
    private javax.swing.JLabel jLabelSuperficieZoo;
    private javax.swing.JLabel jLabelTextoAlimentacion;
    private javax.swing.JLabel jLabelTextoAlimentacion1;
    private javax.swing.JLabel jLabelTextoCapacidad;
    private javax.swing.JLabel jLabelTextoCapacidad1;
    private javax.swing.JLabel jLabelTextoClima;
    private javax.swing.JLabel jLabelTextoClima1;
    private javax.swing.JLabel jLabelTextoEdad;
    private javax.swing.JLabel jLabelTextoEspecie;
    private javax.swing.JLabel jLabelTextoTamaño;
    private javax.swing.JLabel jLabelTextoTamaño1;
    private javax.swing.JLabel jLabelTitulozooDeDatosAnimal;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitat;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitatN;
    private javax.swing.JLabel jLabelTitulozooDeDatosZoo;
    private javax.swing.JLabel jLabelVerImagenAnimal;
    private javax.swing.JMenu jMenuArchivos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemGuardarZoo;
    private javax.swing.JMenuItem jMenuItemLeerZoo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelGestionAnimal;
    private javax.swing.JPanel jPanelGestionZoo;
    private javax.swing.JPanel jPanelInicio;
    private javax.swing.JPanel jPanelIntroducirDatosAnimales;
    private javax.swing.JPanel jPanelIntroducirDatosAnimales2;
    private javax.swing.JPanel jPanelIntroducirDatosHabitat;
    private javax.swing.JPanel jPanelIntroducirDatosZoo;
    private javax.swing.JPanel jPanelVerAnimal;
    private javax.swing.JPanel jPanelVerZoo;
    private javax.swing.JRadioButton jRadioButtonAlimentacionCarnivoro;
    private javax.swing.JRadioButton jRadioButtonAlimentacionDetritivoros;
    private javax.swing.JRadioButton jRadioButtonAlimentacionHerbívoros;
    private javax.swing.JRadioButton jRadioButtonAlimentacionOmnivoro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSliderEdadAnimal;
    private javax.swing.JTabbedPane jTabbedPanel1;
    private javax.swing.JTextArea jTextAreaVerZooCompleto;
    private javax.swing.JTextField jTextFieldArchivoImagenAnimal;
    private javax.swing.JTextField jTextFieldCapacidadHabitat;
    private javax.swing.JTextField jTextFieldClimaHabitat;
    private javax.swing.JTextField jTextFieldEspecieAnimal;
    private javax.swing.JTextField jTextFieldModficarEspecieAnimal;
    private javax.swing.JTextField jTextFieldModificarAlimentacionAnimal;
    private javax.swing.JTextField jTextFieldModificarEdadAnimal;
    private javax.swing.JTextField jTextFieldModificarNombreAnimal;
    private javax.swing.JTextField jTextFieldNombreAnimal;
    private javax.swing.JTextField jTextFieldNombreHabitat;
    private javax.swing.JTextField jTextFieldNombreZoo;
    private javax.swing.JTextField jTextFieldSuperficieZoo;
    private javax.swing.JTextField jTextFieldTamañoHabitat;
    private javax.swing.JTextField jTextFieldVeerNombreZoo;
    private javax.swing.JTextField jTextFieldVerCapacidadHabitat;
    private javax.swing.JTextField jTextFieldVerClimaHabitat;
    private javax.swing.JTextField jTextFieldVerNombreHabitat;
    private javax.swing.JTextField jTextFieldVerSuperficieZoo;
    private javax.swing.JTextField jTextFieldVerTamañoHabitat;
    // End of variables declaration//GEN-END:variables
}
