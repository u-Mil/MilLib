import org.bukkit.plugin.java.JavaPlugin;

public class MilLib {
    public static JavaPlugin plugin;

    public static JavaPlugin getPlugin(){
        return plugin;
    }

    public static void setPlugin(final JavaPlugin plugin){
        MilLib.plugin = plugin;
    }
}
