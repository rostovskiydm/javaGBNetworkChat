module ru.gb.javafxnetworkchat.javafxnetworkchat {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gb.javafxnetworkchat.javafxnetworkchat to javafx.fxml;
    exports ru.gb.javafxnetworkchat.javafxnetworkchat;
}