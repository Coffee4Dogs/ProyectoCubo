
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
        // t = C2[1][3];
        // C2[1][3] = C2[1][1];
        // C2[1][1] = C2[3][1];
        // C2[3][1] = C2[3][3];
        // C2[3][3] = t;

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
        // Move
        for (int i = 1; i <= 3; i++) {
            int t = C1[i][1];
            C1[i][1] = C2[i][1];
            C2[i][1] = C3[i][1];
            C3[i][1] = C4[i][1];
            C4[i][1] = t;
        }
        RIC5();
    }// Fin del Movimiento A1

    public static void A2() {
        // Move
        for (int i = 1; i <= 3; i++) {
            int t = C1[i][2];
            C1[i][2] = C2[i][2];
            C2[i][2] = C3[i][2];
            C3[i][2] = C4[i][2];
            C4[i][2] = t;
        }

    }// Fin del Movimiento A2

    public static void A3() {
        // Move
        for (int i = 1; i <= 3; i++) {
            int t = C1[i][3];
            C1[i][3] = C2[i][3];
            C2[i][3] = C3[i][3];
            C3[i][3] = C4[i][3];
            C4[i][3] = t;

        }
        RDC6();

    }// Fin del Movimiento A3

    // ==--==--==--==-- Movimientos Abajo B --==--==--==--==--
    public static void B1() {
        // Move
        for (int i = 0; i <= 3; i++) {
            int t = C3[i][1];
            C3[i][1] = C2[i][1];
            C2[i][1] = C1[i][1];
            C1[i][1] = C4[i][1];
            C4[i][1] = t;
        }

        RDC5();

    }// Fin del Movimiento B1

    public static void B2() {
        // Move
        for (int i = 0; i <= 3; i++) {
            int t = C3[i][2];
            C3[i][2] = C2[i][2];
            C2[i][2] = C1[i][2];
            C1[i][2] = C4[i][2];
            C4[i][2] = t;
        }

    }// Fin del Movimiento B2

    public static void B3() {

        // Move
        int t;
        for (int i = 0; i <= 3; i++) {
            t = C3[i][3];
            C3[i][3] = C2[i][3];
            C2[i][3] = C1[i][3];
            C1[i][3] = C4[i][3];
            C4[i][3] = t;
        }
        RIC6();

    }// Fin del Movimiento B3

    // ==--==--==--==-- Movimientos Derecha D --==--==--==--==--
    public static void D1() {
        // Move
        int t;
        for (int i = 1; i <= 3; i++) {
            t = C6[1][i];
            C6[1][i] = C2[1][i];
            C2[1][i] = C5[1][i];
            C5[1][i] = C4[1][i];
            C4[1][i] = t;
        }
        RIC1();

    }// Fin del Movimiento D1

    public static void D2() {
        // Move
        int t;
        for (int i = 1; i <= 3; i++) {
            t = C6[2][i];
            C6[2][i] = C2[2][i];
            C2[2][i] = C5[2][i];
            C5[2][i] = C4[2][i];
            C4[2][i] = t;
        }

    }// Fin del Movimiento D2

    public static void D3() {

        // Move
        int t;
        for (int i = 1; i <= 3; i++) {
            t = C6[3][i];
            C6[3][i] = C2[3][i];
            C2[3][i] = C5[3][i];
            C5[3][i] = C4[3][i];
            C4[3][i] = t;
        }

        RDC3();

    }// Fin del Movimiento D3

    // ==--==--==--==-- Movimientos Izquierda I --==--==--==--==--
    public static void I1() { // Optimizar con un for
        // Rotar hacia la Izquierda
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

        RDC1();

    }// Fin del Movimiento I3

    public static void I2() {
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

    }// Fin del Movimiento I2

    public static void I3() {

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

        RIC3();

    }// Fin del Movimiento I3

    // ---Movimientos RD ---
    public static void RD1() {
        // Move
        for (int i = 1; i <= 3; i++) {
            int t = C1[3][i];
            C1[3][i] = C6[3][i];
            C6[3][i] = C3[3][i];
            C3[3][i] = C5[3][i];
            C5[3][i] = t;
        }

        RIC2();

    }// Fin del Movimiento RD1

    public static void RD2() {

        // Move
        for (int i = 1; i <= 3; i++) {
            int t = C1[2][i];
            C1[2][i] = C6[2][i];
            C6[2][i] = C3[2][i];
            C3[2][i] = C5[2][i];
            C5[2][i] = t;
        }

    }// Fin del Movimiento RD2

    public static void RD3() {

        // Move
        for (int i = 1; i <= 3; i++) {
            int t = C1[1][i];
            C1[1][i] = C6[1][i];
            C6[1][i] = C3[1][i];
            C3[1][i] = C5[1][i];
            C5[1][i] = t;
        }

        RDC4();
    }// Fin del Movimiento RD3

    // ---Movimientos RI ---

    public static void RI1() {

        // Move
        for (int i = 1; i <= 3; i++) {
            int t = C1[3][i];
            C1[3][i] = C5[3][i];
            C5[3][i] = C3[3][i];
            C3[3][i] = C6[3][i];
            C6[3][i] = t;
        }

        RIC2();

    }// Fin del Movimiento RI1

    public static void RI2() {

        // Move
        for (int i = 1; i <= 3; i++) {
            int t = C1[2][i];
            C1[2][i] = C5[2][i];
            C5[2][i] = C3[2][i];
            C3[2][i] = C6[2][i];
            C6[2][i] = t;
        }

    }// Fin del Movimiento RI2

    public static void RI3() {

        // Move
        for (int i = 1; i <= 3; i++) {
            int t = C1[1][i];
            C1[1][i] = C5[1][i];
            C5[1][i] = C3[1][i];
            C3[1][i] = C6[1][i];
            C6[1][i] = t;
        }

        RIC4();

    }// Fin del Movimiento RI3

    public static void main(String[] args) {

        ImprimeCubo();
        RD1();
        RD2();
        RD3();
        ImprimeCubo();
        RD1();
        RD2();
        RD3();
        ImprimeCubo();
        RD1();
        RD2();
        RD3();
        ImprimeCubo();
        RD1();
        RD2();
        RD3();
        ImprimeCubo();

    }// Fin del metodo Main

}// Fin de la clase Main
