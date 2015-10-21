package web.presentation.views;

import web.presentation.models.Model;

public class ThemeView implements View {

	@Override
	public void show(Model model) {
		System.out.println("ThemeView");
		System.out.println("   " + model.get("log"));
		System.out.print("Temas ");
		System.out.print(model.get("temas"));

	}

}
