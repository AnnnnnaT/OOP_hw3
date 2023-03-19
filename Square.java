public class Square extends Rectangle {

    Double side;
    

    public Square(Double side) {
        super(side, side);
            
    }

    public Double area(Double side) {
        return Math.pow(side, 2);
    }

    public Double perimetr(Double side) {
        return 4 * side;
    }

    public int compareTo(Figure figure) {
        return super.compareTo(figure);
    }

    public String toString() {
        return String.format("\nПлощадь квадрата: %.2f; \nПериметр квадрата: %.2f;", area(), perimetr());
    }

}
