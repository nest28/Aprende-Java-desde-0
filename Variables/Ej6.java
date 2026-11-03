public class Ej6 {

    public static void main(String[] args) {

        double baseImponible = 100;
        double iva = baseImponible * 0.21;
        double total = baseImponible + iva;

        System.out.println("Base imponible: " + baseImponible + "euros");
        System.out.println("IVA: " + iva + " euros");
        System.out.println("Total factura: " + total + " euros");

    }
}