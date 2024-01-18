
package De4;

public class Word {
    private int id;
    private String en;
    private String vn;

    public Word(int id, String en, String vn) {
        this.id = id;
        this.en = en;
        this.vn = vn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getVn() {
        return vn;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }
    public void displayInfo(){
        System.out.println("ID: " +id);
        System.out.println("Tiếng Anh: " +en);
        System.out.println("Tiếng Việt: " +vn);
    }
    
}
