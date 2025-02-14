import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BeginnerCharacterPanel implements CharacterPanel {
    //the combo box allows you to add more weapons in the future where you would run out of space with buttons
    private JComboBox<String> comboBox;

    //create a combobox for the characters of the given mode
    public JPanel getPanel() {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Choose Your Character"));
        String[] characters = {"Character 1 Beginner", "Character 2 Beginner"};
        comboBox = new JComboBox<>(characters);
        panel.add(comboBox);
        return panel;
    }
    //return the selected character name
    public String getSelectedChar() {
        //casted to string because of an issue in testing
        return (String) comboBox.getSelectedItem();
    }
    //return image location of the selected character based on name selected from combobox
    public String getCharImage() {
        if (getSelectedChar().equals("Character 1 Beginner")) {
            return "SE471_Lab1/Problem-2/src/Images/Beginner1.png";
        }
        else if (getSelectedChar().equals("Character 2 Beginner")) {
            return "SE471_Lab1/Problem-2/src/Images/Beginner2.png";
        }
        else {
            return "";
        }
    }
}
