class Flachenrechner {
    public static void main(String[] args) {
        Rechteck rechteck2 = new Rechteck(6, 3);
        rechteck2.to_string();
        System.out.println(rechteck2.getArea());
        Kreis kreis1 = new Kreis(5);
        kreis1.to_string();
        System.out.println(kreis1.getArea());
        Dreieck dreieck1 = new Dreieck(10, 5);
        dreieck1.to_string();
        System.out.println(dreieck1.getArea());
    }
}