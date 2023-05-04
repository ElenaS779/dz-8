public class TaskForStudent {
    private String description;

    public TaskForStudent(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return " " + description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
