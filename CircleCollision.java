import javax.swing.*;
import java.awt.*;

public class CircleCollision extends JFrame {

    public CircleCollision() {
        // Set window title
        setTitle("Circle Collision Simulation");

        // Set window size
        setSize(800, 600);

        // Close the window on exit
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the drawing panel
        add(new CirclePanel());

        // Make the window visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new CircleCollision();
    }
}
class Circle {
    int x, y;        // Position of the circle
    int radius;      // Radius of the circle
    int dx, dy;      // Velocity in x and y directions

    public Circle(int x, int y, int radius, int dx, int dy) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.dx = dx;
        this.dy = dy;
    }

    // Update circle position based on velocity
    public void move(int width, int height) {
        x += dx;
        y += dy;

        // Bounce off the left and right walls
        if (x - radius < 0 || x + radius > width) {
            dx = -dx;
        }

        // Bounce off the top and bottom walls
        if (y - radius < 0 || y + radius > height) {
            dy = -dy;
        }
    }
}
class CirclePanel extends JPanel {
    Circle[] circles;

    public CirclePanel() {
        // Initialize a few circles with random positions and velocities
        circles = new Circle[5];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(
                (int) (Math.random() * 800), 
                (int) (Math.random() * 600),
                30,
                (int) (Math.random() * 5 + 1),
                (int) (Math.random() * 5 + 1)
            );
        }

        // Start a timer to update the circles periodically
        Timer timer = new Timer(16, e -> {
            updateCircles();
            repaint();
        });
        timer.start();
    }

    // Update the position of all circles
    public void updateCircles() {
        for (Circle circle : circles) {
            circle.move(getWidth(), getHeight());
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw each circle
        for (Circle circle : circles) {
            g.setColor(Color.RED);
            g.fillOval(circle.x - circle.radius, circle.y - circle.radius, circle.radius * 2, circle.radius * 2);
        }
    }
}

