package semana1.streams;

import java.util.List;

public class ActiveUsers {

    public boolean getActive(List<String> user){
        return user.get(3).equals("active");
    }

    public String getName(List<String> user){
        return user.get(1);
    }

    public static void main(String[] args) {
        List<List<String>> users = List.of(
                List.of("u1" , "mari", "20", "active"),
                List.of("u1" , "mono", "6", "inactive"),
                List.of("u2" , "shawn mendes", "27", "active"),
                List.of("u1" , "james", "20", "inactive"),
                List.of("u3" , "joji", "32", "active"),
                List.of("u1" , "messi", "38", "inactive"),
                List.of("u4" , "the weekend", "35", "active")
        );
        ActiveUsers activeUsers = new ActiveUsers();
        List<String> names = users.stream()
                .filter(user -> activeUsers.getActive(user))
                        .map(user -> activeUsers.getName(user).toUpperCase())
                        .sorted().toList();

        System.out.println(names);
    }
}
