package mid1.lang.math.test;

public class LottoMain {

    public static void main(String[] args) {
        int[] generator = new Lotto().generator();
        System.out.print("로또 번호 : ");
        for (int lottoNumber : generator) {
            System.out.print(lottoNumber + " ");
        }
    }

}
