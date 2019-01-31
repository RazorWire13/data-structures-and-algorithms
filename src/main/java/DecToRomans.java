public class DecToRomans {

    public static void main(String args[]) {

        System.out.println(makeRoman(3954));
    }

    public static String makeRoman (int num) {

        String[] romNums = {"I","IV","V","IX","X","XL","L","XC","C","DC","D","CM","M"};
        int[] decNums = {1,4,5,9,10,40,50,90,100,400,500,900,1000};

        StringBuilder result = new StringBuilder();

        for (int i = (decNums.length - 1); i >= 0; i--) {
            while (num >= decNums[i]) {
                result.append(romNums[i]);
                num -= decNums[i];
            }
        }
        return result.toString();
    }
}
