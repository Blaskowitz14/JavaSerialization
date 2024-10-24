package org.blaskowitz;

import java.util.Arrays;

public class Main {
    private final static String USER_PATH = "src/main/resources/user.sr";
    private final static String USERS_PATH = "src/main/resources/users.sr";

    public static void main(String[] args) {

        UserModel user1 = new UserModel("blaskowitz", "123456");

        UserModel[] users = new UserModel[] {
                new UserModel("kenpxrk", "qwerty"),
                new UserModel("iswkk", "kkkkkkk"),
                new UserModel("marginal", "vd")
        };

        SerializationUtil.serialize(user1, USER_PATH);
        SerializationUtil.serialize(users, USERS_PATH);

        System.out.println(SerializationUtil.deserialize(USER_PATH).toString() + "\n");
        UserModel[] usersDeserialized = SerializationUtil.deserialize(USERS_PATH);
        Arrays.stream(usersDeserialized).forEach(System.out::println);
    }
}