public class ArrayEinfach {
    public static void main(String[] args) {
        int[] quadratZahlen = new int[10];
        for (int i = 0; i < quadratZahlen.length; i++) {
            quadratZahlen[i] = (i+1) * (i+1);
        }
        for(int i: quadratZahlen) {
            System.out.println(i);
        }
    }
}
