module it.polimi.ingsw.am {
    requires javafx.controls;
    requires javafx.fxml;


    opens it.polimi.ingsw.am22 to javafx.fxml;
    exports it.polimi.ingsw.am22;
}