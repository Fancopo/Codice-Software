module il.polimi.ingsw.am22 {
    requires javafx.controls;
    requires javafx.fxml;


    opens il.polimi.ingsw.am22 to javafx.fxml;
    exports il.polimi.ingsw.am22;
}