package net.woji.api;

import net.woji.api.event.EventBus;

import java.nio.file.Path;
import org.slf4j.Logger;

public interface PluginContext {
  EventBus getEventBus();
  Logger getLogger();
  Path getDataFolder();
} 
