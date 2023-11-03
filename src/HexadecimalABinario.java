public class HexadecimalABinario {
    private String numeroHexadecimal;

    public HexadecimalABinario(String numeroHexadecimal) {
        this.numeroHexadecimal = numeroHexadecimal;
    }

    public String convertir() {
        int decimal = Integer.parseInt(numeroHexadecimal, 16);
        return Integer.toBinaryString(decimal);
    }
}