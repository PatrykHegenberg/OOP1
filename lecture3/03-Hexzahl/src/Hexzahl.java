public class Hexzahl {
    public static void main(String[] args) {
        int zahl = Integer.parseInt(System.console().readLine());
        // zahl in hexadezimal umwandeln und als String ausgeben
        System.out.println(Integer.toHexString(zahl));

        System.out.println(makeHex(zahl));
    }

    public static String makeHex(int zahl) {
        String hex = "";
        while(zahl > 0) {
            if(zahl%16 < 10) {
                hex += (char)(zahl%16 + 48);
            } else if(zahl%16 < 16) {
                hex += (char)(zahl%16 + 55);
            }
            zahl /= 16;
        }
        // reverse the String hex
        String reverseHex = "";
        for (int i = hex.length() -1; i >= 0; i--) {
            reverseHex += hex.charAt(i);
        }
        return reverseHex;
    }
}