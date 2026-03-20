<<<<<<< HEAD
    requires javafx.controls;
    requires javafx.fxml;


=======
module it.polimi.ingsw.am22 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.smartcardio;


    opens it.polimi.ingsw.am22 to javafx.fxml;
    exports it.polimi.ingsw.am22;
>>>>>>> 7c921dd (second commit)
}