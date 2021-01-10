package XuankeSystem;
public class Teacher extends User{

    public Teacher(){
        super("123456");
    }
    private String zhiCheng;

    public String getZhiCheng() {
        return zhiCheng;
    }

    public void setZhiCheng(String zhiCheng) {
        this.zhiCheng = zhiCheng;
    }
}