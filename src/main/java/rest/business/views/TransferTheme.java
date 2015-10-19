package rest.business.views;

import java.util.ArrayList;
import java.util.List;

import rest.business.models.entities.Theme;

public class TransferTheme {
	
	private List<String> themeList;
	private String theme;
	
	
	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	
	
	public TransferTheme(){
		this.themeList = new ArrayList<String>();
	}

	public List<String> getListaTemas() {
		return themeList;
	}

	public void setListaTemas(List<String> listaTemas) {
		this.themeList = listaTemas;
	}
	
	

}
