public class Circle extends Figure implements Сircumference {

    Double r;

    public Circle(Double r) throws Exception {
        this.r = r;
        if (r <= 0) {
            throw new Exception("Радиус должен быть больше 0");
        }
    }

    public Double area() {
        return Math.PI * (Math.pow(r, 2));
    }

    public Double circumference() {

        return 2 * r * Math.PI;
    }

    public int compareTo(Figure figure) {
        return super.compareTo(figure);
    }

    public String toString() {
        return String.format("\nПлощадь круга: %.2f; \nДлина окружности: %.2f;", area(), circumference());
    }

    @Override
    public Double perimetr() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'perimetr'");
    }
}
