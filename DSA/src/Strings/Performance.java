package Strings;

public class Performance {
    public static void main(String[] args) {
        String series = "";

        for (int i = 0;i<26;i++){
            char ch = (char)('a'+i);
            series = series+ ch;
        }
        System.out.println(series);

        // Since strings are immutable a new "object" is being created after every iteration and the old object gets
        //de referenced ex. after first iteration Series = "a" but after 2nd its series = "ab", "a" is de referenced now

        // to resolve this we've got STRING BUILDER CLASS


    }
}
