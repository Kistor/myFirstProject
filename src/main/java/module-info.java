module com.example.mymathtest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mymathtest to javafx.fxml;
    exports com.example.mymathtest;
}