import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

public class MilUtils {
    public static void tell(final CommandSender sender, final String msg){
        sender.sendMessage(msg);
    }
    public static void log(final String msg){
        tell(Bukkit.getConsoleSender(), "[" + MilLib.getPlugin().getName() + "] " + msg);
    }
}
