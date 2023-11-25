// Version/ProyectoCubo_10.0
// Updates: Registro (Tabla)
package proyectocubo;

import static proyectocubo.ProyectoCubo.C6;
import java.awt.Color; //Libreria para usar colores.

import javax.management.remote.TargetedNotification;
import javax.swing.table.DefaultTableModel;

import static proyectocubo.ProyectoCubo.C1;
import static proyectocubo.ProyectoCubo.C2;
import static proyectocubo.ProyectoCubo.C3;
import static proyectocubo.ProyectoCubo.C4;
import static proyectocubo.ProyectoCubo.C5;
import static proyectocubo.ProyectoCubo.C6;

public class FormCubo extends javax.swing.JFrame {
    public static int ccol = 0;

    // Declarar variables de los colores.
    // public static Color Rojo = Color.red;
    public static Color Rojo = new Color(255, 77, 77);
    // public static Color Amarillo = Color.yellow;
    public static Color Amarillo = new Color(255, 224, 102);
    // public static Color Naranja = Color.orange;
    public static Color Naranja = new Color(255, 153, 0);
    // public static Color Blanco = Color.white;
    public static Color Blanco = new Color(242, 242, 242);
    // public static Color Verde = Color.green;
    public static Color Verde = new Color(0, 179, 134);
    // public static Color Azul = Color.blue;
    public static Color Azul = new Color(26, 163, 255);
    // public static Color Azul = new Color.(7, 98, 173);

    // Solucion
    // public static String Mov[] = new String [300];
    // int cm = -1; //contador de movimientos
    // int Sol = 0;

    // public static int reg = 0;
    // public static String Mov[] = new String[300];
    // public static boolean Sol = false;
    // public static String prevLog;

    public static String Mov[] = new String[300];
    public static int reg = 0; // Registros
    public static int Sol = 0; // 0 El cubo esta armado // 1 Hay que armar el cubo.
    public static int Ultimo_Registro = 0; // Aqui se guardara el ultimo valor de reg, una vez que se aprete el boton de
                                           // solucion.

    // DefaultTableModel Tabla_Mov = new DefaultTableModel();
    // DefaultTableModel Tabla_Mov = new DefaultTableModel();
    DefaultTableModel tdm = new DefaultTableModel();

    void Agregar_Registro(String x) {

        // Agrega Registros
        Mov[reg] = x;
        reg = reg + 1;
        
        
        label_reg.setText(String.valueOf(reg));

        if (reg >= 1) {
            label_Mov1.setText(":-$ Cantidad de registros: ");
        }

        else if (reg == 1) {
            label_Mov1.setText(":-$ Cubo Armado/");
        }

        else {
            label_Mov1.setText("Error");
        }
        
        label_Mov.setText(":-$ Ultimo Movimiento: " + x);

        // Tabla
        // Get Model - Llamamos a la cosa que esta en Tabla_Mov.setModel
        DefaultTableModel model = (DefaultTableModel) Tabla_Mov.getModel();
        // Add Row
        model.addRow(new Object[] { "", "" });
        // Add Data
        Tabla_Mov.setValueAt(Mov[reg], reg, 1);
        Tabla_Mov.setValueAt(String.valueOf(reg), reg, 0);

    }

    void Solucion() {
        // Tabla
        // Get Model - Llamamos a la cosa que esta en Tabla_Mov.setModel
        DefaultTableModel model = (DefaultTableModel) Tabla_Mov.getModel();
        // Set Rows 1
        model.setRowCount(1);
        //Labels
        label_Mov.setText("Cubo Armado");
        label_reg.setText("Sin Registros");

        // Boton Solucion
        reg = Ultimo_Registro;
        reg = 0; // Reiniciar registros a 0.

        // Movimientos A
        if (Mov[reg].equals("A1"));
            B1();
        if (Mov[reg].equals("A2"));
            B2();
        if (Mov[reg].equals("A3"));
            B3();

        // Movimientos B
        if (Mov[reg].equals("B1"));
            A1();
        if (Mov[reg].equals("B2"));
            A2();
        if (Mov[reg].equals("B3"));
            A3();
    }

    // Funcion Solucion En Clase
    // void Solucion() {
    // // Sol = 1;
    // // //A
    // // if(Mov[cm].equals("A1")) B1();
    // // if(Mov[cm].equals("A2")) B2();
    // // if(Mov[cm].equals("A3")) B3();
    // // //B
    // // if(Mov[cm].equals("B1")) A1();
    // // if(Mov[cm].equals("B2")) A2();
    // // if(Mov[cm].equals("B3")) A3();
    // //
    // // //I
    // // if(Mov[cm].equals("I1")) D1();
    // // if(Mov[cm].equals("I2")) D2();
    // // if(Mov[cm].equals("I3")) D3();
    // //
    // // //D
    // // if(Mov[cm].equals("D1")) I1();
    // // if(Mov[cm].equals("D2")) I2();
    // // if(Mov[cm].equals("D3")) I3();
    // //
    // // if(cm<0){
    // //
    // // }
    // //

    // }

    // Matriz de Color
    public static Color COL1[][] = {
            { Rojo, Rojo, Rojo, Rojo },
            { Rojo, Rojo, Rojo, Rojo },
            { Rojo, Rojo, Rojo, Rojo },
            { Rojo, Rojo, Rojo, Rojo }
    };

    public static Color COL2[][] = {
            { Amarillo, Amarillo, Amarillo, Amarillo },
            { Amarillo, Amarillo, Amarillo, Amarillo },
            { Amarillo, Amarillo, Amarillo, Amarillo },
            { Amarillo, Amarillo, Amarillo, Amarillo }
    };

    public static Color COL3[][] = {
            { Naranja, Naranja, Naranja, Naranja },
            { Naranja, Naranja, Naranja, Naranja },
            { Naranja, Naranja, Naranja, Naranja },
            { Naranja, Naranja, Naranja, Naranja }
    };

    public static Color COL4[][] = {
            { Blanco, Blanco, Blanco, Blanco },
            { Blanco, Blanco, Blanco, Blanco },
            { Blanco, Blanco, Blanco, Blanco },
            { Blanco, Blanco, Blanco, Blanco }
    };

    public static Color COL5[][] = {
            { Verde, Verde, Verde, Verde },
            { Verde, Verde, Verde, Verde },
            { Verde, Verde, Verde, Verde },
            { Verde, Verde, Verde, Verde }
    };

    public static Color COL6[][] = {
            { Azul, Azul, Azul, Azul },
            { Azul, Azul, Azul, Azul },
            { Azul, Azul, Azul, Azul },
            { Azul, Azul, Azul, Azul } };

    void ColoresOn1() {
        Txt1_11.setBackground(COL1[1][1]);
        Txt1_12.setBackground(COL1[1][2]);
        Txt1_13.setBackground(COL1[1][3]);
        Txt1_21.setBackground(COL1[2][1]);
        Txt1_22.setBackground(COL1[2][2]);
        Txt1_23.setBackground(COL1[2][3]);
        Txt1_31.setBackground(COL1[3][1]);
        Txt1_32.setBackground(COL1[3][2]);
        Txt1_33.setBackground(COL1[3][3]);
    }

    void ColoresOn2() {
        Txt2_11.setBackground(COL2[1][1]);
        Txt2_12.setBackground(COL2[1][2]);
        Txt2_13.setBackground(COL2[1][3]);
        Txt2_21.setBackground(COL2[2][1]);
        Txt2_22.setBackground(COL2[2][2]);
        Txt2_23.setBackground(COL2[2][3]);
        Txt2_31.setBackground(COL2[3][1]);
        Txt2_32.setBackground(COL2[3][2]);
        Txt2_33.setBackground(COL2[3][3]);
    }

    void ColoresOn3() {
        Txt3_11.setBackground(COL3[1][1]);
        Txt3_12.setBackground(COL3[1][2]);
        Txt3_13.setBackground(COL3[1][3]);
        Txt3_21.setBackground(COL3[2][1]);
        Txt3_22.setBackground(COL3[2][2]);
        Txt3_23.setBackground(COL3[2][3]);
        Txt3_31.setBackground(COL3[3][1]);
        Txt3_32.setBackground(COL3[3][2]);
        Txt3_33.setBackground(COL3[3][3]);
    }

    void ColoresOn4() {
        Txt4_11.setBackground(COL4[1][1]);
        Txt4_12.setBackground(COL4[1][2]);
        Txt4_13.setBackground(COL4[1][3]);
        Txt4_21.setBackground(COL4[2][1]);
        Txt4_22.setBackground(COL4[2][2]);
        Txt4_23.setBackground(COL4[2][3]);
        Txt4_31.setBackground(COL4[3][1]);
        Txt4_32.setBackground(COL4[3][2]);
        Txt4_33.setBackground(COL4[3][3]);
    }

    void ColoresOn5() {
        Txt5_11.setBackground(COL5[1][1]);
        Txt5_12.setBackground(COL5[1][2]);
        Txt5_13.setBackground(COL5[1][3]);
        Txt5_21.setBackground(COL5[2][1]);
        Txt5_22.setBackground(COL5[2][2]);
        Txt5_23.setBackground(COL5[2][3]);
        Txt5_31.setBackground(COL5[3][1]);
        Txt5_32.setBackground(COL5[3][2]);
        Txt5_33.setBackground(COL5[3][3]);
    }

    void ColoresOn6() {
        Txt6_11.setBackground(COL6[1][1]);
        Txt6_12.setBackground(COL6[1][2]);
        Txt6_13.setBackground(COL6[1][3]);
        Txt6_21.setBackground(COL6[2][1]);
        Txt6_22.setBackground(COL6[2][2]);
        Txt6_23.setBackground(COL6[2][3]);
        Txt6_31.setBackground(COL6[3][1]);
        Txt6_32.setBackground(COL6[3][2]);
        Txt6_33.setBackground(COL6[3][3]);
    }

    void ColoresOn() {
        ColoresOn1();
        ColoresOn2();
        ColoresOn3();
        ColoresOn4();
        ColoresOn5();
        ColoresOn6();

    }

    public static int cc = 0;

    // Las caras del cubo.
    public static int C1[][] = {
            { 0, 0, 0, 0 },
            { 0, 11, 12, 13 },
            { 0, 14, 15, 16 },
            { 0, 17, 18, 19 } };

    public static int C2[][] = {
            { 0, 0, 0, 0 },
            { 0, 21, 22, 23 },
            { 0, 24, 25, 26 },
            { 0, 27, 28, 29 } };

    public static int C3[][] = {
            { 0, 0, 0, 0 },
            { 0, 31, 32, 33 },
            { 0, 34, 35, 36 },
            { 0, 37, 38, 39 } };

    public static int C4[][] = {
            { 0, 0, 0, 0 },
            { 0, 41, 42, 43 },
            { 0, 44, 45, 46 },
            { 0, 47, 48, 49 } };

    public static int C5[][] = {
            { 0, 0, 0, 0 },
            { 0, 51, 52, 53 },
            { 0, 54, 55, 56 },
            { 0, 57, 58, 59 } };

    public static int C6[][] = {
            { 0, 0, 0, 0 },
            { 0, 61, 62, 63 },
            { 0, 64, 65, 66 },
            { 0, 67, 68, 69 } };

    public FormCubo() {
        initComponents();
        String Titulo[] = { "Registros", "Movimientos" };

    }

    // --- ColoresOff ---
    void ColoresOff1() {
        Txt1_11.setBackground(Blanco);
        Txt1_12.setBackground(Blanco);
        Txt1_13.setBackground(Blanco);
        Txt1_21.setBackground(Blanco);
        Txt1_22.setBackground(Blanco);
        Txt1_23.setBackground(Blanco);
        Txt1_31.setBackground(Blanco);
        Txt1_32.setBackground(Blanco);
        Txt1_33.setBackground(Blanco);
    }

    void ColoresOff2() {
        Txt2_11.setBackground(Blanco);
        Txt2_12.setBackground(Blanco);
        Txt2_13.setBackground(Blanco);
        Txt2_21.setBackground(Blanco);
        Txt2_22.setBackground(Blanco);
        Txt2_23.setBackground(Blanco);
        Txt2_31.setBackground(Blanco);
        Txt2_32.setBackground(Blanco);
        Txt2_33.setBackground(Blanco);
    }

    void ColoresOff3() {
        Txt3_11.setBackground(Blanco);
        Txt3_12.setBackground(Blanco);
        Txt3_13.setBackground(Blanco);
        Txt3_21.setBackground(Blanco);
        Txt3_22.setBackground(Blanco);
        Txt3_23.setBackground(Blanco);
        Txt3_31.setBackground(Blanco);
        Txt3_32.setBackground(Blanco);
        Txt3_33.setBackground(Blanco);
    }

    void ColoresOff4() {
        Txt4_11.setBackground(Blanco);
        Txt4_12.setBackground(Blanco);
        Txt4_13.setBackground(Blanco);
        Txt4_21.setBackground(Blanco);
        Txt4_22.setBackground(Blanco);
        Txt4_23.setBackground(Blanco);
        Txt4_31.setBackground(Blanco);
        Txt4_32.setBackground(Blanco);
        Txt4_33.setBackground(Blanco);
    }

    void ColoresOff5() {
        Txt5_11.setBackground(Blanco);
        Txt5_12.setBackground(Blanco);
        Txt5_13.setBackground(Blanco);
        Txt5_21.setBackground(Blanco);
        Txt5_22.setBackground(Blanco);
        Txt5_23.setBackground(Blanco);
        Txt5_31.setBackground(Blanco);
        Txt5_32.setBackground(Blanco);
        Txt5_33.setBackground(Blanco);
    }

    void ColoresOff6() {
        Txt6_11.setBackground(Blanco);
        Txt6_12.setBackground(Blanco);
        Txt6_13.setBackground(Blanco);
        Txt6_21.setBackground(Blanco);
        Txt6_22.setBackground(Blanco);
        Txt6_23.setBackground(Blanco);
        Txt6_31.setBackground(Blanco);
        Txt6_32.setBackground(Blanco);
        Txt6_33.setBackground(Blanco);
    }

    void ColoresOff() {
        ColoresOff1();
        ColoresOff2();
        ColoresOff3();
        ColoresOff4();
        ColoresOff5();
        ColoresOff6();
    }

    void Colores() {
        ccol = ccol + 1;
        if (ccol > 1)
            ccol = 0;
        if (ccol == 1)
            ColoresOn();
        else
            ColoresOff();
    }

    // --- Etiquetas ---
    void EtiquetasOff1() {
        // Apaga la cara 1
        Txt1_11.setText("");
        Txt1_12.setText("");
        Txt1_13.setText("");
        Txt1_21.setText("");
        Txt1_22.setText("");
        Txt1_23.setText("");
        Txt1_31.setText("");
        Txt1_32.setText("");
        Txt1_33.setText("");
    }

    void EtiquetasOff2() {
        // Apaga la cara 2
        Txt2_11.setText("");
        Txt2_12.setText("");
        Txt2_13.setText("");
        Txt2_21.setText("");
        Txt2_22.setText("");
        Txt2_23.setText("");
        Txt2_31.setText("");
        Txt2_32.setText("");
        Txt2_33.setText("");
    }

    void EtiquetasOff3() {
        // Apaga la cara 3
        Txt3_11.setText("");
        Txt3_12.setText("");
        Txt3_13.setText("");
        Txt3_21.setText("");
        Txt3_22.setText("");
        Txt3_23.setText("");
        Txt3_31.setText("");
        Txt3_32.setText("");
        Txt3_33.setText("");
    }

    void EtiquetasOff4() {
        // Apaga la cara 4
        Txt4_11.setText("");
        Txt4_12.setText("");
        Txt4_13.setText("");
        Txt4_21.setText("");
        Txt4_22.setText("");
        Txt4_23.setText("");
        Txt4_31.setText("");
        Txt4_32.setText("");
        Txt4_33.setText("");
    }

    void EtiquetasOff5() {
        // Apaga la cara 5
        Txt5_11.setText("");
        Txt5_12.setText("");
        Txt5_13.setText("");
        Txt5_21.setText("");
        Txt5_22.setText("");
        Txt5_23.setText("");
        Txt5_31.setText("");
        Txt5_32.setText("");
        Txt5_33.setText("");
    }

    void EtiquetasOff6() {
        // Apaga la cara 6
        Txt6_11.setText("");
        Txt6_12.setText("");
        Txt6_13.setText("");
        Txt6_21.setText("");
        Txt6_22.setText("");
        Txt6_23.setText("");
        Txt6_31.setText("");
        Txt6_32.setText("");
        Txt6_33.setText("");
    }

    void EtiquetasOff() {
        // Apaga todas las caras
        EtiquetasOff1();
        EtiquetasOff2();
        EtiquetasOff3();
        EtiquetasOff4();
        EtiquetasOff5();
        EtiquetasOff6();
    }

    // --- Etiquetas On ---
    void EtiquetasOn1() {
        // Enciende solo la cara 1
        Txt1_11.setText(String.valueOf(C1[1][1]));
        Txt1_12.setText(String.valueOf(C1[1][2]));
        Txt1_13.setText(String.valueOf(C1[1][3]));
        Txt1_21.setText(String.valueOf(C1[2][1]));
        Txt1_22.setText(String.valueOf(C1[2][2]));
        Txt1_23.setText(String.valueOf(C1[2][3]));
        Txt1_31.setText(String.valueOf(C1[3][1]));
        Txt1_32.setText(String.valueOf(C1[3][2]));
        Txt1_33.setText(String.valueOf(C1[3][3]));
    }

    void EtiquetasOn2() {
        // Enciende solo la cara 2
        Txt2_11.setText(String.valueOf(C2[1][1]));
        Txt2_12.setText(String.valueOf(C2[1][2]));
        Txt2_13.setText(String.valueOf(C2[1][3]));
        Txt2_21.setText(String.valueOf(C2[2][1]));
        Txt2_22.setText(String.valueOf(C2[2][2]));
        Txt2_23.setText(String.valueOf(C2[2][3]));
        Txt2_31.setText(String.valueOf(C2[3][1]));
        Txt2_32.setText(String.valueOf(C2[3][2]));
        Txt2_33.setText(String.valueOf(C2[3][3]));
    }

    void EtiquetasOn3() {
        // Enciende solo la cara 3
        Txt3_11.setText(String.valueOf(C3[1][1]));
        Txt3_12.setText(String.valueOf(C3[1][2]));
        Txt3_13.setText(String.valueOf(C3[1][3]));
        Txt3_21.setText(String.valueOf(C3[2][1]));
        Txt3_22.setText(String.valueOf(C3[2][2]));
        Txt3_23.setText(String.valueOf(C3[2][3]));
        Txt3_31.setText(String.valueOf(C3[3][1]));
        Txt3_32.setText(String.valueOf(C3[3][2]));
        Txt3_33.setText(String.valueOf(C3[3][3]));
    }

    void EtiquetasOn4() {
        // Enciende solo la cara 4
        Txt4_11.setText(String.valueOf(C4[1][1]));
        Txt4_12.setText(String.valueOf(C4[1][2]));
        Txt4_13.setText(String.valueOf(C4[1][3]));
        Txt4_21.setText(String.valueOf(C4[2][1]));
        Txt4_22.setText(String.valueOf(C4[2][2]));
        Txt4_23.setText(String.valueOf(C4[2][3]));
        Txt4_31.setText(String.valueOf(C4[3][1]));
        Txt4_32.setText(String.valueOf(C4[3][2]));
        Txt4_33.setText(String.valueOf(C4[3][3]));
    }

    void EtiquetasOn5() {
        // Enciende solo la cara 5
        Txt5_11.setText(String.valueOf(C5[1][1]));
        Txt5_12.setText(String.valueOf(C5[1][2]));
        Txt5_13.setText(String.valueOf(C5[1][3]));
        Txt5_21.setText(String.valueOf(C5[2][1]));
        Txt5_22.setText(String.valueOf(C5[2][2]));
        Txt5_23.setText(String.valueOf(C5[2][3]));
        Txt5_31.setText(String.valueOf(C5[3][1]));
        Txt5_32.setText(String.valueOf(C5[3][2]));
        Txt5_33.setText(String.valueOf(C5[3][3]));
    }

    void EtiquetasOn6() {
        // Enciende solo la cara 6
        Txt6_11.setText(String.valueOf(C6[1][1]));
        Txt6_12.setText(String.valueOf(C6[1][2]));
        Txt6_13.setText(String.valueOf(C6[1][3]));
        Txt6_21.setText(String.valueOf(C6[2][1]));
        Txt6_22.setText(String.valueOf(C6[2][2]));
        Txt6_23.setText(String.valueOf(C6[2][3]));
        Txt6_31.setText(String.valueOf(C6[3][1]));
        Txt6_32.setText(String.valueOf(C6[3][2]));
        Txt6_33.setText(String.valueOf(C6[3][3]));
    }

    void EtiquetasOn() {
        // Enciende todas las caras.

        EtiquetasOn1();
        EtiquetasOn2();
        EtiquetasOn3();
        EtiquetasOn4();
        EtiquetasOn5();
        EtiquetasOn6();
    }// Fin del Metodo On

    void Etiquetas() {
        cc = cc + 1;
        if (cc > 1)
            cc = 0;
        if (cc == 1)
            EtiquetasOn();
        else
            EtiquetasOff();

    }

    // --- Rotaciones Derecha ---
    public void RDC1() {
        // Move
        // Rotando las esquinas
        int t = C1[1][3];
        C1[1][3] = C1[1][1];
        C1[1][1] = C1[3][1];
        C1[3][1] = C1[3][3];
        C1[3][3] = t;

        // Rotando las de en medio
        t = C1[1][2];
        C1[1][2] = C1[2][1];
        C1[2][1] = C1[3][2];
        C1[3][2] = C1[2][3];
        C1[2][3] = t;

        // Color
        // Rotando las esquinas
        Color t2 = COL1[1][3];
        COL1[1][3] = COL1[1][1];
        COL1[1][1] = COL1[3][1];
        COL1[3][1] = COL1[3][3];
        COL1[3][3] = t2;

        // Rotando las de en medio
        t2 = COL1[1][2];
        COL1[1][2] = COL1[2][1];
        COL1[2][1] = COL1[3][2];
        COL1[3][2] = COL1[2][3];
        COL1[2][3] = t2;

        // Update
        if (cc == 1)
            EtiquetasOn();
        if (ccol == 1)
            ColoresOn();

    }// Fin del Movimiento RDC6

    public void RDC2() {
        // Move
        // Rotando las esquinas
        int t = C2[1][3];
        C2[1][3] = C2[1][1];
        C2[1][1] = C2[3][1];
        C2[3][1] = C2[3][3];
        C2[3][3] = t;

        // Rotando las de en medio
        t = C2[1][2];
        C2[1][2] = C2[2][1];
        C2[2][1] = C2[3][2];
        C2[3][2] = C2[2][3];
        C2[2][3] = t;

        // Color
        // Rotando las esquinas
        Color t2 = COL2[1][3];
        COL2[1][3] = COL2[1][1];
        COL2[1][1] = COL2[3][1];
        COL2[3][1] = COL2[3][3];
        COL2[3][3] = t2;

        // Rotando las de en medio
        t2 = COL2[1][2];
        COL2[1][2] = COL2[2][1];
        COL2[2][1] = COL2[3][2];
        COL2[3][2] = COL2[2][3];
        COL2[2][3] = t2;

        // Update
        if (cc == 1)
            EtiquetasOn();
        if (ccol == 1)
            ColoresOn();

    }// Fin del Movimiento RDC2

    public void RDC3() {
        // Move
        // Rotando las esquinas
        int t = C3[1][3];
        C3[1][3] = C3[1][1];
        C3[1][1] = C3[3][1];
        C3[3][1] = C3[3][3];
        C3[3][3] = t;

        // Rotando las de en medio
        t = C3[1][2];
        C3[1][2] = C3[2][1];
        C3[2][1] = C3[3][2];
        C3[3][2] = C3[2][3];
        C3[2][3] = t;

        // Color
        // Rotando las esquinas
        Color t2 = COL3[1][3];
        COL3[1][3] = COL3[1][1];
        COL3[1][1] = COL3[3][1];
        COL3[3][1] = COL3[3][3];
        COL3[3][3] = t2;

        // Rotando las de en medio
        t2 = COL3[1][2];
        COL3[1][2] = COL3[2][1];
        COL3[2][1] = COL3[3][2];
        COL3[3][2] = COL3[2][3];
        COL3[2][3] = t2;

        // Update
        if (cc == 1)
            EtiquetasOn();
        if (ccol == 1)
            ColoresOn();

    }// Fin del Movimiento RDC3

    public void RDC4() {
        // Move
        // Rotando las esquinas
        int t = C4[1][3];
        C4[1][3] = C4[1][1];
        C4[1][1] = C4[3][1];
        C4[3][1] = C4[3][3];
        C4[3][3] = t;

        // Rotando las de en medio
        t = C4[1][2];
        C4[1][2] = C4[2][1];
        C4[2][1] = C4[3][2];
        C4[3][2] = C4[2][3];
        C4[2][3] = t;

        // Color
        // Rotando las esquinas
        Color t2 = COL4[1][3];
        COL4[1][3] = COL4[1][1];
        COL4[1][1] = COL4[3][1];
        COL4[3][1] = COL4[3][3];
        COL4[3][3] = t2;

        // Rotando las de en medio
        t2 = COL4[1][2];
        COL4[1][2] = COL4[2][1];
        COL4[2][1] = COL4[3][2];
        COL4[3][2] = COL4[2][3];
        COL4[2][3] = t2;

        // Update
        if (cc == 1)
            EtiquetasOn();
        if (ccol == 1)
            ColoresOn();
    }// Fin del Movimiento RDC4

    public void RDC5() {
        // Move
        // Rotando las esquinas
        int t = C5[1][3];
        C5[1][3] = C5[1][1];
        C5[1][1] = C5[3][1];
        C5[3][1] = C5[3][3];
        C5[3][3] = t;

        // Rotando las de en medio
        t = C5[1][2];
        C5[1][2] = C5[2][1];
        C5[2][1] = C5[3][2];
        C5[3][2] = C5[2][3];
        C5[2][3] = t;

        // Color
        // Rotando las esquinas
        Color t2 = COL5[1][3];
        COL5[1][3] = COL5[1][1];
        COL5[1][1] = COL5[3][1];
        COL5[3][1] = COL5[3][3];
        COL5[3][3] = t2;

        // Rotando las de en medio
        t2 = COL5[1][2];
        COL5[1][2] = COL5[2][1];
        COL5[2][1] = COL5[3][2];
        COL5[3][2] = COL5[2][3];
        COL5[2][3] = t2;

        // Update
        if (cc == 1)
            EtiquetasOn();
        if (ccol == 1)
            ColoresOn();

    }// Fin del Movimiento RDC5

    public void RDC6() {
        // Move
        int t = C6[1][3];
        C6[1][3] = C6[1][1];
        C6[1][1] = C6[3][1];
        C6[3][1] = C6[3][3];
        C6[3][3] = t;

        // Rotando las de en medio
        t = C6[1][2];
        C6[1][2] = C6[2][1];
        C6[2][1] = C6[3][2];
        C6[3][2] = C6[2][3];
        C6[2][3] = t;

        // Color
        Color t2 = COL6[1][3];
        COL6[1][3] = COL6[1][1];
        COL6[1][1] = COL6[3][1];
        COL6[3][1] = COL6[3][3];
        COL6[3][3] = t2;

        // Rotando las de en medio
        t2 = COL6[1][2];
        COL6[1][2] = COL6[2][1];
        COL6[2][1] = COL6[3][2];
        COL6[3][2] = COL6[2][3];
        COL6[2][3] = t2;

        // Update
        if (cc == 1)
            EtiquetasOn();
        if (ccol == 1)
            ColoresOn();
    }// Fin del Movimiento RDC6

    // --- Rotaciones Izquierda ---
    public void RIC1() {
        // Move
        int t = C1[1][1];
        C1[1][1] = C1[1][3];
        C1[1][3] = C1[3][3];
        C1[3][3] = C1[3][1];
        C1[3][1] = t;
        // Rotar las de en medio
        t = C1[1][2];
        C1[1][2] = C1[2][3];
        C1[2][3] = C1[3][2];
        C1[3][2] = C1[2][1];
        C1[2][1] = t;

        // Color
        Color t2 = COL1[1][1];
        COL1[1][1] = COL1[1][3];
        COL1[1][3] = COL1[3][3];
        COL1[3][3] = COL1[3][1];
        COL1[3][1] = t2;
        // Rotar las de en medio
        t2 = COL1[1][2];
        COL1[1][2] = COL1[2][3];
        COL1[2][3] = COL1[3][2];
        COL1[3][2] = COL1[2][1];
        COL1[2][1] = t2;

        // Update
        if (cc == 1)
            EtiquetasOn();
        if (ccol == 1)
            ColoresOn();
    }

    public void RIC2() {
        // Move
        int t = C2[1][1];
        C2[1][1] = C2[1][3];
        C2[1][3] = C2[3][3];
        C2[3][3] = C2[3][1];
        C2[3][1] = t;
        // Rotar las de en medio
        t = C2[1][2];
        C2[1][2] = C2[2][3];
        C2[2][3] = C2[3][2];
        C2[3][2] = C2[2][1];
        C2[2][1] = t;

        // Color
        Color t2 = COL2[1][1];
        COL2[1][1] = COL2[1][3];
        COL2[1][3] = COL2[3][3];
        COL2[3][3] = COL2[3][1];
        COL2[3][1] = t2;
        // Rotar las de en medio
        t2 = COL2[1][2];
        COL2[1][2] = COL2[2][3];
        COL2[2][3] = COL2[3][2];
        COL2[3][2] = COL2[2][1];
        COL2[2][1] = t2;

        // Update
        if (cc == 1)
            EtiquetasOn();
        if (ccol == 1)
            ColoresOn();
    }

    public void RIC3() {
        // Move
        // Mover Esquinas
        int t = C3[1][1];
        C3[1][1] = C3[1][3];
        C3[1][3] = C3[3][3];
        C3[3][3] = C3[3][1];
        C3[3][1] = t;
        // Rotar las de en medio
        t = C3[1][2];
        C3[1][2] = C3[2][3];
        C3[2][3] = C3[3][2];
        C3[3][2] = C3[2][1];
        C3[2][1] = t;

        // Color
        // Rotando las esquinas
        Color t2 = COL3[1][1];
        COL3[1][1] = COL3[1][3];
        COL3[1][3] = COL3[3][3];
        COL3[3][3] = COL3[3][1];
        COL3[3][1] = t2;
        // Rotar las de en medio
        t2 = COL3[1][2];
        COL3[1][2] = COL3[2][3];
        COL3[2][3] = COL3[3][2];
        COL3[3][2] = COL3[2][1];
        COL3[2][1] = t2;

        // Update
        if (cc == 1)
            EtiquetasOn();
        if (ccol == 1)
            ColoresOn();
    }

    public void RIC4() {
        // Move
        int t = C4[1][1];
        C4[1][1] = C4[1][3];
        C4[1][3] = C4[3][3];
        C4[3][3] = C4[3][1];
        C4[3][1] = t;
        // Rotar las de en medio
        t = C4[1][2];
        C4[1][2] = C4[2][3];
        C4[2][3] = C4[3][2];
        C4[3][2] = C4[2][1];
        C4[2][1] = t;

        // Color
        Color t2 = COL4[1][1];
        COL4[1][1] = COL4[1][3];
        COL4[1][3] = COL4[3][3];
        COL4[3][3] = COL4[3][1];
        COL4[3][1] = t2;
        // Rotar las de en medio
        t2 = COL4[1][2];
        COL4[1][2] = COL4[2][3];
        COL4[2][3] = COL4[3][2];
        COL4[3][2] = COL4[2][1];
        COL4[2][1] = t2;
        // Update
        if (cc == 1)
            EtiquetasOn();
        if (ccol == 1)
            ColoresOn();
    }

    public void RIC5() {
        // Move
        // Mover Esquinas
        int t = C5[1][1];
        C5[1][1] = C5[1][3];
        C5[1][3] = C5[3][3];
        C5[3][3] = C5[3][1];
        C5[3][1] = t;
        // Rotar las de en medio
        t = C5[1][2];
        C5[1][2] = C5[2][3];
        C5[2][3] = C5[3][2];
        C5[3][2] = C5[2][1];
        C5[2][1] = t;

        // Color
        // Rotando las esquinas
        Color t2 = COL5[1][1];
        COL5[1][1] = COL5[1][3];
        COL5[1][3] = COL5[3][3];
        COL5[3][3] = COL5[3][1];
        COL5[3][1] = t2;
        // Rotar las de en medio
        t2 = COL5[1][2];
        COL5[1][2] = COL5[2][3];
        COL5[2][3] = COL5[3][2];
        COL5[3][2] = COL5[2][1];
        COL5[2][1] = t2;
        // Update
        if (cc == 1)
            EtiquetasOn();
        if (ccol == 1)
            ColoresOn();
    }

    public void RIC6() {
        // Move
        int t = C6[1][1];
        C6[1][1] = C6[1][3];
        C6[1][3] = C6[3][3];
        C6[3][3] = C6[3][1];
        C6[3][1] = t;
        // Rotar las de en medio
        t = C6[1][2];
        C6[1][2] = C6[2][3];
        C6[2][3] = C6[3][2];
        C6[3][2] = C6[2][1];
        C6[2][1] = t;

        // Color
        // Rotando las esquinas
        Color t2 = COL6[1][1];
        COL6[1][1] = COL6[1][3];
        COL6[1][3] = COL6[3][3];
        COL6[3][3] = COL6[3][1];
        COL6[3][1] = t2;
        // Rotar las de en medio
        t2 = COL6[1][2];
        COL6[1][2] = COL6[2][3];
        COL6[2][3] = COL6[3][2];
        COL6[3][2] = COL6[2][1];
        COL6[2][1] = t2;

        // Update
        if (cc == 1)
            EtiquetasOn();
        if (ccol == 1)
            ColoresOn();
    }

    // --- Movimientos A (Arriba) ---
    public void A1() {

        // Move
        for (int i = 1; i <= 3; i++) {
            int t = C1[i][1];
            C1[i][1] = C2[i][1];
            C2[i][1] = C3[i][1];
            C3[i][1] = C4[i][1];
            C4[i][1] = t;
        }

        // Color
        for (int i = 1; i <= 3; i++) {
            Color t2 = COL1[i][1];
            COL1[i][1] = COL2[i][1];
            COL2[i][1] = COL3[i][1];
            COL3[i][1] = COL4[i][1];
            COL4[i][1] = t2;
        }

        // Update
        if (cc == 1)
            EtiquetasOn();
        if (ccol == 1)
            ColoresOn();

        // Movimientos Extra
        RIC5();

        // Agregar Registro
        Agregar_Registro("A1");
    }// Fin del Movimiento A1

    public void A2() {

        // Move
        for (int i = 1; i <= 3; i++) {
            int t = C1[i][2];
            C1[i][2] = C2[i][2];
            C2[i][2] = C3[i][2];
            C3[i][2] = C4[i][2];
            C4[i][2] = t;
        }
        // Color
        for (int i = 1; i <= 3; i++) {
            Color t2 = COL1[i][2];
            COL1[i][2] = COL2[i][2];
            COL2[i][2] = COL3[i][2];
            COL3[i][2] = COL4[i][2];
            COL4[i][2] = t2;
        }
        // Update
        if (cc == 1)
            EtiquetasOn();
        if (ccol == 1)
            ColoresOn();

        // Agregar Registro
        Agregar_Registro("A2");

    }// Fin del Movimiento A2

    public void A3() {

        // Move
        for (int i = 1; i <= 3; i++) {
            int t = C1[i][3];
            C1[i][3] = C2[i][3];
            C2[i][3] = C3[i][3];
            C3[i][3] = C4[i][3];
            C4[i][3] = t;

        }
        // Color
        for (int i = 1; i <= 3; i++) {
            Color t2 = COL1[i][3];
            COL1[i][3] = COL2[i][3];
            COL2[i][3] = COL3[i][3];
            COL3[i][3] = COL4[i][3];
            COL4[i][3] = t2;
        }

        // Update
        if (cc == 1)
            EtiquetasOn();
        if (ccol == 1)
            ColoresOn();

        // Movimientos Extra
        RDC6();

        // //Registro
        // Sol = true;
        // //Log
        // String regText = Integer.toString(reg);
        // Txt_Reg.setText(regText);
        // //Add Registry
        // reg = reg + 1;
        // //Log
        // prevLog = Mov[reg] + " ";
        // regText = Integer.toString(reg);
        // Txt_Reg.setText(regText);
        //
        // //Add Registry
        // Mov[reg] = "A3";
        // //Log:
        // prevLog = prevLog + Mov[reg];
        // Txt_Solve.setText(prevLog);

        // Registro 2.0
        // //Contador de Registros
        // reg = reg + 1;
        // label_reg.setText(String.valueOf(reg));

        // Agregar Registro
        Agregar_Registro("A3");

    }// Fin del Movimiento A3

    // --- Movimientos B (Abajo ) ---
    public void B1() {
        // Move
        for (int i = 0; i <= 3; i++) {
            int t = C3[i][1];
            C3[i][1] = C2[i][1];
            C2[i][1] = C1[i][1];
            C1[i][1] = C4[i][1];
            C4[i][1] = t;
        }

        // Color
        for (int i = 0; i <= 3; i++) {
            Color t2 = COL3[i][1];
            COL3[i][1] = COL2[i][1];
            COL2[i][1] = COL1[i][1];
            COL1[i][1] = COL4[i][1];
            COL4[i][1] = t2;
        }
        // Update
        if (cc == 1)
            EtiquetasOn();
        if (ccol == 1)
            ColoresOn();

        // Movimientos Extra
        RDC5();

        // Registro 2.0
        Agregar_Registro("B1");

    }// Fin del Movimiento B1

    public void B2() {
        // Move
        for (int i = 0; i <= 3; i++) {
            int t = C3[i][2];
            C3[i][2] = C2[i][2];
            C2[i][2] = C1[i][2];
            C1[i][2] = C4[i][2];
            C4[i][2] = t;
        }

        // Color
        for (int i = 0; i <= 3; i++) {
            Color t2 = COL3[i][2];
            COL3[i][2] = COL2[i][2];
            COL2[i][2] = COL1[i][2];
            COL1[i][2] = COL4[i][2];
            COL4[i][2] = t2;
        }

        // Update
        if (cc == 1)
            EtiquetasOn();
        if (ccol == 1)
            ColoresOn();

        // Agregar Registro
        Agregar_Registro("B2");

    }// Fin del Movimiento B2

    public void B3() {
        // Move
        for (int i = 0; i <= 3; i++) {
            int t = C3[i][3];
            C3[i][3] = C2[i][3];
            C2[i][3] = C1[i][3];
            C1[i][3] = C4[i][3];
            C4[i][3] = t;
        }

        // Color
        for (int i = 0; i <= 3; i++) {
            Color t2 = COL3[i][3];
            COL3[i][3] = COL2[i][3];
            COL2[i][3] = COL1[i][3];
            COL1[i][3] = COL4[i][3];
            COL4[i][3] = t2;
        }

        // Update
        if (cc == 1)
            EtiquetasOn();
        if (ccol == 1)
            ColoresOn();

        // Movimientos Extra
        RIC6();

        // Agregar Registro
        Agregar_Registro("B3");

    }// Fin del Movimiento B3

    // --- Movimientos D (Derecha) ---
    public void D1() {
        // Move
        for (int i = 1; i <= 3; i++) {
            int t = C6[1][i];
            C6[1][i] = C2[1][i];
            C2[1][i] = C5[1][i];
            C5[1][i] = C4[1][i];
            C4[1][i] = t;
        }

        // Color
        for (int i = 1; i <= 3; i++) {
            Color t2 = COL6[1][i];
            COL6[1][i] = COL2[1][i];
            COL2[1][i] = COL5[1][i];
            COL5[1][i] = COL4[1][i];
            COL4[1][i] = t2;
        }

        // Update
        if (cc == 1)
            EtiquetasOn();
        if (ccol == 1)
            ColoresOn();

        RIC1();
    }// Fin del Movimiento D1

    public void D2() {
        // Move
        for (int i = 1; i <= 3; i++) {
            int t = C6[2][i];
            C6[2][i] = C2[2][i];
            C2[2][i] = C5[2][i];
            C5[2][i] = C4[2][i];
            C4[2][i] = t;
        }

        // Color
        for (int i = 1; i <= 3; i++) {
            Color t2 = COL6[2][i];
            COL6[2][i] = COL2[2][i];
            COL2[2][i] = COL5[2][i];
            COL5[2][i] = COL4[2][i];
            COL4[2][i] = t2;
        }

        // Update
        if (cc == 1)
            EtiquetasOn();
        if (ccol == 1)
            ColoresOn();

    }// Fin del Movimiento D2

    public void D3() {
        // Move
        for (int i = 1; i <= 3; i++) {
            int t = C6[3][i];
            C6[3][i] = C2[3][i];
            C2[3][i] = C5[3][i];
            C5[3][i] = C4[3][i];
            C4[3][i] = t;
        }

        // Color
        for (int i = 1; i <= 3; i++) {
            Color t2 = COL6[3][i];
            COL6[3][i] = COL2[3][i];
            COL2[3][i] = COL5[3][i];
            COL5[3][i] = COL4[3][i];
            COL4[3][i] = t2;
        }

        // Update
        if (cc == 1)
            EtiquetasOn();
        if (ccol == 1)
            ColoresOn();

        RDC3();
    }// Fin del Movimiento D3

    // --- Movimientos I (Izquierda) ---
    public void I1() {
        // Move
        int t = C5[1][1];
        C5[1][1] = C2[1][1];
        C2[1][1] = C6[1][1];
        C6[1][1] = C4[1][1];
        C4[1][1] = t;

        t = C5[1][2];
        C5[1][2] = C2[1][2];
        C2[1][2] = C6[1][2];
        C6[1][2] = C4[1][2];
        C4[1][2] = t;

        t = C5[1][3];
        C5[1][3] = C2[1][3];
        C2[1][3] = C6[1][3];
        C6[1][3] = C4[1][3];
        C4[1][3] = t;

        // Color
        Color t2 = COL5[1][1];
        COL5[1][1] = COL2[1][1];
        COL2[1][1] = COL6[1][1];
        COL6[1][1] = COL4[1][1];
        COL4[1][1] = t2;

        t2 = COL5[1][2];
        COL5[1][2] = COL2[1][2];
        COL2[1][2] = COL6[1][2];

        COL6[1][2] = COL4[1][2];
        COL4[1][2] = t2;

        t2 = COL5[1][3];
        COL5[1][3] = COL2[1][3];
        COL2[1][3] = COL6[1][3];
        COL6[1][3] = COL4[1][3];
        COL4[1][3] = t2;

        // Update
        if (cc == 1)
            EtiquetasOn();
        if (ccol == 1)
            ColoresOn();

        RDC1();
    }// Fin del Movimiento I1

    public void I2() {
        // Move
        int t = C5[2][1];
        C5[2][1] = C2[2][1];
        C2[2][1] = C6[2][1];
        C6[2][1] = C4[2][1];
        C4[2][1] = t;

        t = C5[2][2];
        C5[2][2] = C2[2][2];
        C2[2][2] = C6[2][2];
        C6[2][2] = C4[2][2];
        C4[2][2] = t;

        t = C5[2][3];
        C5[2][3] = C2[2][3];
        C2[2][3] = C6[2][3];
        C6[2][3] = C4[2][3];
        C4[2][3] = t;

        // Color
        Color t2 = COL5[2][1];
        COL5[2][1] = COL2[2][1];
        COL2[2][1] = COL6[2][1];
        COL6[2][1] = COL4[2][1];
        COL4[2][1] = t2;

        t2 = COL5[2][2];
        COL5[2][2] = COL2[2][2];
        COL2[2][2] = COL6[2][2];
        COL6[2][2] = COL4[2][2];
        COL4[2][2] = t2;

        t2 = COL5[2][3];
        COL5[2][3] = COL2[2][3];
        COL2[2][3] = COL6[2][3];
        COL6[2][3] = COL4[2][3];
        COL4[2][3] = t2;

        // Update
        if (cc == 1)
            EtiquetasOn();
        if (ccol == 1)
            ColoresOn();

    }// Fin del Movimiento I2

    public void I3() {

        // Move
        int t = C5[3][1];
        C5[3][1] = C2[3][1];
        C2[3][1] = C6[3][1];
        C6[3][1] = C4[3][1];
        C4[3][1] = t;

        t = C5[3][2];
        C5[3][2] = C2[3][2];
        C2[3][2] = C6[3][2];
        C6[3][2] = C4[3][2];
        C4[3][2] = t;

        t = C5[3][3];
        C5[3][3] = C2[3][3];
        C2[3][3] = C6[3][3];
        C6[3][3] = C4[3][3];
        C4[3][3] = t;

        // Color
        Color t2 = COL5[3][1];
        COL5[3][1] = COL2[3][1];
        COL2[3][1] = COL6[3][1];
        COL6[3][1] = COL4[3][1];
        COL4[3][1] = t2;

        t2 = COL5[3][2];
        COL5[3][2] = COL2[3][2];
        COL2[3][2] = COL6[3][2];
        COL6[3][2] = COL4[3][2];
        COL4[3][2] = t2;

        t2 = COL5[3][3];
        COL5[3][3] = COL2[3][3];
        COL2[3][3] = COL6[3][3];
        COL6[3][3] = COL4[3][3];
        COL4[3][3] = t2;

        // Update
        if (cc == 1)
            EtiquetasOn();
        if (ccol == 1)
            ColoresOn();

        RIC3();
    }// Fin del Movimiento I3

    // ---Movimientos RD ---
    public void RD1() {
        // Move
        for (int i = 1; i <= 3; i++) {
            int t = C1[3][i];
            C1[3][i] = C6[3][i];
            C6[3][i] = C3[3][i];
            C3[3][i] = C5[3][i];
            C5[3][i] = t;
        }

        // Color
        for (int i = 1; i <= 3; i++) {
            Color t2 = COL1[3][i];
            COL1[3][i] = COL6[3][i];
            COL6[3][i] = COL3[3][i];
            COL3[3][i] = COL5[3][i];
            COL5[3][i] = t2;
        }

        // Update
        if (cc == 1)
            EtiquetasOn();
        if (ccol == 1)
            ColoresOn();

        RIC2();

    }// Fin del Movimiento RD1

    public void RD2() {

        // Move
        for (int i = 1; i <= 3; i++) {
            int t = C1[2][i];
            C1[2][i] = C6[2][i];
            C6[2][i] = C3[2][i];
            C3[2][i] = C5[2][i];
            C5[2][i] = t;
        }

        // Color
        for (int i = 1; i <= 3; i++) {
            Color t2 = COL1[2][i];
            COL1[2][i] = COL6[2][i];
            COL6[2][i] = COL3[2][i];
            COL3[2][i] = COL5[2][i];
            COL5[2][i] = t2;
        }

        // Update
        if (cc == 1)
            EtiquetasOn();
        if (ccol == 1)
            ColoresOn();

    }// Fin del Movimiento RD2

    public void RD3() {

        // Move
        for (int i = 1; i <= 3; i++) {
            int t = C1[1][i];
            C1[1][i] = C6[1][i];
            C6[1][i] = C3[1][i];
            C3[1][i] = C5[1][i];
            C5[1][i] = t;
        }

        // Color
        for (int i = 1; i <= 3; i++) {
            Color t2 = COL1[1][i];
            COL1[1][i] = COL6[1][i];
            COL6[1][i] = COL3[1][i];
            COL3[1][i] = COL5[1][i];
            COL5[1][i] = t2;
        }

        // Update
        if (cc == 1)
            EtiquetasOn();
        if (ccol == 1)
            ColoresOn();

        RDC4();
    }// Fin del Movimiento RD3

    // ---Movimientos RI ---

    public void RI1() {

        // Move
        for (int i = 1; i <= 3; i++) {
            int t = C1[3][i];
            C1[3][i] = C5[3][i];
            C5[3][i] = C3[3][i];
            C3[3][i] = C6[3][i];
            C6[3][i] = t;
        }

        // Color
        for (int i = 1; i <= 3; i++) {
            Color t2 = COL1[3][i];
            COL1[3][i] = COL5[3][i];
            COL5[3][i] = COL3[3][i];
            COL3[3][i] = COL6[3][i];
            COL6[3][i] = t2;
        }

        // Update
        if (cc == 1)
            EtiquetasOn();
        if (ccol == 1)
            ColoresOn();

        RIC2();

    }// Fin del Movimiento RI1

    public void RI2() {

        // Move
        for (int i = 1; i <= 3; i++) {
            int t = C1[2][i];
            C1[2][i] = C5[2][i];
            C5[2][i] = C3[2][i];
            C3[2][i] = C6[2][i];
            C6[2][i] = t;
        }

        // Color
        for (int i = 1; i <= 3; i++) {
            Color t2 = COL1[2][i];
            COL1[2][i] = COL5[2][i];
            COL5[2][i] = COL3[2][i];
            COL3[2][i] = COL6[2][i];
            COL6[2][i] = t2;
        }

        // Update
        if (cc == 1)
            EtiquetasOn();
        if (ccol == 1)
            ColoresOn();

    }// Fin del Movimiento RI2

    public void RI3() {

        // Move
        for (int i = 1; i <= 3; i++) {
            int t = C1[1][i];
            C1[1][i] = C5[1][i];
            C5[1][i] = C3[1][i];
            C3[1][i] = C6[1][i];
            C6[1][i] = t;
        }

        // Color
        for (int i = 1; i <= 3; i++) {
            Color t2 = COL1[1][i];
            COL1[1][i] = COL5[1][i];
            COL5[1][i] = COL3[1][i];
            COL3[1][i] = COL6[1][i];
            COL6[1][i] = t2;
        }

        // Update
        if (cc == 1)
            EtiquetasOn();
        if (ccol == 1)
            ColoresOn();

        RIC4();

    }// Fin del Movimiento RI3

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">                          
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        Btn_Etiquetas = new javax.swing.JButton();
        Btn_Colores = new javax.swing.JButton();
        Txt5_11 = new javax.swing.JTextField();
        Txt5_12 = new javax.swing.JTextField();
        Txt5_13 = new javax.swing.JTextField();
        Txt5_21 = new javax.swing.JTextField();
        Txt5_22 = new javax.swing.JTextField();
        Txt5_23 = new javax.swing.JTextField();
        Txt5_31 = new javax.swing.JTextField();
        Txt5_32 = new javax.swing.JTextField();
        Txt5_33 = new javax.swing.JTextField();
        Txt1_32 = new javax.swing.JTextField();
        Txt1_33 = new javax.swing.JTextField();
        Txt2_11 = new javax.swing.JTextField();
        Txt2_12 = new javax.swing.JTextField();
        Txt2_13 = new javax.swing.JTextField();
        Txt2_21 = new javax.swing.JTextField();
        Txt2_22 = new javax.swing.JTextField();
        Txt2_23 = new javax.swing.JTextField();
        Txt2_31 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Txt1_11 = new javax.swing.JTextField();
        Txt1_12 = new javax.swing.JTextField();
        Txt1_13 = new javax.swing.JTextField();
        Txt1_21 = new javax.swing.JTextField();
        Txt1_22 = new javax.swing.JTextField();
        Txt1_23 = new javax.swing.JTextField();
        Txt1_31 = new javax.swing.JTextField();
        Txt2_32 = new javax.swing.JTextField();
        Txt6_11 = new javax.swing.JTextField();
        Txt2_33 = new javax.swing.JTextField();
        Txt6_12 = new javax.swing.JTextField();
        Txt6_13 = new javax.swing.JTextField();
        Txt6_21 = new javax.swing.JTextField();
        Txt6_22 = new javax.swing.JTextField();
        Txt3_11 = new javax.swing.JTextField();
        Txt6_23 = new javax.swing.JTextField();
        Txt3_12 = new javax.swing.JTextField();
        Txt3_13 = new javax.swing.JTextField();
        Txt3_21 = new javax.swing.JTextField();
        Txt3_22 = new javax.swing.JTextField();
        Txt3_23 = new javax.swing.JTextField();
        Txt6_31 = new javax.swing.JTextField();
        Txt6_32 = new javax.swing.JTextField();
        Txt6_33 = new javax.swing.JTextField();
        Btn_A1 = new javax.swing.JButton();
        Txt3_31 = new javax.swing.JTextField();
        Btn_A2 = new javax.swing.JButton();
        Txt3_32 = new javax.swing.JTextField();
        Btn_A3 = new javax.swing.JButton();
        Txt3_33 = new javax.swing.JTextField();
        Txt4_11 = new javax.swing.JTextField();
        Txt4_12 = new javax.swing.JTextField();
        Txt4_13 = new javax.swing.JTextField();
        Txt4_21 = new javax.swing.JTextField();
        Txt4_22 = new javax.swing.JTextField();
        Txt4_23 = new javax.swing.JTextField();
        Txt4_31 = new javax.swing.JTextField();
        Txt4_32 = new javax.swing.JTextField();
        Txt4_33 = new javax.swing.JTextField();
        Btn_I1 = new javax.swing.JButton();
        Btn_D2 = new javax.swing.JButton();
        Btn_B1 = new javax.swing.JButton();
        Btn_B3 = new javax.swing.JButton();
        Btn_B2 = new javax.swing.JButton();
        Btn_D1 = new javax.swing.JButton();
        Btn_D3 = new javax.swing.JButton();
        Btn_I2 = new javax.swing.JButton();
        Btn_I3 = new javax.swing.JButton();
        Btn_RD1 = new javax.swing.JButton();
        Btn_RD2 = new javax.swing.JButton();
        Btn_RD3 = new javax.swing.JButton();
        Btn_RI1 = new javax.swing.JButton();
        Btn_RI2 = new javax.swing.JButton();
        Btn_RI3 = new javax.swing.JButton();
        Btn_Solucion = new javax.swing.JButton();
        Btn_Empezar = new javax.swing.JButton();
        label_Mov = new javax.swing.JLabel();
        label_reg = new javax.swing.JLabel();
        label_Mov1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla_Mov = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(8, 8, 8));
        jPanel5.setForeground(new java.awt.Color(8, 8, 8));

        Btn_Etiquetas.setBackground(new java.awt.Color(23, 23, 23));
        Btn_Etiquetas.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Btn_Etiquetas.setForeground(new java.awt.Color(251, 251, 251));
        Btn_Etiquetas.setText("Etiquetas");
        Btn_Etiquetas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 23, 23)));
        Btn_Etiquetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EtiquetasActionPerformed(evt);
            }
        });

        Btn_Colores.setBackground(new java.awt.Color(23, 23, 23));
        Btn_Colores.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Btn_Colores.setForeground(new java.awt.Color(251, 251, 251));
        Btn_Colores.setText("Colores");
        Btn_Colores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 23, 23)));
        Btn_Colores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ColoresActionPerformed(evt);
            }
        });

        Txt5_11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt5_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt5_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt5_11ActionPerformed(evt);
            }
        });

        Txt5_12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt5_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt5_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt5_12ActionPerformed(evt);
            }
        });

        Txt5_13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt5_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt5_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt5_13ActionPerformed(evt);
            }
        });

        Txt5_21.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt5_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt5_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt5_21ActionPerformed(evt);
            }
        });

        Txt5_22.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt5_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt5_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt5_22ActionPerformed(evt);
            }
        });

        Txt5_23.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt5_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt5_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt5_23ActionPerformed(evt);
            }
        });

        Txt5_31.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt5_31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt5_31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt5_31ActionPerformed(evt);
            }
        });

        Txt5_32.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt5_32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt5_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt5_32ActionPerformed(evt);
            }
        });

        Txt5_33.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt5_33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt5_33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt5_33ActionPerformed(evt);
            }
        });

        Txt1_32.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt1_32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt1_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt1_32ActionPerformed(evt);
            }
        });

        Txt1_33.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt1_33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt1_33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt1_33ActionPerformed(evt);
            }
        });

        Txt2_11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt2_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt2_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt2_11ActionPerformed(evt);
            }
        });

        Txt2_12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt2_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt2_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt2_12ActionPerformed(evt);
            }
        });

        Txt2_13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt2_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt2_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt2_13ActionPerformed(evt);
            }
        });

        Txt2_21.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt2_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt2_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt2_21ActionPerformed(evt);
            }
        });

        Txt2_22.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt2_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt2_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt2_22ActionPerformed(evt);
            }
        });

        Txt2_23.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt2_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt2_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt2_23ActionPerformed(evt);
            }
        });

        Txt2_31.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt2_31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt2_31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt2_31ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE));

        Txt1_11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt1_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt1_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt1_11ActionPerformed(evt);
            }
        });

        Txt1_12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt1_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt1_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt1_12ActionPerformed(evt);
            }
        });

        Txt1_13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt1_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt1_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt1_13ActionPerformed(evt);
            }
        });

        Txt1_21.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt1_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt1_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt1_21ActionPerformed(evt);
            }
        });

        Txt1_22.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt1_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt1_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt1_22ActionPerformed(evt);
            }
        });

        Txt1_23.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt1_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt1_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt1_23ActionPerformed(evt);
            }
        });

        Txt1_31.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt1_31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt1_31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt1_31ActionPerformed(evt);
            }
        });

        Txt2_32.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt2_32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt2_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt2_32ActionPerformed(evt);
            }
        });

        Txt6_11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt6_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt6_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt6_11ActionPerformed(evt);
            }
        });

        Txt2_33.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt2_33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt2_33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt2_33ActionPerformed(evt);
            }
        });

        Txt6_12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt6_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt6_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt6_12ActionPerformed(evt);
            }
        });

        Txt6_13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt6_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt6_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt6_13ActionPerformed(evt);
            }
        });

        Txt6_21.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt6_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt6_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt6_21ActionPerformed(evt);
            }
        });

        Txt6_22.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt6_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt6_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt6_22ActionPerformed(evt);
            }
        });

        Txt3_11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt3_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt3_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt3_11ActionPerformed(evt);
            }
        });

        Txt6_23.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt6_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt6_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt6_23ActionPerformed(evt);
            }
        });

        Txt3_12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt3_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt3_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt3_12ActionPerformed(evt);
            }
        });

        Txt3_13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt3_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt3_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt3_13ActionPerformed(evt);
            }
        });

        Txt3_21.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt3_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt3_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt3_21ActionPerformed(evt);
            }
        });

        Txt3_22.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt3_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt3_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt3_22ActionPerformed(evt);
            }
        });

        Txt3_23.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt3_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt3_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt3_23ActionPerformed(evt);
            }
        });

        Txt6_31.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt6_31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt6_31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt6_31ActionPerformed(evt);
            }
        });

        Txt6_32.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt6_32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt6_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt6_32ActionPerformed(evt);
            }
        });

        Txt6_33.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt6_33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt6_33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt6_33ActionPerformed(evt);
            }
        });

        Btn_A1.setBackground(new java.awt.Color(23, 23, 23));
        Btn_A1.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Btn_A1.setForeground(new java.awt.Color(251, 251, 251));
        Btn_A1.setText("A1");
        Btn_A1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 23, 23)));
        Btn_A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_A1ActionPerformed(evt);
            }
        });

        Txt3_31.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt3_31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt3_31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt3_31ActionPerformed(evt);
            }
        });

        Btn_A2.setBackground(new java.awt.Color(23, 23, 23));
        Btn_A2.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Btn_A2.setForeground(new java.awt.Color(251, 251, 251));
        Btn_A2.setText("A2");
        Btn_A2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 23, 23)));
        Btn_A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_A2ActionPerformed(evt);
            }
        });

        Txt3_32.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt3_32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt3_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt3_32ActionPerformed(evt);
            }
        });

        Btn_A3.setBackground(new java.awt.Color(23, 23, 23));
        Btn_A3.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Btn_A3.setForeground(new java.awt.Color(251, 251, 251));
        Btn_A3.setText("A3");
        Btn_A3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 23, 23)));
        Btn_A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_A3ActionPerformed(evt);
            }
        });

        Txt3_33.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt3_33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt3_33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt3_33ActionPerformed(evt);
            }
        });

        Txt4_11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt4_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt4_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt4_11ActionPerformed(evt);
            }
        });

        Txt4_12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt4_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt4_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt4_12ActionPerformed(evt);
            }
        });

        Txt4_13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt4_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt4_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt4_13ActionPerformed(evt);
            }
        });

        Txt4_21.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt4_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt4_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt4_21ActionPerformed(evt);
            }
        });

        Txt4_22.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt4_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt4_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt4_22ActionPerformed(evt);
            }
        });

        Txt4_23.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt4_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt4_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt4_23ActionPerformed(evt);
            }
        });

        Txt4_31.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt4_31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt4_31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt4_31ActionPerformed(evt);
            }
        });

        Txt4_32.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt4_32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt4_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt4_32ActionPerformed(evt);
            }
        });

        Txt4_33.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt4_33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt4_33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt4_33ActionPerformed(evt);
            }
        });

        Btn_I1.setBackground(new java.awt.Color(23, 23, 23));
        Btn_I1.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Btn_I1.setForeground(new java.awt.Color(251, 251, 251));
        Btn_I1.setText("I1");
        Btn_I1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 23, 23)));
        Btn_I1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_I1ActionPerformed(evt);
            }
        });

        Btn_D2.setBackground(new java.awt.Color(23, 23, 23));
        Btn_D2.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Btn_D2.setForeground(new java.awt.Color(251, 251, 251));
        Btn_D2.setText("D2");
        Btn_D2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 23, 23)));
        Btn_D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_D2ActionPerformed(evt);
            }
        });

        Btn_B1.setBackground(new java.awt.Color(23, 23, 23));
        Btn_B1.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Btn_B1.setForeground(new java.awt.Color(251, 251, 251));
        Btn_B1.setText("B1");
        Btn_B1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 23, 23)));
        Btn_B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_B1ActionPerformed(evt);
            }
        });

        Btn_B3.setBackground(new java.awt.Color(23, 23, 23));
        Btn_B3.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Btn_B3.setForeground(new java.awt.Color(251, 251, 251));
        Btn_B3.setText("B3");
        Btn_B3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 23, 23)));
        Btn_B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_B3ActionPerformed(evt);
            }
        });

        Btn_B2.setBackground(new java.awt.Color(23, 23, 23));
        Btn_B2.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Btn_B2.setForeground(new java.awt.Color(251, 251, 251));
        Btn_B2.setText("B2");
        Btn_B2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 23, 23)));
        Btn_B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_B2ActionPerformed(evt);
            }
        });

        Btn_D1.setBackground(new java.awt.Color(23, 23, 23));
        Btn_D1.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Btn_D1.setForeground(new java.awt.Color(251, 251, 251));
        Btn_D1.setText("D1");
        Btn_D1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 23, 23)));
        Btn_D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_D1ActionPerformed(evt);
            }
        });

        Btn_D3.setBackground(new java.awt.Color(23, 23, 23));
        Btn_D3.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Btn_D3.setForeground(new java.awt.Color(251, 251, 251));
        Btn_D3.setText("D3");
        Btn_D3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 23, 23)));
        Btn_D3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_D3ActionPerformed(evt);
            }
        });

        Btn_I2.setBackground(new java.awt.Color(23, 23, 23));
        Btn_I2.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Btn_I2.setForeground(new java.awt.Color(251, 251, 251));
        Btn_I2.setText("I2");
        Btn_I2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 23, 23)));
        Btn_I2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_I2ActionPerformed(evt);
            }
        });

        Btn_I3.setBackground(new java.awt.Color(23, 23, 23));
        Btn_I3.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Btn_I3.setForeground(new java.awt.Color(251, 251, 251));
        Btn_I3.setText("I3");
        Btn_I3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 23, 23)));
        Btn_I3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_I3ActionPerformed(evt);
            }
        });

        Btn_RD1.setBackground(new java.awt.Color(23, 23, 23));
        Btn_RD1.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Btn_RD1.setForeground(new java.awt.Color(251, 251, 251));
        Btn_RD1.setText("RD1");
        Btn_RD1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 23, 23)));
        Btn_RD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RD1ActionPerformed(evt);
            }
        });

        Btn_RD2.setBackground(new java.awt.Color(23, 23, 23));
        Btn_RD2.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Btn_RD2.setForeground(new java.awt.Color(251, 251, 251));
        Btn_RD2.setText("RD2");
        Btn_RD2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 23, 23)));
        Btn_RD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RD2ActionPerformed(evt);
            }
        });

        Btn_RD3.setBackground(new java.awt.Color(23, 23, 23));
        Btn_RD3.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Btn_RD3.setForeground(new java.awt.Color(251, 251, 251));
        Btn_RD3.setText("RD3");
        Btn_RD3.setBorder(null);
        Btn_RD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RD3ActionPerformed(evt);
            }
        });

        Btn_RI1.setBackground(new java.awt.Color(23, 23, 23));
        Btn_RI1.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Btn_RI1.setForeground(new java.awt.Color(251, 251, 251));
        Btn_RI1.setText("RI1");
        Btn_RI1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 23, 23)));
        Btn_RI1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RI1ActionPerformed(evt);
            }
        });

        Btn_RI2.setBackground(new java.awt.Color(23, 23, 23));
        Btn_RI2.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Btn_RI2.setForeground(new java.awt.Color(251, 251, 251));
        Btn_RI2.setText("RI2");
        Btn_RI2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 23, 23)));
        Btn_RI2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RI2ActionPerformed(evt);
            }
        });

        Btn_RI3.setBackground(new java.awt.Color(23, 23, 23));
        Btn_RI3.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Btn_RI3.setForeground(new java.awt.Color(251, 251, 251));
        Btn_RI3.setText("RI3");
        Btn_RI3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 23, 23)));
        Btn_RI3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RI3ActionPerformed(evt);
            }
        });

        Btn_Solucion.setBackground(new java.awt.Color(23, 23, 23));
        Btn_Solucion.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Btn_Solucion.setForeground(new java.awt.Color(251, 251, 251));
        Btn_Solucion.setText("Solucion");
        Btn_Solucion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 23, 23)));
        Btn_Solucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SolucionActionPerformed(evt);
            }
        });

        Btn_Empezar.setBackground(new java.awt.Color(23, 23, 23));
        Btn_Empezar.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Btn_Empezar.setForeground(new java.awt.Color(251, 251, 251));
        Btn_Empezar.setText("Empezar");
        Btn_Empezar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 23, 23)));
        Btn_Empezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EmpezarActionPerformed(evt);
            }
        });

        label_Mov.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        label_Mov.setForeground(new java.awt.Color(113, 217, 208));
        label_Mov.setText("                  ");

        label_reg.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        label_reg.setForeground(new java.awt.Color(0, 237, 55));
        label_reg.setText("             ");

        label_Mov1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        label_Mov1.setForeground(new java.awt.Color(232, 230, 107));
        label_Mov1.setText("  ");

        Tabla_Mov.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                        { null, null, null, null }
                },
                new String[] {
                        "Registros", "Movimientos",
                }));
        jScrollPane3.setViewportView(Tabla_Mov);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                        .addGroup(jPanel5Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                                        .addComponent(Btn_Empezar,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                78,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(Btn_Solucion,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                74,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                                        .addComponent(label_Mov1)
                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(label_reg,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                273,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE))
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                        .addGroup(jPanel5Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                                        .addGroup(jPanel5Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel5Layout
                                                                                        .createSequentialGroup()
                                                                                        .addGap(0, 36, Short.MAX_VALUE)
                                                                                        .addGroup(jPanel5Layout
                                                                                                .createParallelGroup(
                                                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addGroup(jPanel5Layout
                                                                                                        .createSequentialGroup()
                                                                                                        .addGroup(
                                                                                                                jPanel5Layout
                                                                                                                        .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                        .addComponent(
                                                                                                                                Btn_I1,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                31,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                        .addComponent(
                                                                                                                                Btn_I2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                31,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                        .addComponent(
                                                                                                                                Btn_I3,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                31,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                        .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                        .addGroup(
                                                                                                                jPanel5Layout
                                                                                                                        .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                        .addGroup(
                                                                                                                                jPanel5Layout
                                                                                                                                        .createSequentialGroup()
                                                                                                                                        .addComponent(
                                                                                                                                                Txt5_11,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                30,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                        .addGap(1,
                                                                                                                                                1,
                                                                                                                                                1)
                                                                                                                                        .addComponent(
                                                                                                                                                Txt5_12,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                30,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                        .addGap(1,
                                                                                                                                                1,
                                                                                                                                                1)
                                                                                                                                        .addComponent(
                                                                                                                                                Txt5_13,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                30,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                        .addGroup(
                                                                                                                                jPanel5Layout
                                                                                                                                        .createSequentialGroup()
                                                                                                                                        .addComponent(
                                                                                                                                                Txt5_31,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                30,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                        .addGap(1,
                                                                                                                                                1,
                                                                                                                                                1)
                                                                                                                                        .addComponent(
                                                                                                                                                Txt5_32,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                30,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                        .addGap(1,
                                                                                                                                                1,
                                                                                                                                                1)
                                                                                                                                        .addComponent(
                                                                                                                                                Txt5_33,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                30,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                        .addGroup(
                                                                                                                                jPanel5Layout
                                                                                                                                        .createSequentialGroup()
                                                                                                                                        .addComponent(
                                                                                                                                                Txt5_21,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                30,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                        .addGap(1,
                                                                                                                                                1,
                                                                                                                                                1)
                                                                                                                                        .addComponent(
                                                                                                                                                Txt5_22,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                30,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                        .addGap(1,
                                                                                                                                                1,
                                                                                                                                                1)
                                                                                                                                        .addComponent(
                                                                                                                                                Txt5_23,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                30,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                                .addGroup(
                                                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                        jPanel5Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(
                                                                                                                        Btn_RI3,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                        31,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(
                                                                                                                        Btn_RI2,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                        31,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(
                                                                                                                        Btn_RI1,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                        31,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                .addGroup(jPanel5Layout
                                                                                        .createSequentialGroup()
                                                                                        .addComponent(Btn_Etiquetas,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                78,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(0, 0, Short.MAX_VALUE)))
                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addGroup(jPanel5Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                false)
                                                                                .addGroup(jPanel5Layout
                                                                                        .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(jPanel5Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(Txt3_11,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        30,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(1, 1, 1)
                                                                                                .addComponent(Txt3_12,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        30,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(1, 1, 1)
                                                                                                .addComponent(Txt3_13,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        30,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addGroup(jPanel5Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(Txt3_31,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        30,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(1, 1, 1)
                                                                                                .addComponent(Txt3_32,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        30,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(1, 1, 1)
                                                                                                .addComponent(Txt3_33,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        30,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addGroup(jPanel5Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(Txt3_21,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        30,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(1, 1, 1)
                                                                                                .addComponent(Txt3_22,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        30,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(1, 1, 1)
                                                                                                .addComponent(Txt3_23,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        30,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addGroup(jPanel5Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(Txt4_11,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        30,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(1, 1, 1)
                                                                                                .addComponent(Txt4_12,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        30,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(1, 1, 1)
                                                                                                .addComponent(Txt4_13,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        30,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addGroup(jPanel5Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(Txt4_21,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        30,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(1, 1, 1)
                                                                                                .addComponent(Txt4_22,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        30,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(1, 1, 1)
                                                                                                .addComponent(Txt4_23,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        30,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addGroup(jPanel5Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel5Layout
                                                                                                        .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                        .addComponent(
                                                                                                                Btn_B2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                31,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGroup(
                                                                                                                jPanel5Layout
                                                                                                                        .createSequentialGroup()
                                                                                                                        .addComponent(
                                                                                                                                Txt4_31,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                30,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                        .addGap(1,
                                                                                                                                1,
                                                                                                                                1)
                                                                                                                        .addComponent(
                                                                                                                                Txt4_32,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                30,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                .addGap(1, 1, 1)
                                                                                                .addComponent(Txt4_33,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        30,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGroup(jPanel5Layout
                                                                                        .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(jPanel5Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(Txt2_11,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        30,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(1, 1, 1)
                                                                                                .addComponent(Txt2_12,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        30,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(1, 1, 1)
                                                                                                .addComponent(Txt2_13,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        30,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addGroup(jPanel5Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(Txt2_31,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        30,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(1, 1, 1)
                                                                                                .addComponent(Txt2_32,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        30,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(1, 1, 1)
                                                                                                .addComponent(Txt2_33,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        30,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addGroup(jPanel5Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(Txt2_21,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        30,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(1, 1, 1)
                                                                                                .addComponent(Txt2_22,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        30,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(1, 1, 1)
                                                                                                .addComponent(Txt2_23,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        30,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGroup(jPanel5Layout
                                                                                        .createSequentialGroup()
                                                                                        .addComponent(Btn_B1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                31,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(31, 31, 31)
                                                                                        .addComponent(Btn_B3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                31,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel5Layout
                                                                                        .createSequentialGroup()
                                                                                        .addGroup(jPanel5Layout
                                                                                                .createParallelGroup(
                                                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addGroup(jPanel5Layout
                                                                                                        .createSequentialGroup()
                                                                                                        .addComponent(
                                                                                                                Txt1_31,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGap(1, 1, 1)
                                                                                                        .addComponent(
                                                                                                                Txt1_32,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGap(1, 1, 1)
                                                                                                        .addComponent(
                                                                                                                Txt1_33,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(jPanel5Layout
                                                                                                        .createSequentialGroup()
                                                                                                        .addComponent(
                                                                                                                Txt1_21,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGap(1, 1, 1)
                                                                                                        .addGroup(
                                                                                                                jPanel5Layout
                                                                                                                        .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                        .addComponent(
                                                                                                                                Txt1_12,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                30,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                        .addGroup(
                                                                                                                                jPanel5Layout
                                                                                                                                        .createSequentialGroup()
                                                                                                                                        .addComponent(
                                                                                                                                                Txt1_22,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                30,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                        .addGap(1,
                                                                                                                                                1,
                                                                                                                                                1)
                                                                                                                                        .addComponent(
                                                                                                                                                Txt1_23,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                30,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                                .addGroup(
                                                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                        jPanel5Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(
                                                                                                                        Btn_A2,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                        31,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(31,
                                                                                                                        31,
                                                                                                                        31)))
                                                                                        .addGap(1, 1, 1))
                                                                                .addGroup(
                                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                                        jPanel5Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel5Layout
                                                                                                        .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(
                                                                                                                Btn_A1,
                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                31,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(
                                                                                                                Txt1_11,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(32, 32, 32)
                                                                                                .addGroup(jPanel5Layout
                                                                                                        .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(
                                                                                                                Txt1_13,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(
                                                                                                                Btn_A3,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                31,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                                .addComponent(Btn_Colores,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 78,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel5Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                                        .addGroup(jPanel5Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addGroup(jPanel5Layout
                                                                                        .createSequentialGroup()
                                                                                        .addComponent(Btn_RD1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                31,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                        .addComponent(Btn_RD2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                31,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(Btn_RD3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                31,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(24, 24, 24))
                                                                                .addGroup(jPanel5Layout
                                                                                        .createSequentialGroup()
                                                                                        .addGroup(jPanel5Layout
                                                                                                .createParallelGroup(
                                                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addGroup(jPanel5Layout
                                                                                                        .createSequentialGroup()
                                                                                                        .addComponent(
                                                                                                                Txt6_21,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGap(1, 1, 1)
                                                                                                        .addComponent(
                                                                                                                Txt6_22,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(jPanel5Layout
                                                                                                        .createSequentialGroup()
                                                                                                        .addComponent(
                                                                                                                Txt6_11,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGap(1, 1, 1)
                                                                                                        .addComponent(
                                                                                                                Txt6_12,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                        .addGap(1, 1, 1)
                                                                                        .addGroup(jPanel5Layout
                                                                                                .createParallelGroup(
                                                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addGroup(jPanel5Layout
                                                                                                        .createSequentialGroup()
                                                                                                        .addComponent(
                                                                                                                Txt6_23,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                        .addComponent(
                                                                                                                Btn_D2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                31,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(jPanel5Layout
                                                                                                        .createSequentialGroup()
                                                                                                        .addComponent(
                                                                                                                Txt6_13,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                        .addComponent(
                                                                                                                Btn_D1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                31,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                .addGroup(jPanel5Layout
                                                                                        .createSequentialGroup()
                                                                                        .addComponent(Txt6_31,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(1, 1, 1)
                                                                                        .addComponent(Txt6_32,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(1, 1, 1)
                                                                                        .addComponent(Txt6_33,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(Btn_D3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                31,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(246, 246, 246))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        jPanel5Layout.createSequentialGroup()
                                                                                .addComponent(jScrollPane3,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        202,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addContainerGap()))))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(label_Mov, javax.swing.GroupLayout.PREFERRED_SIZE, 273,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(316, 316, 316)))));
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Btn_Empezar, javax.swing.GroupLayout.PREFERRED_SIZE, 27,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Btn_Solucion, javax.swing.GroupLayout.PREFERRED_SIZE, 27,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Btn_A1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Btn_A2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Btn_A3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel5Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Txt1_11, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Txt1_12, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Txt1_13, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(1, 1, 1)
                                                .addGroup(jPanel5Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Txt1_21, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Txt1_22, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Txt1_23, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(1, 1, 1)
                                                .addGroup(jPanel5Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Txt1_32, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Txt1_31, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Txt1_33, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Btn_RD1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Btn_RD2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Btn_RD3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Btn_RI1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Btn_RI2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Btn_RI3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel5Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addGroup(jPanel5Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                                                .addGroup(jPanel5Layout
                                                                                        .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(Txt2_11,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(Txt2_12,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(Txt2_13,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(1, 1, 1)
                                                                                .addGroup(jPanel5Layout
                                                                                        .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(Txt2_21,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(Txt2_22,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(Txt2_23,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(1, 1, 1)
                                                                                .addGroup(jPanel5Layout
                                                                                        .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(Txt2_32,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(Txt2_31,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(Txt2_33,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                                                .addGroup(jPanel5Layout
                                                                                        .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(Txt6_11,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(Txt6_12,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(Txt6_13,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(Btn_D1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                27,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(1, 1, 1)
                                                                                .addGroup(jPanel5Layout
                                                                                        .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(Txt6_21,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(Txt6_22,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(Txt6_23,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(Btn_D2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                27,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(1, 1, 1)
                                                                                .addGroup(jPanel5Layout
                                                                                        .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(Txt6_32,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(Txt6_31,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(Txt6_33,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(Btn_D3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                27,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel5Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(Txt3_11,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(Txt3_12,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(Txt3_13,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(1, 1, 1)
                                                                .addGroup(jPanel5Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(Txt3_21,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(Txt3_22,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(Txt3_23,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(1, 1, 1)
                                                                .addGroup(jPanel5Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(Txt3_32,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(Txt3_31,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(Txt3_33,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addGroup(jPanel5Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(Txt5_11,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(Txt5_12,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(Txt5_13,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(Btn_I1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                27,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(1, 1, 1)
                                                                .addGroup(jPanel5Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(Txt5_21,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(Txt5_22,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(Txt5_23,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(Btn_I2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                27,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(1, 1, 1)
                                                                .addGroup(jPanel5Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(Txt5_32,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(Txt5_31,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(Txt5_33,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(Btn_I3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                27,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(0, 182, Short.MAX_VALUE)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(136, 136, 136)))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Txt4_11, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Txt4_12, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Txt4_13, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(1, 1, 1)
                                                .addGroup(jPanel5Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Txt4_21, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Txt4_22, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Txt4_23, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(1, 1, 1)
                                                .addGroup(jPanel5Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Txt4_32, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Txt4_31, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Txt4_33, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(4, 4, 4)
                                                .addGroup(jPanel5Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Btn_B1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Btn_B3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Btn_B2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15,
                                                        Short.MAX_VALUE)
                                                .addComponent(Btn_Colores, javax.swing.GroupLayout.PREFERRED_SIZE, 27,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Btn_Etiquetas, javax.swing.GroupLayout.PREFERRED_SIZE, 27,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                        Short.MAX_VALUE)
                                                .addGap(6, 6, 6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_Mov)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(label_reg)
                                        .addComponent(label_Mov1))
                                .addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>                        

    private void Btn_I3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Btn_I3ActionPerformed
        // TODO add your handling code here:
        I3();
        EtiquetasOn();
    }// GEN-LAST:event_Btn_I3ActionPerformed

    private void Btn_I2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Btn_I2ActionPerformed
        // TODO add your handling code here:
        I2();
        EtiquetasOn();
    }// GEN-LAST:event_Btn_I2ActionPerformed

    private void Btn_D3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Btn_D3ActionPerformed
        // TODO add your handling code here:
        D3();
        EtiquetasOn();
    }// GEN-LAST:event_Btn_D3ActionPerformed

    private void Btn_D1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Btn_D1ActionPerformed
        // TODO add your handling code here:
        D1();
        EtiquetasOn();
    }// GEN-LAST:event_Btn_D1ActionPerformed

    private void Btn_B2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Btn_B2ActionPerformed
        // TODO add your handling code here:

        B2();
        EtiquetasOn();

    }// GEN-LAST:event_Btn_B2ActionPerformed

    private void Btn_B3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Btn_B3ActionPerformed
        // TODO add your handling code here:
        B3();
        EtiquetasOn();
    }// GEN-LAST:event_Btn_B3ActionPerformed

    private void Btn_B1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Btn_B1ActionPerformed
        // TODO add your handling code here:
        B1();
        EtiquetasOn();
    }// GEN-LAST:event_Btn_B1ActionPerformed

    private void Btn_D2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Btn_D2ActionPerformed
        // TODO add your handling code here:
        D2();
        EtiquetasOn();
    }// GEN-LAST:event_Btn_D2ActionPerformed

    private void Btn_I1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Btn_I1ActionPerformed
        // TODO add your handling code here:
        I1();
        EtiquetasOn();
    }// GEN-LAST:event_Btn_I1ActionPerformed

    private void Txt4_33ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt4_33ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt4_33ActionPerformed

    private void Txt4_32ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt4_32ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt4_32ActionPerformed

    private void Txt4_31ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt4_31ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt4_31ActionPerformed

    private void Txt4_23ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt4_23ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt4_23ActionPerformed

    private void Txt4_22ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt4_22ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt4_22ActionPerformed

    private void Txt4_21ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt4_21ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt4_21ActionPerformed

    private void Txt4_13ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt4_13ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt4_13ActionPerformed

    private void Txt4_12ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt4_12ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt4_12ActionPerformed

    private void Txt4_11ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt4_11ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt4_11ActionPerformed

    private void Txt3_33ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt3_33ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt3_33ActionPerformed

    private void Btn_A3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Btn_A3ActionPerformed
        // TODO add your handling code here:
        A3();

        EtiquetasOn();
    }// GEN-LAST:event_Btn_A3ActionPerformed

    private void Txt3_32ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt3_32ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt3_32ActionPerformed

    private void Btn_A2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Btn_A2ActionPerformed
        // TODO add your handling code here:
        A2();
        EtiquetasOn();
    }// GEN-LAST:event_Btn_A2ActionPerformed

    private void Txt3_31ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt3_31ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt3_31ActionPerformed

    private void Btn_A1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Btn_A1ActionPerformed
        // TODO add your handling code here:
        A1();
        EtiquetasOn();
    }// GEN-LAST:event_Btn_A1ActionPerformed

    private void Txt6_33ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt6_33ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt6_33ActionPerformed

    private void Txt6_32ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt6_32ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt6_32ActionPerformed

    private void Txt6_31ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt6_31ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt6_31ActionPerformed

    private void Txt3_23ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt3_23ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt3_23ActionPerformed

    private void Txt3_22ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt3_22ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt3_22ActionPerformed

    private void Txt3_21ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt3_21ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt3_21ActionPerformed

    private void Txt3_13ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt3_13ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt3_13ActionPerformed

    private void Txt3_12ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt3_12ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt3_12ActionPerformed

    private void Txt6_23ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt6_23ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt6_23ActionPerformed

    private void Txt3_11ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt3_11ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt3_11ActionPerformed

    private void Txt6_22ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt6_22ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt6_22ActionPerformed

    private void Txt6_21ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt6_21ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt6_21ActionPerformed

    private void Txt6_13ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt6_13ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt6_13ActionPerformed

    private void Txt6_12ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt6_12ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt6_12ActionPerformed

    private void Txt2_33ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt2_33ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt2_33ActionPerformed

    private void Txt6_11ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt6_11ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt6_11ActionPerformed

    private void Txt2_32ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt2_32ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt2_32ActionPerformed

    private void Txt1_31ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt1_31ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt1_31ActionPerformed

    private void Txt1_23ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt1_23ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt1_23ActionPerformed

    private void Txt1_22ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt1_22ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt1_22ActionPerformed

    private void Txt1_21ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt1_21ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt1_21ActionPerformed

    private void Txt1_13ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt1_13ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt1_13ActionPerformed

    private void Txt1_12ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt1_12ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt1_12ActionPerformed

    private void Txt1_11ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt1_11ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt1_11ActionPerformed

    private void Txt2_31ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt2_31ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt2_31ActionPerformed

    private void Txt2_23ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt2_23ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt2_23ActionPerformed

    private void Txt2_22ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt2_22ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt2_22ActionPerformed

    private void Txt2_21ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt2_21ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt2_21ActionPerformed

    private void Txt2_13ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt2_13ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt2_13ActionPerformed

    private void Txt2_12ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt2_12ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt2_12ActionPerformed

    private void Txt2_11ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt2_11ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt2_11ActionPerformed

    private void Txt1_33ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt1_33ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt1_33ActionPerformed

    private void Txt1_32ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt1_32ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt1_32ActionPerformed

    private void Txt5_33ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt5_33ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt5_33ActionPerformed

    private void Txt5_32ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt5_32ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt5_32ActionPerformed

    private void Txt5_31ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt5_31ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt5_31ActionPerformed

    private void Txt5_23ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt5_23ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt5_23ActionPerformed

    private void Txt5_22ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt5_22ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt5_22ActionPerformed

    private void Txt5_21ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt5_21ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt5_21ActionPerformed

    private void Txt5_13ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt5_13ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt5_13ActionPerformed

    private void Txt5_12ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt5_12ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt5_12ActionPerformed

    private void Txt5_11ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt5_11ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt5_11ActionPerformed

    private void Btn_ColoresActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Btn_ColoresActionPerformed
        // TODO add your handling code here:
        Colores();
    }// GEN-LAST:event_Btn_ColoresActionPerformed

    private void Btn_EtiquetasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Btn_EtiquetasActionPerformed
        // TODO add your handling code here:
        Etiquetas();
    }// GEN-LAST:event_Btn_EtiquetasActionPerformed

    private void Btn_SolucionActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Btn_SolucionActionPerformed
        // TODO add your handling code here:
        Solucion();
    }// GEN-LAST:event_Btn_SolucionActionPerformed

    private void Btn_RD1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Btn_RD1ActionPerformed
        // TODO add your handling code here:
        RD1();
    }// GEN-LAST:event_Btn_RD1ActionPerformed

    private void Btn_RD2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Btn_RD2ActionPerformed
        // TODO add your handling code here:
        RD2();
    }// GEN-LAST:event_Btn_RD2ActionPerformed

    private void Btn_RD3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Btn_RD3ActionPerformed
        // TODO add your handling code here:
        RD3();
    }// GEN-LAST:event_Btn_RD3ActionPerformed

    private void Btn_RI1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Btn_RI1ActionPerformed
        // TODO add your handling code here:
        RI1();

    }// GEN-LAST:event_Btn_RI1ActionPerformed

    private void Btn_RI2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Btn_RI2ActionPerformed
        // TODO add your handling code here:
        RI2();
    }// GEN-LAST:event_Btn_RI2ActionPerformed

    private void Btn_RI3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Btn_RI3ActionPerformed
        // TODO add your handling code here:
        RI3();
    }// GEN-LAST:event_Btn_RI3ActionPerformed

    private void Btn_EmpezarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Btn_EmpezarActionPerformed
        // TODO add your handling code here:
        Etiquetas();
        Colores();

    }// GEN-LAST:event_Btn_EmpezarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormCubo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCubo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCubo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCubo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCubo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Btn_A1;
    private javax.swing.JButton Btn_A2;
    private javax.swing.JButton Btn_A3;
    private javax.swing.JButton Btn_B1;
    private javax.swing.JButton Btn_B2;
    private javax.swing.JButton Btn_B3;
    private javax.swing.JButton Btn_Colores;
    private javax.swing.JButton Btn_D1;
    private javax.swing.JButton Btn_D2;
    private javax.swing.JButton Btn_D3;
    private javax.swing.JButton Btn_Empezar;
    private javax.swing.JButton Btn_Etiquetas;
    private javax.swing.JButton Btn_I1;
    private javax.swing.JButton Btn_I2;
    private javax.swing.JButton Btn_I3;
    private javax.swing.JButton Btn_RD1;
    private javax.swing.JButton Btn_RD2;
    private javax.swing.JButton Btn_RD3;
    private javax.swing.JButton Btn_RI1;
    private javax.swing.JButton Btn_RI2;
    private javax.swing.JButton Btn_RI3;
    private javax.swing.JButton Btn_Solucion;
    private javax.swing.JTable Tabla_Mov;
    private javax.swing.JTextField Txt1_11;
    private javax.swing.JTextField Txt1_12;
    private javax.swing.JTextField Txt1_13;
    private javax.swing.JTextField Txt1_21;
    private javax.swing.JTextField Txt1_22;
    private javax.swing.JTextField Txt1_23;
    private javax.swing.JTextField Txt1_31;
    private javax.swing.JTextField Txt1_32;
    private javax.swing.JTextField Txt1_33;
    private javax.swing.JTextField Txt2_11;
    private javax.swing.JTextField Txt2_12;
    private javax.swing.JTextField Txt2_13;
    private javax.swing.JTextField Txt2_21;
    private javax.swing.JTextField Txt2_22;
    private javax.swing.JTextField Txt2_23;
    private javax.swing.JTextField Txt2_31;
    private javax.swing.JTextField Txt2_32;
    private javax.swing.JTextField Txt2_33;
    private javax.swing.JTextField Txt3_11;
    private javax.swing.JTextField Txt3_12;
    private javax.swing.JTextField Txt3_13;
    private javax.swing.JTextField Txt3_21;
    private javax.swing.JTextField Txt3_22;
    private javax.swing.JTextField Txt3_23;
    private javax.swing.JTextField Txt3_31;
    private javax.swing.JTextField Txt3_32;
    private javax.swing.JTextField Txt3_33;
    private javax.swing.JTextField Txt4_11;
    private javax.swing.JTextField Txt4_12;
    private javax.swing.JTextField Txt4_13;
    private javax.swing.JTextField Txt4_21;
    private javax.swing.JTextField Txt4_22;
    private javax.swing.JTextField Txt4_23;
    private javax.swing.JTextField Txt4_31;
    private javax.swing.JTextField Txt4_32;
    private javax.swing.JTextField Txt4_33;
    private javax.swing.JTextField Txt5_11;
    private javax.swing.JTextField Txt5_12;
    private javax.swing.JTextField Txt5_13;
    private javax.swing.JTextField Txt5_21;
    private javax.swing.JTextField Txt5_22;
    private javax.swing.JTextField Txt5_23;
    private javax.swing.JTextField Txt5_31;
    private javax.swing.JTextField Txt5_32;
    private javax.swing.JTextField Txt5_33;
    private javax.swing.JTextField Txt6_11;
    private javax.swing.JTextField Txt6_12;
    private javax.swing.JTextField Txt6_13;
    private javax.swing.JTextField Txt6_21;
    private javax.swing.JTextField Txt6_22;
    private javax.swing.JTextField Txt6_23;
    private javax.swing.JTextField Txt6_31;
    private javax.swing.JTextField Txt6_32;
    private javax.swing.JTextField Txt6_33;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel label_Mov;
    private javax.swing.JLabel label_Mov1;
    private javax.swing.JLabel label_reg;
    // End of variables declaration                   
}
