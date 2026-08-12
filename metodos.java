public class metodos {
    public int[][] LlenarMatriz(int[][] m){
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m.length; j++){
                m[i][j] = (int)(Math.random()*10);
            }
        }
        return m;
    }

    public void MostrarMatriz(int[][] m){
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m.length; j++){
                System.out.print(" | " + m[i][j]);
            }
            System.out.println("| \n ------------");
        }
    }

    public objMatriz[][] LlenarMatrizObj(objMatriz[][] m){
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m.length; j++){
            objMatriz o = new objMatriz();
            o.setDato((int)(Math.random()*50 + 1));
            m[i][j] = o;
            }
        }

        return m;
    }

    public void MostrarMatrizObj(objMatriz[][] m){
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m.length; j++){
                System.out.print(" | " + m[i][j].getDato());
            }
            System.out.println("| \n ------------");
        }
    }
}
