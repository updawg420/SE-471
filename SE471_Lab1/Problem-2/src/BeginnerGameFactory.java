public class BeginnerGameFactory implements GameFactory {
    //create a beginner character panel
    public CharacterPanel createCharPanel() {
        return new BeginnerCharacterPanel();
    }

    //create a beginner weapon panel
    public WeaponPanel createWepPanel() {
        return new BeginnerWeaponPanel();
    }
}
