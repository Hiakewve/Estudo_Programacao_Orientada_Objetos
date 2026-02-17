public class Retangulo {
    public double largura;
    public double altura;

    public double area(){
        double area = altura * largura;
        return area;
    }

    public double perimetro(){
        double perimetro = 2 * (altura + largura);
        return perimetro;
    }

    public double diagonal(){
        double diagonal = Math.sqrt(altura * altura + largura * largura);
        return diagonal;
    }
}
