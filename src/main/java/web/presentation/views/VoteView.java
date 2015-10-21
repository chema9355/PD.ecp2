package web.presentation.views;

import web.presentation.models.Model;

public class VoteView implements View {

	@Override
	public void show(Model model) {

		System.out.println("VoteView");
		System.out.println("   " + model.get("log"));
		System.out.print("Temas ");
		System.out.println(model.get("temas"));

	}

}
