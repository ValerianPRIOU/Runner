import javafx.scene.Parent;
import javafx.scene.Scene;

public class GameScene extends Scene {

    public GameScene(Parent parent) {
        super(parent);
    }

Camera camera = new Camera(120,60);
}
