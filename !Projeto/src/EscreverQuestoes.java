import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
 
public class EscreverQuestoes {		

	public void escrverTex(ArrayList<Questao> questoes){
		try {
			PrintStream out = new PrintStream(new FileOutputStream("prova.tex")); 
		    out.println("\\documentclass[12pt, a4paper]{article}");
		    out.println("\\usepackage[latin1]{inputenc}");
		    out.println("\\usepackage[brazil]{babel}");
		    out.println("\\usepackage{graphicx}");
		    out.println("\\usepackage{fancyhdr}");
		    out.println("\\pagestyle{fancy}");
		    out.println("\\rhead{AVI - AVALIA��O INTEGRADA}");
		    out.println("");
		    out.println("\\begin{document}");
		    out.println("");
		    out.println("	\\begin{flushleft}");
			out.println("		CURSO:");
			out.println("		\\\\");
			out.println("		S�RIE:");
			out.println("		\\\\");
			out.println("		ANO/SEMESTRE:");
			out.println("		\\\\");
			out.println("	\\end{flushleft}");
			out.println("	\\begin{flushleft}");
			out.println("		Nome:");
			out.println("		\\\\");
			out.println("		Peso: 2,0");
			out.println("	\\end{flushleft}");
	    	out.println("	\\begin{center}");
			out.println("		PROVA DE FORMA��O GERAL");
			out.println("		\\\\");
			out.println("	\\end{center}");
		    
		    for (int i = 0; i < questoes.size(); i++) {
				out.println("	\\begin{flushleft}");
				out.println("		\\textbf{"+(i+1)+". "+questoes.get(i).titulo+"}");
				out.println("		\\\\");
				out.println("	\\end{flushleft}");
				out.println("	\\begin{flushleft}");
				out.println("		"+questoes.get(i).enunciado);
				out.println("		\\\\");
				out.println("	\\end{flushleft}");
				out.println("	\\begin{flushleft}");
				out.println("		A) "+questoes.get(i).alternativaA);
				out.println("		\\\\");
				out.println("		B) "+questoes.get(i).alternativaB);
				out.println("		\\\\");
				out.println("		C) "+questoes.get(i).alternativaC);
				out.println("		\\\\");
				out.println("		D) "+questoes.get(i).alternativaD);
				out.println("		\\\\");
				out.println("		E) "+questoes.get(i).alternativaE);
				out.println("		\\\\");
				out.println("	\\end{flushleft}");
			}
		    
		    out.println("");
		    out.println("\\end{document}");
		    
			out.close();
			System.out.println("Arquivo escrito com sucesso!");
			System.out.println("Carregando... (Pode demorar na primeira vez)");
			ExecComando.executar("cmd.exe", "/C", "pdflatex prova");
			ExecComando.executar("cmd.exe", "/C", "prova.pdf");
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
		}		
	}
		
}