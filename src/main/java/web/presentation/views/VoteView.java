package web.presentation.views;

import java.util.List;

import web.presentation.models.Model;

public class VoteView implements View{

	@Override
	public void show(Model model) {
		
		System.out.println("VoteView");
        System.out.println("   " + model.get("log"));
		//List<String> listaTemas = (List<String>) model.get("temas");
		System.out.print("Temas ");
        //for (String elem : listaTemas){
        //	System.out.print(elem+",");
        //}
		System.out.println(model.get("temas"));
       // System.out.print("]");
        
    
        
	}

}
