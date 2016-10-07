package pl.luxdev.lol.utils;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class Config {
	
	private final File file;
	private final YamlConfiguration cfg;
	
	public Config(File f){
		file = f;
		if(!f.exists()) createIfNotExists();
		cfg = YamlConfiguration.loadConfiguration(f);
	}
	
	public Config(File f, boolean createIfNotExists){
		file = f;
		if(createIfNotExists && !f.exists()) createIfNotExists();
		cfg = YamlConfiguration.loadConfiguration(f);
	}
	
	public YamlConfiguration getCfg(){
		return cfg;
	}
	
	public void save(){
		try {
			cfg.save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	private void createIfNotExists(){
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
}