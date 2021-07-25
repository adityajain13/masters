import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;


public class Shapes extends Application {

    public void start(Stage stage) {

        //Create text field
        TextField shapeField = new TextField();
        shapeField.setMaxWidth(200);

        //Add label
        Label shapeLabel = new Label("Enter a shape");
        shapeLabel.setTextFill(Color.BLACK);
        shapeLabel.setFont(Font.font("Arial", 24));

        //Add submit button
        Button shapeButton = new Button();
        shapeButton.setText("Draw your shape");

        //Create VBox
        VBox root = new VBox(25);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(shapeLabel, shapeField, shapeButton);

        //Create scene and add to stage
        Scene scene = new Scene(root, 600, 600);
        stage.setScene(scene);
        stage.setTitle("Shapes");
        stage.show();

        shapeButton.setOnAction(e ->{

            //Check input and draw if valid
            //Triangle
            if (shapeField.getText().equals("triangle")) {
                Polygon triangle = new Polygon();
                triangle.getPoints().addAll(new Double[]{0.0, 0.0, 100.0, 0.0, 50.0, -100.0});

                //Display triangle
                root.getChildren().add(triangle);

                //Remove text field and button
                root.getChildren().removeAll(shapeLabel, shapeField, shapeButton);

                //Create text field and label for colour input
                Label colourLabel = new Label("What colour would you like?");
                colourLabel.setTextFill(Color.BLACK);
                colourLabel.setFont(Font.font("Arial", 24));

                //Create text field
                TextField colourField = new TextField();
                colourField.setMaxWidth(200);

                //Add submit button
                Button colourButton = new Button();
                colourButton.setText("Colour shape");

                root.getChildren().addAll(colourLabel, colourField, colourButton);

                //Colour shape
                colourButton.setOnAction(e1 -> {
                    if (colourField.getText().equals("red")) {
                        triangle.setFill(Color.RED);
                    } else if (colourField.getText().equals("blue")) {
                        triangle.setFill(Color.BLUE);
                    } else if (colourField.getText().equals("yellow")) {
                        triangle.setFill(Color.YELLOW);
                    } else {
                        Alert errorAlert = new Alert(AlertType.ERROR);
                        errorAlert.setHeaderText("Invalid colour.");
                        errorAlert.setContentText("Please try red, blue, or yellow.");
                        errorAlert.showAndWait();
                    }
                });

            }
            //Circle
            else if (shapeField.getText().equals("circle")) {

                Circle circle = new Circle();
                circle.setCenterX(100.0f);
                circle.setCenterY(100.0f);
                circle.setRadius(50.f);

                //Display circle
                root.getChildren().add(circle);

                //Remove text field and button
                root.getChildren().removeAll(shapeLabel, shapeField, shapeButton);

                //Create text field and label for colour input
                Label colourLabel = new Label("What colour would you like?");
                colourLabel.setTextFill(Color.BLACK);
                colourLabel.setFont(Font.font("Arial", 24));

                //Create text field
                TextField colourField = new TextField();
                colourField.setMaxWidth(200);

                //Add submit button
                Button colourButton = new Button();
                colourButton.setText("Colour shape");

                root.getChildren().addAll(colourLabel, colourField, colourButton);

                //Colour shape
                colourButton.setOnAction(e1 -> {
                    if (colourField.getText().equals("red")) {
                        circle.setFill(Color.RED);
                    } else if (colourField.getText().equals("blue")) {
                        circle.setFill(Color.BLUE);
                    } else if (colourField.getText().equals("yellow")) {
                        circle.setFill(Color.YELLOW);
                    } else {
                        Alert errorAlert = new Alert(AlertType.ERROR);
                        errorAlert.setHeaderText("Invalid colour.");
                        errorAlert.setContentText("Please try red, blue, or yellow.");
                        errorAlert.showAndWait();
                    }

                });

            }
            //Pentagon
            else if (shapeField.getText().equals("pentagon")) {
                Polygon pentagon = new Polygon();
                pentagon.getPoints().addAll(new Double[]{50.0, 0.0, 150.0, 0.0, 200.0, -125.0, 100.0, -205.0, 0.0, -125.0});

                //Display pentagon
                root.getChildren().add(pentagon);

                //Remove text field and button
                root.getChildren().removeAll(shapeLabel, shapeField, shapeButton);

                //Create text field and label for colour input
                Label colourLabel = new Label("What colour would you like?");
                colourLabel.setTextFill(Color.BLACK);
                colourLabel.setFont(Font.font("Arial", 24));

                //Create text field
                TextField colourField = new TextField();
                colourField.setMaxWidth(200);

                //Add submit button
                Button colourButton = new Button();
                colourButton.setText("Colour shape");

                root.getChildren().addAll(colourLabel, colourField, colourButton);

                //Colour shape
                colourButton.setOnAction(e1 -> {
                    if (colourField.getText().equals("red")) {
                        pentagon.setFill(Color.RED);
                    } else if (colourField.getText().equals("blue")) {
                        pentagon.setFill(Color.BLUE);
                    } else if (colourField.getText().equals("yellow")) {
                        pentagon.setFill(Color.YELLOW);
                    } else {
                        Alert errorAlert = new Alert(AlertType.ERROR);
                        errorAlert.setHeaderText("Invalid colour.");
                        errorAlert.setContentText("Please try red, blue, or yellow.");
                        errorAlert.showAndWait();
                    }
                });
            }
            else {
                Alert errorAlert = new Alert(AlertType.ERROR);
                errorAlert.setHeaderText("Invalid shape");
                errorAlert.setContentText("Input either triangle, circle, or pentagon.");
                errorAlert.showAndWait();
            }

        });
    }

    public static void main(String[] args) {

        launch(args);

    }
}
