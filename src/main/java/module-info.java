module com.example.newjavafx {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.newjavafx to javafx.fxml;
    exports com.example.newjavafx;
}