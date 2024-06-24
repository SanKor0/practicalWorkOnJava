import java.util.Scanner;

public class HealthCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш текущий вес в килограммах:");
        double weight = scanner.nextDouble();

        System.out.println("Введите ваш рост в метрах:");
        double height = scanner.nextDouble();

        System.out.println("Введите ваш возраст:");
        int age = scanner.nextInt();

        double bmi = weight / (height * height);
        double idealWeight = 24.9 * height * height;

        double recommendedCalories;
        String recommendation;

        if (bmi > 24.9) {
            double weightToLose = weight - idealWeight;
            recommendedCalories = calculateCalories(weight, height, age) - 500;
            recommendation = "Рекомендуется снизить вес для достижения идеального веса. Идеальный вес: " + idealWeight +
                    " кг. Необходимо сбросить: " + weightToLose + " кг. Рекомендуемый дневной прием калорий: " + recommendedCalories + " калорий.";
        } else if (bmi < 18.5) {
            double weightToGain = idealWeight - weight;
            recommendedCalories = calculateCalories(weight, height, age) + 500;
            recommendation = "Рекомендуется увеличить потребление пищи для набора веса. Идеальный вес: " + idealWeight +
                    " кг. Необходимо набрать: " + weightToGain + " кг. Рекомендуемый дневной прием калорий: " + recommendedCalories + " калорий.";
        } else {
            recommendedCalories = calculateCalories(weight, height, age);
            recommendation = "Ваш вес находится в пределах нормы. Идеальный вес: " + idealWeight +
                    " кг. Рекомендуемый дневной прием калорий: " + recommendedCalories + " калорий.";
        }

        System.out.println(recommendation);
    }

    public static double calculateCalories(double weight, double height, int age) {
        // Формула Харриса-Бенедикта для подсчета дневной нормы калорий
        double bmr = 10 * weight + 6.25 * height * 100 - 5 * age;
        return bmr;
    }
}
