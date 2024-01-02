public class UserData {
    private double height;
    private int age;
    private String name;

    public static void main(String[] args) {
        UserData user = new UserData("Adam", 25, 178.5);
        user.checkUserApplication();

        UserData user1 = new UserData("Karolina", 45, 178.5);
        user1.checkUserApplication();

    }

    public UserData(String name, int age, double height) {
        this.height = height;
        this.age = age;
        this.name = name;
    }

    public void checkUserApplication() {
        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }

    }
}