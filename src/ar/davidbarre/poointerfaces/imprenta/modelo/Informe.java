package ar.davidbarre.poointerfaces.imprenta.modelo;

public class Informe extends  Hoja{
    private  String autor;
    private String revisor;

    public Informe(String autor,String revisor,String contenido){
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Infome escrito por " + this.autor
                + ", y revisado por " + revisor
                +"\n" + this.contenido;
    }
}
