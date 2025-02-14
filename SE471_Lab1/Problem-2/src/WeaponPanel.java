import javax.swing.JPanel;
//Creates panel for weapon selection, can provide the selected weapon and selected weapon image location
public interface WeaponPanel {
    //returns the panel to place the weapon into
    JPanel getPanel();
    //returns a string of the name of the selected weapon
    String getSelectedWep();
    //returns the image reference for the selected weapon
    String getWepImage();
}
