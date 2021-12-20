package src;

public class Triangle {
    // static, non-changing, variable
    static int numberOfSides = 3;

    // instance variables
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    public Triangle(
        double base,
        double height,
        double sideLenOne,
        double sideLenTwo,
        double sideLenThree
    ) {
        // instantiate
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    public double findArea() {
        return (this.base * this.height) / 2;
    }

}
