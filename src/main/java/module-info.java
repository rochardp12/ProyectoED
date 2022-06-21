module ec.edu.espol.proyectoed_pp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens ec.edu.espol.proyectoed_pp to javafx.fxml;
    exports ec.edu.espol.proyectoed_pp;
    
    opens ec.edu.espol.controllers to javafx.fxml;
    exports ec.edu.espol.controllers;
    
    opens ec.edu.espol.util to javafx.fxml;
    exports ec.edu.espol.util;
    
    opens ec.edu.espol.model to javafx.fxml;
    exports ec.edu.espol.model;
}

