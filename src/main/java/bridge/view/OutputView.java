package bridge.view;

import bridge.constant.BridgeStructure;
import bridge.constant.CrossingDirection;
import bridge.constant.CrossingResult;
import bridge.constant.GameResult;

import java.util.List;


public class OutputView {

    public void printMap(List<CrossingResult> crossingResults, List<CrossingDirection> crossingDirections) {
        String upperResult = BridgeStructure.START.getOutput();
        String downResult = BridgeStructure.START.getOutput();
        for (int i = 0; i < crossingResults.size(); i++) {
            upperResult = upperResult.replace(BridgeStructure.END.getOutput(), BridgeStructure.MIDDLE.getOutput());
            downResult = downResult.replace(BridgeStructure.END.getOutput(), BridgeStructure.MIDDLE.getOutput());
            upperResult += makeMap(crossingDirections.get(i), crossingResults.get(i), CrossingDirection.TOP);
            downResult += makeMap(crossingDirections.get(i), crossingResults.get(i), CrossingDirection.BOTTOM);
        }
        System.out.println(upperResult + System.lineSeparator() + downResult);
    }

    private String makeMap(CrossingDirection crossingDirection, CrossingResult crossingResult, CrossingDirection direction) {
        if (crossingDirection.equals(direction)) {
            return " " + crossingResult.getOutput() + " " + BridgeStructure.END.getOutput();
        }
        return " " + CrossingResult.NOT_CROSSING.getOutput() + " " + BridgeStructure.END.getOutput();
    }

    public void printResult(List<CrossingResult> crossingResults, List<CrossingDirection> crossingDirections) {
        System.out.println("최종 게임 결과");
        printMap(crossingResults, crossingDirections);
    }

    public void printTotalResult(GameResult result, int count) {
        System.out.println(String.format("게임 성공 여부: %s", result.getOutput()) + System.lineSeparator() + String.format("총 시도한 횟수: %d", count));
    }

    public void printException(String message) {
        System.out.println(message);
    }
}
