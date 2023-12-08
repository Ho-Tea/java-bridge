package bridge.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class BridgeGameTest {

    @Test
    @DisplayName("다리를 건널 수 있음과 없음을 표시할 수 있다")
    void move() {
        BridgeGame bridgeGame = new BridgeGame(new Bridge(List.of("U", "D", "D")));
        assertAll(
                () -> assertThat(bridgeGame.move("U")).isEqualTo(CrossingResult.SUCCESS),
                () -> assertThat(bridgeGame.move("U")).isEqualTo(CrossingResult.FAIL)
        );
    }

    @Test
    @DisplayName("사용자가 게임을 재시작할지 아닐지 알 수 있다.")
    void retry() {
        BridgeGame bridgeGame = new BridgeGame(new Bridge(List.of("U", "D", "D")));
        assertAll(
                () -> assertThat(bridgeGame.retry("R")).isTrue(),
                () -> assertThat(bridgeGame.retry("Q")).isFalse()
        );
    }

    @Test
    @DisplayName("사용자가 게임을 성공했는지 알 수 있다.")
    void win(){
        BridgeGame bridgeGame = new BridgeGame(new Bridge(new ArrayList<>()));
        assertThat(bridgeGame.win(CrossingResult.SUCCESS)).isEqualTo(GameResult.SUCCESS);
    }


}