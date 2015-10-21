package rest.business.views;

import java.util.List;

import rest.business.models.entities.Vote;

public class TransferVote {

	private List<Vote> themeList;
	private String themeToVote;
	int vote;

	public List<Vote> getThemeList() {
		return themeList;
	}

	public void setThemeList(List<Vote> themeList) {
		this.themeList = themeList;
	}

	public String getThemeToVote() {
		return themeToVote;
	}

	public void setThemeToVote(String themeToVote) {
		this.themeToVote = themeToVote;
	}

	public int getVote() {
		return vote;
	}

	public void setVote(int vote) {
		this.vote = vote;
	}

}
