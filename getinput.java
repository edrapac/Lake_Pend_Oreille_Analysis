package lpoinfo;

import java.io.IOException;

public class getinput extends lpoinfo {
    private static final String TARGETFILE1 = "C:\\Path_to_Data\\Environmental_Data_Deep_Moor_2012.txt";
    private static final String TARGETFILE2 = "C:\\Path_to_Data\\Environmental_Data_Deep_Moor_2013.txt";
    private static final String TARGETFILE3 = "C:\\Path_to_Data\\Environmental_Data_Deep_Moor_2014.txt";
    private static final String TARGETFILE4 = "C:\\Path_to_Data\\Environmental_Data_Deep_Moor_2015.txt";
    public static void main(String[] args) {

    }
    public static void input(String choice) {
        try{
            if (choice.equalsIgnoreCase("2012")) {
                getinfo t1 = new getinfo();
                t1.getAirTemp(TARGETFILE1);
                t1.getWindSpeed(TARGETFILE1);
                t1.getBarometricPressure(TARGETFILE1);
            }
            else if (choice.equalsIgnoreCase("2013")){
                getinfo t1 = new getinfo();
                t1.getAirTemp(TARGETFILE2);
                t1.getWindSpeed(TARGETFILE2);
                t1.getBarometricPressure(TARGETFILE2);
            }
            else if (choice.equalsIgnoreCase("2014")){
                getinfo t1 = new getinfo();
                t1.getAirTemp(TARGETFILE3);
                t1.getWindSpeed(TARGETFILE3);
                t1.getBarometricPressure(TARGETFILE3);
            }
            else if (choice.equalsIgnoreCase("2015")){
                getinfo t1 = new getinfo();
                t1.getAirTemp(TARGETFILE4);
                t1.getWindSpeed(TARGETFILE4);
                t1.getBarometricPressure(TARGETFILE4);
            }
            else{
                System.out.println("Please choose a valid year from 2012-2015 and run the program again");
            }

        }
        catch (Exception e){
            System.out.println("Please try again with valid input" + e);
        }
    }
}
