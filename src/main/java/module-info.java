module main.project_demo_submission {
    requires javafx.controls;
    requires javafx.fxml;


    opens main.project_demo_submission to javafx.fxml;
    exports main.project_demo_submission;
}