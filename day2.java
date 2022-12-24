public class day2 {
    public String intToRoman(int num) {
        int [] numbers = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String [] letters = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        StringBuilder roman = new StringBuilder();
        int n = numbers.length;
        
        for(int i = 0; i < n; i++) {
            while(num >= numbers[i]) {
                roman.append(letters[i]);
                num = num - numbers[i];
            }
        }
        return roman.toString();
    }
}
