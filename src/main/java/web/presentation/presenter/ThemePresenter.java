package web.presentation.presenter;


import rest.business.controllers.BusinessControllerThemes;
import rest.business.models.entities.Theme;
import rest.business.views.TransferTheme;
import web.presentation.models.Model;

public class ThemePresenter {
	
	private String theme;
	
	public ThemePresenter(){
		}
	
	
	public String process(Model model) {
        model.put("log", "Theme Manager Page");
        TransferTheme themeList = new BusinessControllerThemes().getListOfThemes();
        model.put("temas", themeList.getListaTemas());
        return "ThemeManagerView";
    }

    public String showVoting(Model model) {
        model.put("log", "Theme Manager Page");
        //new BusinessController2().m2(new TransferTheme());
        return "ThemeManagerView";
    }
    
    public String createTheme(Model model) {
        model.put("log", "Voting Page");
        TransferTheme theme = new TransferTheme();
        theme.setTheme(this.getThemeName());
        new BusinessControllerThemes().addTheme(theme);

        TransferTheme themeList = new BusinessControllerThemes().getListOfThemes();
        model.put("temas", themeList.getListaTemas());
        return "VoteView";
    }
    
    public void setTheme(String theme){
    	this.theme=theme;}
    

	public String getThemeName() {
		return this.theme;
	}
}


