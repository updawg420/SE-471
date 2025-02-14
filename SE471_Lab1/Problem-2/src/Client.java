import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Client {
    public static void main(String[] args) {
        //create JFrame and set close operation and window size
        JFrame frame = new JFrame("Character Select");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,1000);
        //These have to be final and arrays of size 0 to avoid an error for using them in other methods
        //intialize currentMode as beginner
        final String[] currentMode = {"Beginner"};
        final GameFactory[] factory = {Utility.getFactory(currentMode[0])};
        final CharacterPanel[] characterPanel = {factory[0].createCharPanel()};
        final WeaponPanel[] weaponPanel = {factory[0].createWepPanel()};
        //create JPanels for the selected character and weapon
        JPanel selectedCharacterPanel = new JPanel();
        JPanel selectedWeaponPanel = new JPanel();
        //set up a layout for the frame
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        //add character and weapon panels to the frame
        frame.add(characterPanel[0].getPanel());
        frame.add(weaponPanel[0].getPanel());
        //JScroll Pane is used to scroll through the image if it is too big the issue is fixed now through resizing
        //but it would be too much work to remove
        JScrollPane characterScrollPane = new JScrollPane(selectedCharacterPanel);
        JScrollPane weaponScrollPane = new JScrollPane(selectedWeaponPanel);
        //Add the scroll panes for the character and weapon images
        frame.add(characterScrollPane);
        frame.add(weaponScrollPane);
        //create buttons to switch between beginner intermediate and advanced modes
        JPanel buttonPanel = new JPanel();
        JButton beginnerModeButton = new JButton("Beginner Mode");
        JButton intermediateModeButton = new JButton("Intermediate Mode");
        JButton advancedModeButton = new JButton("Advanced Mode");
        //button to display the current selected character and weapon
        JButton displaySelectionButton = new JButton("Display Selection");
        //Beginner button action listener
        beginnerModeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //set mode to beginner and get a GameFactory for it
                currentMode[0] = "Beginner";
                factory[0] = Utility.getFactory(currentMode[0]);
                //create character and weapon panels for the new mode
                characterPanel[0] = factory[0].createCharPanel();
                weaponPanel[0] = factory[0].createWepPanel();
                //remove everything from the frame and add the new information based on the mode
                frame.getContentPane().removeAll();
                frame.add(characterPanel[0].getPanel());
                frame.add(weaponPanel[0].getPanel());
                frame.add(characterScrollPane);
                frame.add(weaponScrollPane);
                frame.add(buttonPanel);
                frame.revalidate();
                frame.repaint();
            }
        });
        //same as beginner button
        intermediateModeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentMode[0] = "Intermediate";
                factory[0] = Utility.getFactory(currentMode[0]);
                characterPanel[0] = factory[0].createCharPanel();
                weaponPanel[0] = factory[0].createWepPanel();

                frame.getContentPane().removeAll();
                frame.add(characterPanel[0].getPanel());
                frame.add(weaponPanel[0].getPanel());
                frame.add(characterScrollPane);
                frame.add(weaponScrollPane);
                frame.add(buttonPanel);
                frame.revalidate();
                frame.repaint();
            }
        });
        //same as beginner button
        advancedModeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentMode[0] = "Advanced";
                factory[0] = Utility.getFactory(currentMode[0]);
                characterPanel[0] = factory[0].createCharPanel();
                weaponPanel[0] = factory[0].createWepPanel();

                frame.getContentPane().removeAll();
                frame.add(characterPanel[0].getPanel());
                frame.add(weaponPanel[0].getPanel());
                frame.add(characterScrollPane);
                frame.add(weaponScrollPane);
                frame.add(buttonPanel);
                frame.revalidate();
                frame.repaint();
            }
        });
        //Display Selection button action listener
        displaySelectionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Obtain the selected character and weapon information
                String selectedCharacter = characterPanel[0].getSelectedChar();
                String selectedWeapon = weaponPanel[0].getSelectedWep();
                String characterImage = characterPanel[0].getCharImage();
                String weaponImage = weaponPanel[0].getWepImage();
                //remove everything from the character and weapon panels and add the selected ones
                selectedCharacterPanel.removeAll();
                selectedWeaponPanel.removeAll();
                selectedCharacterPanel.add(new JLabel("Selected Character: " + selectedCharacter));
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
        //add all the different needed buttons to the buttonPanel and then add the panel to the frame
        buttonPanel.add(beginnerModeButton);
        buttonPanel.add(intermediateModeButton);
        buttonPanel.add(advancedModeButton);
        buttonPanel.add(displaySelectionButton);
        frame.add(buttonPanel);
        //make the frame visible
        frame.setVisible(true);
    }
    //function to resize images so that they fit in the frame and don't extend past the window
    public static ImageIcon resizeImage(String image, int width, int height) {
        ImageIcon icon = new ImageIcon(image);
        Image img = icon.getImage();
        Image resize = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resize);
    }
}
