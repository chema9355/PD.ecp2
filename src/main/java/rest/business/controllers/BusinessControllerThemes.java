package rest.business.controllers;

import rest.business.models.entities.Theme;
import rest.business.views.TransferTheme;
import rest.data.models.daos.DaoFactory;

public class BusinessControllerThemes {

    public TransferTheme getListOfThemes() {
    	TransferTheme listaTemas = new TransferTheme();
        listaTemas.setListaTemas(DaoFactory.getFactory().getThemeDao().findAllNames());
        return listaTemas;
    }

    public void addTheme(TransferTheme theme) {
    	int num = DaoFactory.getFactory().getThemeDao().findAll().size()+1;
        DaoFactory.getFactory().getThemeDao().create(new Theme(num,theme.getTheme()));
       // DaoFactory.getFactory().getThemeDao().setNumThemes(num+1);
    }

}
