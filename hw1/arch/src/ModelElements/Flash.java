package ModelElements;

import java.awt.Color;

import Stuff.Angle3D;
import Stuff.Point3D;

public class Flash {
    public Point3D location;
    public Angle3D angle;
    public Color color;
    public float power;

    // public Flash(Point3D location, Angle3D angle, Color color, Float power) {
    //     this.location = location;
    //     this.angle = angle;
    //     this.color = color;
    //     this.power = power;
    // }

    // не понимаю, нужен ли тут конструктор для класса.
    public void Rotate(Angle3D newAngle) {
    }

    public void Move(Point3D newLocation) {
    }
}
