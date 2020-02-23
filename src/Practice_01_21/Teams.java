package Practice_01_21;

public class Teams {
    public static void main(String[] args) {
        //create objects
        BOATeams teams1 =new BOATeams();
        teams1.teamName="Eagles";
        teams1.teamSize=9;
teams1.companyName="Bank of America";

        BOATeams teams2 =new BOATeams();
        teams2.teamName="BugBusters";
        teams2.teamSize=12;
        teams2.companyName="Bank of America";


        ScrumTeam team3= new ScrumTeam();
        team3.StanUp();//ScrumTeam class
        team3.teamSize=10;//BOATeams
        team3.companyName="Bank of America";

        ScrumTeam team4= new ScrumTeam();
        ScrumTeam team5= new ScrumTeam();
        ScrumTeam team6= new ScrumTeam();
        System.out.println(team6.teamSize);//0
        System.out.println(team3.teamSize);//10
        System.out.println("team 1 is "+teams1.companyName);//BoA
        System.out.println("team 6 is "+team6.companyName);


    }
}
