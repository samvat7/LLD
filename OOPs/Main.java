public class Main {

    interface Shape{

        double area(double a);
    }

    static class Circle implements Shape{

        @Override public double area(double r){

            return Math.PI*(r*r);
        }
    }

    static class Square implements Shape{

        @Override public double area(double a){

            return a*a;
        }
    }

	public static void main(String[] args){
		
        Circle c = new Circle();

        System.out.println(c.area(1));

        Square s = new Square();

        System.out.println(s.area(1.7));
	}
}