/*
OOPSBAnner App UC4 - OOPS Banner Display
 Using loops to display the string joins and printing.
@author Abhilaksh
@version 4.0

*/
public class OOPSBannerApp {
    public static void main(String[] args) {
        String arr[] = new String[7];
        arr[0]=(String.join("","    *****    ","    *****    "," ************"," **************"));
        arr[1]=(String.join("","  **     **  ","  **     **  "," **        **"," **            "));
        arr[2]=(String.join(""," **       ** "," **       ** "," **        **"," **            "));
        arr[3]=(String.join(""," **       ** "," **       ** "," ************"," **************"));
        arr[4]=(String.join(""," **       ** "," **       ** "," **          ","             **"));
        arr[5]=(String.join("","  **     **  ","  **     **  "," **          ","             **"));
        arr[6]=(String.join("","    *****    ","    *****    "," **          "," **************"));

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}