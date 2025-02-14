public class IntermediateGameFactory implements GameFactory {
    public CharacterPanel createCharPanel() {
        return new IntermediateCharacterPanel();
    }

    public WeaponPanel createWepPanel() {
        return new IntermediateWeaponPanel();
    }
}
