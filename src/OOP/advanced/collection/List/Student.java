package OOP.advanced.collection.List;

public class Student {
    private String stuNo;
    private String name;
    private int[] scores;
    public Student(){}

    public Student(String stuNo, String name) {
        this.stuNo = stuNo;
        this.name = name;
    }

    public int[] getScores() {
        return scores;
    }

    public double getTotal() {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return total;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public String getStuNo() {
        return stuNo;
    }

    public String getName() {
        return name;
    }


}
