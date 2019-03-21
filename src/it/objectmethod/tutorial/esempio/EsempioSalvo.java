package it.objectmethod.tutorial.esempio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EsempioSalvo {

	public String ciaoSalvo() {
		return "Ciao Salvo come stai?";
	}
	
}
