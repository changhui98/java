package mid1.lang.string.builder;

public class StringBuilderMain1_2 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        String string = sb.append("a").append("b").append("c").append("d")
            .insert(4, "java")
            .delete(4, 8)
            .reverse()
            .toString();

        System.out.println("string : " + string);
    }

}
