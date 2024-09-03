package vista;

import javax.swing.*;

public class MainApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Doctores");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);

        DoctorCardsPanel doctorCardsPanel = new DoctorCardsPanel();
        JScrollPane scrollPane = new JScrollPane(doctorCardsPanel);
        frame.add(scrollPane);

        frame.setVisible(true);
    }
}
