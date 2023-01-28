package ar.davidbarre.poointerfaces.imprenta;

import ar.davidbarre.poointerfaces.imprenta.modelo.Curriculo;
import ar.davidbarre.poointerfaces.imprenta.modelo.Hoja;
import ar.davidbarre.poointerfaces.imprenta.modelo.Informe;

import java.util.Currency;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo("Jhon doe","Ingeniero en sistemas","Resumen laboral....");
        cv.addExperiencia("Java");
        cv.addExperiencia("Angular");
        cv.addExperiencia("JavaScript");
        cv.addExperiencia("C++");

        Informe informe = new Informe("Martin Fowler","james","Estudio sobre microservisios");
        imprimir(cv);
        System.out.println("=========");
        imprimir(informe);
        /* System.out.println("=========");
        System.out.println(informe.imprimir());
        System.out.println("=========");
        System.out.println(cv.imprimir());*/ //es lo mismo
    }
    
    public  static void  imprimir(Hoja imprimible){
        System.out.println(imprimible.imprimir());
    }
}
