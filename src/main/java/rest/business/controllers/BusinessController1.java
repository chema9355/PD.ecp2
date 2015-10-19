package rest.business.controllers;

import rest.business.views.TransferTheme;
import rest.business.views.TransferVote;
import rest.data.models.daos.DaoFactory;

public class BusinessController1 {

    public TransferTheme m1() {
    	TransferTheme listaTemas = new TransferTheme();
        listaTemas.setListaTemas(DaoFactory.getFactory().getThemeDao().findAllNames());
        return listaTemas;
    }

    public void m2(TransferVote vote) {
        DaoFactory.getFactory().getVoteDao().read(1);
    }

}
