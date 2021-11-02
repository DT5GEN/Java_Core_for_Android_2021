package HomeWork051;


public class Sotrudnik {

    public String name;
    public String level;
    public String phone;
    public String mail;

    public int zarplata;
    public int age;


    public Sotrudnik(String name, String level, String phone, String mail, int zarplata, int age) {
        this.name = name;
        this.level = level;
        this.phone = phone;
        this.mail = mail;
        this.zarplata = zarplata;
        this.age = age;
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getZarplata() {
        return zarplata;
    }

    public void setZarplata(int zarplata) {
        this.zarplata = zarplata;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo() {
        // System.out.print("\t Игрок \t \t                        \t должность \t email     \t        телефон \t      зарплата \t возраст \t  \n");
        System.out.printf("\t %s \t %s \t %s \t %s \t %d \t %d \t  \n", name, level, mail, phone, zarplata, age);

    }



    void pastuhInfo() {
        System.out.printf("У игрока %s (%d lvl) %d очков и накоплено %d монет \n",name,level,phone,zarplata);

        //   System.out.println(this);
    }



}


