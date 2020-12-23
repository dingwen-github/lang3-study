package builder;

import lombok.Builder;

import java.io.Serializable;

/**
 * @program:
 * @description: Student实体
 * @author: dingwen
 * @create: 2020/12/23 10:17
 **/

@Builder
public class Student implements Serializable {


    private static final long serialVersionUID = -4822093575930025739L;
    private String id;
    private String name;
    private String clazz;
    private String subject;
    private Double score;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", clazz='" + clazz + '\'' +
                ", subject='" + subject + '\'' +
                ", score=" + score +
                '}';
    }
}
