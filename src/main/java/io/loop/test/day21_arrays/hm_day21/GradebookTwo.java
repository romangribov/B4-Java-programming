public class GradebookTwo {
    public static void main(String[] args) {
        // Массивы с именами, баллами и оценками
        String[] names = {"Mike", "Joe", "Ana", "Ali", "Joanna"};
        int[] scores = {80, 54, 100, 66, 94};
        char[] grades = {'B', 'D', 'A', 'C', 'A'};

        // Выводим результаты в требуемом формате
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " | " + scores[i] + " | " + grades[i]);
        }
    }
}
