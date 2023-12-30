public class Application {
    double height;
    int age;
    String name;

    public static void main (String[] args){
        Application application = new Application ("Adam", 25, 178.5);
        application.checkUserApplication();

            Application applicationdwa = new Application ("Karolina", 45, 178.5);
            applicationdwa.checkUserApplication();

    }

    public Application (String name, int age, double height) {
        this.height = height;
        this.age = age;
        this.name = name;
    }

    public void checkUserApplication() {
        if (this.name != null) {
            if (this.age > 30 && this.height > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }

    }
}