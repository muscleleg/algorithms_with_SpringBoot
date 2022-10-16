package study.algorithms.programers.개념테스트;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class equals {
    @Test
    void 주소테스트() {
////        int a =3;
////        int b = 3;
//        int c = 3;
//        String[] nonNested = new String[3];
//        nonNested.equals(nonNested);
//        String[][] nested = new String[2][3];
//        nested.equals(nested);
        int[] a= {1,2};
        int[] b = {1,2};
        String[][] a2 = {{"1","2"},{"3","4"}};
        String[][] b2 = {{"1","2"},{"3","4"}};
        System.out.println("int[] equal테스트:"+a.equals(b));
        System.out.println(a2.equals(b2));
        System.out.println("Arrays.equals(a, b) = " + Arrays.equals(a, b));
        System.out.println("Arrays.equals(a2,b2) = " + Arrays.equals(a2, b2));
        System.out.println("Arrays.deepEquals(a2, b2) = " + Arrays.deepEquals(a2, b2));

//        String d = new String("abc");
//        Object f;
//        Integer k;
////        k.equals()
////        f.equals()
////        a.equals(b);
////        String[][] a1;
////        String[][] a2;
////        Arrays.deepEquals(a1, a2);
//        System.out.println(System.identityHashCode(a));
//        System.out.println(System.identityHashCode(b));
//        System.out.println(System.identityHashCode(c));
//        System.out.println(System.identityHashCode(d));

    }
}
