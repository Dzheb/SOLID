package Models;
public class Square implements Shape{
  private double side;

  public Square(double side) {
      this.side = side;
  }

  @Override
  public double calcPerimetr() {
      return side*4;
  }

  @Override
  public double calcArea() {
      return side*side;
  }

  public String description(){
      StringBuilder sb = new StringBuilder();
      return sb.append("Квадрат стороной ").append(side).append(".").toString();
  }
}