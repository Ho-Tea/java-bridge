package bridge.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BridgeGameTest {
    @DisplayName("이동한 칸과 정답을 비교 한다")
    @ParameterizedTest
    @CsvSource({"U,D,false", "U,U,true", "D,D,true"})
    void validateToCrossByRandomNumber(String answer, String input, boolean expected) {
        BridgeGame bridgeGame = new BridgeGame();
        boolean actual = bridgeGame.isPass(answer, input);
        assertThat(actual).isEqualTo(expected);
    }

}