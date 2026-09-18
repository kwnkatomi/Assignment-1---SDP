package pcbuilder;

public class Main {
    public static void main(String[] args) {
        ComputerConfiguration config = new ComputerConfiguration(
                "My PC", // Name
                "Intel i7", // CPU Model
                16, // RAM in GB
                1024, // Storage in GB
                "NVIDIA RTX 3080", // Graphics Card Model
                750, // Power Supply Watts
                "Air-cooled", // Cooling
                true, // Wi-Fi
                true, // Bluetooth
                true, // RGB Lighting
                "Windows 10", // Operating System
                24, // Warranty in months
                "Mid Tower" // Case Size
        );
        System.out.println(config.describe());
    }
}
