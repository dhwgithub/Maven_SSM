package henu.pojo;

public class User {
    private Integer uid;

    private String username;

    private String password;

    private String uother;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUother() {
        return uother;
    }

    public void setUother(String uother) {
        this.uother = uother == null ? null : uother.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", uother='" + uother + '\'' +
                '}';
    }
}