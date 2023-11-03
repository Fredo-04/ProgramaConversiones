public class DecimalABinario {
    private int numeroDecimal;

    public DecimalABinario(int numeroDecimal) {
        this.numeroDecimal = numeroDecimal;
    }

    public String convertir() {
        return Integer.toBinaryString(numeroDecimal);
    }
}
