package bridge.constant;

public enum BridgeStructure {
    START("["),
    END("]"),
    MIDDLE("|");

    private final String output;

    BridgeStructure(String output) {
        this.output = output;
    }

    public String getOutput() {
        return output;
    }
}
