module it.polimi.ingsw.software {
    requires javafx.controls;
    requires javafx.fxml;


    opens it.polimi.ingsw.software to javafx.fxml;
    exports it.polimi.ingsw.software;
}