package net.woji.api;

public interface Plugin {
  default void init(PluginContext context) {
  }
  default void onLoad() {}
  default void onEnable() {}
  default void onDisable() {}
}
