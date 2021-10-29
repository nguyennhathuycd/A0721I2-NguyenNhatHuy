package refactoring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TennisGameTest {
    private int scoreOfPlayer1;
    private int scoreOfPlayer2;
    private String expectedScore;
    final static int ZERO_POINTS = 0;
    final static int ONE_POINTS = 1;
    final static int TWO_POINTS = 2;
    final static int THREE_POINTS = 3;
    final static int FOUR_POINTS = 4;
    final static int FIVE_POINTS = 5;
    final static int SIX_POINTS = 6;
    final static int FOURTEEN_POINTS = 14;
    final static int FIFTEEN_POINTS = 15;
    final static int SIXTEEN_POINTS = 16;

    public TennisGameTest(int scoreOfPlayer1, int scoreOfPlayer2, String expectedScore) {
        this.scoreOfPlayer1 = scoreOfPlayer1;
        this.scoreOfPlayer2 = scoreOfPlayer2;
        this.expectedScore = expectedScore;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getAllScores() {
        return Arrays.asList(new Object[][] {
            {ZERO_POINTS, ZERO_POINTS, "Love-All" },
            {ONE_POINTS, ONE_POINTS, "Fifteen-All" },
            {TWO_POINTS, TWO_POINTS, "Thirty-All"},
            {THREE_POINTS, THREE_POINTS, "Forty-All"},
            {FOUR_POINTS, FOUR_POINTS, "Deuce"},

            {ONE_POINTS, ZERO_POINTS, "Fifteen-Love"},
            {ZERO_POINTS, ONE_POINTS, "Love-Fifteen"},
            {TWO_POINTS, ZERO_POINTS, "Thirty-Love"},
            {ZERO_POINTS, TWO_POINTS, "Love-Thirty"},
            {THREE_POINTS, ZERO_POINTS, "Forty-Love"},
            {ZERO_POINTS, THREE_POINTS, "Love-Forty"},
            {FOUR_POINTS, ZERO_POINTS, "Win for player1"},
            {ZERO_POINTS, FOUR_POINTS, "Win for player2"},

            {TWO_POINTS, ONE_POINTS, "Thirty-Fifteen"},
            {ONE_POINTS, TWO_POINTS, "Fifteen-Thirty"},
            {THREE_POINTS, ONE_POINTS, "Forty-Fifteen"},
            {ONE_POINTS, THREE_POINTS, "Fifteen-Forty"},
            {FOUR_POINTS, ONE_POINTS, "Win for player1"},
            {ONE_POINTS, FOUR_POINTS, "Win for player2"},

            {THREE_POINTS, TWO_POINTS, "Forty-Thirty"},
            {TWO_POINTS, THREE_POINTS, "Thirty-Forty"},
            {FOUR_POINTS, TWO_POINTS, "Win for player1"},
            {TWO_POINTS, FOUR_POINTS, "Win for player2"},

            {FOUR_POINTS, THREE_POINTS, "Advantage player1"},
            {THREE_POINTS, FOUR_POINTS, "Advantage player2"},
            {FIVE_POINTS, FOUR_POINTS, "Advantage player1"},
            {FOUR_POINTS, FIVE_POINTS, "Advantage player2"},
            {FIFTEEN_POINTS, FOURTEEN_POINTS, "Advantage player1"},
            {FOURTEEN_POINTS, FIFTEEN_POINTS, "Advantage player2"},

            {SIX_POINTS, FOUR_POINTS, "Win for player1"},
            {FOUR_POINTS, SIX_POINTS, "Win for player2"},
            {SIXTEEN_POINTS, FOURTEEN_POINTS, "Win for player1"},
            {FOURTEEN_POINTS, SIXTEEN_POINTS, "Win for player2"},
        });
    }

    @Test
    public void checkAllScores() {
        int highestScore = Math.max(this.scoreOfPlayer1, this.scoreOfPlayer2);
        final int ZERO_POINTS = 0;
        final int ONE_POINTS = 1;
        int scoreOfPlayer1 = ZERO_POINTS;
        int scoreOfPlayer2 = ZERO_POINTS;
        for (int i = ZERO_POINTS; i < highestScore; i++) {
            if (i < this.scoreOfPlayer1)
                scoreOfPlayer1 += ONE_POINTS;
            if (i < this.scoreOfPlayer2)
                scoreOfPlayer2 += ONE_POINTS;
        }
        assertEquals(this.expectedScore, TennisGame.getScore(scoreOfPlayer1, scoreOfPlayer2));
    }
}