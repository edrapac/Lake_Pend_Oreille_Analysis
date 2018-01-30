package lpoinfo;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class lpoinfo {
    private static final String TARGETFILE1 = "C:\\Path_to_Data\\Environmental_Data_Deep_Moor_2012.txt";
    private static final String TARGETFILE2 = "C:\\Path_to_Data\\Environmental_Data_Deep_Moor_2013.txt";
    private static final String TARGETFILE3 = "C:\\Path_to_Data\\LPO_weatherdata-master\\Environmental_Data_Deep_Moor_2014.txt";
    private static final String TARGETFILE4 = "C:\\Path_to_Data\\LPO_weatherdata-master\\Environmental_Data_Deep_Moor_2015.txt";
    /**
     *
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Please select a year 2012-2015");
        String choice = new String(in.next());
        getinput t1 = new getinput();
        t1.input(choice);
        }

    }


