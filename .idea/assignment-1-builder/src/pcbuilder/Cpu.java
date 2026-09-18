package pcbuilder;

public record Cpu(String model, int powerWatts, boolean integratedGraphics) {
    public Cpu {
        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("CPU model must not be blank");
        }
        if (powerWatts < 1 || powerWatts > 400) {
            throw new IllegalArgumentException("CPU power must be between 1 and 400 W");
        }
    }
}
