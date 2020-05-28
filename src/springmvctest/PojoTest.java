package springmvctest;

public class PojoTest {
    private String userName;
    private String sex;
    
    public PojoTest(String a, String b, String c) {
        this.userName = b;
        this.sex = c;
    }
    
    public void setUserName(String X) {
        this.userName = X;
    }
    
    public String getUserName() {
        return this.userName;
    }
    
    public void setSex(String s) {
        this.sex = s; 
    }
    
    public String getSex() {
        return this.sex;
    }
    
    

}
