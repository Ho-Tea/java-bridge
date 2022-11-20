package bridge.controller;

import bridge.view.InputView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class BridgeControllerTest {

    @DisplayName("다리의 길이를 숫자로 입력 받지 않는 경우 예외처리.")
    @Test
    void inputBridgeLengthByNotNumeric() {
        BridgeController bridgeController = new BridgeController();
        assertThatThrownBy(() -> bridgeController.validateNumeric("h"))
                .isInstanceOf(IllegalArgumentException.class);
    }
    @DisplayName("이동할 때 다른 문자가 입력 되는 경우 예외처리.")
    @Test
    void inputMoveLetterByAnotherLetter() {
        BridgeController bridgeController = new BridgeController();
        assertThatThrownBy(() -> bridgeController.validateLetter("a"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("게임이 실패 하고 다른 문자가 입력 되는 경우 예외처리.")
    @Test
    void inputEndLetterByAnotherLetter() {
        BridgeController bridgeController = new BridgeController();
        assertThatThrownBy(() -> bridgeController.validateEndLetter("b"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}