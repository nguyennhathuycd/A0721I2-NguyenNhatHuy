package refactoring;

public class TennisGame {
    final static int ZERO_POINTS = 0;
    final static int ONE_POINTS = 1;
    final static int TWO_POINTS = 2;
    final static int THREE_POINTS = 3;
    final static int FOUR_POINTS = 4;

    public static String getScore(int scoreOfPlayer1, int scoreOfPlayer2) {
        String score = "";
        boolean scoreGreaterThanOrRqualFour = scoreOfPlayer1 >= FOUR_POINTS || scoreOfPlayer2 >= FOUR_POINTS;
        if (scoreOfPlayer1 == scoreOfPlayer2)
        {
            score = getScoreWhenEqualScore(scoreOfPlayer1);
        } else if (scoreGreaterThanOrRqualFour) {
            score = CheckWinOrAdvantage(scoreOfPlayer1, scoreOfPlayer2);
        } else {
            score = getScore(scoreOfPlayer1, scoreOfPlayer2, score);
        }
        return score;
    }

    private static String getScore(int scoreOfPlayer1, int scoreOfPlayer2, String score) {
        int tempScore;
        for (int i = ONE_POINTS; i < THREE_POINTS; i++)
        {
            if (i == ONE_POINTS) {
                tempScore = scoreOfPlayer1;
            }
            else {
                score += "-";
                tempScore = scoreOfPlayer2;
            }
            switch(tempScore)
            {
                case ZERO_POINTS:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }

    private static String CheckWinOrAdvantage(int scoreOfPlayer1, int scoreOfPlayer2) {
        String score;
        int minusResult = scoreOfPlayer1 - scoreOfPlayer2;
        if (minusResult == ONE_POINTS) {
            score = "Advantage player1";
        } else if (minusResult == -ONE_POINTS) {
            score = "Advantage player2";
        } else if (minusResult >= TWO_POINTS) {
            score = "Win for player1";
        } else {
            score = "Win for player2";
        }
        return score;
    }

    private static String getScoreWhenEqualScore(int scoreOfPlayer1) {
        String score;
        switch (scoreOfPlayer1)
        {
            case ZERO_POINTS:
                score = "Love-All";
                break;
            case ONE_POINTS:
                score = "Fifteen-All";
                break;
            case TWO_POINTS:
                score = "Thirty-All";
                break;
            case THREE_POINTS:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }
}
