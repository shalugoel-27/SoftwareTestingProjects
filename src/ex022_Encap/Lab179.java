package ex022_Encap;

public class Lab179 {
    public static void main(String[] args) {
        VWOLogin vwologin =new VWOLogin("123","admin");
        System.out.println(vwologin.password);
        vwologin.password = "345";
        System.out.println(vwologin.password);

GoodVWOLogin goodvwologin =new GoodVWOLogin("admin","pass123");
        //System.out.println(goodvwologin.password); //u cannot access pwd now this is 1st layer of encap bcoz private keyword is used
        System.out.println(goodvwologin.getUsername());
        System.out.println(goodvwologin.getPassword());
        goodvwologin.setUsername("pramod");
        System.out.println(goodvwologin.getUsername());
        //we have changed the username by getter setter but with a control that we cannot change the pwd bcoz we have commented the set pwd option
        // but admin can cahnge the pwd so it should be there so we add some validation in set pwd

       // goodvwologin.setPassword("abcd@34!#",false); // u cannot set bcoz not a admin
        goodvwologin.setPassword("abcd@34!#",true);
        System.out.println(goodvwologin.getPassword()); //new pwd is set
    }

}
class VWOLogin{
    public String username;
    public String password;
    //bcoz this is public in nature anyone can access it and change ur passwords so make it private

    public VWOLogin(String password, String username) {
        this.password = password;
        this.username = username;
    }
}

class GoodVWOLogin {
    private String username;
    private String password;
    //locally available not outside

    public GoodVWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

   public void setPassword(String password, boolean isAdmin) {
       if (isAdmin) {

           this.password = password;
       } else {
           System.out.println("Not allowed- not a admin");
       }
   }

        //if u want that no one can change ur pwd then comment the set pwd thing
    }






