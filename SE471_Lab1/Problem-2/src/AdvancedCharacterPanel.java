import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdvancedCharacterPanel implements CharacterPanel {
    private JComboBox<String> comboBox;

    public JPanel getPanel() {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Choose Your Character"));
        String[] characters = {"Character 1 Advanced", "Character 2 Advanced"};
        comboBox = new JComboBox<>(characters);
        panel.add(comboBox);
        return panel;
    }

    public String getSelectedChar() {
        return (String) comboBox.getSelectedItem();
    }

    public String getCharImage() {
        if (getSelectedChar().equals("Character 1 Advanced")) {
            return "src/Images/Advanced1.png";
        }
        else if (getSelectedChar().equals("Character 2 Advanced")) {
            return "src/Images/Advanced2.png";
        }
        else {
            return "";
        }
    }
}
