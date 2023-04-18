import javax.swing.*;
import java.awt.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;

class AnalogClockPanel extends JPanel {
    private WallClock clock;

    public AnalogClockPanel(WallClock clock) {
        this.clock = clock;
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // enable anti-aliasing
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // set the clock size
        int clockSize = Math.min(getWidth(), getHeight()) - 20;

        // calculate the center of the clock
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        // draw the clock face
        g.drawOval(centerX - clockSize / 2, centerY - clockSize / 2, clockSize, clockSize);

        // draw the minute and second marks
        for (int i = 0; i < 60; i++) {
            double angle = Math.toRadians(i * 6);
            int x1 = (int) (centerX + Math.sin(angle) * (clockSize / 2));
            int y1 = (int) (centerY - Math.cos(angle) * (clockSize / 2));
            int x2 = (int) (centerX + Math.sin(angle) * (clockSize / 2 - (i % 5 == 0 ? 20 : 15)));
            int y2 = (int) (centerY - Math.cos(angle) * (clockSize / 2 - (i % 5 == 0 ? 20 : 15)));
            g.drawLine(x1, y1, x2, y2);
        }

        // draw the clock numbers
        for (int i = 1; i <= 12; i++) {
            double angle = Math.toRadians(i * 30);
            int x = (int) (centerX + Math.sin(angle) * (clockSize / 3));
            int y = (int) (centerY - Math.cos(angle) * (clockSize / 3));
            String number = Integer.toString(i);
            FontMetrics fm = g.getFontMetrics();
            int numberWidth = fm.stringWidth(number);
            g.drawString(number, x - numberWidth / 2, y + fm.getAscent() / 3);
        }

     // get the current time from the clock
        int hours = clock.getHours();
        int minutes = clock.getMinutes();
        int seconds = clock.getSeconds();

        // calculate the angles of the clock hands
        double secondsAngle = Math.toRadians(seconds * 6);
        double minutesAngle = Math.toRadians(minutes * 6 + seconds * 0.1);
        double hoursAngle = Math.toRadians(hours * 30 + minutes * 0.5);

     // draw the clock hands
        int handSize = clockSize / 2 - 10;
        int secondHandSize = (int) (handSize * 0.9);
        int minuteHandSize = (int) (handSize * 0.7);
        int hourHandSize = (int) (handSize * 0.5);

        g.setColor(Color.RED);
        g.drawLine(centerX, centerY, (int) (centerX + secondHandSize * Math.sin(secondsAngle)),
                (int) (centerY - secondHandSize * Math.cos(secondsAngle)));

        g.setColor(Color.BLACK);
        ((Graphics2D) g).setStroke(new BasicStroke(3));
        g.drawLine(centerX, centerY, (int) (centerX + minuteHandSize * Math.sin(minutesAngle)),
                (int) (centerY - minuteHandSize * Math.cos(minutesAngle)));

        ((Graphics2D) g).setStroke(new BasicStroke(6));
        g.drawLine(centerX, centerY, (int) (centerX + hourHandSize * Math.sin(hoursAngle)),
                (int) (centerY - hourHandSize * Math.cos(hoursAngle)));
    }
}