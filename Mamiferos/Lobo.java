public class Lobo extends Canino {

    public Integer numCamada;
    public String especieLobo;

    public Lobo(String habitat, float altura, float largo, float peso, String nombreCientifico,
                String color, Float tamanoColmillos, Integer numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public Integer getNumCamada() {
        return numCamada;
    }

    public void setNumCamada(Integer numCamada) {
        this.numCamada = numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    public void setEspecieLobo(String especieLobo) {
        this.especieLobo = especieLobo;
    }

    @Override
    public String correr() {
        return "Puede llegar a alcanzar una velocidad de 50 - 60 km hora.";
    }

    @Override
    public String comer() {
        return "Vive en " +  this.habitat + ".\nUtiliza sus colmillos de " + this.tamanoColmillos +
                " cm para cazar y puede alcanzar los " + this.peso + " kilos de peso.";
    }

    @Override
    public String comunicarse() {
        return "Se comunica con otros caninos a través del lenguaje corporal, mediante posturas ofensivas y defensivas" +
                ", vocalizaciones y expresiones faciales.";
    }

    @Override
    public String dormir() {
        return "Duerme en cualquier lugar donde se sienta seguro.";
    }
}
