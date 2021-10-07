package Question1;

public class Square extends Shape{
    private int side;

    public Square(){}

    public Square(int side){
        this.side = side;
    }

    public Square(String name, String color, int side){
        this.setName(name);
        this.setColor(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    //Override
    public int getArea() {
        return side* side;
    }

    public int getPerimeter() {
        return side * 4;
    }
}
