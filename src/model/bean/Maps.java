
package model.bean;

public class Maps {
    
    private int idMaps;
    private String namemap;

    public Maps() {
    }

    public Maps(int idMaps, String namemap) {
        this.idMaps = idMaps;
        this.namemap = namemap;
    }

    public int getIdMaps() {
        return idMaps;
    }

    public void setIdMaps(int idMaps) {
        this.idMaps = idMaps;
    }

    public String getNamemap() {
        return namemap;
    }

    public void setNamemap(String namemap) {
        this.namemap = namemap;
    }

    @Override
    public String toString() {
        return getNamemap();
    }
    
}
