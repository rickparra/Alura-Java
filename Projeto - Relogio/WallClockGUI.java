import javax.swing.*;
import java.awt.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;
public class WallClockGUI extends JFrame {
     private WallClock clock;

     public WallClockGUI(WallClock clock) {
         this.clock = clock;

         // set up the window
         setTitle("Wall Clock");
         setSize(200, 100);
         setDefaultCloseOperation(EXIT_ON_CLOSE);

         // create an analog clock panel to display the time
         AnalogClockPanel clockPanel = new AnalogClockPanel(clock);
         add(clockPanel);

         // update the time every second
         new Timer(1000, e -> {
             clock.tick();
             repaint();
          }).start();
      }

      public static void main(String[] args) {
          // get the current time in Brasília
          ZonedDateTime now = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
          
          // create a wall clock with the current time in Brasília
          WallClock clock = new WallClock(now.getHour(), now.getMinute(), now.getSecond());
          
          WallClockGUI gui = new WallClockGUI(clock);
          gui.setVisible(true);
      }
}