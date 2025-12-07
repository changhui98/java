package pack;

import pack.a.User;

public class PackageMain3 {

    public static void main(String[] args) {

        /*
        자주 사용하는 객체를 import 한다.
        자주 사용하지 않는 객체는 풀 네임.
        같은 클래스명이 있을 때 import는 둘 중 하나만 선택할 수 있음.
         */
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }

}
