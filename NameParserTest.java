package main.java;

public class NameParserTest {

    public static void main(String[] args) {

        String[] names = {"John Doe", "Bill Mask", "Nigua Joshua"};



        //John, Bill, Nigua

        System.out.println(new NameParser().parse(names));

    }

}
class NameParser {

    public String parse(String[] names) {

        String result = "";

        String result2 = ", ";

        StringBuilder result1 = new StringBuilder();

        for(int i = 0; i < names.length; i++) {

            String firstName = names[i].split(" ")[0];

            result1.append(firstName);

            if (i != names.length - 1) {

                result1.append(result2);}
        }

        return result = String.valueOf(result1);

    }

}
