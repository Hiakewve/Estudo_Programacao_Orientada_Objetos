public class ConversorMoeda {
    public static double IOF = 0.06;

    public static double valorSerPago(double quantia, double precoDolar){
        return quantia * precoDolar * (1 + IOF);
    }
}
