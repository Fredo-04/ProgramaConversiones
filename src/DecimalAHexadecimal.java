public class DecimalAHexadecimal {
    private int numeroDecimal;

    public DecimalAHexadecimal(int numeroDecimal) {
        this.numeroDecimal = numeroDecimal;
    }

    public String convertir() {
        return Integer.toHexString(numeroDecimal).toUpperCase();
    }
}
