package Stuff;

import java.util.ArrayList;
import java.util.List;

public class Poligon {
    public List<Point3D> points = new ArrayList<>();

    public Poligon(Point3D point) {
        this.points.add(point);
    }
}
