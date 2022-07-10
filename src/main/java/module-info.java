module yz.group.gbjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens yz.group.gbjavafx to javafx.fxml;
    exports yz.group.gbjavafx;
}