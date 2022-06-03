import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.events.interaction.ButtonClickEvent;
import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.api.requests.restaction.CommandListUpdateAction;
import org.jetbrains.annotations.NotNull;
import javax.security.auth.login.LoginException;


public class Main extends ListenerAdapter {

    private static JDABuilder jdaBuilder;
    private static JDA jda;



    public static void main(String[] args) {
        String TOKEN="Your Discord Token"; 
        jdaBuilder = JDABuilder.createDefault(TOKEN);

        jdaBuilder.setStatus(OnlineStatus.ONLINE);
        jdaBuilder.addEventListeners(new Main());


        try {
            jda = jdaBuilder.build();

        } catch (LoginException exception) {
            exception.printStackTrace();
        }

        CommandListUpdateAction action = jda.updateCommands();

        action.addCommands(new CommandData("gitinit", "create a git repo")).complete();
        action.addCommands(new CommandData("githelp", "See how to git (help command!)")).complete();
        action.addCommands(new CommandData("gitrm", "remove a git repo")).complete();

    }


    @Override
    public void onSlashCommand(@NotNull SlashCommandEvent event) {
        String name = event.getName();

        switch(name) {
            case "githelp":
                gitHelp help = new gitHelp();
                event.replyEmbeds(help.getHelpInfo().build()).queue();
                break;
            case "gitinit":

                break;
            case "gitrm":
                break;
        }

    }

    @Override
    public void onButtonClick(@NotNull ButtonClickEvent event) {

    }
}
