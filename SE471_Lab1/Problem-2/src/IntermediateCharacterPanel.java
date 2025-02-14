//view GameFactory Interface for comments
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IntermediateCharacterPanel implements CharacterPanel {
    private JComboBox<String> comboBox;

    public JPanel getPanel() {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Choose Your Character"));
        String[] characters = {"Character 1 Intermediate", "Character 2 Intermediate"};
        //combo box for drop down of characters able to add more in future if needed
        comboBox = new JComboBox<>(characters);
        panel.add(comboBox);
        return panel;
    }

    public String getSelectedChar() {
        return (String) comboBox.getSelectedItem();
    }

    public String getCharImage() {
        if (getSelectedChar().equals("Character 1 Intermediate")) {
            return "src/Images/Intermediate1.png";
        }
        else if (getSelectedChar().equals("Character 2 Intermediate")) {
            return "src/Images/Intermediate2.png";
        }
        else {
            return "";
        }
    }
}
