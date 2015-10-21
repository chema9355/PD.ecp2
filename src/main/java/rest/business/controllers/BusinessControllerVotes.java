package rest.business.controllers;

import java.util.ArrayList;

import java.util.LinkedHashMap;
import java.util.List;

import rest.business.models.entities.Theme;
import rest.business.models.entities.Vote;
import rest.business.views.TransferTheme;
import rest.business.views.TransferVote;
import rest.data.models.daos.DaoFactory;

public class BusinessControllerVotes {

	public TransferTheme getListOfVotes() {
		LinkedHashMap<String, List<String>> map = new LinkedHashMap<String, List<String>>();
		List<String> list;
		List<String> themeList = DaoFactory.getFactory().getThemeDao().findAllNames();
		for (String elem : themeList) {
			list = this.votesOfTheme(elem);
			map.put(elem, list);
		}
		TransferTheme transferTheme = new TransferTheme();
		transferTheme.setMap(map);
		return transferTheme;

	}

	private List<String> votesOfTheme(String elem) {
		String media;
		double totalVotes = 0;
		List<Vote> voteList;
		List<String> list = new ArrayList<>();
		Theme theme = DaoFactory.getFactory().getThemeDao().findByName(elem);
		voteList = DaoFactory.getFactory().getVoteDao().findByTheme(theme);
		for (Vote elem1 : voteList) {
			totalVotes = totalVotes + elem1.getVote();
		}

		if (voteList.size() != 0) {
			media = Double.toString(totalVotes / voteList.size());
		} else {
			media = "NaN";
		}

		list.add("NombreTema: " + elem);
		list.add("media: " + media);

		return list;
	}

	public void addVote(TransferVote themeName) {
		Theme theme = DaoFactory.getFactory().getThemeDao().findByName(themeName.getThemeToVote());
		int num = DaoFactory.getFactory().getVoteDao().findAll().size() + 1;
		Vote vote = new Vote(num, themeName.getVote(), theme);
		DaoFactory.getFactory().getVoteDao().create(vote);
	}

}
