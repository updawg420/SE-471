import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BeginnerWeaponPanel implements WeaponPanel {
    //the combo box allows you to add more weapons in the future where you would run out of space with buttons
    private JComboBox<String> comboBox;

    //create a panel for the given weapon with a combobox which can be used to select a weapon
    public JPanel getPanel() {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Choose Your Weapon"));
        String[] weapons = {"Weapon 1 Beginner", "Weapon 2 Beginner"};
        comboBox = new JComboBox<>(weapons);
        panel.add(comboBox);
        return panel;
    }

    //return the name of the weapon selected in combobox
    public String getSelectedWep() {
        return (String) comboBox.getSelectedItem();
    }

    //return the location of the weapon image
    public String getWepImage() {
        if (getSelectedWep().equals("Weapon 1 Beginner")) {
            return "src/Images/Weapon1Beg.png";
        }
        else if (getSelectedWep().equals("Weapon 2 Beginner")) {
            return "src/Images/Weapon2Beg.png";
        }
        else {
            return "";
        }
    }
}
