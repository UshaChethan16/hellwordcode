public class sample {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        user us=new user();
        us.age= 25;
        us.name= "usha";
        us.gender="female";

        System.out.println(us.age + ":"+us.name +":" +us.gender);
    }
}