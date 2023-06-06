public class Figuras2D {
    //triangulo equilatero y cuadrado
    int nLados; //numero de lados
    float lado; //longitud el lado

    //Constructor
    public Figuras2D(float lado) {
        this.lado = lado;
    }
    public Figuras2D(int nLados) {
        this.nLados = nLados;
    }
    public Figuras2D(int nLados, float lado) {
        this.nLados = nLados;
        this.lado = lado;
    }
    //Setter and Getter
    public int getnLados() {
        return nLados;
    }
    public void setnLados(int nLados) {
        this.nLados = nLados;
    }
    public float getLado() {
        return lado;
    }
    public void setLado(float lado) {
        this.lado = lado;
    }


}
