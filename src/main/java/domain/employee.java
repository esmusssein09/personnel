package domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class employee implements Serializable {
    private Integer id;
    private String name;
    private String sex;
    private String address;
    private Integer age;
    private Date birth;
    private String phone;
    private String password;
    private String state;

    private Integer department_id;
    private Integer position_id;
    private Integer project_id;

    private String salary;
    private String performance;
    private String mail;
    private String education;
    private String politics_status;

//角色控制
    private List<Role> roles;
    private int status;
    private String statusStr;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusStr() {
        //状态0 未开启 1 开启
        if (status == 0) {
            statusStr = "未开启";
        } else if (status == 1) {
            statusStr = "开启";
        }
        return statusStr;
    }

    public void setStatusStr(String statusStr) {
        this.statusStr = statusStr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

    public Integer getPosition_id() {
        return position_id;
    }

    public void setPosition_id(Integer position_id) {
        this.position_id = position_id;
    }

    public Integer getProject_id() {
        return project_id;
    }

    public void setProject_id(Integer project_id) {
        this.project_id = project_id;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getPolitics_status() {
        return politics_status;
    }

    public void setPolitics_status(String politics_status) {
        this.politics_status = politics_status;
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", state='" + state + '\'' +
                ", department_id=" + department_id +
                ", position_id=" + position_id +
                ", project_id=" + project_id +
                ", salary='" + salary + '\'' +
                ", performance='" + performance + '\'' +
                ", mail='" + mail + '\'' +
                ", education='" + education + '\'' +
                ", politics_status='" + politics_status + '\'' +
                ", roles=" + roles +
                ", status=" + status +
                ", statusStr='" + statusStr + '\'' +
                '}';
    }
}
