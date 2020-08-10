package sample;

import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;

import java.awt.*;
import java.awt.image.BufferedImage;

import static java.awt.Toolkit.*;

public class Controller {
    public ImageView display;

    public void doTakeScreenshot(ActionEvent actionEvent) {
        try {
            Robot r = new Robot();
            Rectangle rectangle = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage screenCapture = r.createScreenCapture(rectangle);
            System.out.println("buffered");
            WritableImage image = SwingFXUtils.toFXImage(screenCapture, null);

            display.setImage(image);
        } catch (AWTException e) {
            e.printStackTrace();
        }

    }
}
