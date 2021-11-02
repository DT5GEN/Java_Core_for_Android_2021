package HomeWork051;

public class Main {
    public static void main(String[] args) {

        Sotrudnik sotrudnik0 = new Sotrudnik("Владимир Владимирович Мутин         ", "пастух          ", "8 800 200 23 16", "inbox@box.io", 1500000000, 69);
        Sotrudnik sotrudnik1 = new Sotrudnik("Дмитрий Анатольевич Всеговамхорошего", "пастух-пенсионер", "8 (800) 700-89-66", "inbox@box.io", 670000000, 56);
        Sotrudnik sotrudnik2 = new Sotrudnik("Герман Греф                         ", "казначей        ", "8 (800) 707-00-70", "inbox@box.io", 780000000, 57);
        Sotrudnik sotrudnik3 = new Sotrudnik("Эльвира Наибуллина                  ", "главбух         ", "8 800 300-30-00", "inbox@box.io", 45000000, 58);
        Sotrudnik sotrudnik4 = new Sotrudnik("Сергей Шойгу                        ", "сторож          ", "8 (495) 696-71-32", "inbox@box.io", 16000000, 66);
        Sotrudnik sotrudnik5 = new Sotrudnik("Дмитрий Олегович Рогозин            ", "астроном        ", "8 (800) 200-84-42", "inbox@box.io", 83000000, 57);


//        Sotrudnik[] pastuh = new Sotrudnik[6];
//        pastuh[0] = new Sotrudnik("Владимир Владимирович Мутин", "пастух", "8 800 200 23 16", "inbox@box.io", 1500000000, 69);
//        pastuh[1] = new Sotrudnik("Дмитрий Анатольевич Всеговамхорошего", "пастух-пенсионер", "8 (800) 700-89-66", "inbox@box.io", 670000000, 56);
//        pastuh[2] = new Sotrudnik("Герман Греф", "казначей", "+7 800 707-00-70", "inbox@box.io", 780000000, 57);
//        pastuh[3] = new Sotrudnik("Эльвира Наибуллина", "главбух", "8 800 300-30-00", "inbox@box.io", 45000000, 58);
//        pastuh[4] = new Sotrudnik("Сергей Шойгу            ", "сторож", "8 (495) 696-71-32", "inbox@box.io", 16000000, 66);
//        pastuh[5] = new Sotrudnik("Дмитрий Олегович Рогозин", "астроном", "8 (800) 200-84-42", "inbox@box.io", 83000000, 57);

        //   sotrudnik1.printInfo();

        System.out.print("\t Игрок \t \t                        \t должность \t           email     \t     телефон \t      зарплата \t возраст \t  \n");

        Sotrudnik[] pastuhs = {sotrudnik0, sotrudnik1, sotrudnik2, sotrudnik3, sotrudnik4, sotrudnik5};
        for(Sotrudnik sotrudnik :pastuhs)

        {
            sotrudnik.printInfo();
        }

    }

}