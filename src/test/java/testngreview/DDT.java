package testngreview;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT {

    @DataProvider
   public Object[][] data(){
 Object[][]login={
            {"login@codility.com","password","Welcome to Codility"},
            {"unknown@codility.com","password","You shall not pass! Arr!"},
            {"unknowncodility.com","password","Enter a valid email"},
            {"","password","Email is required"},
            {"login@codility.com","","Password is required"}
        };
return login;
    }


    @Test
    public void visibili


}
