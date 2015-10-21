package web.presentation.presenter;

import rest.business.controllers.BusinessControllerThemes;
import rest.business.controllers.BusinessControllerVotes;
import rest.business.views.TransferTheme;
import rest.business.views.TransferVote;
import web.presentation.models.Model;

public class VotePresenter {

	private String theme;
	private int value;

	public String process(Model model) {
		model.put("log", "Voting Page");
		TransferTheme listaTemas = new BusinessControllerVotes().getListOfVotes();
		model.put("temas", listaTemas.getMap());
		return "VoteView";
	}

	public String voteTheme(Model model) {
		model.put("log", "Voting Page");
		TransferVote transferVote = new TransferVote();
		transferVote.setThemeToVote(this.theme);
		transferVote.setVote(this.value);
		new BusinessControllerVotes().addVote(transferVote);

		TransferTheme listaTemas = new BusinessControllerVotes().getListOfVotes();
		model.put("temas", listaTemas.getMap());

		return "VoteView";
	}

	public String showThemeManager(Model model) {
		model.put("log", "Theme Manager Team");
		TransferTheme themeList = new BusinessControllerThemes().getListOfThemes();
		model.put("temas", themeList.getListaTemas());
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
