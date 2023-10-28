
package proyectocubo;

import static proyectocubo.ProyectoCubo.C6;
import java.awt.Color; //Libreria para usar colores.

public class FormCubo extends javax.swing.JFrame {
public static int ccol = 0;
    
    
    //Declarar variables de los colores.
    public static Color Rojo = Color.red;
    public static Color Amarillo = Color.yellow;
    public static Color Naranja = Color.orange;
    public static Color Blanco = Color.white;
    public static Color Verde = Color.green;
    public static Color Azul = Color.cyan;
    
    // public static Color Azul = new Color.(7, 98, 173);
    public static Color COL1[][] = {
        {Rojo,Rojo,Rojo,Rojo},
        {Rojo,Rojo,Rojo,Rojo},
        {Rojo,Rojo,Rojo,Rojo},
        {Rojo,Rojo,Rojo,Rojo}
    };
    
    public static Color COL2[][] = {
        {Amarillo,Amarillo,Amarillo,Amarillo},
        {Amarillo,Amarillo,Amarillo,Amarillo},
        {Amarillo,Amarillo,Amarillo,Amarillo},
        {Amarillo,Amarillo,Amarillo,Amarillo}
    };
    
    public static Color COL3[][] = {
        {Naranja,Naranja,Naranja,Naranja},
        {Naranja,Naranja,Naranja,Naranja},
        {Naranja,Naranja,Naranja,Naranja},
        {Naranja,Naranja,Naranja,Naranja}
    };
    
    public static Color COL4[][] = {
        {Blanco,Blanco,Blanco,Blanco},
        {Blanco,Blanco,Blanco,Blanco},
        {Blanco,Blanco,Blanco,Blanco},
        {Blanco,Blanco,Blanco,Blanco}
    };
    
    public static Color COL5[][] = {
        {Verde, Verde, Verde, Verde},
        {Verde, Verde, Verde, Verde},
        {Verde, Verde, Verde, Verde},
        {Verde, Verde, Verde, Verde}     
    };
    
    public static Color COL6[][] = {
        {Azul, Azul, Azul, Azul},
        {Azul, Azul, Azul, Azul},
        {Azul, Azul, Azul, Azul},
        {Azul, Azul, Azul, Azul}};
    
    
    void ColoresOn1(){
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
    
    void ColoresOn2(){
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
    
    void ColoresOn3(){
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
    
    void ColoresOn4(){
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
    
    void ColoresOn5(){
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
    
    void ColoresOn6(){
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
    
    void ColoresOn(){
        ColoresOn1();
        ColoresOn2();
        ColoresOn3();
        ColoresOn4();
        ColoresOn5();
        ColoresOn6();
        
    }
    
    
    public static int cc = 0;
    
    //Las caras del cubo.
        public static int C1[][] = {
        {0,0,0,0},
        {0,11,12,13},
        {0,14,15,16},
        {0,17,18,19}};
    
        public static int C2[][] = {
        {0,0,0,0},
        {0,21,22,23},
        {0,24,25,26},
        {0,27,28,29}};
        
        public static int C3[][] = {
        {0,0,0,0},
        {0,31,32,33},
        {0,34,35,36},
        {0,37,38,39}};
    
        public static int C4[][] = {
        {0,0,0,0},
        {0,41,42,43},
        {0,44,45,46},
        {0,47,48,49}};
    
        public static int C5[][] = {
        {0,0,0,0},
        {0,51,52,53},
        {0,54,55,56},
        {0,57,58,59}};
        
        public static int C6[][] = {
        {0,0,0,0},
        {0,61,62,63},
        {0,64,65,66},
        {0,67,68,69}};
   
        
        
        
    public FormCubo() {
        initComponents();
    }
    
    
    
    
    
    
    void EtiquetasOn1(){
    //Enciende solo la cara 1
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
    
    void EtiquetasOn2(){
    //Enciende solo la cara 2
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
    
    
    void EtiquetasOn3(){
    //Enciende solo la cara 3
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
    
    void EtiquetasOn4(){
    //Enciende solo la cara 4
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
    
     void EtiquetasOn5(){
    //Enciende solo la cara 5
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
    
     void EtiquetasOn6(){
    //Enciende solo la cara 6
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
     
     void ColoresOff1(){
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
     void ColoresOff2(){
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
     void ColoresOff3(){
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
     void ColoresOff4(){
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
     void ColoresOff5(){
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
     void ColoresOff6(){
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
     void ColoresOff(){
         ColoresOff1();
         ColoresOff2();
         ColoresOff3();
         ColoresOff4();
         ColoresOff5();
         ColoresOff6();
     }
     void Colores(){
        ccol = ccol + 1;
        if(ccol > 1) ccol = 0;
        if(ccol == 1) ColoresOn();
        else 
            ColoresOff();    
    }
     
     
    
    
    void EtiquetasOff1(){
    //Apaga la cara 1
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
    
    void EtiquetasOff2(){
    //Apaga la cara 2
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
    
    void EtiquetasOff3(){
    //Apaga la cara 3
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
    
    void EtiquetasOff4(){
    //Apaga la cara 4
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
    
    void EtiquetasOff5(){
    //Apaga la cara 5
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
    
    void EtiquetasOff6(){
    //Apaga la cara 6
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
    
    void EtiquetasOn(){
        //Enciende todas las caras.
        
        EtiquetasOn1();
        EtiquetasOn2();
        EtiquetasOn3();
        EtiquetasOn4();
        EtiquetasOn5();
        EtiquetasOn6();
    }//Fin del Metodo On
    
    void EtiquetasOff(){
    //Apaga todas las caras 
        EtiquetasOff1();
        EtiquetasOff2();
        EtiquetasOff3();
        EtiquetasOff4();
        EtiquetasOff5();
        EtiquetasOff6();
    }
    
    void Etiquetas(){
        cc = cc + 1;
        if(cc > 1) cc = 0;
        if(cc == 1) EtiquetasOn();
        else 
            EtiquetasOff();
    
    }
    
    
    public void A3Col(){//Se agrega Col
            //Rotar Hacia Arriba Colores    
            Color t;//Se cambia el tipo de variable
 
            for(int i =1; i<=3; i++){
                t = COL1[i][3]; 
                COL1[i][3] = COL2[i][3];
                COL2[i][3] = COL3[i][3];
                COL3[i][3] = COL4[i][3];
                COL4[i][3] = t;
            }
            
            RDC6();
            if(cc==1)EtiquetasOn();
            if(ccol==1)ColoresOn();
            
    }//Fin del Movimiento A3
    
    public void A3(){
            //Rotar Hacia Arriba    
            int t;
 
            for(int i =1; i<=3; i++){
                t = C1[i][3]; 
                C1[i][3] = C2[i][3];
                C2[i][3] = C3[i][3];
                C3[i][3] = C4[i][3];
                C4[i][3] = t;
            }
        A3Col();
        RDC6();
        
    }//Fin del Movimiento A3
    
    public void RDC6(){
            //FUNCION ROTAR CARA 6 A LA DERECHA.
            //Rotando las esquinas
            int t;
            t = C6[1][3];
            C6[1][3] = C6[1][1];
            C6[1][1] = C6[3][1];
            C6[3][1] = C6[3][3];
            C6[3][3] = t;

            //Rotando las de en medio            
            t = C6[1][2];
            C6[1][2] = C6[2][1];
            C6[2][1] = C6[3][2];
            C6[3][2] = C6[2][3];
            C6[2][3] = t;
            
            
            //Color
            //Rotando las esquinas
            Color t2;
            t2 = COL6[1][3];
            COL6[1][3] = COL6[1][1];
            COL6[1][1] = COL6[3][1];
            COL6[3][1] = COL6[3][3];
            COL6[3][3] = t2;

            //Rotando las de en medio            
            t2 = COL6[1][2];
            COL6[1][2] = COL6[2][1];
            COL6[2][1] = COL6[3][2];
            COL6[3][2] = COL6[2][3];
            COL6[2][3] = t2;
        }//Fin del Movimiento RDC6

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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
        Btn_D1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
            .addGap(0, 119, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 131, Short.MAX_VALUE)
        );

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

        jLabel1.setText("------>");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(Btn_I1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Txt5_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(Txt5_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(Txt5_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Txt5_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(Txt5_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(Txt5_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Txt5_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(Txt5_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(Txt5_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Btn_Etiquetas, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(Txt1_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(Txt1_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(Txt1_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(Txt1_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(Txt1_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(Txt1_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Btn_A2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(Txt1_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1)
                                    .addComponent(Txt1_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(1, 1, 1)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Txt1_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Btn_A3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Btn_A1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(Txt3_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(Txt3_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(Txt3_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(Txt3_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(Txt3_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(Txt3_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(Txt3_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(Txt3_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(Txt3_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(Txt4_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(Txt4_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(Txt4_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(Txt4_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(Txt4_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(Txt4_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(Txt4_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(Txt4_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(Txt4_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Btn_Colores, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(Txt2_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(Txt2_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(Txt2_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(Txt2_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(Txt2_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(Txt2_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(Txt2_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(Txt2_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(Txt2_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Txt6_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(Txt6_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(Txt6_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Txt6_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(Txt6_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(Txt6_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Txt6_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(Txt6_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(Txt6_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Btn_D1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addContainerGap(297, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btn_A1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_A2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_A3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt1_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt1_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt1_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt1_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt1_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt1_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt1_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt1_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt1_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Txt2_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt2_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt2_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Txt2_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt2_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt2_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Txt2_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt2_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt2_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Txt6_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt6_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt6_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn_D1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Txt6_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt6_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt6_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Txt6_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt6_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt6_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt3_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt3_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt3_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt3_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt3_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt3_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt3_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt3_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt3_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt5_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt5_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt5_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_I1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt5_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt5_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt5_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt5_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt5_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt5_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt4_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt4_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt4_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt4_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt4_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt4_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt4_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt4_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt4_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Etiquetas, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Colores, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt4_33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt4_33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt4_33ActionPerformed

    private void Txt4_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt4_32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt4_32ActionPerformed

    private void Txt4_31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt4_31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt4_31ActionPerformed

    private void Txt4_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt4_23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt4_23ActionPerformed

    private void Txt4_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt4_22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt4_22ActionPerformed

    private void Txt4_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt4_21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt4_21ActionPerformed

    private void Txt4_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt4_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt4_13ActionPerformed

    private void Txt4_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt4_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt4_12ActionPerformed

    private void Txt4_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt4_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt4_11ActionPerformed

    private void Txt3_33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt3_33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt3_33ActionPerformed

    private void Btn_A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_A3ActionPerformed
        // TODO add your handling code here:
        A3();

        EtiquetasOn();
    }//GEN-LAST:event_Btn_A3ActionPerformed

    private void Txt3_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt3_32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt3_32ActionPerformed

    private void Btn_A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_A2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_A2ActionPerformed

    private void Txt3_31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt3_31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt3_31ActionPerformed

    private void Btn_A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_A1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_A1ActionPerformed

    private void Txt6_33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt6_33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt6_33ActionPerformed

    private void Txt6_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt6_32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt6_32ActionPerformed

    private void Txt6_31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt6_31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt6_31ActionPerformed

    private void Txt3_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt3_23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt3_23ActionPerformed

    private void Txt3_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt3_22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt3_22ActionPerformed

    private void Txt3_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt3_21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt3_21ActionPerformed

    private void Txt3_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt3_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt3_13ActionPerformed

    private void Txt3_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt3_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt3_12ActionPerformed

    private void Txt6_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt6_23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt6_23ActionPerformed

    private void Txt3_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt3_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt3_11ActionPerformed

    private void Txt6_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt6_22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt6_22ActionPerformed

    private void Txt6_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt6_21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt6_21ActionPerformed

    private void Txt6_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt6_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt6_13ActionPerformed

    private void Txt6_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt6_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt6_12ActionPerformed

    private void Txt2_33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt2_33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt2_33ActionPerformed

    private void Txt6_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt6_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt6_11ActionPerformed

    private void Txt2_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt2_32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt2_32ActionPerformed

    private void Txt1_31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt1_31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt1_31ActionPerformed

    private void Txt1_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt1_23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt1_23ActionPerformed

    private void Txt1_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt1_22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt1_22ActionPerformed

    private void Txt1_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt1_21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt1_21ActionPerformed

    private void Txt1_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt1_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt1_13ActionPerformed

    private void Txt1_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt1_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt1_12ActionPerformed

    private void Txt1_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt1_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt1_11ActionPerformed

    private void Txt2_31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt2_31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt2_31ActionPerformed

    private void Txt2_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt2_23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt2_23ActionPerformed

    private void Txt2_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt2_22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt2_22ActionPerformed

    private void Txt2_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt2_21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt2_21ActionPerformed

    private void Txt2_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt2_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt2_13ActionPerformed

    private void Txt2_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt2_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt2_12ActionPerformed

    private void Txt2_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt2_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt2_11ActionPerformed

    private void Txt1_33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt1_33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt1_33ActionPerformed

    private void Txt1_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt1_32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt1_32ActionPerformed

    private void Txt5_33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt5_33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt5_33ActionPerformed

    private void Txt5_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt5_32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt5_32ActionPerformed

    private void Txt5_31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt5_31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt5_31ActionPerformed

    private void Txt5_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt5_23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt5_23ActionPerformed

    private void Txt5_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt5_22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt5_22ActionPerformed

    private void Txt5_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt5_21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt5_21ActionPerformed

    private void Txt5_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt5_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt5_13ActionPerformed

    private void Txt5_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt5_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt5_12ActionPerformed

    private void Txt5_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt5_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt5_11ActionPerformed

    private void Btn_ColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ColoresActionPerformed
        // TODO add your handling code here:
        Colores();
    }//GEN-LAST:event_Btn_ColoresActionPerformed

    private void Btn_EtiquetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EtiquetasActionPerformed
        // TODO add your handling code here:
        Etiquetas();

    }//GEN-LAST:event_Btn_EtiquetasActionPerformed

    private void Btn_I1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_I1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_I1ActionPerformed

    private void Btn_D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_D1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_D1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(FormCubo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCubo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCubo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCubo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCubo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_A1;
    private javax.swing.JButton Btn_A2;
    private javax.swing.JButton Btn_A3;
    private javax.swing.JButton Btn_Colores;
    private javax.swing.JButton Btn_D1;
    private javax.swing.JButton Btn_Etiquetas;
    private javax.swing.JButton Btn_I1;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
