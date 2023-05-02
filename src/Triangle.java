public class Triangle {
  double a;
  double b;
  double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {

    }

    public void area (){
   double p1 = (a + b + c)/2.0;
        System.out.println("Area:  " + Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c)));
    }
}
