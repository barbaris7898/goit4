class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNumMultiplyOdd();
        FirTest firTest = new FirTest();

        //Should be 15
        System.out.println(firTest.test(firNum, 20));
    }
}

class FirNum {
    public int calc(int n) {
        return n;
    }
}

class FirNumSum extends FirNum {
    @Override
    public int calc(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
class FirNumFactorial extends FirNum {
    @Override
    public int calc(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
class FirNumMultiplyOdd extends FirNum {
    @Override
    public int calc(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            if (i%2 != 0) {
                result *= i;
            }
        }
        return result;
    }
}
class FirNumFizzBuzz extends FirNum {
    @Override
    public int calc(int n) {
        int result = 0;
        for(int i = 0; i <= n; i++) {
            if ((i%3 == 0 || i%5 == 0)&&!(i%3 == 0 && i%5 == 0)) {
                result += i;
            }
        }
        return result;
    }
}
