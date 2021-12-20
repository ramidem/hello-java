package src;

public class Main {
    public static void main(String[] args) {
        Triangle triA = new Triangle(15, 8, 15, 8, 17);
        Triangle triB = new Triangle(3, 2.598, 3, 3, 3);

        double triAArea = triA.findArea();
        double triBArea = triB.findArea();

        System.out.println("triA Area: " + triAArea);
        System.out.println("triB Area: " + triBArea);
        System.out.println("Triangles have " + Triangle.numberOfSides + " number of sides.");
    }
}
