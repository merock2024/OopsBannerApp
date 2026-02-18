/*
OOPSBAnner App UC4 - OOPS Banner Display
 Using loops to display the string joins and printing.
@author Abhilaksh
@version 4.0

*/
public class OOPSBannerApp {
    public static void main(String[] args) {
        String names[]={"    *****        *****     ************ **************",
        "  **     **    **     **   **        ** **            ",
        " **       **  **       **  **        ** **            ",
        " **       **  **       **  ************ **************",
        " **       **  **       **  **                       **",
        "  **     **    **     **   **                       **",
        "    *****        *****     **           **************"};

        for(String name:names)
        {
            System.out.println(name);
        }
    }
}