// Interface for Sports
interface Sports {
    void getNumberOfGoals();  // Method to get the number of goals
    void dispTeam();          // Method to display the winning team
}

// Class Hockey implementing Sports
class Hockey implements Sports {
    private int goalsTeamA;
    private int goalsTeamB;

    public Hockey(int goalsTeamA, int goalsTeamB) {
        this.goalsTeamA = goalsTeamA;
        this.goalsTeamB = goalsTeamB;
    }

    @Override
    public void getNumberOfGoals() {
        System.out.println("Hockey Goals - Team A: " + goalsTeamA + ", Team B: " + goalsTeamB);
    }

    @Override
    public void dispTeam() {
        if (goalsTeamA > goalsTeamB) {
            System.out.println("Hockey Winning Team: Team A");
        } else if (goalsTeamB > goalsTeamA) {
            System.out.println("Hockey Winning Team: Team B");
        } else {
            System.out.println("Hockey Match Ended in a Draw");
        }
    }
}

// Class Football implementing Sports
class Football implements Sports {
    private int goalsTeam1;
    private int goalsTeam2;

    public Football(int goalsTeam1, int goalsTeam2) {
        this.goalsTeam1 = goalsTeam1;
        this.goalsTeam2 = goalsTeam2;
    }

    @Override
    public void getNumberOfGoals() {
        System.out.println("Football Goals - Team 1: " + goalsTeam1 + ", Team 2: " + goalsTeam2);
    }

    @Override
    public void dispTeam() {
        if (goalsTeam1 > goalsTeam2) {
            System.out.println("Football Winning Team: Team 1");
        } else if (goalsTeam2 > goalsTeam1) {
            System.out.println("Football Winning Team: Team 2");
        } else {
            System.out.println("Football Match Ended in a Draw");
        }
    }
}

public class SportsInterfaceExample {
    public static void main(String[] args) {
        // Example usage with Hockey
        Sports hockey = new Hockey(3, 2);
        hockey.getNumberOfGoals();
        hockey.dispTeam();

        // Example usage with Football
        Sports football = new Football(2, 2);
        football.getNumberOfGoals();
        football.dispTeam();
    }
}
