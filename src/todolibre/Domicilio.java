package todolibre;

public class Domicilio {

    private String calle;
    private String altura;
    private int numComuna;

    public Domicilio(String calle, String altura, int numComuna) {
        this.calle = calle;
        this.altura = altura;
        this.numComuna = numComuna;
    }

    public int getNumComuna() {
        return numComuna;
    }    
    
}
