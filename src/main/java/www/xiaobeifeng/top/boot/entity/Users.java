package www.xiaobeifeng.top.boot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Project :  boot.
 * Package name: www.xiaobeifeng.top.boot.entity
 * Created by :  benjamin.
 * Created time: 2018/8/3 12:54
 * Changed by :  benjamin.
 * Changed time: 2018/8/3 12:54
 * Class description:
 */
@Entity
public class Users {

    @Id
    @GeneratedValue
    private int userId;
    private String userName;
    private String password;
    private String mail;
    private int role;


    public Users(String userName, String password, String mail, int role) {
        this.userName = userName;
        this.password = password;
        this.mail = mail;
        this.role = role;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public Users() {
    }


}
