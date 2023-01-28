package ar.davidbarre.poointerfaces.imprenta.modelo;

public class Informe extends Hoja implements Imprimir {
    private Persona autor;
    private Persona revisor;

    public Informe(Persona autor, Persona revisor, String contenido) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Infome escrito por " + this.autor
                + ", y revisado por " + revisor
                + "\n" + this.contenido;
    }
}
