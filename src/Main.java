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
        var a = 4;
        System.out.println(dog + a);
        System.out.println(cat + a);
        System.out.println(paper + a);
        // Task3
        var b = 3.5;
        System.out.println(dog - b);
        var c = 1.6;
        System.out.println(cat - c);
        var d = 7639;
        System.out.println(paper - d);
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
        System.out.println(remainder + "остаток от деления");
        // Task 8.1
        var workTime = 640;
        var oneWorkerTime = 8;
        var quantityWorkers = workTime / oneWorkerTime;
        System.out.println("Всего работников в компании — " + quantityWorkers + " человек");
        // Task 8.2
        quantityWorkers = quantityWorkers + 94;
        oneWorkerTime = workTime / quantityWorkers;
        System.out.println("Если в компании работает " + quantityWorkers + " человек, то всего " + oneWorkerTime + " часов работы может быть поделено между сотрудниками».");
    }
}