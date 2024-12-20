public class Initials {
    public static void main(String[] args) {

        String[] names = {"James Bond", "Eve Rell", "Anna Johnson"};


        for (String name : names) {

            int spaceIndex = name.indexOf(" ");

            char firstInitial = name.charAt(0);
            char lastInitial = name.charAt(spaceIndex + 1);

            System.out.print(firstInitial + "" + lastInitial + " ");
        }
    }
}
