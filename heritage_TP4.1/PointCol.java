package heritageV2;

public class PointCol extends Point{
    private String color ;

    public PointCol() {
        super();
        color="red";
    }

    public PointCol(int x, int y, char nom, String color) {
        super(x, y, nom);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "PointCol{" +
                "color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", nom=" + nom +
                '}';
    }
    public String affiche(){
        return this.toString();
    }
}
