package Utilitários;
import Utilitários.ConexaoBD;
import Utilitários.ConexaoBD;
import Utilitários.UsuarioDTO;
import Utilitários.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;


public class ConexaoCi {
    Connection conn;
    
    public int AdicionarFuncionario(UsuarioDTO objusdto){
        conn = new ConexaoBD().ConectaBD();
        try{
            String sql = "Insert into Funcionarios (CPF, Nome, Usuario, Senha, DataNascimento, Funcao, Sexo) Values (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusdto.getCPFFuncionario());
            pstm.setString(2, objusdto.getNomeFuncionario());
            pstm.setString(3, objusdto.getUsuarioFuncionario());
            pstm.setString(4, objusdto.getSenhaFuncionario());
            pstm.setString(5, objusdto.getFuncaoFuncionario());
            pstm.setString(6, objusdto.getDataNascimentoFuncionario());
            pstm.setString(7, objusdto.getSexoFuncionario());
            
            int rs = pstm.executeUpdate();
            return rs;
        }catch (SQLException erro){
            return -1;
        }
    }
    
    public int AdicionarEstoque(UsuarioDTO objusdto){
        conn = new ConexaoBD().ConectaBD();
        try{
            String sql = "Insert into Estoque (Tamanho, Quantidade, Preco, Nome) Values (?, ?, ?, ?)";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusdto.getTamanhoEstoque());
            pstm.setInt(2, objusdto.getQuantidadeEstoque());
            pstm.setDouble(3, objusdto.getPrecoEstoque());
            pstm.setString(4, objusdto.getProdutoEstoque());
            
            int rs = pstm.executeUpdate();
            return rs;
        }catch (SQLException erro){                
            return -1;
        }
    }
    
    public int AdicionarRegistro(UsuarioDTO objusdto){
        conn = new ConexaoBD().ConectaBD();       
        try{
            String sql = "Insert into Registro (Data, Cliente, Telefone, CPF, Produto, Tamanho, Quantidade, Total) Values (?, ?, ?, ?, ?, ?, ?, ?)";
            LocalDate dataAtual = LocalDate.now();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setObject(1, dataAtual);
            pstm.setString(2, objusdto.getClienteRegistro());
            pstm.setString(3, objusdto.getTelefoneRegistro());
            pstm.setString(4, objusdto.getCPFRegistro());
            pstm.setString(5, objusdto.getProdutoRegistro());
            pstm.setString(6, objusdto.getTamanhoRegistro());
            pstm.setInt(7, objusdto.getQuantidadeRegistro());
            pstm.setDouble(8, objusdto.getTotalRegistro());
            
            int rs = pstm.executeUpdate();
            return rs;
        }catch (SQLException erro){    
            return -1;
        }
    }
    
    public int VerificarEstoque(UsuarioDTO objusdto, String Codigo){
        conn = new ConexaoBD().ConectaBD();       
        try{
            String sql = "Select * from Estoque where Codigo = ?)";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setObject(1, objusdto.getCodigoProduto());   
            
            ResultSet rs = pstm.executeQuery();
            return rs;
        }catch (SQLException erro){    
            return -1;
        }
    }
}
