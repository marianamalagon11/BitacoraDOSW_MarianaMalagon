package edu.dosw.bitacora.bitacora_DOSW.semana1.streams;

import java.util.List;

public class AdultsName {

    public boolean isAdult(List<String> user){
        String ageS = user.get(2);
        Integer age = Integer.parseInt(ageS);
        return age >= 18;
    }
    public String getName(List<String> user){
        return user.get(1);
    }

    public static void main(String[] args) {
        List<List<String>>users = List.of(
                List.of("u1" , "mari", "20", "active"),
                List.of("u1" , "mono", "6", "inactive"),
                List.of("u2" , "shawn mendes", "27", "active"),
                List.of("u1" , "james", "20", "inactive"),
                List.of("u3" , "joji", "32", "active"),
                List.of("u1" , "messi", "38", "inactive"),
                List.of("u4" , "the weekend", "35", "active")
        );
        AdultsName adultsName = new AdultsName();
        List<String> names = users.stream()
                .filter(user -> adultsName.isAdult(user))
                .map(user -> adultsName.getName((user)))
                .toList();
        System.out.println(names);
    }
}