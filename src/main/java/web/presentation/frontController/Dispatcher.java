package web.presentation.frontController;



import web.http.HttpRequest;
import web.http.HttpResponse;
import web.presentation.models.Model;
import web.presentation.presenter.ThemePresenter;
import web.presentation.presenter.VotePresenter;
import web.presentation.views.ErrorView;
import web.presentation.views.ThemeView;
import web.presentation.views.View;
import web.presentation.views.VoteView;

public class Dispatcher {

    public void doGet(HttpRequest request, HttpResponse response) {
        Model model = new Model();
        String presenter = request.getPath() + "Presenter";
        String nextView = request.getPath() + "View";

        switch (presenter) {
        case "VotingPresenter":
            VotePresenter votePresenter = new VotePresenter();
            nextView = votePresenter.process(model);
            break;
        case "ThemeManagerPresenter":
            ThemePresenter themePresenter = new ThemePresenter();
            nextView = themePresenter.process(model);
            break;
        }
        this.show(nextView, model);
    }

    public void doPost(HttpRequest request, HttpResponse response) {
        Model model = new Model();
        String controller = request.getPath() + "Presenter";
        String action = request.getParams().get("action");
        String nextView = request.getPath() + "View";

        switch (controller) {
        case "VotingPresenter":
            VotePresenter votePresenter = new VotePresenter();
            if ("VoteTheme".equals(action)) {
            	votePresenter.setTheme(request.getParams().get("themeName"));
            	votePresenter.setValue(request.getParams().get("value"));
                // TODO uI1Presenter.setters((request.getParams().get("param")));
                nextView = votePresenter.voteTheme(model);
            } else if ("ShowThemeManager".equals(action)) {
                // TODO uI1Presenter.setters((request.getParams().get("param")));
                nextView = votePresenter.showThemeManager(model);
            } else {
                model.put("error", "Acción no permitida: " + action);
            }
            break;
        case "ThemeManagerPresenter":
            ThemePresenter themePresenter = new ThemePresenter();
           
            if ("createTheme".equals(action)) {
              
            	themePresenter.setTheme(request.getParams().get("themeName"));
                nextView = themePresenter.createTheme(model);
            } 
            else if ("ShowVoting".equals(action)) {
                // TODO uI1Presenter.setters((request.getParams().get("param")));
                nextView = themePresenter.showVoting(model);
            }
            else {
                model.put("error", "Acción no permitida: " + action);
            }
            break;
        
        }
        this.show(nextView, model);
    }

    private void show(String nextView, Model model) {
        View view;
        switch (nextView) {
        case "VoteView":
            view = new VoteView();
            break;
        case "ThemeManagerView":
            view = new ThemeView();
            break;
        default:
            view = new ErrorView();
            model.put("error", "Vista no encontrada: " + nextView);
        }
        view.show(model);
    }

}
