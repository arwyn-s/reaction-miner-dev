module org.qbiome.rminer {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.qbiome.rminer to javafx.fxml;
    exports org.qbiome.rminer;
}