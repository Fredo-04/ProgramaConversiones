public class HexadecimalADecimal {
    private String numeroHexadecimal;

    public HexadecimalADecimal(String numeroHexadecimal) {
        this.numeroHexadecimal = numeroHexadecimal;
    }

    public int convertir() {
        return Integer.parseInt(numeroHexadecimal, 16);
    }
}
