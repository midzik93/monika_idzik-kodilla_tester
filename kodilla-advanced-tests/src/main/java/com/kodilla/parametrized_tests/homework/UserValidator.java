package com.kodilla.parametrized_tests.homework;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserValidator {

    public boolean validateUsername(String username) {
        return username.matches("^[a-zA-Z0-9._-]{3,}$");
        // zwraca true jeśli przekazane username pasuje do wzorca
    }

    public boolean validateEmail(String email) {
        if (null != email) { // czy zmienna nie jest nullem
            String regex = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
            Pattern pattern = Pattern.compile(regex); // wyrażenie jest kompilowane do obiekt klasy Pattern
            Matcher matcher = pattern.matcher(email); // Tworzony jest obiekt Matcher, który będzie używany do dopasowania wyrażenia regularnego do podanego adresu e-mail.
            return matcher.matches(); // matches() na obiekcie Matcher sprawdza, czy adres e-mail pasuje do wzorca
        }
        return false;
    }
}
