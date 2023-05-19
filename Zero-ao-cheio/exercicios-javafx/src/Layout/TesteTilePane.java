package Layout;

import javafx.geometry.Orientation;
import javafx.scene.layout.TilePane;

import java.util.ArrayList;
import java.util.List;

public class TesteTilePane extends TilePane {

    public TesteTilePane () {

        List<Quadrado> quadrados = new ArrayList<>();

        for (int i = 1; i < 10; i++){
            quadrados.add(new Quadrado(i * 10));
        }

        setHgap(10);
        setVgap(10);

        setOrientation(Orientation.VERTICAL);
        getChildren().addAll(quadrados);
    }
}
