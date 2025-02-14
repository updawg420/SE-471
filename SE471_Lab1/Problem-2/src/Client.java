import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Client {
    public static void main(String[] args) {
        // Create JFrame and set close operation and window size
        JFrame frame = new JFrame("Character Select");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 1000);

        // These have to be final and arrays of size 0 to avoid an error for using them in other methods
        // Initialize currentMode as beginner
        final String[] currentMode = {"Beginner"};
        final GameFactory[] factory = {Utility.getFactory(currentMode[0])};
        final CharacterPanel[] characterPanel = {factory[0].createCharPanel()};
        final WeaponPanel[] weaponPanel = {factory[0].createWepPanel()};

        // Create JPanels for the selected character and weapon
        JPanel selectedCharacterPanel = new JPanel();
        JPanel selectedWeaponPanel = new JPanel();

        // Set up a layout for the frame
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // Add character and weapon panels to the frame
        frame.add(characterPanel[0].getPanel());
        frame.add(weaponPanel[0].getPanel());

        // JScroll Pane is used to scroll through the image if it is too big
        JScrollPane characterScrollPane = new JScrollPane(selectedCharacterPanel);
        JScrollPane weaponScrollPane = new JScrollPane(selectedWeaponPanel);

        // Add the scroll panes for the character and weapon images
        frame.add(characterScrollPane);
        frame.add(weaponScrollPane);

        // Create a JComboBox to switch between beginner, intermediate, and advanced modes
        JPanel comboPanel = new JPanel();
        String[] modes = {"Beginner", "Intermediate", "Advanced"};
        JComboBox<String> modeComboBox = new JComboBox<>(modes);

        // Action listener for the JComboBox
        modeComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Set mode to the selected item and get a GameFactory for it
                currentMode[0] = (String) modeComboBox.getSelectedItem();
                factory[0] = Utility.getFactory(currentMode[0]);

                // Create character and weapon panels for the new mode
                characterPanel[0] = factory[0].createCharPanel();
                weaponPanel[0] = factory[0].createWepPanel();

                // Remove everything from the frame and add the new information based on the mode
                frame.getContentPane().removeAll();
                frame.add(characterPanel[0].getPanel());
                frame.add(weaponPanel[0].getPanel());
                frame.add(characterScrollPane);
                frame.add(weaponScrollPane);
                frame.add(comboPanel);
                frame.revalidate();
                frame.repaint();
            }
        });

        // Button to display the current selected character and weapon
        JButton displaySelectionButton = new JButton("Display Selection");

        // Display Selection button action listener
        displaySelectionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtain the selected character and weapon information
                String selectedCharacter = characterPanel[0].getSelectedChar();
                String selectedWeapon = weaponPanel[0].getSelectedWep();
                String characterImage = characterPanel[0].getCharImage();
                String weaponImage = weaponPanel[0].getWepImage();

                // Remove everything from the character and weapon panels and add the selected ones
                selectedCharacterPanel.removeAll();
                selectedWeaponPanel.removeAll();
                selectedCharacterPanel.add(new JLabel("Selected Character: " + selectedCharacter));
                // Check if an image was returned before resizing and adding
                if (!characterImage.isEmpty()) {
                    selectedCharacterPanel.add(new JLabel(resizeImage(characterImage, 200, 300)));
                }
                selectedWeaponPanel.add(new JLabel("Selected Weapon: " + selectedWeapon));
                if (!weaponImage.isEmpty()) {
                    selectedWeaponPanel.add(new JLabel(resizeImage(weaponImage, 200, 300)));
                }
                frame.revalidate();
                frame.repaint();
            }
        });

        // Add the JComboBox and the display button to the comboPanel
        comboPanel.add(new JLabel("Select Mode: "));
        comboPanel.add(modeComboBox);
        comboPanel.add(displaySelectionButton);

        // Add the comboPanel to the frame
        frame.add(comboPanel);

        // Make the frame visible
        frame.setVisible(true);
    }

    // Function to resize images so that they fit in the frame and don't extend past the window
    public static ImageIcon resizeImage(String image, int width, int height) {
        ImageIcon icon = new ImageIcon(image);
        Image img = icon.getImage();
        Image resize = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resize);
    }
}
