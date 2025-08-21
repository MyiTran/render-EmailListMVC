package murach.data.copy;

import murach.business.User;

public class UserDB {
    public static void insert(User user) {
        // giả sử lưu user vào database
        System.out.println("Saving user to database: " +
                user.getEmail() + " " +
                user.getFirstName() + " " +
                user.getLastName());
    }
}
