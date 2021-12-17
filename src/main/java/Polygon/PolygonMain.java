package Polygon;

class PolygonMain {
    public static void main(String[] args) {
        Polygon p1 = new Polygon();
        p1.render();

        // create an object of Square
        PolygonSquare s1 = new PolygonSquare();
        s1.render();

        // create an object of Circle
        PolygonCircle c1 = new PolygonCircle();
        c1.render();
    }
}
