public class TennisGame {

    public static String getScore(String playerOneName, String playerTwoName, int scorePlayerOne, int scorePlayerTwo) {
        String score;

        if (isScoresEqual(scorePlayerOne, scorePlayerTwo)) {
            score = getEqualScore(scorePlayerOne);
        } else if (isAnyPlayerScoreAtLeastFour(scorePlayerOne, scorePlayerTwo)) {
            score = getWinnerOrAdvantage(scorePlayerOne, scorePlayerTwo);
        } else {
            score = getNormalScore(scorePlayerOne, scorePlayerTwo);
        }
        return score;
    }

    // Hàm xử lý trường hợp điểm số của hai người chơi bằng nhau
    private static String getEqualScore(int scorePlayerOne) {
        if (scorePlayerOne > Points.THREE_POINTS) {
            return "Deuce";
        }

        switch (scorePlayerOne) {
            case Points.TIE_ZERO:
                return "Love-All";
            case Points.TIE_ONE:
                return "Fifteen-All";
            case Points.TIE_TWO:
                return "Thirty-All";
            case Points.TIE_THREE:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    // Hàm xử lý trường hợp một trong hai người chơi đã có điểm số lớn hơn hoặc bằng 4
    private static String getWinnerOrAdvantage(int scorePlayerOne, int scorePlayerTwo) {
        int minusResult = scorePlayerOne - scorePlayerTwo;
        if (minusResult == Points.ONE_POINT) {
            return "Advantage player1";
        } else if (minusResult == Points.NEGATIVE_ONE_POINT) {
            return "Advantage player2";
        } else if (minusResult >= Points.TWO_POINTS) {
            return "Win for player1";
        } else {
            return "Win for player2";
        }
    }

    // Hàm xử lý trường hợp điểm số bình thường (chưa đạt 4)
    private static String getNormalScore(int scorePlayerOne, int scorePlayerTwo) {
        String[] scoreNames = {"Love", "Fifteen", "Thirty", "Forty"};
        return scoreNames[scorePlayerOne] + "-" + scoreNames[scorePlayerTwo];
    }

    private static boolean isScoresEqual(int scorePlayerOne, int scorePlayerTwo) {
        return scorePlayerOne == scorePlayerTwo;
    }

    private static boolean isAnyPlayerScoreAtLeastFour(int scorePlayerOne, int scorePlayerTwo) {
        return scorePlayerOne >= Points.FOUR_POINTS || scorePlayerTwo >= Points.FOUR_POINTS;
    }
}
