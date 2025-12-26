package net.woji.api.event;

public class ServerTickEvent {
  private final long tick;

  public ServerTickEvent(long tick) {
    this.tick = tick;
  }

  public long getTick() {
    return tick;
  }
}
