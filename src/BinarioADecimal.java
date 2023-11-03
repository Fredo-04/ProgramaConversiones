public class BinarioADecimal {
    private String numeroBinario;

    public BinarioADecimal(String numeroBinario) {
        this.numeroBinario = numeroBinario;
    }

    public int convertir() {
        return Integer.parseInt(numeroBinario, 2);
    }
}
