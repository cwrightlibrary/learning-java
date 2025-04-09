import java.awt.Canvas;
import javax.swing.JFrame;

public class Display extends Canvas implements Runnable{
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    public static final String TITLE = "Game Pre-Alpha";

    private Thread thread;
    private boolean running = false;

    /**
     * Starts the game loop and the thread if not already running.
     */
    private void start() {
        if (running)
            return;
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    /**
     * Stops the game loop and thread if running (for use when turning game into an applet later).
     */
    private void stop() {
        if (!running)
            return;
        running = false;
        try {
            thread.join();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public void run() {
        while (running) {

        }
    }

    public static void main(String[] args) {
        Display game = new Display();
        JFrame frame = new JFrame();
        frame.add(game);
        frame.pack();
        frame.setTitle(TITLE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

        game.start();
    }
}
