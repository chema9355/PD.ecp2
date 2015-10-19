package web.presentation.presenter;


import rest.business.controllers.BusinessController1;
import rest.business.views.TransferTheme;
import web.presentation.models.Model;

public class ThemePresenter {
	
	
	public String process(Model model) {
        model.put("log", "Theme Manager Page");
        TransferTheme listaTemas = new BusinessController1().m1();
        model.put("temas", listaTemas.getListaTemas());
        return "ThemeManagerView";
    }

    public String showVoting(Model model) {
        model.put("log", "Theme Manager Page");
        //new BusinessController2().m2(new TransferTheme());
        return "ThemeManagerView";
    }
    
    public String createTheme(Model model) {
        model.put("log", "Voting Page");
       // TransferVote transferObject2 = new BusinessController2().m1();
       // model.put("transferObject2", transferObject2);
        return "VoteView";
    }

}
