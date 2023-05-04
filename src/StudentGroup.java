import java.util.*;

public class StudentGroup {
    private Student headman;
    private final Set<Student> group = new HashSet<>();
    private final HashMap<TaskForStudent, Set<Student>> tasksList = new HashMap<>();

    public StudentGroup(int id, String name, String surname) {
        this.headman = new Student(id, name, surname, "headman");
        group.add(headman);
    }

    public void changeHeadman(int id) {
        group.stream().filter(student -> student.getId() == id).forEach(student -> {
            student.setType("headman");
            Student oldHeadman = getHeadman();
            oldHeadman.setType("student");
            headman = student;
        });
    }

    public void addStudent(int id, String name, String surname, String type) {
        if (type == Student.HEADMAN_TYPE) {
            System.out.println("Error: The headman already exists, student " + name + " not added");
            return;
        }
        if (!group.add(new Student(id, name, surname, type))) {
            System.out.println("Error: The Id already exists, student " + name + " not added ");
        }
    }

    public void renameStudent(int id, String name, String surname) {
        group.stream().filter(student -> student.getId() == id).forEach(student -> {
            student.setName(name);
            student.setSurname(surname);
        });
    }

    public void deleteStudent(int id) {
        for (Student item : group) {
            if (item.getId() == id) {
                group.remove(item);
                return;
            }
        }
    }

    public void addTask(String description) {
        TaskForStudent task = new TaskForStudent(description);
        tasksList.put(task, group);
    }

    public void markTaskDone(int id, String description) {
        for (TaskForStudent task : tasksList.keySet()) {
            if (task.getDescription() == description) {
                Set<Student> students = tasksList.get(task);
                for (Student student : students) {
                    if (student.getId() == id) {
                        student.addCompleteTask(task);
                    }
                }
            }
        }
    }

    public void printAllStudents() {
        group.forEach(student -> {
            System.out.println(student);
        });
    }

    public void printAllTasks() {
        for (TaskForStudent task : tasksList.keySet()) {

            TaskForStudent variableKey = task;
            Set<Student> variableValue = tasksList.get(task);

            System.out.println("Task: " + variableKey);
            System.out.println("Value: " + variableValue);

        }
    }

    public Student getHeadman() {
        return headman;
    }

}