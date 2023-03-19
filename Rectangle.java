
public class Rectangle extends Polyhedron {

    protected Double side1;
    protected Double side2;

    public Rectangle(Double side1, Double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    // public Rectangle(Double side1, Double side2) {
    //     if(side1==side2){
    //     this.side1 = side1;
    //     }
    // }
     
    @Override
    public Double area() {        
        return (side1 * side2);
    }
  
    public Double perimetr() {
        return (2 * (side1 + side2));
    }

   
   public int compareTo(Figure figure) { 
       return super.compareTo(figure);
   }

    public String toString() {
        return String.format("\nПлощадь прямоугольника: %.2f; \nПериметр прямоугольника: %.2f;",area(), perimetr());
    }
}
