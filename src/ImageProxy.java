import java.awt.*;
import javax.swing.*;
        public class ImageProxy implements Icon {
            public ImageProxy(String name) {
                this.name = name;
                image = null;
            }
            public void paintIcon(final Component c, Graphics g, int x, int y) {
                ensureImageLoaded();
                image.paintIcon(c, g, x, y);
            }
            public int getIconWidth() {
                ensureImageLoaded();
                return image.getIconWidth();
            }
            public int getIconHeight() {
                ensureImageLoaded();
                return image.getIconHeight();
            }
            /**
             * Loads the image if it hasn't been loaded yet. Prints
             * a message when the image is loaded.
             */
            private void ensureImageLoaded() {
                if (image == null) {
                    System.out.println("Loading " + name);
                    image = new ImageIcon(name);
                }
            }
            private String name;
            private ImageIcon image;
        }
