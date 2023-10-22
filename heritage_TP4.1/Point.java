package heritageV2;

public class Point {
    int x;
    int y;
    char nom;
    public Point(){
        x=0;
        y=0;
        nom='o';
    }
    public Point(Point p1){
        x=p1.x;
        y=p1.y;
        nom=p1.nom;

    }
    public Point(int x, int y, char nom) {
        this.x = x;
        this.y = y;
        this.nom = nom;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setNom(char nom) {
        this.nom = nom;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getNom() {
        return nom;
    }

    public void afficher(){
        System.out.println(nom+"("+x +","+ y+")");
    }
    public void deplacer(int abs,int ord){
        x+=abs;
        y+=ord;
    }
    public void reset(){
        x=0;
        y=0;
    }
    public  void deplacer(){
        x+=1;
        y-=2;
    }
    @Override
    public String toString(){
        return ("le point "+ nom +" son abscisse est "+ x +" son est ordonnée "+y);
    }
    public Boolean coincide_V1 (Point p){
        return this.x == p.x && this.y == p.y;
    }
    public static Boolean coincide_V2 (Point p,Point p1){
        return p1.x == p.x && p1.y == p.y;
    }
}
