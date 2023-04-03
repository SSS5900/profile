public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.surname = "Николаевич";
        post.patronymic = "Сидоров";
        post.passport = "62 07 № 123456";
        post.phone = "+7 921987654";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 2;
        post.birthday.year = 1981;

    }

}
