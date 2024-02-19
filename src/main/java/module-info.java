module com.app.navigationdrawer {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.app.navigationdrawer to javafx.fxml;
    exports com.app.navigationdrawer;
}