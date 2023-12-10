package bridge.model;

import bridge.constant.CrossingDirection;

import java.util.ArrayList;
import java.util.List;

/**
 * 다리의 길이를 입력 받아서 다리를 생성해주는 역할을 한다.
 */
public class BridgeMaker {
    private static final int MIN = 3;
    private static final int MAX = 20;

    private final BridgeNumberGenerator bridgeNumberGenerator;

    public BridgeMaker(BridgeNumberGenerator bridgeNumberGenerator) {
        this.bridgeNumberGenerator = bridgeNumberGenerator;
    }

    public List<String> makeBridge(int size) {
        validateSize(size);
        List<String> bridge = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            bridge.add(CrossingDirection.of(bridgeNumberGenerator.generate()).getSignatureLetter());
        }
        return bridge;
    }

    private void validateSize(int size) {
        if (size < MIN || size > MAX) {
            throw new IllegalArgumentException(" 다리 길이는 3부터 20 사이의 숫자여야 합니다.");
        }
    }


}
