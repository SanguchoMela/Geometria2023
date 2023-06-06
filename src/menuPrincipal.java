public class menuPrincipal {
    public static void main(String[] args) {
        figuras2D miFigura=new figuras2D(4,2);
        figuras2D miTriangulo = new figuras2D(3,8,5);

        System.out.println(miFigura.areaCuadrado());
        System.out.println(miFigura.perimetroCuadrado());
        System.out.println(miTriangulo.areaTriangulo());
        System.out.println(miTriangulo.perimetroTriangulo());
    }

}
