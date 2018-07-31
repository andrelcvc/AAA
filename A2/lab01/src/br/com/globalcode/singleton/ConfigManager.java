package br.com.globalcode.singleton;
public class ConfigManager {
    
    private static ConfigManager instance = new ConfigManager();

    private ConfigManager() {    }

    public static ConfigManager getInstance() {
        return instance;
    }
  
  private String serverName;

  public String getServerName() {
    return serverName;
  }

  public void setServerName(String serverName) {
    this.serverName = serverName;
  }
}
