public class Triangle extends Polyhedron {
    private Double side1;
    private Double side2;
    private Double side3;

    public Triangle(Double side1, Double side2, Double side3) throws Exception {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        if (!(side1 + side2 > side3 &&
                side1 + side3 > side2 &&
                side2 + side3 > side1)) {
            throw new Exception("Треугольник с такими сторонами не существует");
        }
    }

    public Double perimetr() {
        return side1 + side2 + side3;
    }

    public Double area() {
        Double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    public int compareTo(Figure figure) {
        return super.compareTo(figure);
    }

    public String toString() {
        return String.format("\nПлощадь треугольника: %.2f; \nПериметр треугольника: %.2f;", area(), perimetr());
    }
}
