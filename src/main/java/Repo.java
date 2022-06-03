public class Repo {

    private String oAuthToken;
    private String repoName;
    private String repoInfo;




    public Repo(String oAuthToken, String repoName, String repoInfo){

        this.oAuthToken = oAuthToken;
        this.repoName = repoName;
        this.repoInfo = repoInfo;


    }


    public String getoAuthToken() {
        return oAuthToken;
    }

    public String getRepoName() {
        return repoName;
    }

    public String getRepoInfo() {
        return repoInfo;
    }


}
