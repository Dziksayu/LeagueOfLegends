package pl.luxdev.lol.basic;

import java.lang.reflect.Field;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandMap;
import org.bukkit.plugin.SimplePluginManager;

public class CommandImpl {

	private static CommandMap cmdMap;

	public static void registerCommands(Command... commands) {
		for (Command command : commands) {
			registerCommand(command);
		}
	}

	protected static boolean registerCommand(Command command) {
		if (cmdMap == null) {
			try {
				Field field = SimplePluginManager.class.getDeclaredField("commandMap");
				field.setAccessible(true);
				cmdMap = (CommandMap) field.get(Bukkit.getServer().getPluginManager());
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		cmdMap.register("", command);
		return true;
	}

}
