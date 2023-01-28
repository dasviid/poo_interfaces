package ar.davidbarre.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja{

    private String persona;
    private String carrera;
    private List<String> experiencias;

    public Curriculo(String persona,String carrera,String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public Curriculo addExperiencia(String experiencia){
        experiencias.add(experiencia);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(persona).append("\n")
                .append("Resumen: ").append(contenido).append("\n")
                .append("Profesion: ").append(carrera).append("\n")
                .append("Experiencia: \n");
        for (String exp : experiencias){
            sb.append("- ").append(exp).append("\n");
        }
        return sb.toString();
    }
}
