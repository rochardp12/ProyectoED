module ec.edu.espol.proyectoed_pp {
    requires javafx.controls;
    requires javafx.fxml;

    opens ec.edu.espol.proyectoed_pp to javafx.fxml;
    exports ec.edu.espol.proyectoed_pp;
}
