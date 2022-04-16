module gui.attendancelog {
    requires javafx.controls;
    requires javafx.fxml;


    opens gui.attendancelog to javafx.fxml;
    exports gui.attendancelog;
}