public class figuras2D {
    //triangulo equilatero y cuadrado
    private int nLados;//número de lados
    public float lado;//longitud del lado
    private float altura; //altura del triangulo

    //Constructor
    public figuras2D(int nLados) {
        this.nLados = nLados;
    }

    public figuras2D(float lado) {
        this.lado = lado;
    }

    public figuras2D(int nLados, float lado) {
        this.nLados = nLados;
        this.lado = lado;
    }
    public figuras2D(int nLados, float lado, float altura) {
        this.nLados = nLados;
        this.lado = lado;
        this.altura = altura;
    }

    //Setters y getters
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }


    public int getnLados() {
        return nLados;
    }

    public void setnLados(int nLados) {
        this.nLados = nLados;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    //Metodos
    public float areaCuadrado(){
        return this.lado*this.lado;
    };
    public float perimetroCuadrado(){
        return this.lado*4;
    };

    public float areaTriangulo(){
        return (this.lado*this.altura)/2;
    };
    public float perimetroTriangulo(){
        return this.lado*3;
    };
}
