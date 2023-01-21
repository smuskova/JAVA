import javax.annotation.processing.SupportedOptions;
import java.io.*;

public class Support {
    public Support(String userNames) {
        this.userNames = userNames;
    }
    public String getUserNames() {
        return userNames;
    }

    public void setUserNames(String userNames) {
        this.userNames = userNames;
    }

    private String userNames;


}
