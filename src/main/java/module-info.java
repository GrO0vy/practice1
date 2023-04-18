module com.likelion.practice1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.likelion.practice1 to javafx.fxml;
    exports com.likelion.practice1;
}