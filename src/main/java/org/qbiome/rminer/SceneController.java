package org.qbiome.rminer;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SceneController {
    @FXML
    private TextField sourceField, targetField, orgField, pathField;

    @FXML
    private TextArea terminalArea;

    @FXML
    private Button runButton;
    private boolean runState;

    @FXML
    private void submitForm() throws IOException {
        if (!runState) {
            terminalArea.setText(null);
            runButton.setText("RUN");
            runState = !runState;
        } else {
            terminalArea.setText("source: " + sourceField.getText() + "\n" + "target: " + targetField.getText() + "\n"
                    + "OrgID: " + orgField.getText() + "\n");
            runButton.setText("CLEAR");
            runState = !runState;
        }

    }

}
