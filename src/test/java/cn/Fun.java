package cn;


import org.springframework.util.StringUtils;

public class Fun {
    public static void main(String[] args) {
        String s = "";
        if (StringUtils.isEmpty(s)) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }
    }
}