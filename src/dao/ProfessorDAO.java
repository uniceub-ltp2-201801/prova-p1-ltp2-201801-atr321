package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import model.Professor;



public class ProfessorDAO {

private Connection conexao;
	
	//Metodo construtor
	public ProfessorDAO(Connection conexao) {
		this.conexao = conexao;
	}
	
	
/*public Professor getProfessor(String nomeProfessor) {
		
		//Instanciar os objetos
				PreparedStatement ps= null;
				ResultSet rs = null;
				Professor resultado = null;
				
				
				//retornar o cliente do BD
				try {
					//Preparar o SQL
					ps = conexao.prepareStatement("SELECT idprofessor, nomeprofessor, datanascprofessor, nomemaeprofessor, titulacaoprofessor, iddisciplina FROM professor WHERE nomeprofessor = ?");
					//Setar os parametros do SQL
					ps.setString(1, nomeProfessor);
					
					
					//Executar o SQL
					rs = ps.executeQuery();
					
					//criar um cliente com base no rs
					rs.first();
					
					resultado = new Professor(rs.getInt("idprofessor"), rs.getString("nomeprofessor"), rs.getDate("datanascprofessor"), rs.getString("nomemaeprofessor"), rs.getInt("titulacaoprofessor"), rs.getInt("iddisciplina"));
					
					rs.close();
					ps.close();
					
				}catch(SQLException e){
					e.printStackTrace();
				}
				
				return resultado;
}
	*/
	
public ArrayList<Professor> getProfessor(int idProfessor) {
		
		String query = "SELECT idprofessor, nomeprofessor, datanascprofessor, nomemaeprofessor, titulacaoprofessor FROM professor WHERE idprofessor = ?";
		ArrayList<Professor> professores = new ArrayList<>();
		
				PreparedStatement ps= null;
				ResultSet rs = null;

				try {

					ps = conexao.prepareStatement(query);

					ps.setInt(1, idProfessor);

					rs = ps.executeQuery();

					while(rs.next()) {
					professores.add (new Professor(rs.getInt("idprofessor"), rs.getString("nomeprofessor"), rs.getDate("datanascprofessor"), rs.getString("nomemaeprofessor"), rs.getInt("titulacaoprofessor")));
					}
					rs.close();
					ps.close();
					
				}catch(SQLException e){
					e.printStackTrace();
				}
				
				return professores;
		
	

}
	
}
