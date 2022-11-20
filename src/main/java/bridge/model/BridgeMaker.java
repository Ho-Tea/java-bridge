package bridge.model;

import java.util.List;

/**
 * 다리의 길이를 입력 받아서 다리를 생성해주는 역할을 한다.
 */
public class BridgeMaker {

    private final BridgeNumberGenerator bridgeNumberGenerator;

    public BridgeMaker(BridgeNumberGenerator bridgeNumberGenerator) {
        this.bridgeNumberGenerator = bridgeNumberGenerator;
    }

    /**
     * @param size 다리의 길이
     * @return 입력받은 길이에 해당하는 다리 모양. 위 칸이면 "U", 아래 칸이면 "D"로 표현해야 한다.
     */

    public List<String> makeBridge(int size) {
        return null;
    }

    public void validateSize(int size) {
        if (size < 3 || 20 < size) {
            throw new IllegalArgumentException();
        }
    }

    public void validateRandomNumber(int number) {
        if (number != 0 || number != 1) {
            throw new IllegalArgumentException();
        }
    }
    public int generateNumber(){
        return bridgeNumberGenerator.generate();
    }
    public String judgeRow(int row){
        if(row == 0){
            return "D";
        }
        return "U";
    }
}
