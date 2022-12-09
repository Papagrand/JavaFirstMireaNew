package ru.mirea.task24;

    class Client  {
        public void Sit(Chair chair){
            System.out.println("Клиент сел на " + chair.getName());
        }
    }

    public class Task24 {
        public static void main(String[] args) {
            ChairFactory chairFactory = new ChairFactory();
            Chair chair = chairFactory.createChair(Chairs.MULTIFUINCTIONAL_CHAIR);
            Client client = new Client();
            client.Sit(chair);
        }
    }
