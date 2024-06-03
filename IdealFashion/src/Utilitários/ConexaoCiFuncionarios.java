import Utilitários.ConexaoBD;
import Utilitários.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConexaoCiFuncionarios {
    Connection conn;
    
    public int AutenticarFunc(UsuarioDTO objusdto){
        conn = new ConexaoBD().ConectaBD();
        try{
            String sql = "Insert into Funcionarios (Nome, Usuario, Senha, DataNascimento, Funcao, Sexo) Values (?, ?, ?, ?, ?, ?)";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusdto.getCPF());
            pstm.setString(2, objusdto.getNome());
            pstm.setString(3, objusdto.getUsuario());
            pstm.setString(4, objusdto.getSenha());
            pstm.setString(5, objusdto.getFuncao());
            pstm.setString(6, objusdto.getSexo());
            
            int rs = pstm.executeUpdate();
            return rs;
        }catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "UsuarioConexaoci : " + erro);
            return -1;
        }
    }
}
