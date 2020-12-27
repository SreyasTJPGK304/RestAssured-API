package Utils;

public class utils {
    public static String URL(){
        String URL = "https://reqres.in";
        return URL;
    }
    public static String postdetails(String name, String job) {
        String details =
                 "name :"  + name + ",\n"
                + "job :" + job + "\n"

                ;
        return details;

    }


}
