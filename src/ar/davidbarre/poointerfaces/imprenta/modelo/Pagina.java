package ar.davidbarre.poointerfaces.imprenta.modelo;

public class Pagina extends Hoja implements Imprimir {
    public Pagina(String contenido) {
        super(contenido);
    }

    @Override
    public String imprimir() {
        return this.contenido;
    }
}
