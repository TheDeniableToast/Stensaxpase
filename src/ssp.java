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

        if (result == JOptionPane.YES_OPTION) {
        }
    }
}
