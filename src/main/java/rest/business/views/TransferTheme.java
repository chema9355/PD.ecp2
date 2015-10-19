package rest.business.views;

import java.util.ArrayList;
import java.util.List;

public class TransferTheme {
	
	private List<String> listaTemas;
	
	public TransferTheme(){
		this.listaTemas = new ArrayList<String>();
	}

	public List<String> getListaTemas() {
		return listaTemas;
	}

	public void setListaTemas(List<String> listaTemas) {
		this.listaTemas = listaTemas;
	}
	
	

}
