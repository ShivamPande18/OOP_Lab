public class Result {
    private int[][] marks; 
    private int[] totalMarks; 

    public Result(int[][] marks) {
        this.marks = marks;
        this.totalMarks = new int[marks.length];
        calculateTotalMarks();
    }

    public void calculateTotalMarks() {
        for (int i = 0; i < marks.length; i++) {
            int total = 0;
            for (int j = 0; j < marks[i].length; j++) {
                total += marks[i][j];
            }
            totalMarks[i] = total;
        }
    }

    public void findHighestMarks() {
        for (int j = 0; j < marks[0].length; j++) {
            int highestMarks = marks[0][j];
            int studentRoll = 0;
            for (int i = 1; i < marks.length; i++) {
                if (marks[i][j] > highestMarks) {
                    highestMarks = marks[i][j];
                    studentRoll = i;
                }
            }
            System.out.println("Subject " + (j + 1) + ": Highest Marks = " + highestMarks + ", Student Roll = " + (studentRoll + 1));
        }
    }

    public void findStudentWithHighestTotalMarks() {
        int highestTotalMarks = totalMarks[0];
        int studentRoll = 0;
        for (int i = 1; i < totalMarks.length; i++) {
            if (totalMarks[i] > highestTotalMarks) {
                highestTotalMarks = totalMarks[i];
                studentRoll = i;
            }
        }
        System.out.println("Student with Highest Total Marks: Roll = " + (studentRoll + 1) + ", Marks = " + highestTotalMarks);
    }

    public static void main(String[] args) {
        int[][] marks = {
            {80, 90, 70},
            {60, 75, 85},
            {70, 80, 65}
        };

        Result result = new Result(marks);

        System.out.println("Highest Marks:");
        result.findHighestMarks();

        System.out.println("\nStudent with Highest Total Marks:");
        result.findStudentWithHighestTotalMarks();
    }
}
