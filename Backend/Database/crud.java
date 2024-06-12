import java.sql.Connection;
import java.sql.PreparedStatement;



/*Crud Feito */

public class crud extends ModelDeputados {


public void adicionar (String nome, String email){
    try (Connetion conn = getConnection()){
        String sql= "INSERT INTO Deputados (nome, email)VALUES (?,?)";
        try(PreparedStatement stm= conn.PreparedStatement(sql)){
            stm.setString(1, nome);
            stm.setString(2, email);
        }

    }catch (Exception e){
        System.out.println("Erro ao cadastrar deputado"+ e.getMessage());
    }
}

public void deletar (int id){
try (Connection conn  = getConnection()){
    String sql= "DELETE * FROM Deputados WHERE id= ?";
    try(PreparedStatement stm= conn.PreparedStatement(sql)){
        stm.setInt(1, id);
        System.out.println("Excluido com sucesso");
    
}catch(Exception e){
    System.out.println("Erro ao deletar Deputado" + e.getMessage());
}
}
}


}
