public class Main {
    public static void main(String[] args) {
        // Task1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Task2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Task3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Task 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);
        // Task 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog*10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        // Task 6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var sum = boxer1 + boxer2;
        System.out.println(sum + "кг. общая масса двух бойцов");
        var diff = boxer2 - boxer1;
        System.out.println(diff + "кг. разница между массами бойцов");
        // Task 7
        var remainder = boxer2 % boxer1;
        System.out.println(remainder + " остаток от деления");
        // Task 8.1
        var workTime = 640;
        var oneWorkerTime = 8;
        var quantityWorkers = workTime / oneWorkerTime;
        System.out.println("Всего работников в компании — " + quantityWorkers + " человек");
        // Task 8.2
        quantityWorkers = quantityWorkers + 94;
        workTime = quantityWorkers * oneWorkerTime;
        System.out.println("Если в компании работает " + quantityWorkers + " человек, то всего " + workTime + " часов работы может быть поделено между сотрудниками».");
    }
}