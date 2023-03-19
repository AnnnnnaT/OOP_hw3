public abstract class Figure implements Area, Perimetr, Comparable<Figure>{
    
    public String toString() {
        return super.toString();
    }


    public int compareTo(Figure figure) {
        if(this.area() == figure.area()){
            return 0;
        }
        if(this.area() < figure.area()){
            return -1;
        }
        return  1;
    }
}