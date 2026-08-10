import java.util.*;

public class JavaPriorityQueue {

    static class Student {

        int id;
        String name;
        double cgpa;

        Student(int id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }
    }

    static class StudentComparator
            implements Comparator<Student> {

        @Override
        public int compare(Student a, Student b) {

            int result =
                Double.compare(b.cgpa, a.cgpa);

            if (result != 0) {
                return result;
            }

            result =
                a.name.compareTo(b.name);

            if (result != 0) {
                return result;
            }

            return Integer.compare(a.id, b.id);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        PriorityQueue<Student> queue =
            new PriorityQueue<>(
                new StudentComparator()
            );

        for (int i = 0; i < n; i++) {

            String command = sc.next();

            if (command.equals("ENTER")) {

                String name = sc.next();
                double cgpa = sc.nextDouble();
                int id = sc.nextInt();

                queue.add(
                    new Student(id, name, cgpa)
                );

            } else if (command.equals("SERVED")) {

                if (!queue.isEmpty()) {
                    queue.poll();
                }
            }
        }

        List<Student> students =
            new ArrayList<>(queue);

        students.sort(new StudentComparator());

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student student : students) {
                System.out.println(student.name);
            }
        }

        sc.close();
    }
}
