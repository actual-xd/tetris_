module ru.guu.tetris {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.guu.tetris to javafx.fxml;
    exports ru.guu.tetris;
}