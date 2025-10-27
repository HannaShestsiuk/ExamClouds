package lesson19_collections.VIII_Students;

public class Student {
    private String name;
    private String group;
    private int course;
    private double avgMark;

    public Student(String name, String group, int course, double avgMark){
        this.name = name;
        this.group = group;
        this.course = course;
        this.avgMark = avgMark;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public double getAvgMark() {
        return avgMark;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return name + " is in group " + group + " has average mark " + avgMark;
    }
}
