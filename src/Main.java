import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public void guessGame() {
        Random random = new Random();
        int numberToGuess = random.nextInt(10); // Генерация случайного числа от 0 до 9
        Scanner scanner = new Scanner(System.in);
        int userGuess;
        int attempts = 0;

        do {
            System.out.println("Введите число от 0 до 9:");
            userGuess = scanner.nextInt(); // Считывание введенного пользователем числа
            attempts++; // Увеличиваем счетчик попыток

            if (userGuess < 0 || userGuess > 9) {
                System.out.println("Пожалуйста, введите число в диапазоне от 0 до 9.");
            } else if (userGuess != numberToGuess) {
                System.out.println("Вы не угадали, введите число от 0 до 9:");
            }
        } while (userGuess != numberToGuess); // Продолжаем до тех пор, пока пользователь не угадает

        System.out.println("Вы угадали!");
        System.out.println("Вы отгадали число за " + attempts + " попытки(ок).");
    }

    public void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Вывод символа '*'
            }
            System.out.println(); // Переход на новую строку после завершения строки
        }
    }

    public int sumLastNums(int x) {
        // Предполагаем, что у нас есть как минимум две цифры в числе
        int lastDigit = x % 10; // Получаем последнюю цифру
        int secondLastDigit = (x / 10) % 10; // Получаем предпоследнюю цифру

        return lastDigit + secondLastDigit; // Возвращаем сумму двух последних цифр
    }

    public boolean isPositive(int x) {
        return x > 0; // Возвращаем true, если число положительное, иначе false
    }

    public boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z'; // Проверяем, является ли символ заглавной буквой
    }

    public boolean isDivisor(int a, int b) {
        return (a != 0 && b % a == 0) || (b != 0 && a % b == 0); // Проверяем делимость
    }

    public int lastNumSum(int a, int b) {
        return (a % 10 + b % 10); // Суммируем последние цифры (единичные разряды)
    }

    public double safeDiv(int x, int y) {
        if (y == 0) {
            return 0; // Возвращаем 0, если делим на 0
        }
        return (double) x / y; // Выполняем деление
    }

    public String makeDecision(int x, int y) {
        if (x > y) {
            return x + " > " + y; // Если x больше y
        } else if (x < y) {
            return x + " < " + y; // Если x меньше y
        } else {
            return x + " == " + y; // Если x равно y
        }
    }

    public boolean sum3(int x, int y, int z) {
        // Проверяем, можно ли сложить два числа так, чтобы получить третье
        return (x + y == z) || (x + z == y) || (y + z == x);
    }

    public String age(int x) {
        String suffix;
        int absX = Math.abs(x) % 100; // берем модуль числа и находим остаток от деления на 100

        if (absX >= 11 && absX <= 14) {
            suffix = "лет"; // исключения для 11, 12, 13, 14
        } else {
            switch (absX % 10) {
                case 1:
                    suffix = "год";
                    break;
                case 2:
                case 3:
                case 4:
                    suffix = "года";
                    break;
                default:
                    suffix = "лет";
                    break;
            }
        }

        return x + " " + suffix; // Формируем строку и возвращаем
    }

    public void printDays(String x) {
        switch (x.toLowerCase()) { // Приводим к нижнему регистру для сравнения
            case "понедельник":
                System.out.println("Понедельник");
                System.out.println("Вторник");
                System.out.println("Среда");
                System.out.println("Четверг");
                System.out.println("Пятница");
                System.out.println("Суббота");
                System.out.println("Воскресенье");
                break;
            case "вторник":
                System.out.println("Вторник");
                System.out.println("Среда");
                System.out.println("Четверг");
                System.out.println("Пятница");
                System.out.println("Суббота");
                System.out.println("Воскресенье");
                break;
            case "среда":
                System.out.println("Среда");
                System.out.println("Четверг");
                System.out.println("Пятница");
                System.out.println("Суббота");
                System.out.println("Воскресенье");
                break;
            case "четверг":
                System.out.println("Четверг");
                System.out.println("Пятница");
                System.out.println("Суббота");
                System.out.println("Воскресенье");
                break;
            case "пятница":
                System.out.println("Пятница");
                System.out.println("Суббота");
                System.out.println("Воскресенье");
                break;
            case "суббота":
                System.out.println("Суббота");
                System.out.println("Воскресенье");
                break;
            case "воскресенье":
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("это не день недели");
        }
    }

    public String reverseListNums(int x) {
        StringBuilder result = new StringBuilder(); // Используем StringBuilder для формирования строки

        for (int i = x; i >= 0; i--) {
            result.append(i); // Добавляем текущее число
            if (i > 0) {
                result.append(" "); // Добавляем пробел между числами
            }
        }

        return result.toString(); // Возвращаем строку с числами
    }

    public int pow(int x, int y) {
        int result = 1; // Начинаем с единицы
        for (int i = 0; i < y; i++) { // Умножаем x на себя y раз
            result *= x; // Умножаем результат на x
        }
        return result; // Возвращаем результат
    }

    public boolean equalNum(int x) {
        String numStr = String.valueOf(x); // Преобразуем число в строку
        char firstDigit = numStr.charAt(0); // Получаем первый символ

        // Проверяем, равны ли все символы первому
        for (int i = 1; i < numStr.length(); i++) {
            if (numStr.charAt(i) != firstDigit) {
                return false; // Если есть различие, возвращаем false
            }
        }
        return true; // Все символы одинаковые
    }

    public int findLast(int[] arr, int x) {
        // Ищем последнее вхождение x в массив arr
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i; // Возвращаем индекс последнего вхождения
            }
        }
        return -1; // Если x не найден, возвращаем -1
    }

    public int[] add(int[] arr, int x, int pos) {
        // Проверка, чтобы позиция была корректной
        if (pos < 0 || pos > arr.length) {
            throw new ArrayIndexOutOfBoundsException("Некорректная позиция для вставки.");
        }

        // Создаем новый массив размером на 1 больше, чем arr
        int[] newArr = new int[arr.length + 1];
        // Копируем элементы до позиции вставки
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        // Вставляем x на позицию pos
        newArr[pos] = x;

        // Копируем оставшиеся элементы
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr; // Возвращаем новый массив
    }

    public void reverse(int[] arr) {
        // Смена местами элементов от начала до середины массива
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public int[] concat(int[] arr1, int[] arr2) {
        // Создаем новый массив, размер которого равен сумме размеров обоих массивов
        int[] result = new int[arr1.length + arr2.length];

        // Копируем элементы первого массива в новый массив
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        // Копируем элементы второго массива в новый массив, начиная с индекса, равного длине первого массива
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);

        return result; // Возвращаем объединенный массив
    }

    public int[] deleteNegative(int[] arr) {
        List<Integer> positiveNumbers = new ArrayList<>();

        // Проходим по каждому элементу массива
        for (int num : arr) {
            // Если число не отрицательное, добавляем его в список
            if (num >= 0) {
                positiveNumbers.add(num);
            }
        }

        // Преобразуем список обратно в массив
        int[] result = new int[positiveNumbers.size()];
        for (int i = 0; i < positiveNumbers.size(); i++) {
            result[i] = positiveNumbers.get(i);
        }

        return result; // Возвращаем новый массив
    }


    public static void main(String[] args) {
        Main mainProgram = new Main();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите задачу:");
            System.out.println("1. Игра «Угадай число»");
            System.out.println("2. Построение левого треугольника");
            System.out.println("3. Сумма последних двух цифр числа");
            System.out.println("4. Проверка на положительность числа");
            System.out.println("5. Проверка на заглавную букву");
            System.out.println("6. Проверка делимости");
            System.out.println("7. Многократный вызов (сумма единичных разрядов)");
            System.out.println("8. Безопасное деление");
            System.out.println("9. Сравнение строк");

            System.out.println("10. Проверка тройной суммы");
            System.out.println("11. Определение возраста");
            System.out.println("12. Вывод дней недели");
            System.out.println("13. Числа наоборот");
            System.out.println("14. Возведение в степень");
            System.out.println("15. Проверка одинаковости знаков");
            System.out.println("16. Поиск последнего значения");
            System.out.println("17. Добавление в массив");
            System.out.println("18. Реверс массива");
            System.out.println("19. Объединение массивов");
            System.out.println("20. Удалить негатив");
            System.out.println("0. Выход");

            System.out.print("Введите номер задачи: ");


            int choice = scanner.nextInt(); // Считываем выбор пользователя
            scanner.nextLine(); // Читаем оставшийся символ новой строки

            switch (choice) {
                case 1:

                    mainProgram.guessGame(); // Запускаем игру в угадывание
                    break;
                case 2:
                    System.out.print("Введите высоту треугольника (x): ");
                    int x = scanner.nextInt(); // Читаем высоту треугольника
                    mainProgram.leftTriangle(x); // Вызываем метод для построения треугольника
                    break;
                case 3:
                    System.out.print("Введите число, чтобы получить сумму последних двух цифр: ");
                    int number = scanner.nextInt(); // Читаем число от пользователя
                    int sum = mainProgram.sumLastNums(number); // Вычисляем сумму последних двух цифр
                    System.out.println("Сумма двух последних цифр числа " + number + " равна: " + sum);
                    break;
                case 4:
                    System.out.print("Введите число для проверки на положительность: ");
                    int checkNumber = scanner.nextInt(); // Читаем число для проверки
                    boolean isPositive = mainProgram.isPositive(checkNumber); // Проверяем на положительность
                    System.out.println("Число " + checkNumber + " положительное: " + isPositive);
                    break;
                case 5:
                    System.out.print("Введите символ для проверки на заглавную букву: ");
                    char checkChar = scanner.nextLine().charAt(0); // Читаем символ от пользователя
                    boolean isUpperCase = mainProgram.isUpperCase(checkChar); // Проверяем на заглавную букву
                    System.out.println("Символ '" + checkChar + "' заглавная буква: " + isUpperCase);
                    break;
                case 6:
                    System.out.print("Введите первое число (a): ");
                    int a = scanner.nextInt(); // Читаем первое число от пользователя
                    System.out.print("Введите второе число (b): ");
                    int b = scanner.nextInt(); // Читаем второе число от пользователя
                    boolean isDivisor = mainProgram.isDivisor(a, b); // Проверяем делимость
                    System.out.println("Число " + a + (isDivisor ? " является" : " не является") + " делителем числа " + b + ", поэтому:" + isDivisor);
                    break;
                case 7:
                    int sumOfLastDigits = 0; // Переменная для хранения суммы единичных разрядов
                    for (int i = 0; i < 5; i++) { // Цикл для 5 чисел
                        System.out.print("Введите число " + (i + 1) + ": "); // Запрос числа
                        int numberInput = scanner.nextInt(); // Чтение числа
                        sumOfLastDigits = mainProgram.lastNumSum(sumOfLastDigits, numberInput); // Вызываем метод для сложения
                        System.out.println("Текущая сумма: " + sumOfLastDigits); // Вывод текущей суммы
                    }
                    System.out.println("Итого: " + sumOfLastDigits); // Вывод итоговой суммы
                    break;
                case 8:
                    System.out.print("Введите делимое (x): ");
                    int num1 = scanner.nextInt(); // Читаем делимое
                    System.out.print("Введите делитель (y): ");
                    int num2 = scanner.nextInt(); // Читаем делитель
                    double result = mainProgram.safeDiv(num1, num2); // Выполняем безопасное деление
                    System.out.println("Результат деления " + num1 + " на " + num2 + " составляет: " + result);
                    break;
                case 9:
                    System.out.print("Введите первое число (x): ");
                    int firstNum = scanner.nextInt(); // Читаем первое число
                    System.out.print("Введите второе число (y): ");
                    int secondNum = scanner.nextInt(); // Читаем второе число
                    String comparisonResult = mainProgram.makeDecision(firstNum, secondNum); // Получаем результат сравнения

                    System.out.println("Результат сравнения: " + comparisonResult); // Выводим результат
                    break;

                case 10:
                    System.out.print("Введите три числа (x, y, z): ");
                    int x1 = scanner.nextInt();
                    int y = scanner.nextInt();
                    int z = scanner.nextInt();
                    boolean resultt = mainProgram.sum3(x1, y, z); // Вызываем метод sum3
                    System.out.println("Результат: " + resultt);
                    break;
                case 11:
                    System.out.print("Введите возраст (x): ");
                    int ageInput = scanner.nextInt(); // Читаем возраст
                    String ageResult = mainProgram.age(ageInput); // Вызываем метод age
                    System.out.println("Результат: " + ageResult);
                    break;
                case 12:
                    System.out.print("Введите день недели: ");
                    String dayInput = scanner.nextLine(); // Считываем название дня недели
                    mainProgram.printDays(dayInput); // Вызываем метод для вывода дней недели
                    break;
                case 13:
                    System.out.print("Введите число (x): ");
                    int reverseInput = scanner.nextInt(); // Считываем число для обратного вывода
                    String reverseResult = mainProgram.reverseListNums(reverseInput); // Вызываем метод reverseListNums
                    System.out.println("Результат: " + reverseResult);
                    break;
                case 14:
                    System.out.print("Введите число (x): ");
                    int base = scanner.nextInt(); // Считываем основание
                    System.out.print("Введите степень (y): ");
                    int exponent = scanner.nextInt(); // Считываем степень
                    int powerResult = mainProgram.pow(base, exponent); // Вызываем метод pow
                    System.out.println("Результат: " + powerResult);
                    break;
                case 15:
                    System.out.print("Введите число (x): ");
                    int equalInput = scanner.nextInt(); // Считываем число для проверки на одинаковость цифр
                    boolean equalResult = mainProgram.equalNum(equalInput); // Вызываем метод equalNum
                    System.out.println("Результат: " + equalResult);
                    break;
                case 16:
                    System.out.print("Введите размер массива: ");
                    int size = scanner.nextInt(); // Считываем размер массива
                    int[] arr = new int[size]; // Создаем массив указанного размера
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < size; i++) {
                        arr[i] = scanner.nextInt(); // Читаем элементы массива
                    }
                    System.out.print("Введите число для поиска: ");
                    int findInput = scanner.nextInt(); // Считываем число для поиска
                    int lastIndex = mainProgram.findLast(arr, findInput); // Ищем последнее вхождение числа
                    System.out.println("Индекс последнего вхождения: " + lastIndex);
                    break;
                case 17:
                    System.out.print("Введите размер массива: ");
                    int newSize = scanner.nextInt(); // Считываем размер массива
                    int[] originalArr = new int[newSize]; // Создаем массив указанного размера
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < newSize; i++) {
                        originalArr[i] = scanner.nextInt(); // Читаем элементы массива
                    }
                    System.out.print("Введите число для вставки (x): ");
                    int valueToAdd = scanner.nextInt(); // Считываем значение для вставки
                    System.out.print("Введите позицию (pos) для вставки: ");
                    int position = scanner.nextInt(); // Считываем позицию для вставки
                    try {
                        int[] updatedArr = mainProgram.add(originalArr, valueToAdd, position); // Вставляем значение в массив
                        System.out.print("Обновленный массив: ");
                        for (int num : updatedArr) {
                            System.out.print(num + " "); // Выводим обновленный массив
                        }
                        System.out.println();
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage()); // Выводим сообщение об ошибке, если позиция некорректна
                    }
                    break;
                case 18:
                    System.out.print("Введите размер массива для реверса: ");
                    int reverseSize = scanner.nextInt(); // Считываем размер массива для реверса
                    int[] reverseArr = new int[reverseSize]; // Создаем массив указанного размера
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < reverseSize; i++) {
                        reverseArr[i] = scanner.nextInt(); // Читаем элементы массива
                    }
                    mainProgram.reverse(reverseArr); // Вызываем метод reverse для реверса массива
                    System.out.print("Реверсированный массив: ");
                    for (int num : reverseArr) {
                        System.out.print(num + " "); // Выводим реверсированный массив
                    }
                    System.out.println();
                    break;
                case 19:
                    // Запрос размеров и элементов первого массива
                    System.out.print("Введите размер первого массива: ");
                    int size1 = scanner.nextInt();
                    int[] arr1 = new int[size1];
                    System.out.println("Введите элементы первого массива:");
                    for (int i = 0; i < size1; i++) {
                        arr1[i] = scanner.nextInt();
                    }

                    // Запрос размеров и элементов второго массива
                    System.out.print("Введите размер второго массива: ");
                    int size2 = scanner.nextInt();
                    int[] arr2 = new int[size2];
                    System.out.println("Введите элементы второго массива:");
                    for (int i = 0; i < size2; i++) {
                        arr2[i] = scanner.nextInt();
                    }

                    // Объединение массивов
                    int[] concatenatedArray = mainProgram.concat(arr1, arr2);
                    System.out.print("Объединенный массив: ");
                    for (int num : concatenatedArray) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;
                case 20:
                    System.out.print("Введите размер массива для удаления негативов: ");
                    int deleteSize = scanner.nextInt(); // Считываем размер массива
                    int[] deleteArr = new int[deleteSize]; // Создаем массив указанного размера
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < deleteSize; i++) {
                        deleteArr[i] = scanner.nextInt(); // Читаем элементы массива
                    }

                    // Удаление негативов
                    int[] resultArray = mainProgram.deleteNegative(deleteArr);
                    System.out.print("Массив без негативов: ");
                    for (int num : resultArray) {
                        System.out.print(num + " "); // Выводим массив без негативов
                    }
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    return; // Выход из программы
                default:
                    System.out.println("Неверный выбор");
            }
        }
    }
}
