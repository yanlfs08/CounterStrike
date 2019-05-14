
package model.bean;

public class Players {
    
    private int idPlayer;
    private String nickname;
    private String steamID;

    public Players() {
    }

    public Players(int idPlayer, String nickname, String steamID) {
        this.idPlayer = idPlayer;
        this.nickname = nickname;
        this.steamID = steamID;
    }

    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSteamID() {
        return steamID;
    }

    public void setSteamID(String steamID) {
        this.steamID = steamID;
    }

    @Override
    public String toString() {
        return getNickname(); 
    }
     
    
}

 


