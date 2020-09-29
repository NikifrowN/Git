public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;
        System.out.println(container.count);

        System.out.println(sumDigits(12345));
    }

    public static Integer sumDigits(Integer number)
    {
        int sum = 0;
        String numberString = number.toString();
        int numberLength = numberString.length();
        for(int i = 0; i < numberLength; i++) {
            sum += Integer.parseInt(String.valueOf(numberString.charAt(i)));
        }
        return sum;
    }
}
