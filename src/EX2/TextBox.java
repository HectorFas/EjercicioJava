package EX2;

public class TextBox {
    int ancho, alto;
    String texto;

    public TextBox(String texto, int ancho, int alto) {
        this.texto = texto;
        setAncho(ancho);
        setAlto(alto);

    }
    public TextBox(int ancho, int alto) {
        this.texto = "";
        this.ancho = ancho;
        this.alto = alto;
    }

    public TextBox(String texto) {
        setTexto(texto, true);
    }





    public void setAncho(int ancho) {
        if ( ancho >= 0 && ancho >= texto.length()) {
            this.ancho = ancho;
        }
    }

    public void setAlto(int alto) {
        if (!texto.isEmpty() && alto >= 1) {
            this.alto = alto;
        }
    }

    public void setTexto(String texto) {
        if ( !texto.isEmpty()) {
            this.texto = texto;
        }
    }

    public void setTexto(String texto, boolean ajustar) {
        if(ajustar && !texto.isEmpty()) {
            ancho = texto.length();
            alto = 1;
        }
        this.texto = texto;
    }

    @Override
    public String toString() {
        return
                "┏" + "━".repeat(ancho) + "┓\n" +
                ("┃" + " ".repeat(ancho) + "┃\n").repeat((alto - 1) / 2) +
                (alto > 0 ? "┃" + " ".repeat((ancho - texto.length() + 1) / 2) + texto + " ".repeat((ancho - texto.length()) / 2) + "┃\n" : "") +
                ("┃" + " ".repeat(ancho) + "┃\n").repeat(alto / 2) +
                "┗" + "━".repeat(ancho) + "┛\n";
    }

}
