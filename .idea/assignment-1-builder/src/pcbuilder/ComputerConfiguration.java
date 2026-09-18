package pcbuilder;

public final class ComputerConfiguration{
    private final String name;
    private final String cpuModel;
    private final int memoryGb;
    private final int storageGb;
    private final String graphicsCardModel;
    private final int powerSupplyWatts;
    private final String cooling;
    private final boolean wifiEnabled;
    private final boolean bluetoothEnabled;
    private final boolean rgbLightingEnabled;
    private final String operatingSystem;
    private final int warrantyMonths;
    private final String caseSize;

    public ComputerConfiguration(
            String name,
            String cpuModel,
            int memoryGb,
            int storageGb,
            String graphicsCardModel,
            int powerSupplyWatts,
            String cooling,
            boolean wifiEnabled,
            boolean bluetoothEnabled,
            boolean rgbLightingEnabled,
            String operatingSystem,
            int warrantyMonths,
            String caseSize) {
        this.name = name;
        this.cpuModel = cpuModel;
        this.memoryGb = memoryGb;
        this.storageGb = storageGb;
        this.graphicsCardModel = graphicsCardModel;
        this.powerSupplyWatts = powerSupplyWatts;
        this.cooling = cooling;
        this.wifiEnabled = wifiEnabled;
        this.bluetoothEnabled = bluetoothEnabled;
        this.rgbLightingEnabled = rgbLightingEnabled;
        this.operatingSystem = operatingSystem;
        this.warrantyMonths = warrantyMonths;
        this.caseSize = caseSize;
    }

    public String describe() {
        return name + " | " + cpuModel + " | RAM=" + memoryGb
                + " GB | SSD=" + storageGb + " GB | GPU="
                + (graphicsCardModel == null ? "integrated" : graphicsCardModel)
                + " | PSU=" + powerSupplyWatts + " W | Cooling=" + cooling
                + " | Wi-Fi=" + wifiEnabled + " | Bluetooth=" + bluetoothEnabled
                + " | RGB=" + rgbLightingEnabled + " | OS=" + operatingSystem
                + " | Warranty=" + warrantyMonths + " months | Case=" + caseSize;
    }
}
