package ar.davidbarre.poointerfaces.imprenta;

import ar.davidbarre.poointerfaces.imprenta.modelo.*;

import java.util.Currency;

import static ar.davidbarre.poointerfaces.imprenta.modelo.Genero.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo("Jhon doe", "Ingeniero en sistemas", "Resumen laboral....");
        cv.addExperiencia("Java");
        cv.addExperiencia("Angular");
        cv.addExperiencia("JavaScript");
        cv.addExperiencia("C++");

        Libro libro = new Libro("Fran barreneche", "Patrones de diseño", PROGRAMACION);
        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Guservoy"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Composite"))
                .addPagina(new Pagina("Patron Facade"));


        Informe informe = new Informe("Martin Fowler", "james", "Estudio sobre microservisios");
        imprimir(cv);
        System.out.println("=========");
        imprimir(informe);
        System.out.println("=========");
        imprimir(libro);
        /* System.out.println("=========");
        System.out.println(informe.imprimir());
        System.out.println("=========");
        System.out.println(cv.imprimir());*/ //es lo mismo
    }

    public static void imprimir(Imprimir imprimible) {
        System.out.println(imprimible.imprimir());
    }
}
