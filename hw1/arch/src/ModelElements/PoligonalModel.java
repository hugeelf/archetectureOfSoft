package ModelElements;

import java.util.ArrayList;
import java.util.List;

import Stuff.Point3D;
import Stuff.Poligon;
import Stuff.Texture;

public class PoligonalModel {
    public List<Poligon> poligons;
    public List<Texture> textures;

    public PoligonalModel(List<Texture> textures) {
        this.poligons = new ArrayList<>();
        this.textures = textures;

        this.poligons.add(new Poligon(new Point3D()));
    }
}
