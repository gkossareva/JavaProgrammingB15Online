package OCA;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {


    }

    public boolean cigarParty(int cigars, boolean isWeekend) {

        if (cigars >= 40 && cigars <= 60 || isWeekend == true) {
            return true;
        } else if (cigars < 40 && cigars > 60 && isWeekend == false) {

        }
        return false;
    }}