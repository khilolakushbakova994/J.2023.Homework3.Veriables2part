public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {

        System.out.println("Задача 1");

        //Объявите переменные типа int, byte, short, long, float, double.
        //Название переменных может быть любым, но если состоит из двух слов и более, должно соответствовать правилу camelCase.
        //Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».


        int oranges = 300;
        byte mandarin = 3;
        short lemon = 30;
        long pomelo = 5325;
        float coffeeBeans = 25.50f;
        double seeds = 350.45;

        System.out.println("Значение переменной апкльсины, с типом int равно  " + oranges);
        System.out.println("Значение переменной мандарины, с типом byte равно  " + mandarin);
        System.out.println("Значение переменной лимон, с типом short равно  " + lemon);
        System.out.println("Значение переменной помело, с типом long равно  " + pomelo);
        System.out.println("Значение переменной кофейные зерна, с типом float равно  " + coffeeBeans);
        System.out.println("Значение переменной семена, с типом double равно  " + seeds);
    }

    public static void task2() {

        System.out.println("Задача 2");

        //Ниже дан список различных значений. Инициализируйте переменные, используйте изученные ранее типы переменных.
        //Значения:
        //27.12
        //987 678 965 549
        //2.786
        //569
        //-159
        //27897
        //67

        byte books = 67;
        short pens = 569;
        int notebooks = 27897;
        long erasers = 987678965549l;
        float chalks = 2.786f;
        double printers = 27.12;
        short budget = -159;
    }

    public static void task3() {

        System.out.println("Задача 3");

        //Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
        //У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
        //Три учительницы закупили все вместе 480 листов бумаги на все три класса.
        // Посчитайте, сколько достанется листов каждому ученику.
        //Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».
        //Для объявления переменных не используйте тип var.

        byte lyudmilaPavlovnasStudentsNumber = 23;
        short annaSergeevnasStudentsNumber = 27;
        short yekaterinaAndeevnasStudentsNumber = 30;
        int sheetsBoughtTogether = 480;
        int totalStudentNumber = lyudmilaPavlovnasStudentsNumber + annaSergeevnasStudentsNumber + yekaterinaAndeevnasStudentsNumber;
        int sheetPerEachStudent = sheetsBoughtTogether / totalStudentNumber;
        System.out.println("На каждого ученика расчитано  " + sheetPerEachStudent + " листов бумаги");
    }

    public static void task4() {

        System.out.println("Задача 4");

        //Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты. Какая производительность машины будет:
        //за 20 минут,
        //в сутки,
        //за 3 дня,
        //за 1 месяц?
        //Рассчитывайте производительность работы машины в том случае, если она работает без перерыва заданный промежуток времени.
        //Результаты подсчетов выведите в консоль в формате: «За … машина произвела … штук бутылок».
        //Для объявления переменных не используйте тип var.

        byte numberOfBottlesPer2minutes = 16;
        byte productionOf16bottles = 2;
        int numberOfBottlesPerMinute = numberOfBottlesPer2minutes / productionOf16bottles;
        int numberOfBottlesper20minutes = numberOfBottlesPerMinute * 20;
        int minutesInADay = 60 * 24;
        int numberOfBottlesPerDay = minutesInADay * numberOfBottlesPerMinute;
        int minutesFor3day = minutesInADay * 3;
        int numberOfBottlesFor3Days = minutesFor3day * numberOfBottlesPerMinute;
        int numberOfBottlesForAMonth = numberOfBottlesPerDay * 30;

        System.out.println("За 20 минут машина произвела  " + numberOfBottlesper20minutes + "  штук бутылок");
        System.out.println("За сутки машина произвела  " + numberOfBottlesPerDay + "  штук бутылок");
        System.out.println("За 3 дня машина произвела  " + numberOfBottlesFor3Days + "  штук бутылок");
        System.out.println("За месяц машина произвела  " + numberOfBottlesForAMonth + "  штук бутылок");
    }

    public static void task5() {

        System.out.println(" Задача 5");

        //На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
        // На один класс уходит 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?
        //Выведите результат задачи в консоль в формате: «В школе, где … классов,
        // нужно … банок белой краски и … банок коричневой краски».
        //Для объявления переменных не используйте тип var.

        short bothColors = 120;
        short whitePerRoom = 2;
        short brownPerRoom = 4;
        int bothPerRoom = whitePerRoom + brownPerRoom;
        int numberOfRooms = bothColors / bothPerRoom;
        int boughtWhite = numberOfRooms * whitePerRoom;
        int boughtBrown = numberOfRooms * brownPerRoom;
        System.out.println(" В школе, где  " + numberOfRooms + "  классов, нужно " + boughtWhite + "  банок белой краски и  " + boughtBrown + "  банок коричневой краски");
    }

    public static void task6() {

        System.out.println("Задача 6 ");


        //Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.
        //Вот один из рецептов, по которому спортсмен готовит себе завтрак:
        //Бананы — 5 штук (1 банан — 80 грамм).
        //Молоко — 200 мл (100 мл = 105 грамм).
        //Мороженое-пломбир — 2 брикета по 100 грамм.
        //Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
        //Смешать всё в блендере — и готово.
        //Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.
        //Результат в граммах и килограммах напечатайте в консоль.
        //  !!! Важное условие: если в рецепт нужно добавить несколько единиц какого-то продукта (с определенным весом),
        //  то нужно умножать количество единиц на вес в граммах. Например, если в рецепте указано,
        //  что нужно добавить 5 бананов по 80 грамм, то нужно количество бананов (5) умножить на вес одного (80 грамм),
        //  а не считать самим общую сумму граммов.

        short weightOf1banana = 80;
        short weightOf100mlMilk = 105;
        short iceCream = 200;
        short oneEgg = 70;
        int weightOf5babanas = weightOf1banana * 5;
        int weightOf200mlMilk = weightOf100mlMilk * 2;
        int eggs4 = oneEgg * 4;
        float totalWeightInGram = weightOf5babanas + weightOf200mlMilk + iceCream + eggs4;
        System.out.println(totalWeightInGram + "  грамм");
        float in1kg = 1000f;
        float totalWeightInKg = totalWeightInGram / in1kg;
        System.out.println(totalWeightInKg + "  кг");
    }

    public static void task7() {

        System.out.println("Задача 7");


        //Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории, нужно сбросить 7 кг.
        // Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
        //Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм,
        // а сколько — если каждый день будет худеть на 500 грамм.
        //Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
        //Результаты всех подсчетов выведите в консоль.

        short aim = 7;
        int aimInKg = aim * 1000;
        int firstOption = 250;
        int secondOption = 500;
        int daysWithFirstOption = aimInKg / firstOption;
        int daysWithSecondOption = aimInKg / secondOption;
        System.out.println("Если будет терять 250 гр за день, то  скинет за " + daysWithFirstOption + "  дней");
        System.out.println("Если будет терять 500 гр за день, то  скинет за " + daysWithSecondOption + "  дней");
    }

    public static void task8() {

        System.out.println("Задача 8");


        //Представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников.
        // В компании есть правило: чем дольше сотрудник работает в компании, тем ценнее он для бизнеса.
        // Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год.
        // Каждый год повышение составляет 10% от текущей зарплаты.
        //К вам пришел руководитель с задачей автоматизировать повышение зарплаты,
        // а также провести расчет для следующих сотрудников:
        //Маша получает 67 760 рублей в месяц.
        //Денис получает 83 690 рублей в месяц.
        //Кристина получает 76 230 рублей в месяц.
        //Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель
        // попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
        //Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
        //Выведите в консоль информацию по каждому сотруднику.
        // Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».

        double mashaGetsSalaryPerMonth = 67_760;
        double denisGetsSalaryPerMonth = 83_690;
        double kristinaGetsSalaryPerMonth = 76_230;
        double increasedToAll = 10;
        double mashaSalaryIncreasedBy10 = (mashaGetsSalaryPerMonth * increasedToAll / 100) + mashaGetsSalaryPerMonth;
        double denisSalaryIncreasedBy10 = (denisGetsSalaryPerMonth * increasedToAll / 100) + denisGetsSalaryPerMonth;
        double kristinaSalaryIncreasedBy10 = (kristinaGetsSalaryPerMonth * increasedToAll / 100) + kristinaGetsSalaryPerMonth;
        double totalAnnualCurrentSalaryForAll = (mashaGetsSalaryPerMonth + denisGetsSalaryPerMonth + kristinaGetsSalaryPerMonth) * 12;
        double totalAnnualSalaryAfterIncreasing = (mashaSalaryIncreasedBy10 + denisSalaryIncreasedBy10 + kristinaSalaryIncreasedBy10) * 12;
        double differenceOfAnnualSalaries = totalAnnualSalaryAfterIncreasing - totalAnnualCurrentSalaryForAll;
        double annualDifferenceInMashaSalary = (mashaSalaryIncreasedBy10 * 12) - (mashaGetsSalaryPerMonth * 12);
        double annualDifferenceInDenisSalary = (denisSalaryIncreasedBy10 * 12) - (denisGetsSalaryPerMonth * 12);
        double annualDifferenceInKristinaSalary = (kristinaSalaryIncreasedBy10 * 12) - (kristinaGetsSalaryPerMonth * 12);

        System.out.println("Маша теперь получает  " + mashaSalaryIncreasedBy10 + "  рублей. Годовой доход вырос на  " + annualDifferenceInMashaSalary + "  рублей.");
        System.out.println("Денис теперь получает  " + denisSalaryIncreasedBy10 + "  рублей. Годовой доход вырос на  " + annualDifferenceInDenisSalary + "  рублей.");
        System.out.println("Кристина теперь получает  " + kristinaSalaryIncreasedBy10 + "  рублей. Годовой доход вырос на  " + annualDifferenceInKristinaSalary + "  рублей.");


    }
}