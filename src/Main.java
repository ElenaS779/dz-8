public class Main {
    public static void main(String[] args) {
        /*
        Створюємо екземпляр класу Група одразу зі старостою
         */
        StudentGroup group = new StudentGroup(3, "Peter", "White");
        group.addStudent(1, "Molly", "Black", Student.STUDENT_TYPE);
        group.addStudent(2, "Mike", "Smith", Student.STUDENT_TYPE);
        group.addStudent(4, "Tonny", "Adams", Student.STUDENT_TYPE);
        group.printAllStudents();
        /*
          Змінюємо ім'я студента
         */
        group.renameStudent(2, "Sara", "Clod");
        group.printAllStudents();
        /*
          Змінюємо старосту
         */
        group.changeHeadman(4);
        System.out.println("New headman: " + group.getHeadman());
        /*
          видаляємо студента з групи
         */
        group.deleteStudent(3);
        group.printAllStudents();
        /*
          додаємо 2 задачі для всієї групм
         */
        group.addTask("Learn multiple data types");
        group.addTask("Learn encapsulation");
        group.printAllTasks();
        /*
          позначаємо задачу як виконану для студента з id:2
         */
        group.markTaskDone(2, "Learn multiple data types");
        group.printAllTasks();
    }

}
