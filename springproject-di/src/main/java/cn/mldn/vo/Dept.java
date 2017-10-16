package cn.mldn.vo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("serial")
public class Dept implements Serializable {

	private Long deptno;
	private String loc;
	private String dname;

	private Emp emps[];
	private List<String> info;
	private Set<String> setinfo;
	private Map<Integer,Object> mapinfo;
	private Map<String,Emp> mapempinfo;
	public Long getDeptno() {
		return deptno;
	}
	public void setDeptno(Long deptno) {
		this.deptno = deptno;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Emp[] getEmps() {
		return emps;
	}
	public void setEmps(Emp[] emps) {
		this.emps = emps;
	}
	public List<String> getInfo() {
		return info;
	}
	public void setInfo(List<String> info) {
		this.info = info;
	}
	public Set<String> getSetinfo() {
		return setinfo;
	}
	public void setSetinfo(Set<String> setinfo) {
		this.setinfo = setinfo;
	}
	public Map<Integer, Object> getMapinfo() {
		return mapinfo;
	}
	public void setMapinfo(Map<Integer, Object> mapinfo) {
		this.mapinfo = mapinfo;
	}
	public Map<String, Emp> getMapempinfo() {
		return mapempinfo;
	}
	public void setMapempinfo(Map<String, Emp> mapempinfo) {
		this.mapempinfo = mapempinfo;
	}
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", loc=" + loc + ", dname=" + dname + ", emps=" + Arrays.toString(emps)
		+ ", info=" + info + ", setinfo=" + setinfo + ", mapinfo=" + mapinfo + ", mapempinfo=" + mapempinfo
		+ "]";
	}

}
