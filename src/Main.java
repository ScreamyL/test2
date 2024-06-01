//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String slovo = "Hello";
        char[] charArray = slovo.toCharArray();

        for (int a = 0; a < charArray.length; a++)
        {
            for (int b = a + 1; b < charArray.length; b++)
            {
                if (charArray[a] == charArray[b])
                {
                    System.out.println("Повторяется " + charArray[b]);
                    return;
                }
            }
        }
        System.out.println("Ничего не повторяется");
    }
}