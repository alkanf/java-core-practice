package strings;

public class RemoveSpaces {
    public String removeSpaces(String text) {
String withoutSpaces = "";
        for(int i=0;i<text.length();i++) {
    if(text.charAt(i) != ' ')
        withoutSpaces = withoutSpaces + text.charAt(i);
}
return withoutSpaces;
    }

    public static void main(String[] args) {
        RemoveSpaces obj = new RemoveSpaces();
        System.out.println(obj.removeSpaces("ana kelime"));
    }
}
