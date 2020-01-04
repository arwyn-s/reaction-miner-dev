package org.qbiome.rminer;

import java.io.IOException;
import javafx.fxml.FXML;

public class OutputController {

    @FXML
    private void switchToInput() throws IOException {
        App.setRoot("input");
    }
}
