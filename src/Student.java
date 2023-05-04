import java.util.*;

public class Student {
    public static String HEADMAN_TYPE = "headman";
    public static String STUDENT_TYPE = "student";

    private int id;
    private String name;
    private String surname;
    private String type;
    private List<TaskForStudent> tasksDone = new ArrayList<>();

    public Student(int id, String name, String surname, String type) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.type = type;
    }

    public void addCompleteTask(TaskForStudent task) {
        tasksDone.add(task);
    }

    @Override
    public String toString() {
        return "Id:" + id + ", Student name: " + name + " " + surname + ", " + type + " Tasks done: " + tasksDone;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        return id == ((Student) obj).getId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String isType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<TaskForStudent> getTasksDone() {
        return tasksDone;
    }

    public void setTasksDone(List<TaskForStudent> tasksDone) {
        this.tasksDone = tasksDone;
    }
}
