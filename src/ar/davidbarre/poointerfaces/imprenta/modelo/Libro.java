package ar.davidbarre.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimir {

    private List<Imprimir> paginas;
    private Persona autor;
    private String titulo;
    private Genero genero;

    public Libro(Persona autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public Libro addPagina(Imprimir pagina) {
        paginas.add(pagina);
        return this;
    }

    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append(titulo).append("\n")
                .append("Autor: ").append(autor).append("\n")
                .append("Genero: ").append(genero).append("\n");
        for (Imprimir pag : paginas) {
            sb.append(pag.imprimir()).append("\n");
        }
        return sb.toString();
    }
}
