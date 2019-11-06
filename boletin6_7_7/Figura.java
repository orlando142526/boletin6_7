
package boletin6_7_7;

import java.util.Scanner;
public class Figura {
 private int tipo;
    private float b;
    private float h;
    private double r;
    private double area;
    Scanner sc = new Scanner(System.in);
    
    public Figura() {
    }

    public Figura(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    public void calcularSuperficie(){
        System.out.println("Operación: \n 1.Cuadrado \n 2.Triangulo \n 3.Circulo");
        tipo = sc.nextInt();
        switch (tipo) {
        //Cadrado
            case 1: calcularCuadrado();
                break;
        //Triangulo
            case 2: calcularTriangulo();
                break;
        //Circulo
            case 3: calcularCirculo();
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }
          
    }
    public void calcularCuadrado(){
        System.out.println("Valor del lado: ");
        b = sc.nextFloat();
        area = b*b;
        System.out.println(area);
    }
    public void calcularTriangulo(){
        System.out.println("Valor de la base: ");
        b = sc.nextFloat();
        System.out.println("Valor de la altura: ");
        h = sc.nextFloat();
        area = b*(h/2);
        System.out.println(area);
    }
    public void calcularCirculo(){
        System.out.println("Valor del radio: ");
        r = sc.nextDouble();
        area = 3.14 * Math.pow(r,2);
        System.out.println(area);
    }
}
