/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplikasiMenuLogin;

/**
 *
 * @author equinox
 */
public class Session {
    private static String username, nama, statusLogin;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Session.username = username;
        username = null;
    }

    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        Session.nama = nama;
        nama = null;
    }

    public static String getStatusLogin() {
        return statusLogin;
    }

    public static void setStatusLogin(String username, String password) {
        if (username.equals("admin") && password.equals("pass")) {
            statusLogin = "aktif";
            setUsername(username);
            setNama("Lingga");
        }
    }
    
    public static void cekStatusLogin() {
        if (Session.getStatusLogin() != "aktif") {
            System.exit(0);
        }
    }
    
    public static void pembatas() {
        System.out.println("===========================================");
    }
    
    public static void Logout() {
        username = null;
        nama = null;
        statusLogin = null;
        System.out.println("Anda berhasil Logout");
        System.exit(0);
    }
}
