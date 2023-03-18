public class Leon extends Felino {

    public Integer numManada;
    public Float potenciaRugido;

    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico,
                float tamanoGarras, Integer velocidad, Integer numManada, Float potenciaRugido) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugido = potenciaRugido;
    }

    public Integer getNumManada() {
        return numManada;
    }

    public void setNumManada(Integer numManada) {
        this.numManada = numManada;
    }

    public Float getPotenciaRugido() {
        return potenciaRugido;
    }

    public void setPotenciaRugido(Float potenciaRugido) {
        this.potenciaRugido = potenciaRugido;
    }

    @Override
    public String correr() {
        return "Llega a alcanzar una velocidad de " + this.velocidad + " km hora.";
    }

    @Override
    public String comer() {
        return "Vive en " + this.habitat + ".\nSuelen cazar en manadas de " + this.numManada + " miembros."
                + "\nUtiliza sus garras de " + this.tamanoGarras +
                " cm para cazar y puede alcanzar los " + this.peso + " kilos de peso.";
    }

    @Override
    public String comunicarse() {
        return "Se comunica con otros felinos a través del lenguaje corporal, las vocalizaciones o la emisión de olores."
                + "\nTiene una potencia de rugido de " + this.potenciaRugido + " decibelios.";
    }

    @Override
    public String dormir() {
        return "Duerme una media de 12 a 16 horas diarias.";
    }
}
