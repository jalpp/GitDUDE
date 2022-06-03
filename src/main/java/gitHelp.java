import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.*;

public class gitHelp {


    private EmbedBuilder embedBuilder;


    public gitHelp(){
        this.embedBuilder = new EmbedBuilder();
    }



    public EmbedBuilder getHelpInfo(){

        this.embedBuilder.setTitle("Commands Documentation");
        this.embedBuilder.setColor(Color.black);
        this.embedBuilder.setDescription(" \n\n  /githelp (See Commands Doc)  \n\n /gitinit [Your Github Personal Access token] [Repo name] [Repo description] (creates a private repo) \n\n /gitrm [Your Github Personal Access token] [Repo name] [Delete Reason] (Delete a existing repo)");

        return this.embedBuilder;
    }










}
