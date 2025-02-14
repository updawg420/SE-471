public class AdvancedGameFactory implements GameFactory {
    public CharacterPanel createCharPanel() {
        return new AdvancedCharacterPanel();
    }

    public WeaponPanel createWepPanel() {
        return new AdvancedWeaponPanel();
    }
}
