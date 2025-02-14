import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IntermediateWeaponPanel implements WeaponPanel {
    private JComboBox<String> comboBox;

    public JPanel getPanel() {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Choose Your Weapon"));
        String[] weapons = {"Weapon 1 Intermediate", "Weapon 2 Intermediate"};
        comboBox = new JComboBox<>(weapons);
        panel.add(comboBox);
        return panel;
    }

    public String getSelectedWep() {
        return (String) comboBox.getSelectedItem();
    }

    public String getWepImage() {
        if (getSelectedWep().equals("Weapon 1 Intermediate")) {
            return "SE471_Lab1/Problem-2/src/Images/Weapon1Inter.png";
        }
        else if (getSelectedWep().equals("Weapon 2 Intermediate")) {
            return "SE471_Lab1/Problem-2/src/Images/Weapon2Inter.png";
        }
        else {
            return "";
        }
    }
}
