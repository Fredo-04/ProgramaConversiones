public class BinarioAHexadecimal {
    private String numeroBinario;

    public BinarioAHexadecimal(String numeroBinario) {
        this.numeroBinario = numeroBinario;
    }

    public String convertir() {
        int decimal = Integer.parseInt(numeroBinario, 2);
        return Integer.toHexString(decimal).toUpperCase();
    }
}
