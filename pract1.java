import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BorschtRecipe {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            // Ввод граммовок для каждого типа ингредиента
            System.out.println("Введите количество мяса:");
            int meat = scanner.nextInt();

            System.out.println("Введите количество лука:");
            int onion = scanner.nextInt();

            System.out.println("Введите количество моркови:");
            int carrot = scanner.nextInt();

            System.out.println("Введите количество томатной пасты:");
            int tomatoPaste = scanner.nextInt();

            System.out.println("Введите количество свеклы:");
            int beetroot = scanner.nextInt();

            System.out.println("Введите количество картофеля:");
            int potato = scanner.nextInt();

            // Написание полного способа приготовления
            String recipe = "1. Нарежьте мясо и поставьте его вариться на 3 часа на минимальном огне.\n" +
                    "2. Далее, добавьте в бульон целый лук и очищенную морковь и варите ещё 2 часа, периодически снимая пену.\n" +
                    "3. В это время порежте свеклу соломкой и потушите на сковородке до полуготовности.\n" +
                    "4. На отдельной сковородке обжарьте натертую на крупную терку морковь с нарезанным на мелкие кубики луком до готовности\n" +
                    "и в конце добавьте 2 ложки томатной пасты.\n" +
                    "5. Примерно через час после добавления в бульон моркови и лука, добавьте в него порезанную кубиком картошку\n" +
                    "6. Минут за 15 до готовности закиньте в бульон тушеную свеклу и обжарку из моркови. Добавьте зелень и чеснок по желанию\n\n" +
                    "Борщ готов!";
            // Запись в txt файл
            FileWriter fileWriter = new FileWriter("borscht_recipe.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println("Рецепт борща:");
            printWriter.println("Мясо: " + meat + " кг");
            printWriter.println("Лук: " + onion + " шт");
            printWriter.println("Морковь: " + carrot + " шт");
            printWriter.println("Томатная паста: " + tomatoPaste + " ст.л.");
            printWriter.println("Свекла: " + beetroot + " шт");
            printWriter.println("Картофель: " + potato + " шт");

            printWriter.println("Способ приготовления:");
            printWriter.println(recipe);

            printWriter.close();
            System.out.println("Рецепт сохранен в файл borscht_recipe.txt");

        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
