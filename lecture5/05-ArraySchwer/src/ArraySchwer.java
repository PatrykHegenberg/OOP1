public class ArraySchwer {
    public static void main(String[] args) {
       int[][] matrix = new int[5][5];

       for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = calcWert(i, j);
            }
       }
       for(int[] i: matrix) {
        String out = "| ";
        for (int j = 0; j < i.length; j++) {
            out += i[j] + " | ";
        }
        System.out.println(out);
        }

    }

    public static int calcWert(int i, int j){
        int wert = (i+1);
        for (int k = 1; k <= j; k++) {
            wert *= (i+1);
        }
        return wert;
    }
}