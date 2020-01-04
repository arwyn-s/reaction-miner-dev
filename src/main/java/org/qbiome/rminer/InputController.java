package org.qbiome.rminer;

import java.io.IOException;
import javafx.fxml.FXML;

public class InputController {

    @FXML
    private void switchToOutput() throws IOException {
        App.setRoot("output");
    }
}
