/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Controladores.Archivos;
import Modelos.Administrativo;
import Modelos.Zoo;
import Modelos.Animal;
import Modelos.Cuidador;
import Modelos.Guia;
import Modelos.Habitat;
import Modelos.Limpiador;
import Modelos.Personal;
import Modelos.Visitas;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
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
        buttonGroupHorarioPersonal = new javax.swing.ButtonGroup();
        buttonGroupTipoDePersonal = new javax.swing.ButtonGroup();
        buttonGroupVerPersonalHorario = new javax.swing.ButtonGroup();
        buttonGroupVerTipoDePersonal = new javax.swing.ButtonGroup();
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
        jLabelTextoAlimentacion1 = new javax.swing.JLabel();
        jTextFieldModificarEdadAnimal = new javax.swing.JTextField();
        jTextFieldModificarAlimentacionAnimal = new javax.swing.JTextField();
        jLabelVerImagenAnimal = new javax.swing.JLabel();
        jLabelTextoAlimentacion2 = new javax.swing.JLabel();
        jComboBoxCuidadoresParaModificar = new javax.swing.JComboBox<>();
        jPanelGestionHabitat = new javax.swing.JPanel();
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
        jLabelAnimalesHabitat = new javax.swing.JLabel();
        jSpinnerNumeroDeAnimalesHabitat = new javax.swing.JSpinner();
        jPanelIntroducirDatosAnimales2 = new javax.swing.JPanel();
        jLabelTitulozooDeDatosHabitat = new javax.swing.JLabel();
        jButtonEditarHabitat = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButtonEliminarHabitat = new javax.swing.JButton();
        jComboBoxVerHabitat = new javax.swing.JComboBox<>();
        jLabelNombreHabitat1 = new javax.swing.JLabel();
        jTextFieldVerNombreHabitat = new javax.swing.JTextField();
        jLabelTextoClima1 = new javax.swing.JLabel();
        jTextFieldVerClimaHabitat = new javax.swing.JTextField();
        jLabelTextoTamaño1 = new javax.swing.JLabel();
        jTextFieldVerTamañoHabitat = new javax.swing.JTextField();
        jLabelTextoCapacidad1 = new javax.swing.JLabel();
        jTextFieldVerCapacidadHabitat = new javax.swing.JTextField();
        jLabelAnimalesHabitat1 = new javax.swing.JLabel();
        jSpinnerVerNumeroDeAnimalesHabitat = new javax.swing.JSpinner();
        jPanelGestionPersonal = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanelIntroducirDatosHabitat1 = new javax.swing.JPanel();
        jLabelTitulozooDeDatosHabitatN1 = new javax.swing.JLabel();
        jLabelNombreHabitat2 = new javax.swing.JLabel();
        jLabelTextoClima2 = new javax.swing.JLabel();
        jLabelTextoTamaño2 = new javax.swing.JLabel();
        jButtonCrearPersonal = new javax.swing.JButton();
        jTextFieldNombrePersonal = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldSalarioPersonal = new javax.swing.JTextField();
        jRadioButtonTarde = new javax.swing.JRadioButton();
        jRadioButtonNoche = new javax.swing.JRadioButton();
        jRadioButtonMañana = new javax.swing.JRadioButton();
        jRadioButtonAdministrativoPersonal = new javax.swing.JRadioButton();
        jRadioButtonCuidadorPerosnal = new javax.swing.JRadioButton();
        jRadioButtonGuiaPersonal = new javax.swing.JRadioButton();
        jRadioButtonLimpiadorPersonal = new javax.swing.JRadioButton();
        jLabelTextoTamaño3 = new javax.swing.JLabel();
        jLabelEmpleado = new javax.swing.JLabel();
        jTextFieldExtraEmpleado = new javax.swing.JTextField();
        jPanelIntroducirDatosAnimales3 = new javax.swing.JPanel();
        jLabelTituloModificarHabitat = new javax.swing.JLabel();
        jButtonEditarPersonal = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButtonEliminarPersonal = new javax.swing.JButton();
        jComboBoxVerPersonal = new javax.swing.JComboBox<>();
        jLabelNombreHabitat3 = new javax.swing.JLabel();
        jTextFieldVerNombrePersonal = new javax.swing.JTextField();
        jLabelTextoClima4 = new javax.swing.JLabel();
        jRadioButtonVerTarde = new javax.swing.JRadioButton();
        jRadioButtonVerNoche = new javax.swing.JRadioButton();
        jRadioButtonVerMañana = new javax.swing.JRadioButton();
        jLabelTextoTamaño4 = new javax.swing.JLabel();
        jTextFieldVerSalarioPersonal = new javax.swing.JTextField();
        jLabelTextoTamaño5 = new javax.swing.JLabel();
        jRadioButtonVerAdministrativoPersonal = new javax.swing.JRadioButton();
        jRadioButtonVerGuiaPersonal = new javax.swing.JRadioButton();
        jRadioButtonVerCuidadorPersonal = new javax.swing.JRadioButton();
        jRadioButtonVerLimpiadorPersonal = new javax.swing.JRadioButton();
        jLabelVerEmpleado = new javax.swing.JLabel();
        jTextFieldVerExtraEmpleado = new javax.swing.JTextField();
        jPanelGestionVisitas = new javax.swing.JPanel();
        jPanelIntroducirDatosHabitat2 = new javax.swing.JPanel();
        jLabelTitulozooDeDatosHabitatN2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jRadioButtonGuiaPersonal1 = new javax.swing.JRadioButton();
        jRadioButtonLimpiadorPersonal1 = new javax.swing.JRadioButton();
        jLabelEmpleado1 = new javax.swing.JLabel();
        jLabelTitulozooDeDatosHabitatN4 = new javax.swing.JLabel();
        jTextFieldRecorridoVisita = new javax.swing.JTextField();
        jLabelTitulozooDeDatosHabitatN5 = new javax.swing.JLabel();
        jLabelTitulozooDeDatosHabitatN6 = new javax.swing.JLabel();
        jLabelTitulozooDeDatosHabitatN7 = new javax.swing.JLabel();
        jSpinnerNumeroVisitantes = new javax.swing.JSpinner();
        jComboBoxNombreGuiaVisita = new javax.swing.JComboBox<>();
        jTextFieldFechaVisita = new javax.swing.JTextField();
        jButtonCrearVisita = new javax.swing.JButton();
        jPanelIntroducirDatosHabitat3 = new javax.swing.JPanel();
        jLabelTitulozooDeDatosHabitatN3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jRadioButtonGuiaPersonal2 = new javax.swing.JRadioButton();
        jRadioButtonLimpiadorPersonal2 = new javax.swing.JRadioButton();
        jLabelEmpleado2 = new javax.swing.JLabel();
        jLabelTitulozooDeDatosHabitatN8 = new javax.swing.JLabel();
        jTextFieldVerVisitantesVisita = new javax.swing.JTextField();
        jLabelTitulozooDeDatosHabitatN9 = new javax.swing.JLabel();
        jLabelTitulozooDeDatosHabitatN10 = new javax.swing.JLabel();
        jLabelTitulozooDeDatosHabitatN11 = new javax.swing.JLabel();
        jComboBoxVerFechaVisitas = new javax.swing.JComboBox<>();
        jTextFieldVerRecorridoVisitas = new javax.swing.JTextField();
        jTextFieldVerGuiaVisita = new javax.swing.JTextField();
        jLabelTitulozooDeDatosHabitatN13 = new javax.swing.JLabel();
        jTextFieldVerFechaInicioVisita = new javax.swing.JTextField();
        jTextFieldVerFechaFinalVisitas = new javax.swing.JTextField();
        jButtonBuscarVisita = new javax.swing.JButton();
        jPanelOtrasGestiones = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabelTitulozooDeDatosHabitatN12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBoxAnimalesAsiganarHabitat = new javax.swing.JComboBox<>();
        jComboBoxHabitatGestionGeneral = new javax.swing.JComboBox<>();
        jLabelTitulozooDeDatosHabitatN14 = new javax.swing.JLabel();
        jLabelTitulozooDeDatosHabitatN15 = new javax.swing.JLabel();
        jButtonAñadirAnimalHabitat = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jComboBoxHabitatParaElNumeroAnimales = new javax.swing.JComboBox<>();
        jTextFieldNumeroAnimalesPorHabitat = new javax.swing.JTextField();
        jLabelTitulozooDeDatosHabitatN16 = new javax.swing.JLabel();
        jLabelTitulozooDeDatosHabitatN17 = new javax.swing.JLabel();
        jLabelTitulozooDeDatosHabitatN18 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jTextFieldEspecieParaFiltar = new javax.swing.JTextField();
        jTextFieldEdadParaFiltar = new javax.swing.JTextField();
        jTextFieldHabitatParaFiltar = new javax.swing.JTextField();
        jComboBoxFiltradoEspecieNombres = new javax.swing.JComboBox<>();
        jComboBoxFiltradoEdadNombres = new javax.swing.JComboBox<>();
        jComboBoxFiltradoHabitatNombres = new javax.swing.JComboBox<>();
        jLabelTitulozooDeDatosHabitatN19 = new javax.swing.JLabel();
        jLabelTitulozooDeDatosHabitatN20 = new javax.swing.JLabel();
        jLabelTitulozooDeDatosHabitatN21 = new javax.swing.JLabel();
        jLabelTitulozooDeDatosHabitatN22 = new javax.swing.JLabel();
        jLabelTitulozooDeDatosHabitatN23 = new javax.swing.JLabel();
        jLabelTitulozooDeDatosHabitatN24 = new javax.swing.JLabel();
        jLabelTitulozooDeDatosHabitatN25 = new javax.swing.JLabel();
        jTextFieldNumeroDeAnimalesTotales = new javax.swing.JTextField();
        jTextFieldNumeroTotalEspecies = new javax.swing.JTextField();
        jButtonFiltrarEspecie = new javax.swing.JButton();
        jButtonFiltrarEdad = new javax.swing.JButton();
        jButtonFiltrarHabitat = new javax.swing.JButton();
        jTextFieldNumeroVisitasTotalesPorMesGestiones = new javax.swing.JTextField();
        jButtonMostrarEstadisticaNumeroAnimalEspecie = new javax.swing.JButton();
        jComboBoxNumeroVisitasMes = new javax.swing.JComboBox<>();
        jPanelMostrarAnimales = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaMostrarAnimalCuidadores = new javax.swing.JTextArea();
        jLabelTitulozooDeDatosHabitatN26 = new javax.swing.JLabel();
        jPanelBDDAnimalesEmpleados = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabelTitulozooDeDatosHabitatN27 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaDatosAnimalesBDD = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jLabelTitulozooDeDatosHabitatN28 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaDatosEmpleadosBDD = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabelEstado = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArchivos = new javax.swing.JMenu();
        jMenuItemGuardarZoo = new javax.swing.JMenuItem();
        jMenuItemLeerZoo = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItemGuardarAnimalArchivo = new javax.swing.JMenuItem();
        jMenuItemMostrarAnimalArchivo = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemGuardarTablaAnimalesBDD = new javax.swing.JMenuItem();
        jMenuItemMostrarAnimalBDD = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItemGuardarTablaPersonalBDD = new javax.swing.JMenuItem();
        jMenuItemMostrarPersonalBDD = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPanel1.setForeground(new java.awt.Color(0, 0, 0));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVerZooLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelIntroducirDatosAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIntroducirDatosAnimalesLayout.createSequentialGroup()
                        .addComponent(jLabelTextoEdad)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSliderEdadAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        jButtonEliminarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarAnimalActionPerformed(evt);
            }
        });

        jComboBoxAnimalesParaModificar.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jComboBoxAnimalesParaModificar.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxAnimalesParaModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAnimalesParaModificarActionPerformed(evt);
            }
        });

        jLabelTextoAlimentacion1.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelTextoAlimentacion1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTextoAlimentacion1.setText("Alimentacion");

        jTextFieldModificarEdadAnimal.setFont(new java.awt.Font("Segoe Script", 0, 12)); // NOI18N
        jTextFieldModificarEdadAnimal.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldModificarAlimentacionAnimal.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldModificarAlimentacionAnimal.setForeground(new java.awt.Color(0, 0, 0));

        jLabelTextoAlimentacion2.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelTextoAlimentacion2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTextoAlimentacion2.setText("Cuidador");

        jComboBoxCuidadoresParaModificar.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jComboBoxCuidadoresParaModificar.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxCuidadoresParaModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCuidadoresParaModificarActionPerformed(evt);
            }
        });

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
                            .addGap(32, 32, 32)
                            .addComponent(jLabel9))
                        .addGroup(jPanelVerAnimalLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanelVerAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelTextoAlimentacion1)
                                .addComponent(jLabelTextoAlimentacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanelVerAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBoxCuidadoresParaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldModificarAlimentacionAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelVerAnimalLayout.setVerticalGroup(
            jPanelVerAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVerAnimalLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxAnimalesParaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
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
                .addGroup(jPanelVerAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTextoAlimentacion2)
                    .addComponent(jComboBoxCuidadoresParaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelVerImagenAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelVerAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModificarAnimal)
                    .addComponent(jButtonEliminarAnimal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(jPanelGestionAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelVerAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelIntroducirDatosAnimales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPanel1.addTab("Animal", jPanelGestionAnimal);

        jPanelGestionHabitat.setBackground(new java.awt.Color(204, 255, 204));
        jPanelGestionHabitat.setPreferredSize(new java.awt.Dimension(358, 420));

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
        jButtonCrearHabitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearHabitatActionPerformed(evt);
            }
        });

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
                    .addComponent(jLabelTextoCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAnimalesHabitat))
                .addGroup(jPanelIntroducirDatosHabitatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIntroducirDatosHabitatLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCapacidadHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelIntroducirDatosHabitatLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jSpinnerNumeroDeAnimalesHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanelIntroducirDatosHabitatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTextoCapacidad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldCapacidadHabitat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelIntroducirDatosHabitatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAnimalesHabitat)
                    .addComponent(jSpinnerNumeroDeAnimalesHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
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
        jButtonEditarHabitat.setText("Modificar Habitat");
        jButtonEditarHabitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarHabitatActionPerformed(evt);
            }
        });

        jButtonEliminarHabitat.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jButtonEliminarHabitat.setText("Eliminar Habitat");
        jButtonEliminarHabitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarHabitatActionPerformed(evt);
            }
        });

        jComboBoxVerHabitat.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jComboBoxVerHabitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVerHabitatActionPerformed(evt);
            }
        });

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
                        .addGap(13, 13, 13)
                        .addGroup(jPanelIntroducirDatosAnimales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombreHabitat1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTextoClima1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTextoTamaño1)
                            .addComponent(jLabelTextoCapacidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAnimalesHabitat1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelIntroducirDatosAnimales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelIntroducirDatosAnimales2Layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldVerClimaHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldVerNombreHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldVerTamañoHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerVerNumeroDeAnimalesHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldVerCapacidadHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelIntroducirDatosAnimales2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonEliminarHabitat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditarHabitat)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelIntroducirDatosAnimales2Layout.setVerticalGroup(
            jPanelIntroducirDatosAnimales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntroducirDatosAnimales2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelTitulozooDeDatosHabitat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxVerHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(105, 105, 105))
                    .addGroup(jPanelIntroducirDatosAnimales2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanelIntroducirDatosAnimales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTextoCapacidad1)
                            .addComponent(jTextFieldVerCapacidadHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanelIntroducirDatosAnimales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAnimalesHabitat1)
                            .addComponent(jSpinnerVerNumeroDeAnimalesHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanelIntroducirDatosAnimales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditarHabitat)
                    .addComponent(jButtonEliminarHabitat))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanelGestionHabitatLayout = new javax.swing.GroupLayout(jPanelGestionHabitat);
        jPanelGestionHabitat.setLayout(jPanelGestionHabitatLayout);
        jPanelGestionHabitatLayout.setHorizontalGroup(
            jPanelGestionHabitatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGestionHabitatLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanelIntroducirDatosHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelIntroducirDatosAnimales2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanelGestionHabitatLayout.setVerticalGroup(
            jPanelGestionHabitatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGestionHabitatLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelGestionHabitatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelIntroducirDatosHabitat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelIntroducirDatosAnimales2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );

        jTabbedPanel1.addTab("Habitat", jPanelGestionHabitat);

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        jPanelIntroducirDatosHabitat1.setBackground(new java.awt.Color(153, 255, 204));
        jPanelIntroducirDatosHabitat1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanelIntroducirDatosHabitat1.setForeground(new java.awt.Color(0, 0, 0));

        jLabelTitulozooDeDatosHabitatN1.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN1.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosHabitatN1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosHabitatN1.setText("Introduce los datos del Personal");

        jLabelNombreHabitat2.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelNombreHabitat2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombreHabitat2.setText("Nombre");

        jLabelTextoClima2.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelTextoClima2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTextoClima2.setText("Horario");

        jLabelTextoTamaño2.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelTextoTamaño2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTextoTamaño2.setText("Salario");

        jButtonCrearPersonal.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jButtonCrearPersonal.setText("Crear Personal");
        jButtonCrearPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearPersonalActionPerformed(evt);
            }
        });

        jTextFieldNombrePersonal.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldNombrePersonal.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldSalarioPersonal.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldSalarioPersonal.setForeground(new java.awt.Color(0, 0, 0));

        buttonGroupHorarioPersonal.add(jRadioButtonTarde);
        jRadioButtonTarde.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jRadioButtonTarde.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonTarde.setText("Tarde");

        buttonGroupHorarioPersonal.add(jRadioButtonNoche);
        jRadioButtonNoche.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jRadioButtonNoche.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonNoche.setText("Noche");

        buttonGroupHorarioPersonal.add(jRadioButtonMañana);
        jRadioButtonMañana.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jRadioButtonMañana.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonMañana.setText("Mañana");

        buttonGroupTipoDePersonal.add(jRadioButtonAdministrativoPersonal);
        jRadioButtonAdministrativoPersonal.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jRadioButtonAdministrativoPersonal.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonAdministrativoPersonal.setText("Administrativo");
        jRadioButtonAdministrativoPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButtonAdministrativoPersonalMousePressed(evt);
            }
        });

        buttonGroupTipoDePersonal.add(jRadioButtonCuidadorPerosnal);
        jRadioButtonCuidadorPerosnal.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jRadioButtonCuidadorPerosnal.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonCuidadorPerosnal.setText("Cuidador");
        jRadioButtonCuidadorPerosnal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButtonCuidadorPerosnalMousePressed(evt);
            }
        });

        buttonGroupTipoDePersonal.add(jRadioButtonGuiaPersonal);
        jRadioButtonGuiaPersonal.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jRadioButtonGuiaPersonal.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonGuiaPersonal.setText("Guia");
        jRadioButtonGuiaPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButtonGuiaPersonalMousePressed(evt);
            }
        });

        buttonGroupTipoDePersonal.add(jRadioButtonLimpiadorPersonal);
        jRadioButtonLimpiadorPersonal.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jRadioButtonLimpiadorPersonal.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonLimpiadorPersonal.setText("Limpiador");
        jRadioButtonLimpiadorPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButtonLimpiadorPersonalMousePressed(evt);
            }
        });

        jLabelTextoTamaño3.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelTextoTamaño3.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTextoTamaño3.setText("Tipo");

        jLabelEmpleado.setVisible(false);
        jLabelEmpleado.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelEmpleado.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldExtraEmpleado.setVisible(false);
        jTextFieldExtraEmpleado.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldExtraEmpleado.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanelIntroducirDatosHabitat1Layout = new javax.swing.GroupLayout(jPanelIntroducirDatosHabitat1);
        jPanelIntroducirDatosHabitat1.setLayout(jPanelIntroducirDatosHabitat1Layout);
        jPanelIntroducirDatosHabitat1Layout.setHorizontalGroup(
            jPanelIntroducirDatosHabitat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntroducirDatosHabitat1Layout.createSequentialGroup()
                .addGroup(jPanelIntroducirDatosHabitat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIntroducirDatosHabitat1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabelTitulozooDeDatosHabitatN1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelIntroducirDatosHabitat1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabelNombreHabitat2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jTextFieldNombrePersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelIntroducirDatosHabitat1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jButtonCrearPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelIntroducirDatosHabitat1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanelIntroducirDatosHabitat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelIntroducirDatosHabitat1Layout.createSequentialGroup()
                                .addComponent(jLabelEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jTextFieldExtraEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelIntroducirDatosHabitat1Layout.createSequentialGroup()
                                .addGroup(jPanelIntroducirDatosHabitat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonCuidadorPerosnal)
                                    .addComponent(jRadioButtonAdministrativoPersonal))
                                .addGap(49, 49, 49)
                                .addGroup(jPanelIntroducirDatosHabitat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelIntroducirDatosHabitat1Layout.createSequentialGroup()
                                        .addComponent(jRadioButtonGuiaPersonal)
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jRadioButtonLimpiadorPersonal)))
                            .addGroup(jPanelIntroducirDatosHabitat1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonMañana, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelIntroducirDatosHabitat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTextoClima2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelIntroducirDatosHabitat1Layout.createSequentialGroup()
                                        .addComponent(jRadioButtonTarde, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonNoche, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanelIntroducirDatosHabitat1Layout.createSequentialGroup()
                                .addComponent(jLabelTextoTamaño2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addGroup(jPanelIntroducirDatosHabitat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTextoTamaño3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldSalarioPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelIntroducirDatosHabitat1Layout.setVerticalGroup(
            jPanelIntroducirDatosHabitat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntroducirDatosHabitat1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelTitulozooDeDatosHabitatN1)
                .addGap(18, 18, 18)
                .addGroup(jPanelIntroducirDatosHabitat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreHabitat2)
                    .addComponent(jTextFieldNombrePersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelTextoClima2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelIntroducirDatosHabitat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonTarde)
                    .addComponent(jRadioButtonMañana)
                    .addComponent(jRadioButtonNoche))
                .addGap(21, 21, 21)
                .addGroup(jPanelIntroducirDatosHabitat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTextoTamaño2)
                    .addComponent(jTextFieldSalarioPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelIntroducirDatosHabitat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIntroducirDatosHabitat1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(156, 156, 156))
                    .addGroup(jPanelIntroducirDatosHabitat1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabelTextoTamaño3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelIntroducirDatosHabitat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonGuiaPersonal)
                            .addComponent(jRadioButtonAdministrativoPersonal))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelIntroducirDatosHabitat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonCuidadorPerosnal)
                            .addComponent(jRadioButtonLimpiadorPersonal))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelIntroducirDatosHabitat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldExtraEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jButtonCrearPersonal)
                        .addGap(18, 18, 18))))
        );

        jPanelIntroducirDatosAnimales3.setBackground(new java.awt.Color(153, 255, 204));
        jPanelIntroducirDatosAnimales3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanelIntroducirDatosAnimales3.setForeground(new java.awt.Color(0, 0, 0));

        jLabelTituloModificarHabitat.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTituloModificarHabitat.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTituloModificarHabitat.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTituloModificarHabitat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloModificarHabitat.setText("Modificar los datos del Personal");

        jButtonEditarPersonal.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jButtonEditarPersonal.setText("Editar Personal");
        jButtonEditarPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarPersonalActionPerformed(evt);
            }
        });

        jButtonEliminarPersonal.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jButtonEliminarPersonal.setText("Eliminar Personal");
        jButtonEliminarPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarPersonalActionPerformed(evt);
            }
        });

        jComboBoxVerPersonal.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jComboBoxVerPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVerPersonalActionPerformed(evt);
            }
        });

        jLabelNombreHabitat3.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelNombreHabitat3.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombreHabitat3.setText("Nombre");

        jTextFieldVerNombrePersonal.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldVerNombrePersonal.setForeground(new java.awt.Color(0, 0, 0));

        jLabelTextoClima4.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelTextoClima4.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTextoClima4.setText("Horario");

        buttonGroupVerPersonalHorario.add(jRadioButtonVerTarde);
        jRadioButtonVerTarde.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jRadioButtonVerTarde.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonVerTarde.setText("Tarde");

        buttonGroupVerPersonalHorario.add(jRadioButtonVerNoche);
        jRadioButtonVerNoche.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jRadioButtonVerNoche.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonVerNoche.setText("Noche");

        buttonGroupVerPersonalHorario.add(jRadioButtonVerMañana);
        jRadioButtonVerMañana.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jRadioButtonVerMañana.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonVerMañana.setText("Mañana");

        jLabelTextoTamaño4.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelTextoTamaño4.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTextoTamaño4.setText("Salario");

        jTextFieldVerSalarioPersonal.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldVerSalarioPersonal.setForeground(new java.awt.Color(0, 0, 0));

        jLabelTextoTamaño5.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelTextoTamaño5.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTextoTamaño5.setText("Tipo");

        buttonGroupVerTipoDePersonal.add(jRadioButtonVerAdministrativoPersonal);
        jRadioButtonVerAdministrativoPersonal.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jRadioButtonVerAdministrativoPersonal.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonVerAdministrativoPersonal.setText("Administrativo");
        jRadioButtonVerAdministrativoPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButtonVerAdministrativoPersonalMousePressed(evt);
            }
        });

        buttonGroupVerTipoDePersonal.add(jRadioButtonVerGuiaPersonal);
        jRadioButtonVerGuiaPersonal.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jRadioButtonVerGuiaPersonal.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonVerGuiaPersonal.setText("Guia");
        jRadioButtonVerGuiaPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButtonVerGuiaPersonalMousePressed(evt);
            }
        });

        buttonGroupVerTipoDePersonal.add(jRadioButtonVerCuidadorPersonal);
        jRadioButtonVerCuidadorPersonal.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jRadioButtonVerCuidadorPersonal.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonVerCuidadorPersonal.setText("Cuidador");
        jRadioButtonVerCuidadorPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButtonVerCuidadorPersonalMousePressed(evt);
            }
        });

        buttonGroupVerTipoDePersonal.add(jRadioButtonVerLimpiadorPersonal);
        jRadioButtonVerLimpiadorPersonal.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jRadioButtonVerLimpiadorPersonal.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonVerLimpiadorPersonal.setText("Limpiador");
        jRadioButtonVerLimpiadorPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButtonVerLimpiadorPersonalMousePressed(evt);
            }
        });

        jLabelVerEmpleado.setVisible(false);
        jLabelVerEmpleado.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelVerEmpleado.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldVerExtraEmpleado.setVisible(false);
        jTextFieldVerExtraEmpleado.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldVerExtraEmpleado.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanelIntroducirDatosAnimales3Layout = new javax.swing.GroupLayout(jPanelIntroducirDatosAnimales3);
        jPanelIntroducirDatosAnimales3.setLayout(jPanelIntroducirDatosAnimales3Layout);
        jPanelIntroducirDatosAnimales3Layout.setHorizontalGroup(
            jPanelIntroducirDatosAnimales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntroducirDatosAnimales3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelTituloModificarHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelIntroducirDatosAnimales3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jComboBoxVerPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelIntroducirDatosAnimales3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanelIntroducirDatosAnimales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIntroducirDatosAnimales3Layout.createSequentialGroup()
                        .addComponent(jRadioButtonVerMañana, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(jPanelIntroducirDatosAnimales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelIntroducirDatosAnimales3Layout.createSequentialGroup()
                                .addComponent(jRadioButtonVerTarde, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonVerNoche, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelTextoClima4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelIntroducirDatosAnimales3Layout.createSequentialGroup()
                        .addComponent(jLabelNombreHabitat3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jTextFieldVerNombrePersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanelIntroducirDatosAnimales3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTextoTamaño4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jTextFieldVerSalarioPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelIntroducirDatosAnimales3Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabelTextoTamaño5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIntroducirDatosAnimales3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonEliminarPersonal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEditarPersonal)
                .addGap(156, 156, 156))
            .addGroup(jPanelIntroducirDatosAnimales3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelIntroducirDatosAnimales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIntroducirDatosAnimales3Layout.createSequentialGroup()
                        .addComponent(jLabelVerEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldVerExtraEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelIntroducirDatosAnimales3Layout.createSequentialGroup()
                        .addGroup(jPanelIntroducirDatosAnimales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonVerCuidadorPersonal)
                            .addComponent(jRadioButtonVerAdministrativoPersonal))
                        .addGap(51, 51, 51)
                        .addGroup(jPanelIntroducirDatosAnimales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonVerLimpiadorPersonal)
                            .addGroup(jPanelIntroducirDatosAnimales3Layout.createSequentialGroup()
                                .addComponent(jRadioButtonVerGuiaPersonal)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanelIntroducirDatosAnimales3Layout.setVerticalGroup(
            jPanelIntroducirDatosAnimales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntroducirDatosAnimales3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelTituloModificarHabitat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxVerPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelIntroducirDatosAnimales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreHabitat3)
                    .addComponent(jTextFieldVerNombrePersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTextoClima4)
                .addGap(2, 2, 2)
                .addGroup(jPanelIntroducirDatosAnimales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonVerTarde)
                    .addComponent(jRadioButtonVerNoche)
                    .addComponent(jRadioButtonVerMañana))
                .addGap(18, 18, 18)
                .addGroup(jPanelIntroducirDatosAnimales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTextoTamaño4)
                    .addComponent(jTextFieldVerSalarioPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelIntroducirDatosAnimales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIntroducirDatosAnimales3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(105, 105, 105))
                    .addGroup(jPanelIntroducirDatosAnimales3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTextoTamaño5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelIntroducirDatosAnimales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonVerAdministrativoPersonal)
                            .addComponent(jRadioButtonVerGuiaPersonal))
                        .addGap(7, 7, 7)
                        .addGroup(jPanelIntroducirDatosAnimales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonVerCuidadorPersonal)
                            .addComponent(jRadioButtonVerLimpiadorPersonal))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelIntroducirDatosAnimales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelVerEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldVerExtraEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanelIntroducirDatosAnimales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditarPersonal)
                    .addComponent(jButtonEliminarPersonal))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanelIntroducirDatosHabitat1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelIntroducirDatosAnimales3, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelIntroducirDatosAnimales3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelIntroducirDatosHabitat1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelGestionPersonalLayout = new javax.swing.GroupLayout(jPanelGestionPersonal);
        jPanelGestionPersonal.setLayout(jPanelGestionPersonalLayout);
        jPanelGestionPersonalLayout.setHorizontalGroup(
            jPanelGestionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelGestionPersonalLayout.setVerticalGroup(
            jPanelGestionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPanel1.addTab("Personal", jPanelGestionPersonal);

        jPanelGestionVisitas.setBackground(new java.awt.Color(204, 255, 204));

        jPanelIntroducirDatosHabitat2.setBackground(new java.awt.Color(153, 255, 204));
        jPanelIntroducirDatosHabitat2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanelIntroducirDatosHabitat2.setForeground(new java.awt.Color(0, 0, 0));

        jLabelTitulozooDeDatosHabitatN2.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN2.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosHabitatN2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosHabitatN2.setText("Introduce los datos de la Visita");

        buttonGroupTipoDePersonal.add(jRadioButtonGuiaPersonal1);
        jRadioButtonGuiaPersonal1.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jRadioButtonGuiaPersonal1.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonGuiaPersonal1.setText("Guia");
        jRadioButtonGuiaPersonal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButtonGuiaPersonal1MousePressed(evt);
            }
        });

        buttonGroupTipoDePersonal.add(jRadioButtonLimpiadorPersonal1);
        jRadioButtonLimpiadorPersonal1.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jRadioButtonLimpiadorPersonal1.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonLimpiadorPersonal1.setText("Limpiador");
        jRadioButtonLimpiadorPersonal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButtonLimpiadorPersonal1MousePressed(evt);
            }
        });

        jLabelEmpleado.setVisible(false);
        jLabelEmpleado1.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelEmpleado1.setForeground(new java.awt.Color(0, 0, 0));

        jLabelTitulozooDeDatosHabitatN4.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN4.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosHabitatN4.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosHabitatN4.setText("Fecha");

        jTextFieldRecorridoVisita.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldRecorridoVisita.setForeground(new java.awt.Color(0, 0, 0));

        jLabelTitulozooDeDatosHabitatN5.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN5.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosHabitatN5.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosHabitatN5.setText("Visitantes");

        jLabelTitulozooDeDatosHabitatN6.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN6.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosHabitatN6.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosHabitatN6.setText("Guia");

        jLabelTitulozooDeDatosHabitatN7.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN7.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosHabitatN7.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosHabitatN7.setText("Recorrido");

        jSpinnerNumeroVisitantes.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N

        jComboBoxNombreGuiaVisita.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jComboBoxNombreGuiaVisita.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldFechaVisita.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldFechaVisita.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldFechaVisita.setText("yyyy-MM-dd ");

        jButtonCrearVisita.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jButtonCrearVisita.setText("Crear Visita");
        jButtonCrearVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearVisitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelIntroducirDatosHabitat2Layout = new javax.swing.GroupLayout(jPanelIntroducirDatosHabitat2);
        jPanelIntroducirDatosHabitat2.setLayout(jPanelIntroducirDatosHabitat2Layout);
        jPanelIntroducirDatosHabitat2Layout.setHorizontalGroup(
            jPanelIntroducirDatosHabitat2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntroducirDatosHabitat2Layout.createSequentialGroup()
                .addGroup(jPanelIntroducirDatosHabitat2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIntroducirDatosHabitat2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabelTitulozooDeDatosHabitatN2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelIntroducirDatosHabitat2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanelIntroducirDatosHabitat2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelIntroducirDatosHabitat2Layout.createSequentialGroup()
                                .addGroup(jPanelIntroducirDatosHabitat2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTitulozooDeDatosHabitatN6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelTitulozooDeDatosHabitatN5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelTitulozooDeDatosHabitatN4)
                                    .addComponent(jLabelTitulozooDeDatosHabitatN7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelIntroducirDatosHabitat2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxNombreGuiaVisita, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldFechaVisita)
                                    .addComponent(jLabelEmpleado1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinnerNumeroVisitantes, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                    .addComponent(jTextFieldRecorridoVisita)))
                            .addGroup(jPanelIntroducirDatosHabitat2Layout.createSequentialGroup()
                                .addComponent(jButtonCrearVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)))
                        .addGap(760, 760, 760)
                        .addGroup(jPanelIntroducirDatosHabitat2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelIntroducirDatosHabitat2Layout.createSequentialGroup()
                                .addComponent(jRadioButtonGuiaPersonal1)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jRadioButtonLimpiadorPersonal1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelIntroducirDatosHabitat2Layout.setVerticalGroup(
            jPanelIntroducirDatosHabitat2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntroducirDatosHabitat2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(156, 156, 156))
            .addGroup(jPanelIntroducirDatosHabitat2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelTitulozooDeDatosHabitatN2)
                .addGap(18, 18, 18)
                .addGroup(jPanelIntroducirDatosHabitat2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulozooDeDatosHabitatN4)
                    .addComponent(jTextFieldFechaVisita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelIntroducirDatosHabitat2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIntroducirDatosHabitat2Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jRadioButtonGuiaPersonal1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonLimpiadorPersonal1))
                    .addGroup(jPanelIntroducirDatosHabitat2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanelIntroducirDatosHabitat2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTitulozooDeDatosHabitatN5)
                            .addComponent(jSpinnerNumeroVisitantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanelIntroducirDatosHabitat2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTitulozooDeDatosHabitatN6)
                            .addComponent(jComboBoxNombreGuiaVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanelIntroducirDatosHabitat2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTitulozooDeDatosHabitatN7)
                            .addComponent(jTextFieldRecorridoVisita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabelEmpleado1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCrearVisita)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jPanelIntroducirDatosHabitat3.setBackground(new java.awt.Color(153, 255, 204));
        jPanelIntroducirDatosHabitat3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanelIntroducirDatosHabitat3.setForeground(new java.awt.Color(0, 0, 0));

        jLabelTitulozooDeDatosHabitatN3.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN3.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosHabitatN3.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosHabitatN3.setText("Introduce los datos de la Visita");

        buttonGroupTipoDePersonal.add(jRadioButtonGuiaPersonal2);
        jRadioButtonGuiaPersonal2.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jRadioButtonGuiaPersonal2.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonGuiaPersonal2.setText("Guia");
        jRadioButtonGuiaPersonal2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButtonGuiaPersonal2MousePressed(evt);
            }
        });

        buttonGroupTipoDePersonal.add(jRadioButtonLimpiadorPersonal2);
        jRadioButtonLimpiadorPersonal2.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jRadioButtonLimpiadorPersonal2.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonLimpiadorPersonal2.setText("Limpiador");
        jRadioButtonLimpiadorPersonal2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButtonLimpiadorPersonal2MousePressed(evt);
            }
        });

        jLabelEmpleado.setVisible(false);
        jLabelEmpleado2.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jLabelEmpleado2.setForeground(new java.awt.Color(0, 0, 0));

        jLabelTitulozooDeDatosHabitatN8.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN8.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosHabitatN8.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosHabitatN8.setText("Fecha  Inicio");

        jTextFieldVerVisitantesVisita.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldVerVisitantesVisita.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldVerVisitantesVisita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldVerVisitantesVisitaMousePressed(evt);
            }
        });

        jLabelTitulozooDeDatosHabitatN9.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN9.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosHabitatN9.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosHabitatN9.setText("Visitantes");

        jLabelTitulozooDeDatosHabitatN10.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN10.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosHabitatN10.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosHabitatN10.setText("Guia");

        jLabelTitulozooDeDatosHabitatN11.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN11.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosHabitatN11.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosHabitatN11.setText("Recorrido");

        jComboBoxVerFechaVisitas.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jComboBoxVerFechaVisitas.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxVerFechaVisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVerFechaVisitasActionPerformed(evt);
            }
        });

        jTextFieldVerRecorridoVisitas.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldVerRecorridoVisitas.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldVerGuiaVisita.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldVerGuiaVisita.setForeground(new java.awt.Color(0, 0, 0));

        jLabelTitulozooDeDatosHabitatN13.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN13.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosHabitatN13.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosHabitatN13.setText("Fecha Final");

        jTextFieldVerFechaInicioVisita.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldVerFechaInicioVisita.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldVerFechaInicioVisita.setText("yyyy-MM-dd ");

        jTextFieldVerFechaFinalVisitas.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldVerFechaFinalVisitas.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldVerFechaFinalVisitas.setText("yyyy-MM-dd ");

        jButtonBuscarVisita.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jButtonBuscarVisita.setText("Buscar");
        jButtonBuscarVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarVisitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelIntroducirDatosHabitat3Layout = new javax.swing.GroupLayout(jPanelIntroducirDatosHabitat3);
        jPanelIntroducirDatosHabitat3.setLayout(jPanelIntroducirDatosHabitat3Layout);
        jPanelIntroducirDatosHabitat3Layout.setHorizontalGroup(
            jPanelIntroducirDatosHabitat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntroducirDatosHabitat3Layout.createSequentialGroup()
                .addGroup(jPanelIntroducirDatosHabitat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIntroducirDatosHabitat3Layout.createSequentialGroup()
                        .addGroup(jPanelIntroducirDatosHabitat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelIntroducirDatosHabitat3Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanelIntroducirDatosHabitat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTitulozooDeDatosHabitatN8)
                                    .addComponent(jLabelTitulozooDeDatosHabitatN13)))
                            .addGroup(jPanelIntroducirDatosHabitat3Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanelIntroducirDatosHabitat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTitulozooDeDatosHabitatN10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelTitulozooDeDatosHabitatN11)
                                    .addComponent(jLabelTitulozooDeDatosHabitatN9))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelIntroducirDatosHabitat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelIntroducirDatosHabitat3Layout.createSequentialGroup()
                                .addGroup(jPanelIntroducirDatosHabitat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelIntroducirDatosHabitat3Layout.createSequentialGroup()
                                        .addComponent(jTextFieldVerVisitantesVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelEmpleado2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldVerRecorridoVisitas, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldVerGuiaVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(760, 760, 760)
                                .addGroup(jPanelIntroducirDatosHabitat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelIntroducirDatosHabitat3Layout.createSequentialGroup()
                                        .addComponent(jRadioButtonGuiaPersonal2)
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jRadioButtonLimpiadorPersonal2)))
                            .addComponent(jTextFieldVerFechaInicioVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldVerFechaFinalVisitas, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelIntroducirDatosHabitat3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabelTitulozooDeDatosHabitatN3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelIntroducirDatosHabitat3Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jComboBoxVerFechaVisitas, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelIntroducirDatosHabitat3Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jButtonBuscarVisita)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelIntroducirDatosHabitat3Layout.setVerticalGroup(
            jPanelIntroducirDatosHabitat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntroducirDatosHabitat3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(156, 156, 156))
            .addGroup(jPanelIntroducirDatosHabitat3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelTitulozooDeDatosHabitatN3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelIntroducirDatosHabitat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulozooDeDatosHabitatN8)
                    .addComponent(jTextFieldVerFechaInicioVisita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelIntroducirDatosHabitat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelTitulozooDeDatosHabitatN13)
                    .addComponent(jTextFieldVerFechaFinalVisitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonBuscarVisita)
                .addGap(34, 34, 34)
                .addComponent(jComboBoxVerFechaVisitas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelIntroducirDatosHabitat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelIntroducirDatosHabitat3Layout.createSequentialGroup()
                        .addGroup(jPanelIntroducirDatosHabitat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonGuiaPersonal2)
                            .addComponent(jTextFieldVerRecorridoVisitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelIntroducirDatosHabitat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelIntroducirDatosHabitat3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonLimpiadorPersonal2)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIntroducirDatosHabitat3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldVerGuiaVisita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))
                    .addGroup(jPanelIntroducirDatosHabitat3Layout.createSequentialGroup()
                        .addComponent(jLabelTitulozooDeDatosHabitatN11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelTitulozooDeDatosHabitatN10)
                        .addGap(18, 18, 18)))
                .addGroup(jPanelIntroducirDatosHabitat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelIntroducirDatosHabitat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldVerVisitantesVisita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelTitulozooDeDatosHabitatN9))
                    .addComponent(jLabelEmpleado2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelGestionVisitasLayout = new javax.swing.GroupLayout(jPanelGestionVisitas);
        jPanelGestionVisitas.setLayout(jPanelGestionVisitasLayout);
        jPanelGestionVisitasLayout.setHorizontalGroup(
            jPanelGestionVisitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGestionVisitasLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanelIntroducirDatosHabitat2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelIntroducirDatosHabitat3, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanelGestionVisitasLayout.setVerticalGroup(
            jPanelGestionVisitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGestionVisitasLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelGestionVisitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelIntroducirDatosHabitat3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelIntroducirDatosHabitat2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        jTabbedPanel1.addTab("Visitas", jPanelGestionVisitas);

        jPanelOtrasGestiones.setBackground(new java.awt.Color(204, 255, 204));

        jPanel7.setBackground(new java.awt.Color(153, 255, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel7.setForeground(new java.awt.Color(0, 0, 0));

        jLabelTitulozooDeDatosHabitatN12.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN12.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosHabitatN12.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosHabitatN12.setText("Asignar Animales a los habitats");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jComboBoxAnimalesAsiganarHabitat.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jComboBoxAnimalesAsiganarHabitat.setForeground(new java.awt.Color(0, 0, 0));

        jComboBoxHabitatGestionGeneral.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jComboBoxHabitatGestionGeneral.setForeground(new java.awt.Color(0, 0, 0));

        jLabelTitulozooDeDatosHabitatN14.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN14.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosHabitatN14.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosHabitatN14.setText("Animales");

        jLabelTitulozooDeDatosHabitatN15.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN15.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosHabitatN15.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosHabitatN15.setText("Habitats");

        jButtonAñadirAnimalHabitat.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jButtonAñadirAnimalHabitat.setText("Añadir");
        jButtonAñadirAnimalHabitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirAnimalHabitatActionPerformed(evt);
            }
        });

        jComboBoxHabitatParaElNumeroAnimales.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jComboBoxHabitatParaElNumeroAnimales.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxHabitatParaElNumeroAnimales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHabitatParaElNumeroAnimalesActionPerformed(evt);
            }
        });

        jTextFieldNumeroAnimalesPorHabitat.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldNumeroAnimalesPorHabitat.setForeground(new java.awt.Color(0, 0, 0));

        jLabelTitulozooDeDatosHabitatN16.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN16.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosHabitatN16.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosHabitatN16.setText("Filtrar especie");

        jLabelTitulozooDeDatosHabitatN17.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN17.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosHabitatN17.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosHabitatN17.setText("Filtrar edad");

        jLabelTitulozooDeDatosHabitatN18.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN18.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosHabitatN18.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosHabitatN18.setText("Filtrar habitat");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jTextFieldEspecieParaFiltar.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldEspecieParaFiltar.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldEdadParaFiltar.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldEdadParaFiltar.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldHabitatParaFiltar.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldHabitatParaFiltar.setForeground(new java.awt.Color(0, 0, 0));

        jComboBoxFiltradoEspecieNombres.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jComboBoxFiltradoEspecieNombres.setForeground(new java.awt.Color(0, 0, 0));

        jComboBoxFiltradoEdadNombres.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jComboBoxFiltradoEdadNombres.setForeground(new java.awt.Color(0, 0, 0));

        jComboBoxFiltradoHabitatNombres.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jComboBoxFiltradoHabitatNombres.setForeground(new java.awt.Color(0, 0, 0));

        jLabelTitulozooDeDatosHabitatN19.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN19.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosHabitatN19.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosHabitatN19.setText("Estadisticas basicas");

        jLabelTitulozooDeDatosHabitatN20.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN20.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosHabitatN20.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosHabitatN20.setText("Numero total animales");

        jLabelTitulozooDeDatosHabitatN21.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN21.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosHabitatN21.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosHabitatN21.setText("Numero total especies");

        jLabelTitulozooDeDatosHabitatN22.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN22.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosHabitatN22.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosHabitatN22.setText("Numero visitas por mes");

        jLabelTitulozooDeDatosHabitatN23.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN23.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosHabitatN23.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosHabitatN23.setText("Numero de animales por habitat");

        jLabelTitulozooDeDatosHabitatN24.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN24.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosHabitatN24.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosHabitatN24.setText("Habitats");

        jLabelTitulozooDeDatosHabitatN25.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN25.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosHabitatN25.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosHabitatN25.setText("Numero");

        jTextFieldNumeroDeAnimalesTotales.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldNumeroDeAnimalesTotales.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldNumeroTotalEspecies.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldNumeroTotalEspecies.setForeground(new java.awt.Color(0, 0, 0));

        jButtonFiltrarEspecie.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jButtonFiltrarEspecie.setText("Buscar");
        jButtonFiltrarEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrarEspecieActionPerformed(evt);
            }
        });

        jButtonFiltrarEdad.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jButtonFiltrarEdad.setText("Buscar");
        jButtonFiltrarEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrarEdadActionPerformed(evt);
            }
        });

        jButtonFiltrarHabitat.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jButtonFiltrarHabitat.setText("Buscar");
        jButtonFiltrarHabitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrarHabitatActionPerformed(evt);
            }
        });

        jTextFieldNumeroVisitasTotalesPorMesGestiones.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextFieldNumeroVisitasTotalesPorMesGestiones.setForeground(new java.awt.Color(0, 0, 0));

        jButtonMostrarEstadisticaNumeroAnimalEspecie.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jButtonMostrarEstadisticaNumeroAnimalEspecie.setText("Recargar");
        jButtonMostrarEstadisticaNumeroAnimalEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarEstadisticaNumeroAnimalEspecieActionPerformed(evt);
            }
        });

        jComboBoxNumeroVisitasMes.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jComboBoxNumeroVisitasMes.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxNumeroVisitasMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre", " " }));
        jComboBoxNumeroVisitasMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNumeroVisitasMesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jButtonAñadirAnimalHabitat))
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabelTitulozooDeDatosHabitatN12, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelTitulozooDeDatosHabitatN14)
                                        .addComponent(jLabelTitulozooDeDatosHabitatN15))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBoxHabitatGestionGeneral, 0, 122, Short.MAX_VALUE)
                                        .addComponent(jComboBoxAnimalesAsiganarHabitat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelTitulozooDeDatosHabitatN23)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabelTitulozooDeDatosHabitatN24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBoxHabitatParaElNumeroAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabelTitulozooDeDatosHabitatN25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldNumeroAnimalesPorHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelTitulozooDeDatosHabitatN16, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldEspecieParaFiltar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxFiltradoEspecieNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                        .addComponent(jButtonFiltrarEspecie)
                                        .addGap(20, 20, 20)))
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelTitulozooDeDatosHabitatN17, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldEdadParaFiltar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxFiltradoEdadNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jButtonFiltrarEdad)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldHabitatParaFiltar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelTitulozooDeDatosHabitatN18, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxFiltradoHabitatNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jButtonFiltrarHabitat))))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabelTitulozooDeDatosHabitatN19, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTitulozooDeDatosHabitatN21)
                                    .addComponent(jLabelTitulozooDeDatosHabitatN20))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNumeroTotalEspecies, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNumeroDeAnimalesTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jComboBoxNumeroVisitasMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jTextFieldNumeroVisitasTotalesPorMesGestiones, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabelTitulozooDeDatosHabitatN22))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jButtonMostrarEstadisticaNumeroAnimalEspecie)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator2)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTitulozooDeDatosHabitatN18)
                            .addComponent(jLabelTitulozooDeDatosHabitatN16)
                            .addComponent(jLabelTitulozooDeDatosHabitatN17))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldEdadParaFiltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldHabitatParaFiltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEspecieParaFiltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jButtonFiltrarEspecie)
                                .addGap(31, 31, 31)
                                .addComponent(jComboBoxFiltradoEspecieNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonFiltrarEdad)
                                    .addComponent(jButtonFiltrarHabitat))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxFiltradoEdadNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxFiltradoHabitatNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabelTitulozooDeDatosHabitatN12)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBoxAnimalesAsiganarHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelTitulozooDeDatosHabitatN14))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelTitulozooDeDatosHabitatN15)
                                    .addComponent(jComboBoxHabitatGestionGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addComponent(jButtonAñadirAnimalHabitat))
                            .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(jSeparator3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTitulozooDeDatosHabitatN23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxHabitatParaElNumeroAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTitulozooDeDatosHabitatN24))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNumeroAnimalesPorHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTitulozooDeDatosHabitatN25)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabelTitulozooDeDatosHabitatN19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTitulozooDeDatosHabitatN20)
                            .addComponent(jTextFieldNumeroDeAnimalesTotales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTitulozooDeDatosHabitatN21)
                            .addComponent(jTextFieldNumeroTotalEspecies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMostrarEstadisticaNumeroAnimalEspecie)))
                .addGap(8, 8, 8)
                .addComponent(jLabelTitulozooDeDatosHabitatN22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNumeroVisitasTotalesPorMesGestiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxNumeroVisitasMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout jPanelOtrasGestionesLayout = new javax.swing.GroupLayout(jPanelOtrasGestiones);
        jPanelOtrasGestiones.setLayout(jPanelOtrasGestionesLayout);
        jPanelOtrasGestionesLayout.setHorizontalGroup(
            jPanelOtrasGestionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOtrasGestionesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanelOtrasGestionesLayout.setVerticalGroup(
            jPanelOtrasGestionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOtrasGestionesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPanel1.addTab("Otras Gestiones", jPanelOtrasGestiones);

        jPanelMostrarAnimales.setBackground(new java.awt.Color(204, 255, 204));

        jPanel3.setBackground(new java.awt.Color(153, 255, 204));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        jTextAreaMostrarAnimalCuidadores.setColumns(20);
        jTextAreaMostrarAnimalCuidadores.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextAreaMostrarAnimalCuidadores.setForeground(new java.awt.Color(0, 0, 0));
        jTextAreaMostrarAnimalCuidadores.setRows(5);
        jScrollPane2.setViewportView(jTextAreaMostrarAnimalCuidadores);

        jLabelTitulozooDeDatosHabitatN26.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN26.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosHabitatN26.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosHabitatN26.setText("Animales y sus Cuidadores");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulozooDeDatosHabitatN26, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulozooDeDatosHabitatN26, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanelMostrarAnimalesLayout = new javax.swing.GroupLayout(jPanelMostrarAnimales);
        jPanelMostrarAnimales.setLayout(jPanelMostrarAnimalesLayout);
        jPanelMostrarAnimalesLayout.setHorizontalGroup(
            jPanelMostrarAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMostrarAnimalesLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanelMostrarAnimalesLayout.setVerticalGroup(
            jPanelMostrarAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMostrarAnimalesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 471, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPanel1.addTab("Mostrar Animales.txt", jPanelMostrarAnimales);

        jPanelBDDAnimalesEmpleados.setBackground(new java.awt.Color(204, 255, 204));

        jPanel6.setBackground(new java.awt.Color(153, 255, 204));

        jLabelTitulozooDeDatosHabitatN27.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN27.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosHabitatN27.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosHabitatN27.setText("Datos de los animales ");

        jTextAreaDatosAnimalesBDD.setColumns(20);
        jTextAreaDatosAnimalesBDD.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextAreaDatosAnimalesBDD.setForeground(new java.awt.Color(0, 0, 0));
        jTextAreaDatosAnimalesBDD.setRows(5);
        jScrollPane3.setViewportView(jTextAreaDatosAnimalesBDD);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelTitulozooDeDatosHabitatN27, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulozooDeDatosHabitatN27, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(153, 255, 204));

        jLabelTitulozooDeDatosHabitatN28.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN28.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabelTitulozooDeDatosHabitatN28.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulozooDeDatosHabitatN28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulozooDeDatosHabitatN28.setText("Datos de los Empleados");

        jTextAreaDatosEmpleadosBDD.setColumns(20);
        jTextAreaDatosEmpleadosBDD.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextAreaDatosEmpleadosBDD.setForeground(new java.awt.Color(0, 0, 0));
        jTextAreaDatosEmpleadosBDD.setRows(5);
        jScrollPane4.setViewportView(jTextAreaDatosEmpleadosBDD);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabelTitulozooDeDatosHabitatN28, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulozooDeDatosHabitatN28, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelBDDAnimalesEmpleadosLayout = new javax.swing.GroupLayout(jPanelBDDAnimalesEmpleados);
        jPanelBDDAnimalesEmpleados.setLayout(jPanelBDDAnimalesEmpleadosLayout);
        jPanelBDDAnimalesEmpleadosLayout.setHorizontalGroup(
            jPanelBDDAnimalesEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBDDAnimalesEmpleadosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanelBDDAnimalesEmpleadosLayout.setVerticalGroup(
            jPanelBDDAnimalesEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBDDAnimalesEmpleadosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelBDDAnimalesEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPanel1.addTab("BDD", jPanelBDDAnimalesEmpleados);

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
        jMenuArchivos.add(jSeparator5);

        jMenuItemGuardarAnimalArchivo.setText("Guardar archivo animales.txt ");
        jMenuItemGuardarAnimalArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGuardarAnimalArchivoActionPerformed(evt);
            }
        });
        jMenuArchivos.add(jMenuItemGuardarAnimalArchivo);

        jMenuItemMostrarAnimalArchivo.setText("Mostrar archivo animal.txt");
        jMenuItemMostrarAnimalArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMostrarAnimalArchivoActionPerformed(evt);
            }
        });
        jMenuArchivos.add(jMenuItemMostrarAnimalArchivo);

        jMenuBar1.add(jMenuArchivos);

        jMenu1.setText("Salir");

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("BDD");

        jMenuItemGuardarTablaAnimalesBDD.setText("Guardar tabla animales");
        jMenu2.add(jMenuItemGuardarTablaAnimalesBDD);

        jMenuItemMostrarAnimalBDD.setText("Mostrar animales");
        jMenu2.add(jMenuItemMostrarAnimalBDD);
        jMenu2.add(jSeparator6);

        jMenuItemGuardarTablaPersonalBDD.setText("Guardar tabla Personal");
        jMenu2.add(jMenuItemGuardarTablaPersonalBDD);

        jMenuItemMostrarPersonalBDD.setText("Mostrar personal");
        jMenu2.add(jMenuItemMostrarPersonalBDD);

        jMenuBar1.add(jMenu2);

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
            this.jComboBoxAnimalesAsiganarHabitat.addItem(nombreAnimal);
            
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
            
            Cuidador cuidadorSeleccionado =(Cuidador) this.jComboBoxCuidadoresParaModificar.getSelectedItem();
            if(cuidadorSeleccionado !=null){
                buscado.setCuidador(cuidadorSeleccionado);
            }
        
            this.jLabelEstado.setText("El animal se ha modificado");
            this.jComboBoxAnimalesAsiganarHabitat.removeItem(nombreAnimal);
            this.jComboBoxAnimalesAsiganarHabitat.addItem(nombreAnimalNuevo);
        
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
            //Ingresar datos principales del zoo
            this.jTextFieldVeerNombreZoo.setText(miZoo.getNombreZoo());
            this.jTextFieldVerSuperficieZoo.setText(Integer.toString(miZoo.getSuperficie()));
            this.jComboBoxVerCiudadZoo.setSelectedItem(miZoo.getCiudad());
            
            //Ingresar datos de los animales
            ArrayList<Animal> listaAnimales = miZoo.getAnimales();
            for(Animal animal: listaAnimales){
                this.jComboBoxAnimalesParaModificar.addItem(animal.getNombreAnimal());
                this.jComboBoxAnimalesAsiganarHabitat.addItem(animal.getNombreAnimal());
            }
            
            //Ingresar datos de los habitat
            ArrayList<Habitat> listaHabitat = miZoo.getHabitats();
            for(Habitat habitat : listaHabitat){
                this.jComboBoxVerHabitat.addItem(habitat.getNombre());
                this.jComboBoxHabitatGestionGeneral.addItem(habitat.getNombre());
                this.jComboBoxHabitatParaElNumeroAnimales.addItem(habitat.getNombre());
            }
            
            //Ingresar datos de empleados
            ArrayList<Personal> listaPersonal = miZoo.getPersonal();
            for(Personal personal: listaPersonal){
                this.jComboBoxVerPersonal.addItem(personal.getNombre());
            }
            //guia
            for(Personal guia : listaPersonal){
                if(guia instanceof Guia){
                    this.jComboBoxNombreGuiaVisita.addItem((Guia) guia );
                }
            }
            //cuidador
            for(Personal cuidador : listaPersonal){
                if(cuidador instanceof Cuidador){
                    this.jComboBoxCuidadoresParaModificar.addItem((Cuidador) cuidador);
                }
            }   
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

    private void jButtonEliminarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarAnimalActionPerformed
        String nombreAnimal = (String) this.jComboBoxAnimalesParaModificar.getSelectedItem();
        
        if(nombreAnimal==null){
            this.jLabelEstado.setText("El animal no se puedo eliminar");
        }else{
            this.miZoo.eliminarAnimal(nombreAnimal);
            this.jComboBoxAnimalesAsiganarHabitat.removeItem(nombreAnimal);
        
            this.jComboBoxAnimalesParaModificar.removeItem(nombreAnimal);
            
            this.jTextFieldModificarNombreAnimal.setText("");
            this.jTextFieldModficarEspecieAnimal.setText("");
            this.jTextFieldModificarEdadAnimal.setText("");
            this.jTextFieldModificarAlimentacionAnimal.setText("");
            this.jLabelVerImagenAnimal.setIcon(null);
            this.jLabelEstado.setText("El animal " + nombreAnimal + " se elimino correctamente");
            
        } 
    }//GEN-LAST:event_jButtonEliminarAnimalActionPerformed

    private void jRadioButtonCuidadorPerosnalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonCuidadorPerosnalMousePressed
        this.jLabelEmpleado.setVisible(true);
        this.jLabelEmpleado.setText("Experiencia");
        
        this.jTextFieldExtraEmpleado.setVisible(true);
    }//GEN-LAST:event_jRadioButtonCuidadorPerosnalMousePressed

    private void jRadioButtonAdministrativoPersonalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonAdministrativoPersonalMousePressed
        this.jLabelEmpleado.setVisible(true);
        this.jLabelEmpleado.setText("Departamento");
        
        this.jTextFieldExtraEmpleado.setVisible(true);
    }//GEN-LAST:event_jRadioButtonAdministrativoPersonalMousePressed

    private void jRadioButtonGuiaPersonalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonGuiaPersonalMousePressed
        this.jLabelEmpleado.setVisible(true);
        this.jLabelEmpleado.setText("Idioma");
        
        this.jTextFieldExtraEmpleado.setVisible(true);
    }//GEN-LAST:event_jRadioButtonGuiaPersonalMousePressed

    private void jRadioButtonLimpiadorPersonalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonLimpiadorPersonalMousePressed
        this.jLabelEmpleado.setVisible(true);
        this.jLabelEmpleado.setText("Area");
        
        this.jTextFieldExtraEmpleado.setVisible(true);
    }//GEN-LAST:event_jRadioButtonLimpiadorPersonalMousePressed

    private void jRadioButtonVerAdministrativoPersonalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonVerAdministrativoPersonalMousePressed
        this.jLabelVerEmpleado.setVisible(true);
        this.jLabelVerEmpleado.setText("Departamento");
        this.jTextFieldVerExtraEmpleado.setVisible(true);
    }//GEN-LAST:event_jRadioButtonVerAdministrativoPersonalMousePressed

    private void jRadioButtonVerCuidadorPersonalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonVerCuidadorPersonalMousePressed
        this.jLabelVerEmpleado.setVisible(true);
        this.jLabelVerEmpleado.setText("Experiencia");
        this.jTextFieldVerExtraEmpleado.setVisible(true);
    }//GEN-LAST:event_jRadioButtonVerCuidadorPersonalMousePressed

    private void jRadioButtonVerGuiaPersonalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonVerGuiaPersonalMousePressed
        this.jLabelVerEmpleado.setVisible(true);
        this.jLabelVerEmpleado.setText("Idioma");
        this.jTextFieldVerExtraEmpleado.setVisible(true);
    }//GEN-LAST:event_jRadioButtonVerGuiaPersonalMousePressed

    private void jRadioButtonVerLimpiadorPersonalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonVerLimpiadorPersonalMousePressed
        this.jLabelVerEmpleado.setVisible(true);
        this.jLabelVerEmpleado.setText("Area");
        this.jTextFieldVerExtraEmpleado.setVisible(true);
    }//GEN-LAST:event_jRadioButtonVerLimpiadorPersonalMousePressed

    private void jButtonCrearHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearHabitatActionPerformed
        String nombreHabitat = this.jTextFieldNombreHabitat.getText();
        String clima = this.jTextFieldClimaHabitat.getText();
        int tamaño = Integer.parseInt(this.jTextFieldTamañoHabitat.getText());
        int capacidad = Integer.parseInt(this.jTextFieldCapacidadHabitat.getText());
        int numeroAnimales = (int) this.jSpinnerNumeroDeAnimalesHabitat.getValue();
        
        Habitat nuevoHabitat = new Habitat(nombreHabitat, clima, tamaño, capacidad, numeroAnimales);
        this.miZoo.añadirHabitat(nuevoHabitat);
        
        if(this.miZoo==null){
            this.jLabelEstado.setText("Aun no se ha creado el habitat.");
        }else{
             this.miZoo.añadirHabitat(nuevoHabitat);
            this.jLabelEstado.setText("Se ha añadido el habitat ya");
            
            //Tengo que crear el combobox par añadir el habitat en lo de modificar
            this.jComboBoxVerHabitat.addItem(nombreHabitat);
            this.jComboBoxHabitatGestionGeneral.addItem(nombreHabitat);
            this.jComboBoxHabitatParaElNumeroAnimales.addItem(nombreHabitat);
            
            //limpiar todo
            this.jTextFieldNombreHabitat.setText("");
            this.jTextFieldClimaHabitat.setText("");
            this.jTextFieldTamañoHabitat.setText("");
            this.jTextFieldCapacidadHabitat.setText("");
            this.jSpinnerNumeroDeAnimalesHabitat.setValue(0);
        }
    }//GEN-LAST:event_jButtonCrearHabitatActionPerformed

    private void jComboBoxAnimalesParaModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAnimalesParaModificarActionPerformed
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
    }//GEN-LAST:event_jComboBoxAnimalesParaModificarActionPerformed

    private void jComboBoxVerHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVerHabitatActionPerformed
        String nombreHabitat=(String) this.jComboBoxVerHabitat.getSelectedItem();
        Habitat buscado=this.miZoo.buscarHabitat(nombreHabitat);
        
        if(buscado==null){
            this.jLabelEstado.setText("No se encontro ningun habitat");
        }else{
            this.jTextFieldVerNombreHabitat.setText(buscado.getNombre());
            this.jTextFieldVerClimaHabitat.setText(buscado.getClima());
            this.jTextFieldVerTamañoHabitat.setText(Integer.toString(buscado.getTamaño()));
            this.jTextFieldVerCapacidadHabitat.setText(Integer.toString(buscado.getCapacidad()));
            this.jSpinnerVerNumeroDeAnimalesHabitat.setValue(buscado.getNumeroAnimales());
            this.jLabelEstado.setText("Datos del habitat mostrado");
        }
    }//GEN-LAST:event_jComboBoxVerHabitatActionPerformed

    private void jButtonEditarHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarHabitatActionPerformed
        String nombreHabitat=(String)this.jComboBoxVerHabitat.getSelectedItem();
        int indice=this.jComboBoxVerHabitat.getSelectedIndex();
        Habitat buscado=this.miZoo.buscarHabitat(nombreHabitat);
        
        if(buscado==null){
            this.jLabelEstado.setText("No hay un habitat a modificar");
        }else{
            String nombreHabitatNuevo=this.jTextFieldVerNombreHabitat.getText();
            buscado.setNombre(nombreHabitatNuevo);
            
            String climaHabitatNuevo=this.jTextFieldVerClimaHabitat.getText();
            buscado.setClima(climaHabitatNuevo);
            
            int tamañoHabitatNuevo=Integer.parseInt(this.jTextFieldVerTamañoHabitat.getText());
            buscado.setTamaño(tamañoHabitatNuevo);
            
            int capacidadHabitatNuevo=Integer.parseInt(this.jTextFieldVerCapacidadHabitat.getText());
            buscado.setCapacidad(capacidadHabitatNuevo);
            
            int numeroAnimalesNuevo= (int) this.jSpinnerVerNumeroDeAnimalesHabitat.getValue();
            buscado.setNumeroAnimales(numeroAnimalesNuevo);
            
            this.jLabelEstado.setText("El habitat se ha modificado");
            
            this.jComboBoxHabitatGestionGeneral.removeItem(indice);
            this.jComboBoxHabitatGestionGeneral.addItem(nombreHabitatNuevo);
            
            this.jComboBoxHabitatParaElNumeroAnimales.removeItem(indice);
            this.jComboBoxHabitatParaElNumeroAnimales.addItem(nombreHabitat);
            
            this.jComboBoxVerHabitat.removeItemAt(indice);
            this.jComboBoxVerHabitat.addItem(nombreHabitatNuevo);
        }
    }//GEN-LAST:event_jButtonEditarHabitatActionPerformed

    private void jButtonEliminarHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarHabitatActionPerformed
       String nombreHabitat = (String) this.jComboBoxVerHabitat.getSelectedItem();
        
        if(nombreHabitat==null){
            this.jLabelEstado.setText("El habitat no se puedo eliminar");
        }else{
            this.miZoo.eliminarHabitat(nombreHabitat);
            this.jComboBoxHabitatGestionGeneral.removeItem(nombreHabitat);
             this.jComboBoxHabitatParaElNumeroAnimales.removeItem(nombreHabitat);
            this.jComboBoxVerHabitat.removeItem(nombreHabitat);
            
            this.jTextFieldVerNombreHabitat.setText("");
            this.jTextFieldVerClimaHabitat.setText("");
            this.jTextFieldVerTamañoHabitat.setText("");
            this.jTextFieldVerCapacidadHabitat.setText("");
            this.jSpinnerVerNumeroDeAnimalesHabitat.setValue(0);
            this.jLabelEstado.setText("El habitat " + nombreHabitat + " se elimino correctamente");
            
        }
    }//GEN-LAST:event_jButtonEliminarHabitatActionPerformed

    private void jButtonCrearPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearPersonalActionPerformed
        String nombrePersona = this.jTextFieldNombrePersonal.getText();
        String horario = "";
        double salario = Double.parseDouble(this.jTextFieldSalarioPersonal.getText());
        
        if(this.jRadioButtonMañana.isSelected()){
            horario ="Mañana";
        }else if(this.jRadioButtonTarde.isSelected()){
            horario = "Tarde";
        }else if(this.jRadioButtonNoche.isSelected()){
            horario = "Noche";
        }else{
            this.jLabelEstado.setText("Selecciona un horario");
        }
        
        String valorExtra = this.jTextFieldExtraEmpleado.getText();
        Personal nuevo = null;
        if(this.jRadioButtonAdministrativoPersonal.isSelected()){
            nuevo = new Administrativo(nombrePersona, horario, salario, valorExtra);
        }else if(this.jRadioButtonCuidadorPerosnal.isSelected()){
            int experiencia = Integer.parseInt(valorExtra);
            nuevo = new Cuidador(nombrePersona, horario, salario, experiencia);
        }else if(this.jRadioButtonGuiaPersonal.isSelected()){
            nuevo = new Guia(nombrePersona, horario, salario, valorExtra);
        }else if(this.jRadioButtonLimpiadorPersonal.isSelected()){
            nuevo = new Limpiador(nombrePersona, horario, salario, valorExtra);
        }else{
            this.jLabelEstado.setText("Selecciona un tipo de personal");
        }
        
        this.miZoo.añadirPersonal(nuevo);
        this.jComboBoxVerPersonal.addItem(nombrePersona);
        
        if(nuevo instanceof Guia){
            this.jComboBoxNombreGuiaVisita.addItem((Guia) nuevo); 
        }
        
        if (nuevo instanceof Cuidador) {
            this.jComboBoxCuidadoresParaModificar.addItem((Cuidador) nuevo);
        }

        this.jLabelEstado.setText("Personal añadido");
        
        
        this.jTextFieldNombrePersonal.setText("");
        this.jTextFieldSalarioPersonal.setText("");
        this.jTextFieldExtraEmpleado.setText("");
        this.buttonGroupTipoDePersonal.clearSelection();
        this.buttonGroupHorarioPersonal.clearSelection();
        this.jLabelEmpleado.setText("");
        this.jTextFieldExtraEmpleado.setVisible(false);
        
        
        
    }//GEN-LAST:event_jButtonCrearPersonalActionPerformed

    private void jComboBoxVerPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVerPersonalActionPerformed
        String nombreSeleccionado = (String) this.jComboBoxVerPersonal.getSelectedItem();
    
        if(nombreSeleccionado == null){
           return; 
        }
        
        Personal seleccionado = this.miZoo.buscarPersonal(nombreSeleccionado);
        
        if(seleccionado == null){
            this.jLabelEstado.setText("No se encontro el personal.");
            return;
        }
    
        this.jTextFieldVerNombrePersonal.setText(seleccionado.getNombre());
        this.jTextFieldVerSalarioPersonal.setText(String.valueOf(seleccionado.getSueldo()));

        switch(seleccionado.getHorario()){
            case "Mañana":
                this.jRadioButtonVerMañana.setSelected(true); break;
            case "Tarde":
                this.jRadioButtonVerTarde.setSelected(true); break;
            case "Noche":
                this.jRadioButtonVerNoche.setSelected(true); break;
            }

            
        if(seleccionado instanceof Administrativo){
            Administrativo a = (Administrativo) seleccionado;
            this.jRadioButtonVerAdministrativoPersonal.setSelected(true);
            this.jLabelVerEmpleado.setText("Departamento:");
            this.jTextFieldVerExtraEmpleado.setText(a.getDepartamento());
        }else if(seleccionado instanceof Cuidador){
            Cuidador c = (Cuidador) seleccionado;
            this.jRadioButtonVerCuidadorPersonal.setSelected(true);
            this.jLabelVerEmpleado.setText("Experiencia:");
            this.jTextFieldVerExtraEmpleado.setText(String.valueOf(c.getExperiencia()));
        }else if(seleccionado instanceof Guia){
            Guia g = (Guia) seleccionado;
            this.jRadioButtonVerGuiaPersonal.setSelected(true);
            this.jLabelVerEmpleado.setText("Idioma:");
            this.jTextFieldVerExtraEmpleado.setText(g.getIdioma());
        }else if(seleccionado instanceof Limpiador){
            Limpiador l = (Limpiador) seleccionado;
            this.jRadioButtonVerLimpiadorPersonal.setSelected(true);
            this.jLabelVerEmpleado.setText("Area:");
            this.jTextFieldVerExtraEmpleado.setText(l.getArea());
        }

   
        this.jTextFieldVerExtraEmpleado.setVisible(true);
        this.jLabelVerEmpleado.setVisible(true);
        this.jLabelEstado.setText("Personal cargado.");
    }//GEN-LAST:event_jComboBoxVerPersonalActionPerformed

    private void jButtonEditarPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarPersonalActionPerformed
        String nombreSeleccionado = (String) this.jComboBoxVerPersonal.getSelectedItem();
        int indice = this.jComboBoxVerPersonal.getSelectedIndex();
        Personal buscado = this.miZoo.buscarPersonal(nombreSeleccionado);
        
        if(buscado == null){
            this.jLabelEstado.setText("No se encontro el empleado.");
        }else{
            String nuevoNombre = this.jTextFieldVerNombrePersonal.getText();
            double salario = Double.parseDouble(this.jTextFieldVerSalarioPersonal.getText());
            
            String horario = "";
            if(this.jRadioButtonVerMañana.isSelected()){
                horario = "Mañana";
            }else if(this.jRadioButtonVerTarde.isSelected()){
                horario = "Tarde";
            }else if(this.jRadioButtonVerNoche.isSelected()){
                horario = "Noche";
            }else{
                this.jLabelEstado.setText("Selecciona un horario.");
                return;
            }

            String valorExtra = this.jTextFieldVerExtraEmpleado.getText();

            buscado.setNombre(nuevoNombre);
            buscado.setHorario(horario);
            buscado.setSueldo(salario);
        
            if(buscado instanceof Administrativo){
                ((Administrativo) buscado).setDepartamento(valorExtra);
            }else if(buscado instanceof Cuidador){
                int experiencia = Integer.parseInt(valorExtra);
                ((Cuidador) buscado).setExperiencia(experiencia);
            }else if(buscado instanceof Guia){
                ((Guia) buscado).setIdioma(valorExtra);
            }else if(buscado instanceof Limpiador){
                ((Limpiador) buscado).setArea(valorExtra);
            }

            this.jComboBoxVerPersonal.removeItemAt(indice);
            this.jComboBoxVerPersonal.addItem(nuevoNombre);
            
            if (buscado instanceof Cuidador) {
                this.jComboBoxCuidadoresParaModificar.removeItem(buscado);
                this.jComboBoxCuidadoresParaModificar.addItem((Cuidador) buscado);
            }
            if(buscado instanceof Guia){
                this.jComboBoxNombreGuiaVisita.removeItemAt(indice);
                this.jComboBoxNombreGuiaVisita.removeItem(buscado);
                this.jComboBoxNombreGuiaVisita.addItem((Guia) buscado);
            }


            this.jLabelEstado.setText("Personal modificado correctamente.");
        }
    }//GEN-LAST:event_jButtonEditarPersonalActionPerformed

    private void jButtonEliminarPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarPersonalActionPerformed
        String nombrePersona = (String) this.jComboBoxVerPersonal.getSelectedItem();
        
        if(nombrePersona == null){
            this.jLabelEstado.setText("El empleado no se pudo eliminar");
        }else{
            Personal persona = this.miZoo.buscarPersonal(nombrePersona);
            Guia guiaEliminado = null;
            Cuidador cuidadorEliminado = null;
            if(persona instanceof Guia){
                for (int i = 0; i < this.jComboBoxNombreGuiaVisita.getItemCount(); i++){
                    Guia gui = this.jComboBoxNombreGuiaVisita.getItemAt(i);
                    if(gui.getNombre().equalsIgnoreCase(nombrePersona)){
                        guiaEliminado = gui;
                    }
                }
            }
            if(persona instanceof Cuidador){
                for(int i = 0; i < this.jComboBoxCuidadoresParaModificar.getItemCount(); i++){
                Cuidador cui = this.jComboBoxCuidadoresParaModificar.getItemAt(i);
                    if(cui.getNombre().equalsIgnoreCase(nombrePersona)){
                        cuidadorEliminado = cui;

                    }
                }
            }
            this.miZoo.eliminarPersonal(nombrePersona);
            
            this.jComboBoxVerPersonal.removeItem(nombrePersona);
            
            this.jTextFieldVerNombrePersonal.setText("");
            this.jTextFieldVerSalarioPersonal.setText("");
            this.jTextFieldVerExtraEmpleado.setText("");

            this.buttonGroupVerTipoDePersonal.clearSelection();
            this.buttonGroupVerPersonalHorario.clearSelection();

            this.jTextFieldVerExtraEmpleado.setVisible(false);
            this.jLabelVerEmpleado.setText("");
            
            if(guiaEliminado != null){
                this.jComboBoxNombreGuiaVisita.removeItem(guiaEliminado);
            }
            
            if(cuidadorEliminado != null){
                this.jComboBoxCuidadoresParaModificar.removeItem(cuidadorEliminado);
            }

            this.jLabelEstado.setText("El empleado " + nombrePersona + " se elimino");
        }
    }//GEN-LAST:event_jButtonEliminarPersonalActionPerformed
    
    private void jRadioButtonGuiaPersonal1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonGuiaPersonal1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonGuiaPersonal1MousePressed

    private void jRadioButtonLimpiadorPersonal1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonLimpiadorPersonal1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonLimpiadorPersonal1MousePressed

    private void jRadioButtonLimpiadorPersonal2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonLimpiadorPersonal2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonLimpiadorPersonal2MousePressed

    private void jRadioButtonGuiaPersonal2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonGuiaPersonal2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonGuiaPersonal2MousePressed

    private void jButtonCrearVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearVisitaActionPerformed
        String textoFecha = this.jTextFieldFechaVisita.getText();
        LocalDate fecha = LocalDate.parse(textoFecha);
        int numeroVisitantes = (int) this.jSpinnerNumeroVisitantes.getValue();
        Guia guiaSeleccionado = (Guia) this.jComboBoxNombreGuiaVisita.getSelectedItem();
        String recorrido = this.jTextFieldRecorridoVisita.getText();
        
        Visitas nuevaVisita = new Visitas(fecha, numeroVisitantes, guiaSeleccionado, recorrido);
        
        
        if(this.miZoo==null){
            this.jLabelEstado.setText("Aun no se ha creado la visita.");
        }else{
            this.miZoo.añadirVisita(nuevaVisita);
            this.jLabelEstado.setText("Se ha añadido la visita ya");
            
 
            this.jTextFieldFechaVisita.setText("yyyy-MM-dd");
            this.jSpinnerNumeroVisitantes.setValue(0);
            this.jComboBoxNombreGuiaVisita.setSelectedIndex(-1);
            this.jTextFieldRecorridoVisita.setText("");
            
        }
    }//GEN-LAST:event_jButtonCrearVisitaActionPerformed

    private void jButtonBuscarVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarVisitaActionPerformed
        String textoInicio = this.jTextFieldVerFechaInicioVisita.getText();
        String textoFinal = this.jTextFieldVerFechaFinalVisitas.getText();
        
        if(textoInicio.isEmpty() || textoFinal.isEmpty()){
            this.jLabelEstado.setText("Debes ingresar ambas fechas");
        }else{
            LocalDate fechaInicio = LocalDate.parse(textoInicio);
            LocalDate fechaFinal = LocalDate.parse(textoFinal);
            
            ArrayList<Visitas> visitasFiltradas = this.miZoo.buscarVisitasEntre(fechaInicio, fechaFinal);
            
            this.jComboBoxVerFechaVisitas.removeAllItems();
            
            if(visitasFiltradas.isEmpty()){
                this.jLabelEstado.setText("No se encontrator visitas en ese rango");
            }else{
                ArrayList<String>fechasAgregadas = new ArrayList<>();
                
                for(int i=0; i<visitasFiltradas.size(); i++){
                    Visitas visita = visitasFiltradas.get(i);
                    String fechaTexto = visita.getFechaComoTexto();
                    if(!fechasAgregadas.contains(fechaTexto)){
                        this.jComboBoxVerFechaVisitas.addItem(visita.getFechaComoTexto());
                        fechasAgregadas.add(fechaTexto);
                    }
                }
                this.jLabelEstado.setText("Visitas encontradas");
            }
        }
    }//GEN-LAST:event_jButtonBuscarVisitaActionPerformed

    private void jTextFieldVerVisitantesVisitaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldVerVisitantesVisitaMousePressed
        
    }//GEN-LAST:event_jTextFieldVerVisitantesVisitaMousePressed

    private void jComboBoxVerFechaVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVerFechaVisitasActionPerformed
       String fechaSeleccionada = (String) this.jComboBoxVerFechaVisitas.getSelectedItem();
        
        if(fechaSeleccionada == null || fechaSeleccionada.isEmpty()){
            this.jLabelEstado.setText("No se ha seleccionado la fecha");
        }else{
            LocalDate fechaBuscada = LocalDate.parse(fechaSeleccionada);
            ArrayList<Visitas> todasLasVisitas = this.miZoo.getVisitas();
            
            for(int i=0; i<todasLasVisitas.size(); i++){
                Visitas visita = todasLasVisitas.get(i);
                
                if(visita.getFecha().isEqual(fechaBuscada)){
                    this.jTextFieldVerRecorridoVisitas.setText(visita.getRecorrido());
                    this.jTextFieldVerGuiaVisita.setText(visita.getGuia().getNombre());
                    this.jTextFieldVerVisitantesVisita.setText(String.valueOf(visita.getNumVisitantes()));
                    
                    this.jLabelEstado.setText("Visita cargada correctamente");
                    return;
                }
            }
             this.jLabelEstado.setText("No se encontró visita para esa fecha");
        }
    }//GEN-LAST:event_jComboBoxVerFechaVisitasActionPerformed

    private void jButtonFiltrarEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarEspecieActionPerformed
        String especieBuscada = this.jTextFieldEspecieParaFiltar.getText();
        ArrayList<Animal> animalesFiltrados = this.miZoo.filtrarPorEspecieAnimal(especieBuscada);
        
        if(especieBuscada == null){
            this.jLabelEstado.setText("No se ha introducido ninguna especie");
        }else{
            this.jComboBoxFiltradoEspecieNombres.removeAllItems();
            
            for(int i=0; i< animalesFiltrados.size(); i++){
                Animal ani = animalesFiltrados.get(i);
                this.jComboBoxFiltradoEspecieNombres.addItem(ani.getNombreAnimal());
            }
            
            this.jLabelEstado.setText("Se han cargado los animales de la especie: " + especieBuscada);
            this.jTextFieldEspecieParaFiltar.setText("");
        }
    }//GEN-LAST:event_jButtonFiltrarEspecieActionPerformed

    private void jButtonFiltrarEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarEdadActionPerformed
        String edadTexto = this.jTextFieldEdadParaFiltar.getText();
        int edad = Integer.parseInt(edadTexto);
        ArrayList<Animal> animalesFiltrados = this.miZoo.filtrarPorEdadAnimal(edad);
        
        if(edadTexto == null || edadTexto.isEmpty()){
            this.jLabelEstado.setText("No se ha encontrado ninguna edad");
        }else{
            this.jComboBoxFiltradoEdadNombres.removeAllItems();
            
            for(int i=0; i<animalesFiltrados.size(); i++){
                Animal ani = animalesFiltrados.get(i);
                this.jComboBoxFiltradoEdadNombres.addItem(ani.getNombreAnimal());
            }
            
            this.jLabelEstado.setText("Se han cargado los animales con la edad " + edad);
            this.jTextFieldEdadParaFiltar.setText("");
        }
        
    }//GEN-LAST:event_jButtonFiltrarEdadActionPerformed

    private void jButtonAñadirAnimalHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirAnimalHabitatActionPerformed
        String nombreAnimal = (String) this.jComboBoxAnimalesAsiganarHabitat.getSelectedItem();
        String nombreHabitat = (String) this.jComboBoxHabitatGestionGeneral.getSelectedItem();
        
        Animal animal = this.miZoo.buscarAnimal(nombreAnimal);
        Habitat habitat = this.miZoo.buscarHabitat(nombreHabitat);
        
        if(animal == null || habitat == null){
            this.jLabelEstado.setText("No se pudo encontrar el animal o el habitat");
        }else{
            int capacidad = habitat.getCapacidad();
            int numeroActual = habitat.getNumeroAnimales();
            
            if(numeroActual < capacidad){
                animal.setHabitat(habitat);
                habitat.setNumeroAnimales( numeroActual +1);
                this.jLabelEstado.setText("Animal asiganado correctamente al habitat");
            }else{
                this.jLabelEstado.setText("El habitat esta lleno. No se pudo asiganar");
            }
        
        }
    }//GEN-LAST:event_jButtonAñadirAnimalHabitatActionPerformed

    private void jButtonFiltrarHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarHabitatActionPerformed
        String nombreHabitat = this.jTextFieldHabitatParaFiltar.getText();
        
        if(nombreHabitat.isEmpty()){
            this.jLabelEstado.setText("Debes ingresar el nombre de un habitat");
        }else{
            ArrayList<Animal> animalesFiltrados = this.miZoo.filtrarPorHabitat(nombreHabitat);
            
            this.jComboBoxFiltradoHabitatNombres.removeAllItems();
            
            if(animalesFiltrados.isEmpty()){
                this.jLabelEstado.setText("No se encontraton aniamles para ese habitat");
            }else{
                for(int i=0; i<animalesFiltrados.size(); i++){
                    Animal animal = animalesFiltrados.get(i);
                    this.jComboBoxFiltradoHabitatNombres.addItem(animal.getNombreAnimal());
                }
                this.jLabelEstado.setText("Animales filtrados por habitat");
                this.jTextFieldHabitatParaFiltar.setText("");
            }
        }
    }//GEN-LAST:event_jButtonFiltrarHabitatActionPerformed

    private void jComboBoxCuidadoresParaModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCuidadoresParaModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCuidadoresParaModificarActionPerformed

    private void jComboBoxHabitatParaElNumeroAnimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHabitatParaElNumeroAnimalesActionPerformed
        String nombreHabitat = (String) this.jComboBoxHabitatParaElNumeroAnimales.getSelectedItem();

    if (nombreHabitat == null) {
        this.jLabelEstado.setText("No se ha seleccionado ningún hábitat.");
    } else {
        Habitat habitat = this.miZoo.buscarHabitat(nombreHabitat);
        int cantidad = habitat.getNumeroAnimales();

        this.jTextFieldNumeroAnimalesPorHabitat.setText(String.valueOf(cantidad));
        this.jLabelEstado.setText("Hábitat cargado correctamente.");
    }
    }//GEN-LAST:event_jComboBoxHabitatParaElNumeroAnimalesActionPerformed

    private void jButtonMostrarEstadisticaNumeroAnimalEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarEstadisticaNumeroAnimalEspecieActionPerformed
        int totalAnimales = this.miZoo.contarAnimales();
        int totalEspecies = this.miZoo.contarEspecies();

        this.jTextFieldNumeroDeAnimalesTotales.setText(String.valueOf(totalAnimales));
        this.jTextFieldNumeroTotalEspecies.setText(String.valueOf(totalEspecies));

        this.jLabelEstado.setText("Datos del numero de animales y especies mostrados.");
    }//GEN-LAST:event_jButtonMostrarEstadisticaNumeroAnimalEspecieActionPerformed

    private void jComboBoxNumeroVisitasMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNumeroVisitasMesActionPerformed
        int index = jComboBoxNumeroVisitasMes.getSelectedIndex();

        if (index >= 0){
            int mesSeleccionado = index + 1; 
            int visitas = miZoo.contarVisitasPorMes(mesSeleccionado);

            jTextFieldNumeroVisitasTotalesPorMesGestiones.setText(String.valueOf(visitas));
            jLabelEstado.setText("Visitas encontradas en el mes seleccionado");
            
        }else{
            jLabelEstado.setText("Selecciona un mes válido");
        }
    }//GEN-LAST:event_jComboBoxNumeroVisitasMesActionPerformed

    private void jMenuItemMostrarAnimalArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMostrarAnimalArchivoActionPerformed
        Archivos archi = new Archivos();
        int seleccion = this.jFileChooserArchivos.showOpenDialog(this);
        
        if(seleccion == jFileChooserArchivos.APPROVE_OPTION){
            File elegido = this.jFileChooserArchivos.getSelectedFile();
            
            try{
                archi.mostrarAnimalCuidador(elegido, jTextAreaMostrarAnimalCuidadores);
                this.jLabelEstado.setText("Contenido mostrado");
            }catch(IOException e){
                this.jLabelEstado.setText("Error al leer el archivo");
            }
        }else{
            this.jLabelEstado.setText("No se selecciono nada");
        } 
        
       
    }//GEN-LAST:event_jMenuItemMostrarAnimalArchivoActionPerformed

    private void jMenuItemGuardarAnimalArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGuardarAnimalArchivoActionPerformed
        Archivos archi = new Archivos();
        
        int seleccion = this.jFileChooserArchivos.showSaveDialog(this);
        
        if(seleccion == jFileChooserArchivos.APPROVE_OPTION){
            File archivoElegido = this.jFileChooserArchivos.getSelectedFile();
            
            try{
                archi.guardarAnimalCuidador(archivoElegido, this.miZoo);
                this.jLabelEstado.setText("Archivo guardado correctamnete");
            }catch(IOException e){
                this.jLabelEstado.setText("Error al guardar el archivo");
            }
        }else{
            this.jLabelEstado.setText("No se selecciono nada");
        }
    }//GEN-LAST:event_jMenuItemGuardarAnimalArchivoActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    
    
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
    private javax.swing.ButtonGroup buttonGroupHorarioPersonal;
    private javax.swing.ButtonGroup buttonGroupTipoDePersonal;
    private javax.swing.ButtonGroup buttonGroupVerPersonalHorario;
    private javax.swing.ButtonGroup buttonGroupVerTipoDePersonal;
    private javax.swing.JButton jButtonAñadirAnimalHabitat;
    private javax.swing.JButton jButtonBuscarVisita;
    private javax.swing.JButton jButtonCrearAnimal;
    private javax.swing.JButton jButtonCrearHabitat;
    private javax.swing.JButton jButtonCrearPersonal;
    private javax.swing.JButton jButtonCrearVisita;
    private javax.swing.JButton jButtonCrearZooBoton;
    private javax.swing.JButton jButtonEditarHabitat;
    private javax.swing.JButton jButtonEditarPersonal;
    private javax.swing.JButton jButtonEliminarAnimal;
    private javax.swing.JButton jButtonEliminarHabitat;
    private javax.swing.JButton jButtonEliminarPersonal;
    private javax.swing.JButton jButtonFiltrarEdad;
    private javax.swing.JButton jButtonFiltrarEspecie;
    private javax.swing.JButton jButtonFiltrarHabitat;
    private javax.swing.JButton jButtonModificarAnimal;
    private javax.swing.JButton jButtonModificarZoo;
    private javax.swing.JButton jButtonMostrarEstadisticaNumeroAnimalEspecie;
    private javax.swing.JButton jButtonVerTodoLosDatosZoo;
    private javax.swing.JComboBox<String> jComboBoxAnimalesAsiganarHabitat;
    private javax.swing.JComboBox<String> jComboBoxAnimalesParaModificar;
    private javax.swing.JComboBox<String> jComboBoxCiudadesZoo;
    private javax.swing.JComboBox<Cuidador> jComboBoxCuidadoresParaModificar;
    private javax.swing.JComboBox<String> jComboBoxFiltradoEdadNombres;
    private javax.swing.JComboBox<String> jComboBoxFiltradoEspecieNombres;
    private javax.swing.JComboBox<String> jComboBoxFiltradoHabitatNombres;
    private javax.swing.JComboBox<String> jComboBoxHabitatGestionGeneral;
    private javax.swing.JComboBox<String> jComboBoxHabitatParaElNumeroAnimales;
    private javax.swing.JComboBox<Guia> jComboBoxNombreGuiaVisita;
    private javax.swing.JComboBox<String> jComboBoxNumeroVisitasMes;
    private javax.swing.JComboBox<String> jComboBoxVerCiudadZoo;
    private javax.swing.JComboBox<String> jComboBoxVerFechaVisitas;
    private javax.swing.JComboBox<String> jComboBoxVerHabitat;
    private javax.swing.JComboBox<String> jComboBoxVerPersonal;
    private javax.swing.JFileChooser jFileChooserArchivos;
    private javax.swing.JFileChooser jFileChooserFotoAnimales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JLabel jLabelEmpleado;
    private javax.swing.JLabel jLabelEmpleado1;
    private javax.swing.JLabel jLabelEmpleado2;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelNombreAnimal;
    private javax.swing.JLabel jLabelNombreHabitat;
    private javax.swing.JLabel jLabelNombreHabitat1;
    private javax.swing.JLabel jLabelNombreHabitat2;
    private javax.swing.JLabel jLabelNombreHabitat3;
    private javax.swing.JLabel jLabelNombreZoo;
    private javax.swing.JLabel jLabelSuperficieZoo;
    private javax.swing.JLabel jLabelTextoAlimentacion;
    private javax.swing.JLabel jLabelTextoAlimentacion1;
    private javax.swing.JLabel jLabelTextoAlimentacion2;
    private javax.swing.JLabel jLabelTextoCapacidad;
    private javax.swing.JLabel jLabelTextoCapacidad1;
    private javax.swing.JLabel jLabelTextoClima;
    private javax.swing.JLabel jLabelTextoClima1;
    private javax.swing.JLabel jLabelTextoClima2;
    private javax.swing.JLabel jLabelTextoClima4;
    private javax.swing.JLabel jLabelTextoEdad;
    private javax.swing.JLabel jLabelTextoEspecie;
    private javax.swing.JLabel jLabelTextoTamaño;
    private javax.swing.JLabel jLabelTextoTamaño1;
    private javax.swing.JLabel jLabelTextoTamaño2;
    private javax.swing.JLabel jLabelTextoTamaño3;
    private javax.swing.JLabel jLabelTextoTamaño4;
    private javax.swing.JLabel jLabelTextoTamaño5;
    private javax.swing.JLabel jLabelTituloModificarHabitat;
    private javax.swing.JLabel jLabelTitulozooDeDatosAnimal;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitat;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitatN;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitatN1;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitatN10;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitatN11;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitatN12;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitatN13;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitatN14;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitatN15;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitatN16;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitatN17;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitatN18;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitatN19;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitatN2;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitatN20;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitatN21;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitatN22;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitatN23;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitatN24;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitatN25;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitatN26;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitatN27;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitatN28;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitatN3;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitatN4;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitatN5;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitatN6;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitatN7;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitatN8;
    private javax.swing.JLabel jLabelTitulozooDeDatosHabitatN9;
    private javax.swing.JLabel jLabelTitulozooDeDatosZoo;
    private javax.swing.JLabel jLabelVerEmpleado;
    private javax.swing.JLabel jLabelVerImagenAnimal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenuArchivos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemGuardarAnimalArchivo;
    private javax.swing.JMenuItem jMenuItemGuardarTablaAnimalesBDD;
    private javax.swing.JMenuItem jMenuItemGuardarTablaPersonalBDD;
    private javax.swing.JMenuItem jMenuItemGuardarZoo;
    private javax.swing.JMenuItem jMenuItemLeerZoo;
    private javax.swing.JMenuItem jMenuItemMostrarAnimalArchivo;
    private javax.swing.JMenuItem jMenuItemMostrarAnimalBDD;
    private javax.swing.JMenuItem jMenuItemMostrarPersonalBDD;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelBDDAnimalesEmpleados;
    private javax.swing.JPanel jPanelGestionAnimal;
    private javax.swing.JPanel jPanelGestionHabitat;
    private javax.swing.JPanel jPanelGestionPersonal;
    private javax.swing.JPanel jPanelGestionVisitas;
    private javax.swing.JPanel jPanelGestionZoo;
    private javax.swing.JPanel jPanelInicio;
    private javax.swing.JPanel jPanelIntroducirDatosAnimales;
    private javax.swing.JPanel jPanelIntroducirDatosAnimales2;
    private javax.swing.JPanel jPanelIntroducirDatosAnimales3;
    private javax.swing.JPanel jPanelIntroducirDatosHabitat;
    private javax.swing.JPanel jPanelIntroducirDatosHabitat1;
    private javax.swing.JPanel jPanelIntroducirDatosHabitat2;
    private javax.swing.JPanel jPanelIntroducirDatosHabitat3;
    private javax.swing.JPanel jPanelIntroducirDatosZoo;
    private javax.swing.JPanel jPanelMostrarAnimales;
    private javax.swing.JPanel jPanelOtrasGestiones;
    private javax.swing.JPanel jPanelVerAnimal;
    private javax.swing.JPanel jPanelVerZoo;
    private javax.swing.JRadioButton jRadioButtonAdministrativoPersonal;
    private javax.swing.JRadioButton jRadioButtonAlimentacionCarnivoro;
    private javax.swing.JRadioButton jRadioButtonAlimentacionDetritivoros;
    private javax.swing.JRadioButton jRadioButtonAlimentacionHerbívoros;
    private javax.swing.JRadioButton jRadioButtonAlimentacionOmnivoro;
    private javax.swing.JRadioButton jRadioButtonCuidadorPerosnal;
    private javax.swing.JRadioButton jRadioButtonGuiaPersonal;
    private javax.swing.JRadioButton jRadioButtonGuiaPersonal1;
    private javax.swing.JRadioButton jRadioButtonGuiaPersonal2;
    private javax.swing.JRadioButton jRadioButtonLimpiadorPersonal;
    private javax.swing.JRadioButton jRadioButtonLimpiadorPersonal1;
    private javax.swing.JRadioButton jRadioButtonLimpiadorPersonal2;
    private javax.swing.JRadioButton jRadioButtonMañana;
    private javax.swing.JRadioButton jRadioButtonNoche;
    private javax.swing.JRadioButton jRadioButtonTarde;
    private javax.swing.JRadioButton jRadioButtonVerAdministrativoPersonal;
    private javax.swing.JRadioButton jRadioButtonVerCuidadorPersonal;
    private javax.swing.JRadioButton jRadioButtonVerGuiaPersonal;
    private javax.swing.JRadioButton jRadioButtonVerLimpiadorPersonal;
    private javax.swing.JRadioButton jRadioButtonVerMañana;
    private javax.swing.JRadioButton jRadioButtonVerNoche;
    private javax.swing.JRadioButton jRadioButtonVerTarde;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JSlider jSliderEdadAnimal;
    private javax.swing.JSpinner jSpinnerNumeroDeAnimalesHabitat;
    private javax.swing.JSpinner jSpinnerNumeroVisitantes;
    private javax.swing.JSpinner jSpinnerVerNumeroDeAnimalesHabitat;
    private javax.swing.JTabbedPane jTabbedPanel1;
    private javax.swing.JTextArea jTextAreaDatosAnimalesBDD;
    private javax.swing.JTextArea jTextAreaDatosEmpleadosBDD;
    private javax.swing.JTextArea jTextAreaMostrarAnimalCuidadores;
    private javax.swing.JTextArea jTextAreaVerZooCompleto;
    private javax.swing.JTextField jTextFieldArchivoImagenAnimal;
    private javax.swing.JTextField jTextFieldCapacidadHabitat;
    private javax.swing.JTextField jTextFieldClimaHabitat;
    private javax.swing.JTextField jTextFieldEdadParaFiltar;
    private javax.swing.JTextField jTextFieldEspecieAnimal;
    private javax.swing.JTextField jTextFieldEspecieParaFiltar;
    private javax.swing.JTextField jTextFieldExtraEmpleado;
    private javax.swing.JTextField jTextFieldFechaVisita;
    private javax.swing.JTextField jTextFieldHabitatParaFiltar;
    private javax.swing.JTextField jTextFieldModficarEspecieAnimal;
    private javax.swing.JTextField jTextFieldModificarAlimentacionAnimal;
    private javax.swing.JTextField jTextFieldModificarEdadAnimal;
    private javax.swing.JTextField jTextFieldModificarNombreAnimal;
    private javax.swing.JTextField jTextFieldNombreAnimal;
    private javax.swing.JTextField jTextFieldNombreHabitat;
    private javax.swing.JTextField jTextFieldNombrePersonal;
    private javax.swing.JTextField jTextFieldNombreZoo;
    private javax.swing.JTextField jTextFieldNumeroAnimalesPorHabitat;
    private javax.swing.JTextField jTextFieldNumeroDeAnimalesTotales;
    private javax.swing.JTextField jTextFieldNumeroTotalEspecies;
    private javax.swing.JTextField jTextFieldNumeroVisitasTotalesPorMesGestiones;
    private javax.swing.JTextField jTextFieldRecorridoVisita;
    private javax.swing.JTextField jTextFieldSalarioPersonal;
    private javax.swing.JTextField jTextFieldSuperficieZoo;
    private javax.swing.JTextField jTextFieldTamañoHabitat;
    private javax.swing.JTextField jTextFieldVeerNombreZoo;
    private javax.swing.JTextField jTextFieldVerCapacidadHabitat;
    private javax.swing.JTextField jTextFieldVerClimaHabitat;
    private javax.swing.JTextField jTextFieldVerExtraEmpleado;
    private javax.swing.JTextField jTextFieldVerFechaFinalVisitas;
    private javax.swing.JTextField jTextFieldVerFechaInicioVisita;
    private javax.swing.JTextField jTextFieldVerGuiaVisita;
    private javax.swing.JTextField jTextFieldVerNombreHabitat;
    private javax.swing.JTextField jTextFieldVerNombrePersonal;
    private javax.swing.JTextField jTextFieldVerRecorridoVisitas;
    private javax.swing.JTextField jTextFieldVerSalarioPersonal;
    private javax.swing.JTextField jTextFieldVerSuperficieZoo;
    private javax.swing.JTextField jTextFieldVerTamañoHabitat;
    private javax.swing.JTextField jTextFieldVerVisitantesVisita;
    // End of variables declaration//GEN-END:variables
}
