package com.curso.javaIntermediario.elementosBasicos.aula8;

//Classe local - dentro do pr�prio m�todo
//Pode ser declarada, instanciada e chamar os m�todos da classe dentro do pr�prio m�todo

public class Externa2 {

	public void metodoQualquer() {

		class ClasseLocal {

			private String texto = "texto classe local";

			public void imprimeTexto() {
				System.out.println(texto);
			}
		}

		ClasseLocal local = new ClasseLocal();

		local.imprimeTexto();
	}

	public static void main(String[] args) {

		Externa2 externa = new Externa2();

		externa.metodoQualquer();
	}

}
