package net.woji.api;

import java.nio.file.Path;
import org.slf4j.Logger;

public interface PluginContext {
  Logger getLogger();
  Path getDataFolder();
} 
