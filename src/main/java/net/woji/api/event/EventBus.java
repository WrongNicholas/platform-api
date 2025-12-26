package net.woji.api.event;

public interface EventBus {
  void post(Object object);
  void register(Object listener);
}
