import java.util.ArrayList;
import java.util.List;

class Matrix {

    private int[][] matriz;
    // LINHA E COLUNA
    Matrix(String matrixAsString) {
       String[] values = matrixAsString.split("\n");
       String lines = "";
       boolean created = false;
       for(int i=0; i <= values.length-1;i++){

           lines = values[i];
           String[] valuesRow = lines.split(" ");
           if(!created){
               this.matriz = new int[values.length][valuesRow.length];
               created = true;
           }
           for (int x =0; x <= valuesRow.length-1;x++){

               matriz[i][x] = new Integer(valuesRow[x]);
           }
       }
    }

    int[] getRow(int rowNumber) {
        int[] line = new int[this.matriz.length];
        for(int i=0; i<= matriz.length-1;i++){
            line[i] = matriz[rowNumber-1][i];
        }
        return line;
    }

    int[] getColumn(int columnNumber) {
        int[] colum = new int[this.matriz.length];
        for(int i=0; i <= this.matriz.length;i++){
            colum[i] = this.matriz[columnNumber][i];
        }
        return colum;
    }
}
