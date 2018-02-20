package blogRest;

public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BlogClient myBlog = new BlogClient();
		
		String pag1 = "Prova_1";
		String titMsg1 = "Messaggio_1";
		String contMsg1 = "Speremo ben!!!!";
		
		myBlog.createPag(pag1);
		Mensaje msg1 = myBlog.createMsg(titMsg1,contMsg1);
		myBlog.insertMsg(pag1, msg1);
		
		String pag2 = "Deporte";
		myBlog.createPag(pag2);
		
		String tit2 = "Partidos_futbol";
		String cont2 = "este finde la liga serà muy interesante!!";
		myBlog.insertMsg(pag2, myBlog.createMsg(tit2, cont2));
		
		String e1 = "Etiqueta_1";
		myBlog.createEti(e1);
		myBlog.addMsgToEti(e1, msg1);
		
		String tit3 = "Natacion";
		String cont3 = "La natacion es un deporte muy completo";
		Mensaje m3 = myBlog.createMsg(tit3, cont3);
		myBlog.insertMsg(pag2, m3);
		
		String e2 = "Mensajes_de_salud";
		myBlog.createEti(e2);
		
		String pag3 = "News";
		myBlog.createPag(pag3);
		
		String tit4 = "Noticia_economica";
		String cont4 = "La crisis ha acabado!!!";
		Mensaje m4 = myBlog.createMsg(tit4, cont4);
		myBlog.insertMsg(pag3,m4);
		
		myBlog.addMsgToEti(e2, m3);
		
		
		myBlog.actualizaMsg("Natacion", cont3 + " y es demonstrado que es sano para la espalda.");
		myBlog.deleteEti(e1);
		
		//myBlog.seeMsgOfEtiXML(e1);
		
		
		
		myBlog.seePaginas();
		myBlog.seePaginasXML();

	}

}
