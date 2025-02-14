import javax.swing.JPanel;
//creates the panel allowing you to select a character and get its name and image location
public interface CharacterPanel {
    //create a panel with a combobox that can be used to select a character
    JPanel getPanel();
    //returns the character selected in combobox's name
    String getSelectedChar();
    //returns the image location of the character selected in combobox
    String getCharImage();
}
