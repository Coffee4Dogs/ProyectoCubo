
package proyectocubo;



public class ProyectoCubo {
    
    
    
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
        
      
        public static void ImprimeCara(int C[][]){
            for(int i = 1; i<=3; i++){
                System.out.print("         ");
                for(int j=1;j<=3; j++){
                    System.out.print(C[i][j]+" ");            
                }
                System.out.println("");
            }
            
          
            
        
    }//Fin del metodo ImprimeCara
        
        public static void ImprimeTresCaras(int Cx[][], int Cy[][], int Cz[][]){
            for(int i = 1; i<=3; i++){
                for(int v=1; v<=3; v++)
                    for(int j=1;j<=3; j++){
                        if(v == 1) System.out.print(Cx[i][j]+" ");
                        if(v == 2) System.out.print(Cy[i][j]+" ");
                        if(v == 3) System.out.print(Cz[i][j]+" ");
                    }
                    System.out.println("");

                }
        }//Fin del metodo ImprimeTresCaras
        
        public static void ImprimeCubo(){
            ImprimeCara(C1);
            ImprimeTresCaras(C5, C2, C6);
            ImprimeCara(C3);
            ImprimeCara(C4);
            System.out.println("========================================");
        }
        
        // --------------Rotaciones Derecha ------------------------------------
        
        
        public static void RDC6(){
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
        }//Fin del Movimiento RDC6
        
        // ==--==--==--==-- Rotaciones Arriba A --==--==--==--==--
        public static void A1(){
            //Rotar Hacia Arriba    
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
        }//Fin del Movimiento A1
        
        public static void A2(){
            //Rotar Hacia Arriba    
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
        }//Fin del Movimiento A2
        
        
        public static void A3(){
            //Rotar Hacia Arriba    
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
        }//Fin del Movimiento A3
        
        // ==--==--==--==-- Rotaciones Abajo B --==--==--==--==--
        
         
        
    public static void main(String[] args) {
        
           System.out.println("Hello friend");
//        ImprimeCubo();
//        RDC6();   
//        ImprimeCubo();
            ImprimeCubo();
            A2();
            ImprimeCubo();
            A2();
            ImprimeCubo();
            A2();
            ImprimeCubo();
            A2();
            ImprimeCubo();
            System.out.println("Hello Jack");
           

        
        
        
        
    }//Fin del metodo Main
    
}//Fin de la clase Main

