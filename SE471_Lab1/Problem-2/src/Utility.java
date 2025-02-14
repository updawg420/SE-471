//used to create corresponding factories based on what mode is chosen
public class Utility {
    public static GameFactory getFactory(String mode) {
        if (mode.equals("Beginner")) {
            return new BeginnerGameFactory();
        }
        else if (mode.equals("Intermediate")) {
            return new IntermediateGameFactory();
        }
        else if (mode.equals("Advanced")) {
            return new AdvancedGameFactory();
        }
        else {
            return null;
        }
    }
}
