module ru.gb.javafxnetworkchat.javafxnetworkchat {
    requires javafx.controls;
    requires javafx.fxml;

    exports ru.gb.javafxnetworkchat.javafxnetworkchat.client;
    opens ru.gb.javafxnetworkchat.javafxnetworkchat.client to javafx.fxml;
}