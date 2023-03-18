public class Tigre extends Felino {

    public String especieTigre;


    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico,
                 float tamanoGarras, Integer velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    public void setEspecieTigre(String especieTigre) {
        this.especieTigre = especieTigre;
    }

    @Override
    public String correr() {
        return "El " + getClass().getName() + " " + this.nombreCientifico + " de la especie " + this.especieTigre
                + ", llega a alcanzar una velocidad de " + this.velocidad + " km hora.";
    }

    @Override
    public String comer() {
        return "Vive en " + this.habitat + ".\nUtiliza sus garras de " + this.tamanoGarras +
                " cm para cazar y puede alcanzar los " + this.peso + " kilos de peso.";
    }

    @Override
    public String comunicarse() {
        return "Se comunica con otros felinos a través del lenguaje corporal, las vocalizaciones o la emisión de olores.";
    }

    @Override
    public String dormir() {
        return "Duerme una media de 12 a 16 horas diarias.";
    }

}
