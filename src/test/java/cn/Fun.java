package cn;


import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Fun {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("NGCMTT01");
        list.add("NGCMTT02");
        list.add("NGCMTT03");
        list.add("NGCMTT04");
        System.out.println(list.toString());
        System.out.println();
        System.out.println(StringUtils.join(list.toArray(), ","));
    }
}