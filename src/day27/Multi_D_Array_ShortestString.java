package day27;

public class Multi_D_Array_ShortestString {
    public static void main(String[] args) {

        String[]developersTeam ={"Vladislav","Hasan","Tolkun","Abide"};
        String [] testersTeam={"Zhibekchach","Mohammed Sohrabi","Nursultan"};
        String[] businesAnalystsTeam={"Lisa","Ershad","Naila"};
        String[][] scrumTeam={developersTeam,testersTeam,businesAnalystsTeam};

        //find the shortes string of text

        int minLength=scrumTeam[0][0].length();
        String shortestSring=scrumTeam[0][0];
        for (int i = 0; i <scrumTeam.length ; i++) {
            for (int j = 0; j < scrumTeam[i].length; j++) {
                if (minLength>scrumTeam[i][j].length()) {
                        minLength=scrumTeam[i][j].length();
                        shortestSring=scrumTeam[i][j];
                }
            }
        }
        System.out.println(minLength);
        System.out.println("shortestSring = " + shortestSring);
    }
}
