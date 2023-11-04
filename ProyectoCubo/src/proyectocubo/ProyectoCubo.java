
package proyectocubo;

public class ProyectoCubo {

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

    public static void ImprimeCara(int C[][]) {
        for (int i = 1; i <= 3; i++) {
            System.out.print("         ");
            for (int j = 1; j <= 3; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println("");
        }

    }// Fin del metodo ImprimeCara

    public static void ImprimeTresCaras(int Cx[][], int Cy[][], int Cz[][]) {
        for (int i = 1; i <= 3; i++) {
            for (int v = 1; v <= 3; v++)
                for (int j = 1; j <= 3; j++) {
                    if (v == 1)
                        System.out.print(Cx[i][j] + " ");
                    if (v == 2)
                        System.out.print(Cy[i][j] + " ");
                    if (v == 3)
                        System.out.print(Cz[i][j] + " ");
                }
            System.out.println("");

        }
    }// Fin del metodo ImprimeTresCaras

    public static void ImprimeCubo() {
        ImprimeCara(C1);
        ImprimeTresCaras(C5, C2, C6);
        ImprimeCara(C3);
        ImprimeCara(C4);
        System.out.println("========================================");
    }

    // --------------Rotaciones Derecha ------------------------------------
    public static void RDC1() {
        // FUNCION ROTAR CARA 6 A LA DERECHA.
        // Rotando las esquinas
        int t;
        t = C1[1][3];
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
    }// Fin del Movimiento RDC6

    public static void RDC2() {
        // FUNCION ROTAR CARA 6 A LA DERECHA.
        // Rotando las esquinas
        int t;
        t = C2[1][3];
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
    }// Fin del Movimiento RDC6

    public static void RDC3() {
        // FUNCION ROTAR CARA 6 A LA DERECHA.
        // Rotando las esquinas
        int t;
        t = C3[1][3];
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
    }// Fin del Movimiento RDC6

    public static void RDC4() {
        // FUNCION ROTAR CARA 6 A LA DERECHA.
        // Rotando las esquinas
        int t;
        t = C4[1][3];
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
    }// Fin del Movimiento RDC6

    public static void RDC5() {
        // FUNCION ROTAR CARA 6 A LA DERECHA.
        // Rotando las esquinas
        int t;
        t = C5[1][3];
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
    }// Fin del Movimiento RDC6

    public static void RDC6() {
        // FUNCION ROTAR CARA 6 A LA DERECHA.
        // Rotando las esquinas
        int t;
        t = C6[1][3];
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
    }// Fin del Movimiento RDC6

    // --------------Rotaciones Izquierda ------------------------------------
    public static void RIC1() {
        // FUNCION ROTAR CARA A LA IZQUIERDA
        int t;
        // Mover Esquinas
        t = C1[1][1];
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
    }

    public static void RIC2() {
        // FUNCION ROTAR CARA A LA IZQUIERDA
        int t;
        // Mover Esquinas
        t = C2[1][1];
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
    }

    public static void RIC3() {
        // FUNCION ROTAR CARA A LA IZQUIERDA
        int t;
        // Mover Esquinas
        t = C3[1][1];
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
    }

    public static void RIC4() {
        // FUNCION ROTAR CARA A LA IZQUIERDA
        int t;
        // Mover Esquinas
        t = C4[1][1];
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
    }

    public static void RIC5() {
        // FUNCION ROTAR CARA A LA IZQUIERDA
        int t;
        // Mover Esquinas
        t = C5[1][1];
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
    }

    public static void RIC6() {
        int t;
        // FUNCION ROTAR CARA A LA IZQUIERDA
        // Mover Esquinas
        t = C6[1][1];
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
    }

    // ==--==--==--==-- Movimientos Arriba A --==--==--==--==--
    public static void A1() {
        // Rotar Hacia Arriba
        int t;
        t = C1[1][1];
        C1[1][1] = C2[1][1];
        C2[1][1] = C3[1][1];
        C3[1][1] = C4[1][1];
        C4[1][1] = t;

        t = C1[2][1];
        C1[2][1] = C2[2][1];
        C2[2][1] = C3[2][1];
        C3[2][1] = C4[2][1];
        C4[2][1] = t;

        t = C1[3][1];
        C1[3][1] = C2[3][1];
        C2[3][1] = C3[3][1];
        C3[3][1] = C4[3][1];
        C4[3][1] = t;
    }// Fin del Movimiento A1

    public static void A2() {
        // Rotar Hacia Arriba
        int t;
        t = C1[1][2];
        C1[1][2] = C2[1][2];
        C2[1][2] = C3[1][2];
        C3[1][2] = C4[1][2];
        C4[1][2] = t;

        t = C1[2][2];
        C1[2][2] = C2[2][3];
        C2[2][2] = C3[2][3];
        C3[2][2] = C4[2][3];
        C4[2][2] = t;

        t = C1[3][2];
        C1[3][2] = C2[3][2];
        C2[3][2] = C3[3][2];
        C3[3][2] = C4[3][2];
        C4[3][2] = t;
    }// Fin del Movimiento A2

    public static void A3() {
        // Rotar Hacia Arriba
        int t;
        t = C1[1][3];
        C1[1][3] = C2[1][3];
        C2[1][3] = C3[1][3];
        C3[1][3] = C4[1][3];
        C4[1][3] = t;

        t = C1[2][3];
        C1[2][3] = C2[2][3];
        C2[2][3] = C3[2][3];
        C3[2][3] = C4[2][3];
        C4[2][3] = t;

        t = C1[3][3];
        C1[3][3] = C2[3][3];
        C2[3][3] = C3[3][3];
        C3[3][3] = C4[3][3];
        C4[3][3] = t;

    }// Fin del Movimiento A3

    // ==--==--==--==-- Movimientos Abajo B --==--==--==--==--
    public static void B1() {
        // Rotar Hacia Abajo
        int t;
        t = C3[1][1];
        C3[1][1] = C2[1][1];
        C2[1][1] = C1[1][1];
        C1[1][1] = C4[1][1];
        C4[1][1] = t;

        t = C3[2][1];
        C3[2][1] = C2[2][1];
        C2[2][1] = C1[2][1];
        C1[2][1] = C4[2][1];
        C4[2][1] = t;

        t = C3[3][1];
        C3[3][1] = C2[3][1];
        C2[3][1] = C1[3][1];
        C1[3][1] = C4[3][1];
        C4[3][1] = t;
    }// Fin del Movimiento B1

    public static void B2() {
        // Rotar Hacia Abajo
        int t;
        t = C3[1][2];
        C3[1][2] = C2[1][2];
        C2[1][2] = C1[1][2];
        C1[1][2] = C4[1][2];
        C4[1][2] = t;

        t = C3[2][2];
        C3[2][2] = C2[2][2];
        C2[2][2] = C1[2][2];
        C1[2][2] = C4[2][2];
        C4[2][2] = t;

        t = C3[3][2];
        C3[3][2] = C2[3][2];
        C2[3][2] = C1[3][2];
        C1[3][2] = C4[3][2];
        C4[3][2] = t;
    }// Fin del Movimiento B2

    public static void B3() {
        // Rotar Hacia Abajo
        int t;
        t = C3[1][3];
        C3[1][3] = C2[1][3];
        C2[1][3] = C1[1][3];
        C1[1][3] = C4[1][3];
        C4[1][3] = t;

        t = C3[2][3];
        C3[2][3] = C2[2][3];
        C2[2][3] = C1[2][3];
        C1[2][3] = C4[2][3];
        C4[2][3] = t;

        t = C3[3][3];
        C3[3][3] = C2[3][3];
        C2[3][3] = C1[3][3];
        C1[3][3] = C4[3][3];
        C4[3][3] = t;
    }// Fin del Movimiento B3

    // ==--==--==--==-- Movimientos Derecha D --==--==--==--==--
    public static void D1() {
        // Rotar Hacia La Derecha
        int t;

        t = C6[1][1];
        C6[1][1] = C2[1][1];
        C2[1][1] = C5[1][1];
        C5[1][1] = C4[1][1];
        C4[1][1] = t;

        t = C6[1][2];
        C6[1][2] = C2[1][2];
        C2[1][2] = C5[1][2];
        C5[1][2] = C4[1][2];
        C4[1][2] = t;

        t = C6[1][3];
        C6[1][3] = C2[1][3];
        C2[1][3] = C5[1][3];
        C5[1][3] = C4[1][3];
        C4[1][3] = t;

    }// Fin del Movimiento D1

    public static void D2() {
        // Rotar Hacia La Derecha
        int t;

        t = C6[2][1];
        C6[2][1] = C2[2][1];
        C2[2][1] = C5[2][1];
        C5[2][1] = C4[2][1];
        C4[2][1] = t;

        t = C6[2][2];
        C6[2][2] = C2[2][2];
        C2[2][2] = C5[2][2];
        C5[2][2] = C4[2][2];
        C4[2][2] = t;

        t = C6[2][3];
        C6[2][3] = C2[2][3];
        C2[2][3] = C5[2][3];
        C5[2][3] = C4[2][3];
        C4[2][3] = t;

    }// Fin del Movimiento D2

    public static void D3() {
        // Rotar Hacia La Derecha
        int t;

        t = C6[3][1];
        C6[3][1] = C2[3][1];
        C2[3][1] = C5[3][1];
        C5[3][1] = C4[3][1];
        C4[3][1] = t;

        t = C6[3][2];
        C6[3][2] = C2[3][2];
        C2[3][2] = C5[3][2];
        C5[3][2] = C4[3][2];
        C4[3][2] = t;

        t = C6[3][3];
        C6[3][3] = C2[3][3];
        C2[3][3] = C5[3][3];
        C5[3][3] = C4[3][3];
        C4[3][3] = t;

    }// Fin del Movimiento D3

    // ==--==--==--==-- Movimientos Izquierda I --==--==--==--==--
    public static void I1() {
        // Rotar hacia la Izquierda
        int t;

        t = C5[1][1];
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

    }// Fin del Movimiento I3

    public static void I2() {
        // Rotar hacia la Izquierda
        int t;

        t = C5[2][1];
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

    }// Fin del Movimiento I2

    public static void I3() {
        // Rotar hacia la Izquierda
        int t;

        t = C5[3][1];
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

    }// Fin del Movimiento I3

    public static void main(String[] args) {
        System.out.println("Hello friend");
        ImprimeCubo();
        I1();
        ImprimeCubo();
        I1();
        ImprimeCubo();
        I1();
        ImprimeCubo();
        I1();
        ImprimeCubo();
        
       

    }// Fin del metodo Main

}// Fin de la clase Main
