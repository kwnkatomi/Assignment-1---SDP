package pcbuilder;

public record GraphicsCard(String model, int powerWatts) {
    public GraphicsCard {
        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("Graphics card model must not be blank");
        }
        if (powerWatts < 1 || powerWatts > 600) {
            throw new IllegalArgumentException("Graphics card power must be between 1 and 600 W");
        }
    }
}
