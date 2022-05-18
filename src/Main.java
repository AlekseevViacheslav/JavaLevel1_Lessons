public class Main {

    public static void main(String[] args) {

        int bonus = 5000;
        int salary = 15000; //выделение памяти и резе
        salary = salary + bonus; //+, -, *, / - целочисленное в int, %
        salary += bonus; // <=> salary = salary + bonus
        salary++; //salary += 1 <-> salary = salary + 1

        System.out.println(salary);

        int a = 10;
        int b = 3;
        System.out.println(a % b);

        double square = 45.5;

        char character = 98-1;
        System.out.println(character);

        String nameOfCat = "Ёська";
        nameOfCat += " крутой кот B)";
        System.out.println(nameOfCat + " зарплата в сосисках " + salary); //


        //=, (аргумент 1) == (аргумент 2)

        //10 < 15
        boolean isSunny = false; // false //истина - 1, ложь - 0 // ==, !=,  <=, >=, >, <, !
        boolean friendNearby = false;

        if (isSunny || friendNearby) {
            System.out.println("иду гулять");
            System.out.println("иду гулять");
            System.out.println("иду гулять");
            //......
        }
        else {
            System.out.println("жду дома");
        }

        printHello();

    }

    public static void printHello() { //Camel Case - английский - транслит // helloMyDearFriend
        System.out.println(" _..---...,\"\"-._ ,/}/)\n" +
                " .'' , ``..'(/-<\n" +
                " / _ { ) \\\n" +
                " ; _ `. `. < a(\n" +
                " ,' ( \\ ) `. \\ __.._ .: y\n" +
                " ( <\\_-) )'-.____...\\ `._ //-'\n" +
                " `. `-' /-._))) `-._)))\n" +
                " `...' ");

    }
}




