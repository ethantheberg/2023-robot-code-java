package frc.robot.constants;

public final class CommandValues {
    //Swerve
    public static boolean fieldOriented = true;

    //Starting Config: Cube, with Middle Place, and Ground Pickup
    public static boolean cube = true; // Both
    public static boolean middlePlace = true; // Place
    public static boolean floor = false; // Place
    public static boolean chute = false; // Pickup
    public static boolean pickup = false;

    //Vision
    public static boolean vision = false;

    // THESE ARE ONLY FOR DRIVERS(Network Tables), NOT USED IN CODE
    public static boolean ground = true; // Pickup
    public static boolean cone = false; // Both
    public static boolean highPlace = false; // Place

    private CommandValues() {
        // private constructor to prevent instantiation
    }
}