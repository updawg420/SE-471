//interface for the GameFactories which create panels based on what mode is selected
public interface GameFactory {
    //creates panel for character selection based on what mode you are in
    CharacterPanel createCharPanel();
    //creates panel for weapon selection based on what mode you are in
    WeaponPanel createWepPanel();
}
