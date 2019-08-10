public class TennisGame {
    public static void main(String[] args) {
        System.out.println(getScore("Cong","Tungf",0,0));
    }
    public static String getScore(String player1Name, String player2Name, int player1_Score, int player2_Score) {
        String resultOfScore = "";
        int tempScore=0;
        boolean scoreDraw = player1_Score == player2_Score;
        if (scoreDraw)

        {
            switch (player1_Score)
            {
                case 0:
                    resultOfScore = "Love-All";
                    break;
                case 1:
                    resultOfScore = "Fifteen-All";
                    break;
                case 2:
                    resultOfScore = "Thirty-All";
                    break;
                case 3:
                    resultOfScore = "Forty-All";
                    break;
                default:
                    resultOfScore = "Deuce";
                    break;

            }
        }
        else {
            boolean ratioDraw = player1_Score >= 4 || player2_Score >= 4;
            if (ratioDraw)
            {
                int player1_OfAdvantageScore = player1_Score-player2_Score;
                if (player1_OfAdvantageScore==1) resultOfScore ="Advantage player1";
                else if (player1_OfAdvantageScore ==-1) resultOfScore ="Advantage player2";
                else if (player1_OfAdvantageScore>=2) resultOfScore = "Win for player1";
                else resultOfScore ="Win for player2";
            }
            else
            {
                for (int i=1; i<3; i++)
                {
                    if (i==1) tempScore = player1_Score;
                    else { resultOfScore+="-"; tempScore = player2_Score;}
                    switch(tempScore)
                    {
                        case 0:
                            resultOfScore+="Love";
                            break;
                        case 1:
                            resultOfScore+="Fifteen";
                            break;
                        case 2:
                            resultOfScore+="Thirty";
                            break;
                        case 3:
                            resultOfScore+="Forty";
                            break;
                    }
                }
            }
        }
        return resultOfScore;
    }
}
