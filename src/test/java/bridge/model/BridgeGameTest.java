package bridge.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class BridgeGameTest {

    @Test
    @DisplayName("다리를 건널 수 있음과 없음을 표시할 수 있다")
    void move(){
        BridgeGame bridgeGame = new BridgeGame(new Bridge(List.of("U","D","D")));
        assertAll(
                () -> assertThat(bridgeGame.move("U")).isEqualTo(BridgeStructure.SUCCESS),
                () -> assertThat(bridgeGame.move("U")).isEqualTo(BridgeStructure.FAIL)
        );

    }

}