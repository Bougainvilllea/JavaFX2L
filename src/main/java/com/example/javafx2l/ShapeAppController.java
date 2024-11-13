package com.example.javafx2l;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import kotlin.jvm.internal.Intrinsics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ShapeAppController {

    Random random = new Random();

    @FXML
    private Canvas canvas;

    @FXML
    private Button circleButton;

    @FXML
    private AnchorPane pane;

    @FXML
    private Button rectangleButton;

    @FXML
    public void initialize() {
        GraphicsContext gcBackG = canvas.getGraphicsContext2D();
        gcBackG.setFill(Color.color(1, 0.99, 0.79));
        gcBackG.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }

    @FXML
    void drawCircle(ActionEvent event) {
        List<Integer> param = randomParam();

        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.color(1, 0.97, 0));
        gc.fillOval(param.get(0), param.get(1), param.get(2), param.get(2));
    }

    @FXML
    void drawRect(ActionEvent event) {
        List<Integer> param = randomParam();

        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.color(1, 0.97, 0));
        gc.fillRect(param.get(0), param.get(1), param.get(2), param.get(2));
    }

    public List<Integer> randomParam(){
        int x = random.nextInt((int) pane.getWidth());
        int y = random.nextInt((int) pane.getHeight());
        int radiusOrSide = random.nextInt(100) + 20;
        return List.of(x, y, radiusOrSide);
    }
}
