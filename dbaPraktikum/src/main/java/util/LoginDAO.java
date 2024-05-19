/*
 * SoSe 2024
 * Logik in Kürze durch DB-Operation ersetzen
 */
package util;


public class LoginDAO {
    public static boolean login(String user, String password) {
	boolean loggedIn = false;
        if(user.equals("nobody" ) && password.equals("1234"))
                loggedIn = true;
        return loggedIn;
    }
}
