package Ex4_FormasGeomatricas;

public class Retangulo extends FormaGeometrica{
    private int calcularArea;
    private int area;

    public Retangulo(int calcularArea, int area) {
        super(calcularArea);
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
    
    public double carcularArea(){
        return Math.PI * area * area;
        
    }
    
}
