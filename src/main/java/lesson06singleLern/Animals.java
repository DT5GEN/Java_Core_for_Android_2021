package lesson06singleLern;


    class Animal {



        void voice() {
            System.out.println("Животное издало какой-то звук");

        }
//
//         boolean void run(int distance ) {
//            System.out.println("Животное издало какой-то звук");
//        }
//
//         boolean void swim(int distance) {
//            System.out.println("Животное издало какой-то звук");
//        }

        String name;

        public Animal() {



        }

        public Animal(String name) {
            this.name = name;


        }

        public void animalInfo() {
            System.out.println("Животное: " + name);
        }

        public void jump() {
            System.out.println("Животное подпрыгнуло");
        }
    }



    class AnimalsApp {
        public static void main(String[] args) {
            Animal animal = new Animal();
            Cats cat = new Cats("Пушок", "черный" ,0);
            Dog dog = new Dog();
            animal.voice();
            cat.voice();
            dog.voice();
            cat.catInfo();
        }
    }

// Результат:
// Животное: Дружок
// Животное: Барсик
// Кот имя: Барсик цвет: Белый


