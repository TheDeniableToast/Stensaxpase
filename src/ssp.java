import javax.swing.*;

public class ssp {

    public static void main(String[] args) {


        Object[] options1 = {"Singleplayer",
                "Multiplayer"};

        int result = JOptionPane.showOptionDialog(null,
                "Vill du spela mot en dator eller din kompis?",
                "Hur vill du spela?",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options1,
                null);
        if (result == 0) {
            int n = (int) (Math.random() * 3);

            String m = "Sten";

            if (n == 0) {
                m = ("Sten");
            }

            if (n == 1) {
                m = ("Sax");
            }

            if (n == 2) {
                m = ("Påse");
            }

            Object[] options2 = {"Sten",
                    "Sax", "Påse"};

            int result2 = JOptionPane.showOptionDialog(null,
                    "Gör ditt val",
                    " ",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options2,
                    null);
            if (result2 == 0) {
                if (n == 0) JOptionPane.showMessageDialog(null, "Det blev oavgjort! Datorn valde också sten");
                if (n == 1) JOptionPane.showMessageDialog(null, "Du vann! Datorn valde sax");
                if (n == 2) JOptionPane.showMessageDialog(null, "Du förlorade! Datorn valde påse");
                }

            if (result2 == 1) {
                if (n == 0) JOptionPane.showMessageDialog(null, "Du förlorade! Datorn valde sten");
                if (n == 1) JOptionPane.showMessageDialog(null, "Det blev oavgjort! Datorn valde också sax");
                if (n == 2) JOptionPane.showMessageDialog(null, "Du vann! Datorn valde påse");
            }

            if (result2 == 2) {
                if (n == 0) JOptionPane.showMessageDialog(null, "Du vann! Datorn valde sten");
                if (n == 1) JOptionPane.showMessageDialog(null, "Du förlorade! Datorn valde sax");
                if (n == 2) JOptionPane.showMessageDialog(null, "Det blev oavgjort! Datorn valde också påse");
            }
            }

        }
    }


