package prova.age.thiago.Struts.bean;

import java.sql.Date;

public class Exame {

	private Long id;
	private String nmExame;
	private Date dtExame;
	private String resExame;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNmExame() {
		return nmExame;
	}
	public void setNmExame(String nmExame) {
		this.nmExame = nmExame;
	}
	public Date getDtExame() {
		return dtExame;
	}
	public void setDtExame(Date dtExame) {
		this.dtExame = dtExame;
	}
	public String getResExame() {
		return resExame;
	}
	public void setResExame(String resExame) {
		this.resExame = resExame;
	}
	
	
}
