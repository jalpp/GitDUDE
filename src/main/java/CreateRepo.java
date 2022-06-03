import net.dv8tion.jda.api.EmbedBuilder;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;

public class CreateRepo extends Repo{

    private EmbedBuilder embedBuilder;
    private GitHub gitHub;



    public CreateRepo(String oAuthToken, String repoName, String repoInfo) {
        super(oAuthToken, repoName, repoInfo);
    }


    public EmbedBuilder getCreateRepoStatus(){

        try {
            this.gitHub = new GitHubBuilder().withOAuthToken(this.getoAuthToken()).build();

            gitHub.createRepository(this.getRepoName()).description(this.getRepoInfo()).private_(true).create();

            return this.embedBuilder.setDescription("Repo created!");


        } catch (IOException e) {
            e.printStackTrace();
            return this.embedBuilder.setDescription("Error occurred!");
        }



    }




}
