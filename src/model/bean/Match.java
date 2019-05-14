
package model.bean;

import java.sql.Date;



public class Match {
    
    private int idMatch;
    private int idPlayer;
    private int kills;
    private int deaths;
    private int assists;
    private int wl;
    private Date data;
    private Maps idMap;
    private int firstkill;
    private int bombplanted;
    private int bombdefuse;

    public Match() {
    }

    public Match(int idMatch, int idPlayer, int kills, int deaths, int assists, int wl, Date data, Maps idMap, int firstkill, int bombplanted, int bombdefuse) {
        this.idMatch = idMatch;
        this.idPlayer = idPlayer;
        this.kills = kills;
        this.deaths = deaths;
        this.assists = assists;
        this.wl = wl;
        this.data = data;
        this.idMap = idMap;
        this.firstkill = firstkill;
        this.bombplanted = bombplanted;
        this.bombdefuse = bombdefuse;
    }   

    public int getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(int idMatch) {
        this.idMatch = idMatch;
    }

    public int getIdPlayer() {
        return idPlayer;
    }
    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getWl() {
        return wl;
    }

    public void setWl(int wl) {
        this.wl = wl;
    }
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Maps getIdMap() {
        return idMap;
    }

    public void setIdMap(Maps idMap) {
        this.idMap = idMap;
    }

    public int getFirstkill() {
        return firstkill;
    }

    public void setFirstkill(int firstkill) {
        this.firstkill = firstkill;
    }

    public int getBombplanted() {
        return bombplanted;
    }

    public void setBombplanted(int bombplanted) {
        this.bombplanted = bombplanted;
    }

    public int getBombdefuse() {
        return bombdefuse;
    }

    public void setBombdefuse(int bombdefuse) {
        this.bombdefuse = bombdefuse;
    }    
    
}
