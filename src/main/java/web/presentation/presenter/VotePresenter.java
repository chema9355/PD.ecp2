package web.presentation.presenter;

import rest.business.controllers.BusinessController1;
import rest.business.views.TransferTheme;

import web.presentation.models.Model;

public class VotePresenter {
	
	
	public String process(Model model) {
        model.put("log", "Voting Page");
        TransferTheme listaTemas = new BusinessController1().m1();
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
	
	

}
