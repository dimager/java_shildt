/**
 * Created with IntelliJ IDEA.
 * User: Mager Dmitry
 * Date: 12.07.13
 * Time: 18:17
 * To change this template use File | Settings | File Templates.
 */
class IfElse {
    public static void main(String args[]) {
        int month = 14; // April
        String season;

        if(month == 12 || month == 1 || month == 2)
            season = "Winter";
        else if(month == 3 || month == 4 || month == 5)
            season = "Spring";
        else if(month == 6 || month == 7 || month == 8)
            season = "Summer";
        else if(month == 9 || month == 10 || month == 11)
            season = "Autumn";
        else
            season = "Bogus Month";

        System.out.println("April is in the " + season + ".");
    }
}

