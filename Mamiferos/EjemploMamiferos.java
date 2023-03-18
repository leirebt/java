public class EjemploMamiferos {
    public static void main(String[] args) {

        Mamifero mamiferos[] = new Mamifero[5];

        Tigre tigreBengala = new Tigre("Bosques tropicales", 110.0f, 265.0f, 260.0f,
                "Panthera tigris tigris", 7.5f, 90, "P. tigris");
        Guepardo guepardoNieves = new Guepardo("Irán", 90.0f, 150.0f, 65.0f,
                "Acinonyx jubatus venaticus", 8.0f, 115);
        Leon leonCongo = new Leon("Llanuras del Este de África", 2.4f,250.0f ,250.0f,
                "Panthera leo azandica", 3.8f, 80, 5, 114.0f);

        Lobo loboIberico = new Lobo("Tundra, taiga, bosques templados y lluviosos, praderas", 70.0f,
        120.0f,40.0f, "Canis lupus signatus", "parduzco gris con tonos ocres",
                5.0f, 8, "lobo");
        Perro chihuahua = new Perro("Estado mexicano de Chihuahua", 15.0f, 23.0f, 2.5f,
                "Canis lupus familiaris", "Blanco, Negro, pardo claro, chocolate, Crema, Dorado",
                3.0f, 10);

        mamiferos[0] = tigreBengala;
        mamiferos[1] = guepardoNieves;
        mamiferos[2] = leonCongo;
        mamiferos[3] = loboIberico;
        mamiferos[4] = chihuahua;

        for (Mamifero mamifero : mamiferos) {
            System.out.println("Información sobre " + mamifero.getNombreCientifico() + ".");
            System.out.println("Alimentación:\n" + mamifero.comer());
            System.out.println("Comunicación:\n" + mamifero.comunicarse());
            System.out.println("Velocidad de carrera:\n" + mamifero.correr());
            System.out.println("Sueño:\n" + mamifero.dormir());

            System.out.println("------------Ficha técnica------------");
            System.out.println("Hábitat: " + mamifero.getHabitat() + ".");
            System.out.println("Altura: " + mamifero.getAltura() + " cm.");
            System.out.println("Largo: " + mamifero.getAltura() + " cm.");
            System.out.println("Peso: " + mamifero.getPeso() + " kg.");
            System.out.println("Nombre científico: " + mamifero.getNombreCientifico() + ".");

            if(mamifero instanceof  Felino) {
                System.out.println("Tamaño de las garras: " + ((Felino) mamifero).getTamanoGarras() + " cm.");
                System.out.println("Velocidad: " + ((Felino) mamifero).getVelocidad() + " km/h.");

                if (mamifero instanceof Tigre) {
                    System.out.println("Especie: " + ((Tigre) mamifero).getEspecieTigre() + ".");
                }
                if (mamifero instanceof Leon) {
                    System.out.println("Tamaño manada: " + ((Leon) mamifero).getNumManada() + " miembros.");
                    System.out.println("Potencia de rugido: " + ((Leon) mamifero).getPotenciaRugido() + " decibelios.");
                }
            }
            if(mamifero instanceof  Canino) {
                System.out.println("Tamaño de los colmillos: " + ((Canino) mamifero).getTamanoColmillos() + " cm.");
                System.out.println("Color: " + ((Canino) mamifero).getColor() + ".");

                if (mamifero instanceof Lobo) {
                    System.out.println("Especie: " + ((Lobo) mamifero).getEspecieLobo() + ".");
                    System.out.println("Tamaño camada: " + ((Lobo) mamifero).getNumCamada() + ".");
                }
                if (mamifero instanceof Perro) {
                    System.out.println("Fuerza de mordida: " + ((Perro) mamifero).getFuerzaMordida() + " PSI.");
                }
            }
            System.out.println("=================================================================");
        }
    }
}