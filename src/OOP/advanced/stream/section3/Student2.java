package OOP.advanced.stream.section3;

public class Student2 implements Comparable<Student2>{
    private String name;
    private Integer score;



    public Student2(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public Integer getScore() {
        return score;
    }

    @Override
    public int compareTo(Student2 o) {
        return Integer.compare(score, o.score);
    }
}
