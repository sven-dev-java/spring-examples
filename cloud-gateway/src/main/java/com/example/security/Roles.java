package com.example.security;

import java.util.ArrayList;
import java.util.List;

public class Roles {
    public static final String USER = "USER";
    public static final String ADMIN = "ADMIN";
    public static final String TESTER = "TESTER";
    public static final String KUNDE = "KUNDE";

    private Roles(){

    }

    public static String[] getAllRoles(){
        List<String> allRoles = new ArrayList<>();
        allRoles.add(USER);
        allRoles.add(ADMIN);
        allRoles.add(TESTER);
        allRoles.add(KUNDE);
        return allRoles.toArray(new String[0]);
    }
}
