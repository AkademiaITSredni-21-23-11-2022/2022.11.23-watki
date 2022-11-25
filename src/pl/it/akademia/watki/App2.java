package pl.it.akademia.watki;

import org.apache.commons.codec.digest.DigestUtils;

public class App2 {
    public static void main(String[] args) {
        String s = "Mateusz";
        String hash = DigestUtils.md5Hex(s);
        System.out.println(hash);
    }
}
