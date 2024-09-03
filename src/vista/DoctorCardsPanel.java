package vista;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import modelo.DoctorDAO;

public class DoctorCardsPanel extends JPanel {
    public DoctorCardsPanel() {
        setLayout(new GridLayout(0, 1, 10, 10)); // Un diseño de grid con una sola columna
        DoctorDAO doctorDAO = new DoctorDAO();
        ArrayList<String> doctorNames = doctorDAO.getDoctorNames();
        
        for (String name : doctorNames) {
            add(createDoctorCard(name));
        }
    }

    private JPanel createDoctorCard(String name) {
        JPanel card = new JPanel();
        card.setLayout(new BorderLayout());
        card.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        JLabel nameLabel = new JLabel(name);
        nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 18));
        
        card.add(nameLabel, BorderLayout.CENTER);

        return card;
    }
}
