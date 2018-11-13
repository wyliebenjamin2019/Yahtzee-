        public static int fullhouse(int die1, int die2, int die3, int die4, int die5){

            boolean fullHouse = true;
            int score = 0;

            if (die1 == die2 && die1 == die3 && die4 == die5 && die1 != die5) {
                score = score + 25;
            }
            if (die1 == die2 && die1 == die4 && die3 == die5 && die1 != die5) {
                score = score + 25;
            }
            if (die1 == die3 && die1 == die4 && die2 == die5 && die1 != die5) {
                score = score + 25;
            }
            if (die3 == die2 && die4 == die3 && die1 == die5 && die2 != die5) {
                score = score + 25;
            }
            if (die2 == die3 && die2 == die5 && die1 == die4 && die2 != die4) {
                score = score + 25;
            }
            if (die1 == die3 && die1 == die5 && die2 == die4 && die1 != die4) {
                score = score + 25;
            }
            if (die1 == die2 && die1 == die5 && die3 == die4 && die1 != die4) {
                score = score + 25;
            }
            if (die2 == die4 && die2 == die5 && die1 == die3 && die1 != die4) {
                score = score + 25;
            }
            if (die1 == die4 && die1 == die5 && die2 == die3 && die1 != die2) {
                score = score + 25;
            }
            if (die3 == die4 && die3 == die5 && die1 == die2 && die1 != die4) {
                score = score + 25;
            }
            System.out.println("Your Score is: " + score);
            return score;
    }
