package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.Inspetor;


public class InspetorDao extends Dao {
	
	public void incluir(Inspetor i) throws Exception {
		open();
		
		stmt = con.prepareStatement("INSERT INTO INSPETOR VALUES(NULL, ?, ?)");
        stmt.setString(1, i.getNome());
        stmt.setInt(2, i.getIdade());
        stmt.execute();		
		close();
	}
	
	public String pesquisaNome(String nome) throws Exception{
		open();
		stmt = con.prepareStatement("SELECT NOME FROM INSPETOR WHERE NOME LIKE ?");
		stmt.setString(1, nome+"%");
		rs = stmt.executeQuery();
		Inspetor i1 = new Inspetor();
		if(rs.next()){
			i1.setNome(rs.getString("nome"));
		}
		return i1.getNome();
	}
	public List<Inspetor> findAll() throws Exception{
		open();
		List<Inspetor> listaInspetores = new ArrayList<Inspetor>();
		stmt = con.prepareStatement("SELECT * FROM INSPETOR");
		rs = stmt.executeQuery();
		while (rs.next()) {
			Inspetor i1 = new Inspetor();
			i1.setIdInspetor(rs.getInt("idinspetor"));
			i1.setNome(rs.getString("nome"));
			i1.setIdade(rs.getInt("idade"));
			listaInspetores.add(i1);
		}		
		close();
		return listaInspetores;
	}
	/*
	public static void main(String[] args) {
		try {
			//System.out.println(new InspetorDao().findAll());
			//System.out.println(new InspetorDao().pesquisaNome("fel"));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	*/
}
