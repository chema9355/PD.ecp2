package rest.business.views;

import java.util.ArrayList;

import java.util.LinkedHashMap;
import java.util.List;

public class TransferTheme {

	private List<String> themeList;
	private String theme;
	private LinkedHashMap<String, List<String>> map = new LinkedHashMap<String, List<String>>();

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public TransferTheme() {
		this.themeList = new ArrayList<String>();
	}

	public List<String> getListaTemas() {
		return themeList;
	}

	public void setListaTemas(List<String> listaTemas) {
		this.themeList = listaTemas;
	}

	public LinkedHashMap<String, List<String>> getMap() {
		return map;
	}

	public void setMap(LinkedHashMap<String, List<String>> map) {
		this.map = map;
	}

}
