package day26_methods;

import java.security.PublicKey;

public class Painter {
    public static void main(String[] args) {
        day26_methods.Picture.draw();
        // Picture.draw(6);

        day26_methods.Picture.draw("blue");

        day26_methods.Picture.draw("red", "yellow");
        day26_methods.Picture.draw("black", "white", "pink");

        day26_methods.Picture.draw(3, "Purple");
        day26_methods.Picture.draw("Green", 5);

        day26_methods.Picture.draw(7);
        day26_methods.Picture.draw(true);
        day26_methods.Picture.draw(49.99);

    }



}