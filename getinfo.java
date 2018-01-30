package lpoinfo;

import javax.sound.midi.SysexMessage;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class getinfo {
    ArrayList<Double> windspeeds = new ArrayList<Double>();
    ArrayList<Double> airtemps = new ArrayList<Double>();
    ArrayList<Double> baropressures = new ArrayList<Double>();
    /*
    lets see if we can extract some stuff here
     */
    public static void main(String[] args) {

    }
    public void getWindSpeed(String target) throws FileNotFoundException{
        int q =1;
        ArrayList<String > filelines = new ArrayList<String>();
        File inputefile = new File(target);
        Scanner input = new Scanner(inputefile);
        while (input.hasNext()){
            filelines.add((input.next()));
        }
        while (filelines.size() > 0){
            try{
                String z = filelines.get((17 + (9*(q-1))));
                windspeeds.add(Double.valueOf(z));
                q++;
            }
            catch (IndexOutOfBoundsException e){
                break;
            }
        }
        avgWindSpeed(windspeeds);
    }
    public void avgWindSpeed(ArrayList<Double> windspeeds){
        double sum = 0;
        for (Double stuff : windspeeds) {
            sum += stuff;

        }
        double s = (sum/windspeeds.size());
        String f =String.format("%.2f", s);

        System.out.println("The average wind speed for this year is: "+f+" miles per hour.");
    }
   // public List medianWindSpeed(ArrayList<String> windspeeds2){
     //   Collections.sort(windspeeds2);   FIX ME LATER PLEASE
       // double sum = 0;

    //}
    public void getAirTemp(String target) throws FileNotFoundException {
        int n = 2;
        List<String> filelines = new ArrayList<String>();
        File inputfile = new File(target);
        Scanner input = new Scanner(inputfile);
        while (input.hasNextLine()) {
            filelines.add(input.next());
        }
        while (filelines.size() > 0) {
            try {
                airtemps.add(Double.valueOf(filelines.get((11 * n) - (n + (n - 2))))); //algorithm found
                n++;
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }
        avgAirTemps(airtemps);
        System.out.println("The median is: "+median(airtemps)+ " degrees F.");
    }
    public static double median(ArrayList<Double> a){
        Collections.sort(a);
        if (a.size() /2 * 2 == a.size()){
            return (a.get(a.size()/2)+ a.get(a.size() / 2-1))/2;
        } else{
            return a.get(a.size()/2);
        }
    }
    public void avgAirTemps(ArrayList<Double> airtemps){
        this.airtemps = airtemps;
        double sum = 0;
        for (Double stuff : airtemps) {
            sum += stuff;
        }
        double s = (sum/airtemps.size());
        String f = String.format("%.2f", s);
        System.out.println(" The average air temperature for this year was: "+f+" degrees F.");
    }
    public void getBarometricPressure(String target) throws FileNotFoundException {
        ArrayList<String> filelines = new ArrayList<String>();
        File inputfile = new File(target);
        Scanner input = new Scanner(inputfile);
        int n =1;
        while(input.hasNext()){
                filelines.add((input.next()));
        }
        while (filelines.size() > 0){
            try{
               baropressures.add(Double.valueOf(filelines.get(((12*n)-3*(n-1)))));
                n++;
            }
            catch (IndexOutOfBoundsException e){
                break;
            }
        }
        avgBaroPressure(baropressures);

    }

    public void avgBaroPressure(ArrayList<Double> baropressures){
        this.baropressures = baropressures;
        double sum = 0;
        for (Double stuff : baropressures) {
            sum += stuff;
        }
        double s = (sum/baropressures.size());
        String f = String.format("%.2f",s);
        System.out.println("The average barometric pressure this year was: "+f+" in mm Hg (mercury).");
    }

            /**
             * below is how we access all data in date column
             * Note the exception catch
             */


                //System.out.println(filelines.get(0));
                //System.out.println(filelines.get((i * j)));//Running this in lpoinfo.java shows format of how data is presented
                //System.out.println(filelines.size());
                //need to figure out how to isolate data
                // we are interested in data from [9] to final index [-1] 0-8 are the labels
                //date indices will ALWAYS be a multiple of 9

    }
