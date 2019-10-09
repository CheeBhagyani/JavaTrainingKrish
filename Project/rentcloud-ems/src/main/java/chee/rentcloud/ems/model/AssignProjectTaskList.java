package chee.rentcloud.ems.model;

import java.util.List;

public class AssignProjectTaskList {
    private Integer aid;
    private Integer eid;
    private Integer pid;

    public List<Integer> getTid() {
        return tid;
    }

    public void setTid(List<Integer> tid) {
        this.tid = tid;
    }

    private List<Integer> tid;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "AssignProjectTaskList{" +
                "aid=" + aid +
                ", eid=" + eid +
                ", pid=" + pid +
                ", tid=" + tid +
                '}';
    }
}
