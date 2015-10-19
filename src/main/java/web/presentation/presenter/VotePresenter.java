package web.presentation.presenter;

import rest.business.controllers.BusinessControllerThemes;
import rest.business.views.TransferTheme;

import web.presentation.models.Model;

public class VotePresenter {
	
	private String theme;
	private int value;
	

	public String process(Model model) {
        model.put("log", "Voting Page");
        TransferTheme listaTemas = new BusinessControllerThemes().getListOfThemes();
        model.put("temas", listaTemas.getListaTemas());
        return "VoteView";
    }

    public String voteTheme(Model model) {
        model.put("log", "Voting Page");
        
      //  new BusinessController2().m2(new TransferTheme());
        return "VoteView";
    }
    
    public String showThemeManager(Model model) {
        model.put("log", "Theme Manager Team");
        //TransferTheme listaTemas = new BusinessController1().m1();
       // model.put("temas", listaTemas.getListaTemas());
        return "ThemeManagerView";
    }

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	

}
