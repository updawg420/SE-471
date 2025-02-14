import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdvancedWeaponPanel implements WeaponPanel {
    private JComboBox<String> comboBox;

    public JPanel getPanel() {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Choose Your Weapon"));
        String[] weapons = {"Weapon 1 Advanced", "Weapon 2 Advanced"};
        comboBox = new JComboBox<>(weapons);
        panel.add(comboBox);
        return panel;
    }

    public String getSelectedWep() {
        return (String) comboBox.getSelectedItem();
    }

    public String getWepImage() {
        if (getSelectedWep().equals("Weapon 1 Advanced")) {
            return "src/Images/Weapon1Adv.png";
        }
        else if (getSelectedWep().equals("Weapon 2 Advanced")) {
            return "src/Images/Weapon2Adv.png";
        }
        else {
            return "";
        }
    }
}
