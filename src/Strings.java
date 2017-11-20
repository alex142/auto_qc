public class Strings {
    private static void getByInd(String str){
        char ind1 = str.charAt(0);
        char ind2 = str.charAt(1);
        char ind3 = str.charAt(9);
        System.out.println("Testing charAt: " + ind1 + " " + ind2 + " " + ind3);
    }

    private static void getByEnding(String str){
        boolean ind1 = str.endsWith("World!");
        boolean ind2 = str.endsWith("ex");
        boolean ind3 = str.endsWith("ex".toUpperCase());
        boolean ind4 = str.endsWith("DEX".toLowerCase());
        boolean ind5 = str.endsWith(" INDEX");
        System.out.println("Testing endsWith + toSomeCase: " + ind1 + " " + ind2 + " " + ind3 + " " + ind4 + " " + ind5);
    }

    private static void checkEquals(String str){
        String st1 = new String("Get");
        String st2 = new String("get by index");
        String st3 = new String("GET BY INDEX");
        boolean ind1 = str.equals(st1);
        boolean ind2 = str.equals(st2);
        boolean ind3 = str.equals(st3);
        System.out.println("Testing equals: " + ind1 + " " + ind2 + " " + ind3);
    }

    private static void checkEqualsIgnore(String str){
        String st1 = new String("GeT bY iNdEx");
        String st2 = new String("get by index");
        String st3 = new String("GET BY INDEX");
        boolean ind1 = str.equalsIgnoreCase(st1);
        boolean ind2 = str.equalsIgnoreCase(st2);
        boolean ind3 = str.equalsIgnoreCase(st3);
        System.out.println("Testing equalsIgnoreCase: " + ind1 + " " + ind2 + " " + ind3);
    }

    private static void checkTrim(String str){
        String ind1 = str.trim();
        System.out.println("Testing trim and length: " + ind1 + " length after: " + ind1.length() +" ; "
                + "length before: " + str.length());
    }

    private static void checkReplace(String str){
        String ind1 = str.replace("IND", "END");
        String ind2 = str.replace("iND", "END");
        System.out.println("Testing replace: input: " + str + "; output 1: " + ind1 +";\n"
                + " output 2: " + ind2);
    }

    private static void checkSplit(String str){
        String[] ind1 = str.split(",");
        String[] ind2 = str.split(" ");
        System.out.println("Testing split: input: " + str + "; output 1: " + ind1[2]
                + " " + ind1[1] + " " + ind1[0] +";\n"
                + " output 2: " + ind2[1] + " " + ind2[0] + " "+ ind2[2] + ";");
    }

    private static void getByStart(String str){
        boolean ind1 = str.startsWith("World!");
        boolean ind2 = str.startsWith("get");
        boolean ind3 = str.startsWith("get".toUpperCase());
        boolean ind4 = str.startsWith("GET".toLowerCase());
        boolean ind5 = str.startsWith("GET ");
        System.out.println("Testing startsWith + toSomeCase: " + ind1 + " " + ind2 + " " + ind3 + " " + ind4 + " " + ind5);
    }

    private static void getSubstr(String str){
        String ind1 = str.substring(4);
        String ind2 = str.substring(4,6);
        System.out.println("Testing startsWith + toSomeCase: substr 1: " + ind1 + "; substr 2: " + ind2 + ";");
    }

    public static void main(String[] args){
        getByInd("GET BY INDEX");
        getByEnding("GET BY INDEX");
        checkEquals("GET BY INDEX");
        checkEqualsIgnore("GET BY INDEX");
        checkTrim(" GET BY INDEX  ");
        checkReplace("GET BY INDEX");
        checkSplit("GET, BY, INDEX");
        getByStart("GET BY INDEX");
        getSubstr("GET BY INDEX");
    }

}
