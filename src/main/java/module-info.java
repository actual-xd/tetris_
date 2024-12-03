module ru.guu.tetris {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ru.guu.tetris to javafx.fxml;
    exports ru.guu.tetris;
}